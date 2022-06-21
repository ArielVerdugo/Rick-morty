package com.eventbrite.androidchallenge.ui.events

import androidx.arch.core.executor.testing.InstantTaskExecutorRule
import com.eventbrite.androidchallenge.viewmodel.CharactersInfoViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.test.*
import org.junit.After
import org.junit.Before
import org.junit.Rule
import org.junit.Test

@ExperimentalCoroutinesApi
class CharactersInfoViewModelTest {

    @get:Rule val instantTaskExecutorRule = InstantTaskExecutorRule()

    private val dispatcher = UnconfinedTestDispatcher()

    @Before
    fun setup() {
        Dispatchers.setMain(dispatcher)
    }

    @After
    fun teardown() {
        Dispatchers.resetMain()
    }

    @Test
    fun template() = runTest(dispatcher) {
        val viewModel = CharactersInfoViewModel()
    }
}