package com.example.photodiary.repo

import com.example.photodiary.retrofit.API
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class UnsplashRepository @Inject constructor(private val api: API) {
}