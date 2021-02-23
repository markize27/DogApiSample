package com.example.dogapisample.data.repository

import com.example.dogapisample.data.retrofit.api.ApiInterface
import com.example.dogapisample.data.retrofit.model.DogModel
import retrofit2.Call
import retrofit2.Retrofit
import javax.inject.Inject

class DogApiSampleRepositoryImpl @Inject constructor(
    private val retrofit: Retrofit
) : DogApiSampleRepository {
    override fun getRandomDog(login: String, password: String): Call<DogModel> {
        return retrofit.create(ApiInterface::class.java)
            .fetchRandomDog()
    }


}