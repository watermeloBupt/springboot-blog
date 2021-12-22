package com.jxy.blog.vo;

import lombok.Data;

import java.util.List;

@Data
public class CommentVo  {

    private String id;

    private UserVo author;

    private String content;

    private List<CommentVo> childrens;

    private Long createDate;

    private Integer level;

    private UserVo toUser;
}

