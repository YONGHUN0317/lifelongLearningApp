package com.example.lifelonglearningapp

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query
import java.net.URLDecoder


interface SearchService {
    @GET("tn_pubr_public_lftm_lrn_lctre_api")
    fun getEmgMedData(
        @Query("serviceKey") KEY: String,
        @Query("type") Type: String
    ): Call<LifelongResponse>
}