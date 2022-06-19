package com.eventbrite.androidchallenge.data.events.model

import com.google.gson.annotations.SerializedName
import java.net.URL
import java.util.*

data class CharacterDto(
    val id: String,
    val name: String,
    @SerializedName("start_date")
    val startDate: Date,
    val image: ImageDto? = null,
    val type: String
)

data class CharactersDto(
    val events: List<CharacterDto>
)

data class ImageDto(
    val url: URL
)