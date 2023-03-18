package com.develop.newsapp.models


import com.develop.newsapp.models.Article

data class NewsResponse(
    val articles: List<Article>,
    val status: String,
    val totalResults: Int
)