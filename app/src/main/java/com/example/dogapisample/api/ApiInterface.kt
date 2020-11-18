package com.example.dogapisample.api

import com.example.dogapisample.model.DogModel
import retrofit2.Call
import retrofit2.http.GET


interface ApiInterface {
    @GET("api/breeds/image/random")
    fun fetchRandomDog(): Call<DogModel>
}