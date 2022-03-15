package com.example.retrofit.service

import android.telecom.Call
import com.example.retrofit.model.CryptoModel
import io.reactivex.Observable
import retrofit2.http.GET

interface CryptoAPI {

    //GET, POST, UPDATE, DELETE
    //https://raw.githubusercontent.com/
    // atilsamancioglu/K21-JSONDataSet/master/crypto.json

    @GET("atilsamancioglu/K21-JSONDataSet/master/crypto.json")
    fun getData():Observable<List<CryptoModel>>

//fun getData(): retrofit2.Call<List<CryptoModel>>

}