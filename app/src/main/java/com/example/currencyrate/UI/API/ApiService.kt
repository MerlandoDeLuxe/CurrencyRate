package com.example.currencyrate.UI.API

import io.reactivex.rxjava3.core.Single
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiService {
//
//    @GET("top/totalvolfull")
//    fun getAllCurrencies(
//        @Query(LIMIT_PARAM) limit: String,
//        @Query(TO_SYMBOL_PARAM) tsym: String,
//        @Query(API_KEY_PARAM) apiKey: String = API_KEY
//    ): Single<Object>
//
//    @GET("pricemulti")
//    fun getPriceSymbolToSymbol(
//        @Query(FROM_SYMBOL_PARAM) fsym: String,
//        @Query(TO_SYMBOL_PARAM) tsym: String,
//        @Query(API_KEY) apiKey: String = API_KEY
//    ):Single<CoinPriceRawData>

    @GET("daily_json.js")
    fun getAllCurrencies():String

    companion object {
        private const val API_KEY =
            "a72ba655e0ae8f47023bf3e696d33e03a70f49444df8b55faec0aa7cfdaeee16"
        private const val API_KEY_PARAM = "api_key"
        private const val LIMIT_PARAM = "limit"
        private const val TO_SYMBOL_PARAM = "tsym"
        private const val FROM_SYMBOL_PARAM = "fsym"
        private const val CONST_CURRENCY_PARAM = "USD"
    }
}