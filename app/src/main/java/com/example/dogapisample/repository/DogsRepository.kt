package com.example.dogapisample.repository

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.example.dogapisample.model.DogModel
import com.example.dogapisample.api.ApiClient
import com.example.dogapisample.api.ApiInterface
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response


class DogsRepository {
    private var apiInterface: ApiInterface?=null

    init {
        apiInterface = ApiClient.getApiClient().create(ApiInterface::class.java)
    }
    fun fetchRandomDog():LiveData<DogModel>{
        val data = MutableLiveData<DogModel>()
        apiInterface?.fetchRandomDog()?.enqueue(object : Callback<DogModel> {

            override fun onResponse(
                call: Call<DogModel>,
                response: Response<DogModel>
            ) {

                val res = response.body()
                if (response.code() == 200 &&  res!=null){
                    data.value = res
                }else{
                    data.value = null
                }

            }
            override fun onFailure(call: Call<DogModel>, t: Throwable) {
                data.value = null
            }
        })
        return data
    }



//    fun fetchAllDogs():LiveData<List<DogModel>>{
//        val data = MutableLiveData<List<DogModel>>()
//
//        apiInterface?.fetchAllDogs()?.enqueue(object : Callback<List<DogModel>>{
//
//            override fun onFailure(call: Call<List<DogModel>>, t: Throwable) {
//                data.value = null
//            }
//
//            override fun onResponse(
//                call: Call<List<DogModel>>,
//                response: Response<List<DogModel>>
//            ) {
//
//                val res = response.body()
//                if (response.code() == 200 &&  res!=null){
//                    data.value = res
//                }else{
//                    data.value = null
//                }
//
//            }
//        })
//
//        return data
//
//    }
}