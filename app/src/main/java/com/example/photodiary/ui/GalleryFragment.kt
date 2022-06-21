package com.example.photodiary.ui

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.example.photodiary.GalleryViewModel
import com.example.photodiary.R
import com.example.photodiary.repo.UnsplashRepository
import com.example.photodiary.retrofit.RetrofitInstance
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class GalleryFragment: Fragment(R.layout.fragment_gallery) {
    lateinit var viewModel: GalleryViewModel

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        viewModel = GalleryViewModel(UnsplashRepository((RetrofitInstance.getApi(RetrofitInstance.getRetrofit()))))
        viewModel.photos.observe(viewLifecycleOwner){

        }
    }
}