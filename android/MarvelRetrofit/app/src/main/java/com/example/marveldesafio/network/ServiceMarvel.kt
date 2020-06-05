package com.example.marveldesafio.network

import com.example.marveldesafio.model.ComicResponse
import retrofit2.http.GET
import retrofit2.http.Query

interface ServiceMarvel {

    @GET("comic?")
    suspend fun getComicService(@Query("ts") ts : String,
                                @Query("hash") hash : String,
                                @Query("apikey") apikey : String
    ) : ComicResponse
}