package com.example.photodiary

import androidx.hilt.lifecycle.ViewModelInject
import com.example.photodiary.repo.UnsplashRepository

class GalleryViewModel @ViewModelInject constructor(private val repository: UnsplashRepository) {
}