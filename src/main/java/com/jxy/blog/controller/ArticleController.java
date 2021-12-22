package com.jxy.blog.controller;

import com.jxy.blog.common.aop.LogAnnotation;
import com.jxy.blog.common.cache.Cache;
import com.jxy.blog.service.ArticleService;
import com.jxy.blog.vo.Result;
import com.jxy.blog.vo.params.ArticleParam;
import com.jxy.blog.vo.params.PageParams;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/articles")
public class ArticleController {
    @Autowired
    ArticleService articleService;

    /**
     * 返回文章列表
     * @param pageParams
     * @return
     */
    @PostMapping("")
    @LogAnnotation(module="文章", operator="获取文章列表")
    @Cache(expire = 5 * 60 * 1000, name = "list_article")
    public Result listArticle(@RequestBody PageParams pageParams) {
        return articleService.listArticle(pageParams);
    }

    @PostMapping("/hot")
    @Cache(expire = 5 * 60 * 1000, name = "hot_article")
    public Result hotArticle() {
        int limit = 5;
        return articleService.hotArticle(limit);
    }

    @PostMapping("/new")
    @Cache(expire = 5 * 60 * 1000, name = "news_article")
    public Result newArticles() {
        int limit = 5;
        return articleService.newArticles(limit);
    }

    @PostMapping("/listArchives")
    public Result listArchives() {

        return articleService.listArchives();
    }

    @PostMapping("/view/{id}")
    public Result findArticleById(@PathVariable Long id) {
        return articleService.findArticleById(id);
    }

    @PostMapping("publish")
    public Result publish(@RequestBody ArticleParam articleParam) {
        return articleService.publish(articleParam);
    }

}
