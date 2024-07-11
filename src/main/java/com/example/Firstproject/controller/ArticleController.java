package com.example.Firstproject.controller;

import com.example.Firstproject.dto.ArticleForm;
import com.example.Firstproject.entity.Article;
import com.example.Firstproject.repository.ArticleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ArticleController {
    @Autowired
    private ArticleRepository articleRepository;

    @GetMapping("/articles/new")
    public String newArticleForm() {
        return "articles/new";
    }

    @PostMapping("/articles/create")
    public String createArticle(ArticleForm form) {
        Article article = form.toEntity();
        Article saved = articleRepository.save(article);
        return "";
    }
}
