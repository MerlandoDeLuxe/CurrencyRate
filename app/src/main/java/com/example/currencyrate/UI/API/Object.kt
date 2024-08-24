package com.example.currencyrate.UI.API

import com.google.gson.annotations.SerializedName

data class Object(
    @SerializedName("Data") val data: List<Data> = listOf()
) {
}