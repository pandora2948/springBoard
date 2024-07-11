package com.example.Firstproject.dto;

import com.example.Firstproject.entity.Article;

public record ArticleForm(String title, String content) {
    public Article toEntity() {
        return new Article(null, title, content);
    }
}