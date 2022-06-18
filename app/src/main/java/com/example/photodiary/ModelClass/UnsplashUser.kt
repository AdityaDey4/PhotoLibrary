package com.example.photodiary.ModelClass

data class UnsplashUser(
    val name: String?,
    val username: String
){
    val attributionUrl get() = "https://unsplash.com/$username/utm_source-PhotoDiary_medium-referral"
}
