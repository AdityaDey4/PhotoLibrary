package com.example.photodiary.repo

import androidx.paging.Pager
import androidx.paging.PagingConfig
import androidx.paging.liveData
import com.example.photodiary.retrofit.API
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class UnsplashRepository @Inject constructor(private val api: API) {

    fun getSearchResult(query: String) =
        Pager(
            config = PagingConfig(
                pageSize = 10, // 1 page = 10 photos
                //pageSize = 100, // max size of recyclerview is 100
                enablePlaceholders = false
            ),
            pagingSourceFactory = {UnsplashPagingSource(api, query)}
        ).liveData
}