package com.jxy.blog.controller;

import com.jxy.blog.service.CommentsService;
import com.jxy.blog.vo.Result;
import com.jxy.blog.vo.params.CommentParams;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/comments")
public class CommentController {
    @Autowired
    private CommentsService commentsService;

    @GetMapping("/article/{id}")
    public Result comments(@PathVariable("id") Long id) {
        return commentsService.commentsByArticleId(id);
    }

    @PostMapping("/create/change")
    public Result createComment(@RequestBody CommentParams commentParams) {
        return commentsService.createComment(commentParams);
    }
}
