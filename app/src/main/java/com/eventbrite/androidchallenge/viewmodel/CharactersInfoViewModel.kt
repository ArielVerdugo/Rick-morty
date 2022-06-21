package com.eventbrite.androidchallenge.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import androidx.paging.Pager
import androidx.paging.PagingConfig
import androidx.paging.cachedIn
import com.eventbrite.androidchallenge.usecase.CharacterInfoUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class CharactersInfoViewModel @Inject constructor(
    private val characterInfoUseCase: CharacterInfoUseCase) : ViewModel(){

    val charactersList = Pager(PagingConfig(pageSize = 1)) {
        characterInfoUseCase.executeCharactersByPage()

    }.flow.cachedIn(viewModelScope)

}