package com.eventbrite.androidchallenge.repository.api.dto

import com.google.gson.annotations.SerializedName
import java.util.*


data class ResponseCharactersDto(
    val results: List<CharacterResponseBody>
)

data class CharacterResponseBody(
    val created: String,
    val episode: List<String>,
    val gender: String,
    val id: Int,
    val image: String,
    val name: String,
    val species: String,
    val status: String,
    val type: String,
    val url: String
)


