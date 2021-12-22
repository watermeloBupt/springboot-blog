package com.jxy.blog.service;

import com.jxy.blog.vo.params.ArticleParam;
import com.jxy.blog.vo.params.PageParams;
import com.jxy.blog.vo.Result;

public interface ArticleService {
    /**
     * 分页查找，文章列表
     * @param pageParams
     * @return
     */
    Result listArticle(PageParams pageParams);

    Result hotArticle(int limit);

    Result newArticles(int limit);

    Result listArchives();

    Result findArticleById(Long id);

    Result publish(ArticleParam articleParam);
}
