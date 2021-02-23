package com.example.dogapisample.data.retrofit.api

import com.example.dogapisample.data.retrofit.model.DogModel
import retrofit2.Call
import retrofit2.http.GET


interface ApiInterface {
    @GET("api/breeds/image/random")
    fun fetchRandomDog(): Call<DogModel>
}