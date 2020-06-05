package com.example.marveldesafio.repository

import com.example.marveldesafio.model.ComicResponse
import com.example.marveldesafio.network.RetrofitInit
import com.example.marveldesafio.network.ServiceMarvel
import com.example.marveldesafio.util.GeradorHash.md5

class RepositoryMarvel {

    private var url = "https://gateway.marvel.com/v1/public/"
    private var service = ServiceMarvel::class
    private val public_key = "6eb7e8896ec5850c52515a8a23ee97f0"
    private val private_key = "0dd0c16fedb8a02985977eafca66b49f5e6a526f"
    private var ts = (System.currentTimeMillis() / 1000).toString()
    private val hash = md5(ts+public_key+private_key)
    private val serviceMarvel = RetrofitInit(url).create(service)

    suspend fun getComicService(): ComicResponse = serviceMarvel.getComicService(ts, hash, public_key)
}