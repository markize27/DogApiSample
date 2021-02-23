package com.example.dogapisample.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.dogapisample.data.retrofit.model.DogModel
import com.example.dogapisample.repository.DogsRepository


class DogViewModel() : ViewModel() {

    private var dogsRepository: DogsRepository? = null
    var dogModelLiveData: LiveData<DogModel>? = null


    init {
        dogsRepository = DogsRepository()
        dogModelLiveData = MutableLiveData()

    }

    fun fetchRandomDog() {
        dogModelLiveData = dogsRepository?.fetchRandomDog()
    }


}

