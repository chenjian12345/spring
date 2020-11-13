package com.cj.pojo;

import org.springframework.stereotype.Component;

/**
 * @Description: 分类
 * @Author: chenj
 * @Date: 2020/11/13
 **/
@Component
public class Category {

    private String categoryId;

    private String categoryName;

    public String getCategoryId()
    {
        return categoryId;
    }

    public void setCategoryId(String categoryId)
    {
        this.categoryId = categoryId;
    }

    public String getCategoryName()
    {
        return categoryName;
    }

    public void setCategoryName(String categoryName)
    {
        this.categoryName = categoryName;
    }
}
