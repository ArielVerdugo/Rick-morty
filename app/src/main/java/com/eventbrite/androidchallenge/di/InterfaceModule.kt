package com.eventbrite.androidchallenge.di

import com.eventbrite.androidchallenge.repository.api.client.CharacterApiClient
import com.eventbrite.androidchallenge.repository.api.client.CharacterApiClientImpl
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent


@Module
@InstallIn(SingletonComponent::class)
abstract class InterfaceModule {
    @Binds
    abstract fun provideApiClientInterface(characterApiClientImpl: CharacterApiClientImpl):CharacterApiClient
}