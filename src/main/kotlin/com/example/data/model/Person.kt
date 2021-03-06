package com.example.data.model

import kotlinx.serialization.Serializable

@Serializable
data class Person(
    val id: Int,
    val name: String,
    val imageUrl: String
)
