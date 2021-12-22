package com.jxy.blog;

import com.jxy.blog.mapper.ArticleMapper;
import com.jxy.blog.mapper.TagMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class BlogApplicationTests {

    @Autowired
    TagMapper tagMapper;
    @Autowired
    ArticleMapper articleMapper;
    @Test
    void contextLoads() {
        Long a = 1405916999732707330L;
        System.out.println(articleMapper.selectById(a));
    }
}
