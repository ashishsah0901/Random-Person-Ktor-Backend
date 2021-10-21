package com.example.data.model

import kotlinx.serialization.Serializable

@Serializable
data class PersonRequest(
    val name: String,
    val imageUrl: String
)
