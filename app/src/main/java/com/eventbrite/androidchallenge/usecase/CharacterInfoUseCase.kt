package com.eventbrite.androidchallenge.usecase


import com.eventbrite.androidchallenge.repository.CharactersPagingSource
import com.eventbrite.androidchallenge.repository.api.client.CharacterApiClient

import javax.inject.Inject

class CharacterInfoUseCase @Inject constructor(
    private val characterApiClient: CharacterApiClient){

    fun executeCharactersByPage(): CharactersPagingSource {
        return CharactersPagingSource(characterApiClient)
    }
}