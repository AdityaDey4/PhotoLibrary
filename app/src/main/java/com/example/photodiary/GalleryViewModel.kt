package com.example.photodiary

import androidx.hilt.lifecycle.ViewModelInject
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.switchMap
import androidx.lifecycle.viewModelScope
import androidx.paging.cachedIn
import com.example.photodiary.repo.UnsplashRepository

class GalleryViewModel @ViewModelInject
constructor(private val repository: UnsplashRepository) : ViewModel() {

    private val currentQuery = MutableLiveData(Constant.DEFAULT_QUERY)

    val photos = currentQuery.switchMap { query->
        repository.getSearchResult(query).cachedIn(viewModelScope)
    }

    fun serachPhotos(query: String){
        currentQuery.value = query
    }
}