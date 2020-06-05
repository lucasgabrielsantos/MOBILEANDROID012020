package com.example.marveldesafio.model

data class Data(
    val count: Int,
    val limit: Int,
    val offset: Int,
    val results: MutableSet<Comic>,
    val total: Int
)