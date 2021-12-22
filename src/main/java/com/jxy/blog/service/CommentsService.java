package com.jxy.blog.service;

import com.jxy.blog.vo.Result;
import com.jxy.blog.vo.params.CommentParams;

public interface CommentsService {
    Result commentsByArticleId(Long id);

    Result createComment(CommentParams commentParams);
}
