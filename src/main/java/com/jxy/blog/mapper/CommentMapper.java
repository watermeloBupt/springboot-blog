package com.jxy.blog.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.jxy.blog.pojo.Comment;
import com.jxy.blog.vo.CommentVo;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CommentMapper extends BaseMapper<Comment> {

}
