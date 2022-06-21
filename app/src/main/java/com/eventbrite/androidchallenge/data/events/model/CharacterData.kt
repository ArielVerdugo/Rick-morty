package com.eventbrite.androidchallenge.data.events.model

import android.os.Parcelable
import com.eventbrite.androidchallenge.repository.api.dto.CharacterResponseBody
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize

import java.util.*

@Parcelize
data class CharacterData(
    @SerializedName("id")
    val id: String,
    @SerializedName("name")
    val name: String,
    @SerializedName("created")
    val created: Date,
    @SerializedName("image")
    val image: String,
    @SerializedName("type")
    val type: String,
    @SerializedName("status")
    val status:String,
    @SerializedName("species")
    val species:String
): Parcelable


fun CharacterResponseBody.toModel(): CharacterData {
    return CharacterData(
        this.id,
        this.name,
        this.created,
        this.image,
        this.type,
        this.status,
        this.species
    )
}

