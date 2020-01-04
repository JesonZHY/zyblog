package com.wxnutrition.admin.controller;

import com.wxnutrition.admin.pojo.PageResult;
import com.wxnutrition.admin.pojo.Result;
import com.wxnutrition.admin.pojo.User;
import com.wxnutrition.admin.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/login")
public class LoginController {

    @Autowired
    private LoginService loginService;

    @RequestMapping("/login")
    @ResponseBody
    public Result login(String username, String password, HttpServletRequest request){
        User user = loginService.login(username, password);
        if (user != null) {
            if (!user.getUserPassword().equals(password)) {
                return new Result(false, "密码错误！");
            }
            if (user.getUserStatus() == 0) {
                return new Result(false, "当前用户已被停用！");
            }
        } else {
            return new Result(false, "用户名不存在！");
        }
        request.getSession().setAttribute("userLogin", username);
        return new Result(true, "登录成功！");
    }

    @RequestMapping("/findAll")
    public PageResult findAll(int page, int rows) {
        return loginService.findAll(page, rows);
    }

    @RequestMapping("/findOne")
    public User findOne(String userId) {
        return loginService.findOne(userId);
    }

    @RequestMapping("/save")
    @ResponseBody
    public Result save(String userName, String userNickname, String userBirthday, String userMobileNum, String userEmail, String userDesc, String userPhoto) throws ParseException {
        List<User> userList = loginService.findByNickName(userNickname);
        if (userList.size() != 0) {
            for (int i = 0; i < userList.size(); i++) {
                User user = userList.get(i);
                if (!user.getUserName().equals(userName)) {
                    return new Result(false, "昵称重复！");
                }
            }
        }
        User user = loginService.findByUsername(userName);
        user.setUserNickname(userNickname);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date birthday = simpleDateFormat.parse(userBirthday);
        user.setUserBirthday(birthday);
        user.setUserMobileNum(userMobileNum);
        user.setUserEmail(userEmail);
        if (!userPhoto.equals("not change pic.")) {
            user.setUserPhoto(userPhoto);
        }
        user.setUserDesc(userDesc);
        int save = loginService.save(user);
        if (save != 0) {
            return new Result(true, "保存成功！");
        } else {
            return new Result(false, "保存失败！");
        }
    }

    @RequestMapping("/insert")
    @ResponseBody
    public Result insert(String userName, String userNickname, String userPassword, String userBirthday, String userMobileNum, String userEmail, String userDesc, String userPhoto) throws ParseException {
        List<User> userList = loginService.findByName(userName);
        if (userList.size() != 0) {
            return new Result(false, "账号重复！");
        }
        List<User> userNickList = loginService.findByNickName(userNickname);
        if (userNickList.size() != 0) {
            return new Result(false, "昵称重复！");
        }
        User user = new User();
        user.setUserId(UUID.randomUUID().toString().replaceAll("-", ""));
        user.setUserName(userName);
        user.setUserPassword(userPassword);
        user.setUserNickname(userNickname);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date birthday = simpleDateFormat.parse(userBirthday);
        user.setUserBirthday(birthday);
        user.setUserMobileNum(userMobileNum);
        user.setUserEmail(userEmail);
        if (!userPhoto.equals("not change pic.")) {
            user.setUserPhoto(userPhoto);
        }
        user.setUserDesc(userDesc);
        user.setUserStatus(1);
        Date today = new Date();
        user.setUserRetistrationTime(today);
        int save = loginService.insert(user);
        if (save != 0) {
            return new Result(true, "注册成功！");
        } else {
            return new Result(false, "注册失败！");
        }
    }

    @RequestMapping("/upload")
    @ResponseBody
    public Result upload(@RequestParam(value = "userPhoto", required = false) MultipartFile uploadFile, HttpServletRequest request) throws IOException {
        if (uploadFile != null) {
            String originalFN = uploadFile.getOriginalFilename();//原文件名
            String requestURL = request.getRequestURL().toString();
            String requestURI = request.getRequestURI();
            String substring = requestURL.substring(0, requestURL.indexOf(requestURI));
            String imagesPath = request.getSession().getServletContext().getRealPath("images");
            uploadFile.transferTo(new File( imagesPath + "/" + originalFN));
            return new Result(true, substring + "/images/" + originalFN);
        } else {
            return new Result(true, "not change pic.");
        }
    }

    @RequestMapping("/logout")
    @ResponseBody
    public Result logout(HttpServletRequest request) {
        request.getSession().removeAttribute("userLogin");
        return new Result(true, "user is logout.");
    }
    @RequestMapping("/isUserLogin")
    @ResponseBody
    public Result isUserLogin(HttpServletRequest request) {
        String userLogin = (String) request.getSession().getAttribute("userLogin");
        if (userLogin != null && !userLogin.equals("")) {
            return new Result(true, "user is login.");
        } else {
            return new Result(false, "user is logout.");
        }
    }

    @RequestMapping("/findByName")
    @ResponseBody
    public Result findByName(String userName) {
        List<User> userList = loginService.findByName(userName);
        if (userList.size() != 0) {
            return new Result(false, "账号重复！");
        } else {
            return new Result(true, "账号可用！");
        }
    }

    @RequestMapping("/findByNickName")
    @ResponseBody
    public Result findByNickName(String userNickName) {
        List<User> userList = loginService.findByNickName(userNickName);
        if (userList.size() != 0) {
            return new Result(false, "昵称重复！");
        } else {
            return new Result(true, "昵称可用！");
        }
    }

    @RequestMapping("/delete")
    @ResponseBody
    public Result delete(String userId) {
        int delete = loginService.delete(userId);
        if (delete != 0) {
            return new Result(true, "删除成功！");
        } else {
            return new Result(false, "删除失败！");
        }
    }

    @RequestMapping("/changeUserStatus")
    @ResponseBody
    public Result changeUserStatus(String userId, String userStatus) {
        int update = loginService.updateUserStatus(userId, userStatus);
        if (update != 0) {
            return new Result(true, "变更用户状态成功！");
        } else {
            return new Result(false, "变更用户状态失败！");
        }
    }

    @RequestMapping("/getUserInfo")
    public User getUserInfo(HttpServletRequest request) {
        String currentUserName = (String) request.getSession().getAttribute("userLogin");
        User currentUser = loginService.findByUsername(currentUserName);
        return currentUser;
    }
}
