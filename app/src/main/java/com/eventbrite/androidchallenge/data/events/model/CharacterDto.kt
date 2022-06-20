package com.eventbrite.androidchallenge.data.events.model

import com.google.gson.annotations.SerializedName
import java.net.URL
import java.util.*

data class CharacterDto(
    val id: String,
    val name: String,
    @SerializedName("start_date")
    val startDate: Date,
    val image: String,
    val type: String,
    val status:String,
    val species:String
)

data class CharactersDto(
    val events: List<CharacterDto>
)