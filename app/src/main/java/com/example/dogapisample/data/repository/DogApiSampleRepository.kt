package com.example.dogapisample.data.repository

import com.example.dogapisample.data.retrofit.model.DogModel
import retrofit2.Call

interface DogApiSampleRepository {

    fun getRandomDog(login: String, password: String): Call<DogModel>

}