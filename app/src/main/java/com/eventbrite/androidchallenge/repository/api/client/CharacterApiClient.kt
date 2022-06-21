package com.eventbrite.androidchallenge.repository.api.client

import com.eventbrite.androidchallenge.repository.api.dto.CharacterResponseBody

interface CharacterApiClient {
    suspend fun getCharactersByPage(page:Int): List<CharacterResponseBody>
}