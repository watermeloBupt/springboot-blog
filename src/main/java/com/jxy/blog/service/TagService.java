package com.jxy.blog.service;

import com.jxy.blog.vo.Result;
import com.jxy.blog.vo.TagVo;

import java.util.List;

public interface TagService {

    List<TagVo> findTagsByArticleId(Long articleId);

    Result hots(int limit);

    Result findAll();

    Result findAllDetail();

    Result findAllDetailById(Long id);
}
