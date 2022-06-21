package com.eventbrite.androidchallenge.repository

import androidx.paging.PagingSource
import androidx.paging.PagingState
import com.eventbrite.androidchallenge.data.events.model.CharacterData
import com.eventbrite.androidchallenge.repository.api.client.CharacterApiClient
import com.eventbrite.androidchallenge.repository.api.client.CharacterApiClientImpl
import com.eventbrite.androidchallenge.repository.api.dto.CharacterResponseBody
import com.eventbrite.androidchallenge.repository.api.dto.ResponseCharactersDto

class CharactersPagingSource(private val characterApiClient: CharacterApiClient) : PagingSource<Int, CharacterResponseBody>() {

    override fun getRefreshKey(state: PagingState<Int, CharacterResponseBody>): Int? {
        return null
    }

    override suspend fun load(params: LoadParams<Int>): LoadResult<Int, CharacterResponseBody> {

        return try {
            val currentPage = params.key ?: 1
            val response = characterApiClient.getCharactersByPage(currentPage)

            LoadResult.Page(
                data = response,
                prevKey = if (currentPage == 1) null else -1,
                nextKey = currentPage.plus(1)
            )
        } catch (e: Exception) {
            LoadResult.Error(e)
        }
    }


}