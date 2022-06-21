package com.eventbrite.androidchallenge.repository.api

import com.eventbrite.androidchallenge.repository.api.dto.CharacterResponseBody
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface CharactersInfoEndPoints {

    @GET("character")
    suspend fun getCharactersByPage(@Query("page") page: Int): Response<List<CharacterResponseBody>>

}