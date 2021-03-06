package com.example.photodiary.retrofit

import com.example.photodiary.Constant
import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.Query

interface API {

    @Headers("Accept-Version: v1", "Authorization: Client-id ${Constant.ACCESS_KEY}")
    @GET("search/photos")
    suspend fun searchPhoto(
        @Query("query") query: String,
        @Query("page") page: Int,
        @Query("per_page") per_page: Int
    ) : UnsplashResponce
}