package com.wxnutrition.admin.pojo;

public class ArticlesWithBLOBs extends Articles {
    private String articleTitle;

    private String articleContents;

    public String getArticleTitle() {
        return articleTitle;
    }

    public void setArticleTitle(String articleTitle) {
        this.articleTitle = articleTitle == null ? null : articleTitle.trim();
    }

    public String getArticleContents() {
        return articleContents;
    }

    public void setArticleContents(String articleContents) {
        this.articleContents = articleContents == null ? null : articleContents.trim();
    }
}