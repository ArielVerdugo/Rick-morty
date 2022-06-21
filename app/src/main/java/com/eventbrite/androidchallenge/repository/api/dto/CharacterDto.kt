package com.eventbrite.androidchallenge.repository.api.dto

import com.google.gson.annotations.SerializedName
import java.util.*

/*data class CharacterDto(
    val id: String,
    val name: String,
    @SerializedName("start_date")
    val startDate: Date,
    val image: String,
    val type: String,
    val status:String,
    val species:String
)*/

data class ResponseCharactersDto(
    val characters: List<CharacterResponseBody>
)

class CharacterResponseBody{
    @SerializedName("id")
    var id: String = ""
    @SerializedName("name")
    var name: String = ""
    @SerializedName("created")
    var created: Date = Date()
    @SerializedName("image")
    var image: String = ""
    @SerializedName("type")
    var type: String = ""
    @SerializedName("status")
    var status:String = ""
    @SerializedName("species")
    var species:String = ""
}


