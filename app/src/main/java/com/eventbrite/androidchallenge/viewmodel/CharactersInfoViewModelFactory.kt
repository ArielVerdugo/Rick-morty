package com.eventbrite.androidchallenge.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.eventbrite.androidchallenge.usecase.CharacterInfoUseCase

class CharactersInfoViewModelFactory(private val characterInfoUseCase: CharacterInfoUseCase) : ViewModelProvider.Factory {

    @Suppress("UNCHECKED_CAST")
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(CharactersInfoViewModel::class.java)) {
            return CharactersInfoViewModel(characterInfoUseCase) as T
        } else {
            throw IllegalArgumentException("ViewModel $modelClass not supported")
        }
    }
}