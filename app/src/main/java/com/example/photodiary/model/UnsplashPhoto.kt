package com.example.photodiary.model

data class UnsplashPhoto(
    val id: String,
    val description: String?,
    val user: UnsplashUser,
    val url: UnsplashUrl
)
