package com.eventbrite.androidchallenge.repository.api.client

import com.eventbrite.androidchallenge.repository.api.CharactersInfoEndPoints
import com.eventbrite.androidchallenge.repository.api.dto.CharacterResponseBody
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import javax.inject.Inject

class CharacterApiClientImpl @Inject constructor(private val apiClient: CharactersInfoEndPoints): CharacterApiClient {
    override suspend fun getCharactersByPage(page: Int): List<CharacterResponseBody> {
        return withContext(Dispatchers.IO){
            val response = apiClient.getCharactersByPage(page)
            response.body() ?: emptyList()
        }
    }

}