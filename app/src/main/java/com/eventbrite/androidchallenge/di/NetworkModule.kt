package com.eventbrite.androidchallenge.di

import com.eventbrite.androidchallenge.repository.api.CharactersInfoEndPoints
import com.eventbrite.androidchallenge.repository.api.client.CharacterApiClient
import com.eventbrite.androidchallenge.repository.api.client.CharacterApiClientImpl
import com.eventbrite.androidchallenge.utils.Constants
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.create
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object NetworkModule {

    @Provides
    @Singleton
    fun provideRetrofit(): Retrofit{
        return Retrofit.Builder()
            .baseUrl(Constants.URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }

    @Provides
    @Singleton
    fun provideCharacterInfoApiClient(retrofit: Retrofit): CharactersInfoEndPoints{
        return retrofit.create(CharactersInfoEndPoints::class.java)
    }
}