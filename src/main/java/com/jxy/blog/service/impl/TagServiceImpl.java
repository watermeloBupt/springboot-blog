package com.jxy.blog.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.jxy.blog.mapper.TagMapper;
import com.jxy.blog.pojo.Tag;
import com.jxy.blog.service.TagService;
import com.jxy.blog.vo.Result;
import com.jxy.blog.vo.TagVo;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Service
public class TagServiceImpl implements TagService {
    @Autowired
    private TagMapper tagMapper;

    @Override
    public List<TagVo> findTagsByArticleId(Long articleId) {
        //mybatisplus 无法多表查询
        List<Tag> tags = tagMapper.findTagsByArticleId(articleId);
        return copyList(tags);
    }

    @Override
    public Result hots(int limit) {
        /**
         *  标签所拥有的文章数量最多
         *  分组 --> 排序
         */
        List<Long> tagIds = tagMapper.findHotTagIds(limit);
        if(CollectionUtils.isEmpty(tagIds)) {
            return Result.success(Collections.emptyList());
        }
        List<Tag> tagList = tagMapper.findTagsByTagIds(tagIds);
        return Result.success(tagList);
    }

    @Override
    public Result findAll() {
        LambdaQueryWrapper<Tag> queryWrapper = new LambdaQueryWrapper<>();
        queryWrapper.select(Tag::getId, Tag::getTagName);
        List<Tag> tagList = tagMapper.selectList(queryWrapper);
        return Result.success(copyList(tagList));
    }

    @Override
    public Result findAllDetail() {
        List<Tag> tagList = tagMapper.selectList(new LambdaQueryWrapper<>());
        return Result.success(copyList(tagList));
    }

    @Override
    public Result findAllDetailById(Long id) {
        Tag tag = tagMapper.selectById(id);
        return Result.success(copy(tag));
    }

    private List<TagVo> copyList(List<Tag> articleList) {
        List<TagVo> tagList = new ArrayList<>();
        for(Tag tag : articleList) {
            tagList.add(copy(tag));
        }
        return tagList;
    }

    private TagVo copy(Tag tag) {
        TagVo tagVo = new TagVo();
        tagVo.setId(String.valueOf(tag.getId()));
        BeanUtils.copyProperties(tag, tagVo);
        return tagVo;
    }
}
