package com.example.photodiary.ModelClass

data class UnsplashPhoto(
    val id: String,
    val description: String?,
    val user: UnsplashUser,
    val url: UnsplashUrl
)
