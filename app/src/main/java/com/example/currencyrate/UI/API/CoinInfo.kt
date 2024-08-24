package com.example.currencyrate.UI.API

import com.google.gson.annotations.SerializedName

data class CoinInfo (
    @SerializedName("Id"                 ) var Id                 : String? = null,
    @SerializedName("Name"               ) var Name               : String? = null,
    @SerializedName("FullName"           ) var FullName           : String? = null,
    @SerializedName("ImageUrl"           ) var ImageUrl           : String? = null
)