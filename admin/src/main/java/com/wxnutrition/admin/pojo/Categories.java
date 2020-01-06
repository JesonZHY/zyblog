package com.wxnutrition.admin.pojo;

public class Categories {
    private String categoriesId;

    private String categoriesName;

    private String categoriesDesc;

    private Integer categoriesStatus;

    private String parentCategoriesId;

    public String getCategoriesId() {
        return categoriesId;
    }

    public void setCategoriesId(String categoriesId) {
        this.categoriesId = categoriesId == null ? null : categoriesId.trim();
    }

    public String getCategoriesName() {
        return categoriesName;
    }

    public void setCategoriesName(String categoriesName) {
        this.categoriesName = categoriesName == null ? null : categoriesName.trim();
    }

    public String getCategoriesDesc() {
        return categoriesDesc;
    }

    public void setCategoriesDesc(String categoriesDesc) {
        this.categoriesDesc = categoriesDesc == null ? null : categoriesDesc.trim();
    }

    public Integer getCategoriesStatus() {
        return categoriesStatus;
    }

    public void setCategoriesStatus(Integer categoriesStatus) {
        this.categoriesStatus = categoriesStatus;
    }

    public String getParentCategoriesId() {
        return parentCategoriesId;
    }

    public void setParentCategoriesId(String parentCategoriesId) {
        this.parentCategoriesId = parentCategoriesId == null ? null : parentCategoriesId.trim();
    }
}