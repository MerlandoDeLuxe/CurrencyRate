package com.example.currencyrate.UI.API

import com.google.gson.JsonObject
import com.google.gson.annotations.JsonAdapter


data class CoinPriceRawData(
    @JsonAdapter(FreeValDeserializer::class)
    val coinPrice: String = ""
)