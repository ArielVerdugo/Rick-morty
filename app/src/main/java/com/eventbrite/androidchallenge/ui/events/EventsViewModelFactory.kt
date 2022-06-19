package com.eventbrite.androidchallenge.ui.events

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider

class EventsViewModelFactory : ViewModelProvider.Factory {

    @Suppress("UNCHECKED_CAST")
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(EventsViewModel::class.java)) {
            return EventsViewModel() as T
        } else {
            throw IllegalArgumentException("ViewModel $modelClass not supported")
        }
    }
}