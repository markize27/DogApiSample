package com.example.dogapisample.viewmodel

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.example.dogapisample.model.DogModel
import com.example.dogapisample.repository.DogsRepository

class DogViewModel(application: Application): AndroidViewModel(application){

        private var dogsRepository: DogsRepository?=null
        var dogModelLiveData : LiveData<DogModel>?=null
//        var createDogsLiveData:LiveData<DogModel>?=null
//        var deleteDogsLiveData:LiveData<Boolean>?=null

        init {
            dogsRepository = DogsRepository()
            dogModelLiveData = MutableLiveData()
//            createDogsLiveData = MutableLiveData()
//            deleteDogsLiveData = MutableLiveData()
        }

        fun fetchRandomDog(){
            dogModelLiveData = dogsRepository?.fetchRandomDog()
        }

//        fun createPost(postModel: DogModel){
//            createPostLiveData = dogsRepository?.createPost(postModel)
//        }
//
//        fun deletePost(id:Int){
//            deletePostLiveData = dogsRepository?.deletePost(id)
//        }

    }

