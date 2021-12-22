package com.jxy.blog.service;

import com.jxy.blog.vo.CategoryVo;
import com.jxy.blog.vo.Result;

import java.util.List;

public interface CategoryService {
    CategoryVo findCategoryById(Long categoryId);

    Result findAll();

    Result findAllDetail();

    Result categoryDetailById(Long id);
}
