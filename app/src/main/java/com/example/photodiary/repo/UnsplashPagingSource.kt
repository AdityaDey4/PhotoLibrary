package com.example.photodiary.repo

import androidx.paging.PagingSource
import androidx.paging.PagingState
import com.example.photodiary.Constant
import com.example.photodiary.model.UnsplashPhoto
import com.example.photodiary.retrofit.API
import retrofit2.HttpException
import java.io.IOException

class UnsplashPagingSource(
    private val api: API,
    private val query: String
): PagingSource<Int, UnsplashPhoto>() {
    override suspend fun load(params: LoadParams<Int>): LoadResult<Int, UnsplashPhoto> {
        val position = params.key ?: Constant.STARTING_PAGE_INDEX

        return try {
            val response = api.searchPhoto(query, position, params.loadSize)
            val photos = response.results

            LoadResult.Page( //-> represent 0ne page of result in recyclerview
                data = photos,
                prevKey = if(position==Constant.STARTING_PAGE_INDEX) null else position-1,
                nextKey = if(photos.isEmpty()) null else position+1
            )
        }catch (exception : IOException){
            LoadResult.Error(exception)

        }catch (exception : HttpException){
            LoadResult.Error(exception)
        }
    }

    override fun getRefreshKey(state: PagingState<Int, UnsplashPhoto>): Int? {
        return null
    }
}