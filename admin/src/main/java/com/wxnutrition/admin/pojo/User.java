package com.wxnutrition.admin.pojo;

import java.util.Date;

public class User {
    private String id;

    private String username;

    private String password;

    private String userPhoto;

    private String userEmail;

    private Date userRegistrationTime;

    private Date userBirthday;

    private Integer userAge;

    private Integer userMobileNum;

    private String userNickname;

    private String userDesc;

    public User() {
    }

    public User(String id, String username, String password, String userPhoto, String userEmail, Date userRegistrationTime, Date userBirthday, Integer userAge, Integer userMobileNum, String userNickname, String userDesc) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.userPhoto = userPhoto;
        this.userEmail = userEmail;
        this.userRegistrationTime = userRegistrationTime;
        this.userBirthday = userBirthday;
        this.userAge = userAge;
        this.userMobileNum = userMobileNum;
        this.userNickname = userNickname;
        this.userDesc = userDesc;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUserPhoto() {
        return userPhoto;
    }

    public void setUserPhoto(String userPhoto) {
        this.userPhoto = userPhoto;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public Date getUserRegistrationTime() {
        return userRegistrationTime;
    }

    public void setUserRegistrationTime(Date userRegistrationTime) {
        this.userRegistrationTime = userRegistrationTime;
    }

    public Date getUserBirthday() {
        return userBirthday;
    }

    public void setUserBirthday(Date userBirthday) {
        this.userBirthday = userBirthday;
    }

    public Integer getUserAge() {
        return userAge;
    }

    public void setUserAge(Integer userAge) {
        this.userAge = userAge;
    }

    public Integer getUserMobileNum() {
        return userMobileNum;
    }

    public void setUserMobileNum(Integer userMobileNum) {
        this.userMobileNum = userMobileNum;
    }

    public String getUserNickname() {
        return userNickname;
    }

    public void setUserNickname(String userNickname) {
        this.userNickname = userNickname;
    }

    public String getUserDesc() {
        return userDesc;
    }

    public void setUserDesc(String userDesc) {
        this.userDesc = userDesc;
    }

    @Override
    public String toString() {
        return "User{" +
                "id='" + id + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", userPhoto='" + userPhoto + '\'' +
                ", userEmail='" + userEmail + '\'' +
                ", userRegistrationTime=" + userRegistrationTime +
                ", userBirthday=" + userBirthday +
                ", userAge=" + userAge +
                ", userMobileNum=" + userMobileNum +
                ", userNickname='" + userNickname + '\'' +
                ", userDesc='" + userDesc + '\'' +
                '}';
    }
}
