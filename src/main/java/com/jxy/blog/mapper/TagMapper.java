package com.jxy.blog.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.jxy.blog.pojo.Tag;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TagMapper extends BaseMapper<Tag> {
    /**
     * 文章id查tagList
     * @param articleId
     * @return
     */
    List<Tag> findTagsByArticleId(Long articleId);

    List<Long> findHotTagIds(int limit);

    List<Tag> findTagsByTagIds(List<Long> tagIds);
}
