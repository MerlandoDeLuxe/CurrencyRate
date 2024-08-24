package com.example.currencyrate.UI.API

import com.google.gson.annotations.SerializedName

data class Data(
    @SerializedName("CoinInfo") val coinInfo: CoinInfo
)