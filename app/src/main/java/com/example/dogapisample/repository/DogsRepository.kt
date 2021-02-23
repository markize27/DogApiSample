package com.example.dogapisample.repository

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.example.dogapisample.data.retrofit.model.DogModel
import com.example.dogapisample.data.retrofit.api.ApiClient
import com.example.dogapisample.data.retrofit.api.ApiInterface
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response


class DogsRepository {
    private var apiInterface: ApiInterface? = null

    init {
        apiInterface = ApiClient.getApiClient().create(ApiInterface::class.java)
    }

    fun fetchRandomDog(): LiveData<DogModel> {
        val data = MutableLiveData<DogModel>()
        apiInterface?.fetchRandomDog()?.enqueue(object : Callback<DogModel> {

            override fun onResponse(
                call: Call<DogModel>,
                response: Response<DogModel>
            ) {

                val res = response.body()
                if (response.code() == 200 && res != null) {
                    data.value = res
                } else {
                    data.value = null
                }

            }

            override fun onFailure(call: Call<DogModel>, t: Throwable) {
                data.value = null
            }
        })
        return data
    }


}