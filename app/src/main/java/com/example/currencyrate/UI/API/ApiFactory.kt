package com.example.currencyrate.UI.API

import retrofit2.Retrofit
import retrofit2.adapter.rxjava3.RxJava3CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory

object ApiFactory {
    private val URL_NAME = "https://min-api.cryptocompare.com/data/"
    private val URL_NAME1 = "https://www.cbr-xml-daily.ru/"

    private var apiService: ApiService? = null

    fun getInstance(): ApiService? {
        if (apiService == null) {
            val retrofit = Retrofit.Builder()
                .baseUrl(URL_NAME1)
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJava3CallAdapterFactory.create())
                .build()
            apiService = retrofit.create(ApiService::class.java)
        }
        return apiService
    }
}