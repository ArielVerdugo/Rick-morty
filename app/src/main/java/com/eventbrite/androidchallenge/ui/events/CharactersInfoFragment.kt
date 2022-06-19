package com.eventbrite.androidchallenge.ui.events

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.recyclerview.widget.LinearLayoutManager
import com.eventbrite.androidchallenge.data.events.model.CharacterDto
import com.eventbrite.androidchallenge.data.events.model.ImageDto
import com.eventbrite.androidchallenge.databinding.CharactersInfoFragmentBinding
import com.eventbrite.androidchallenge.ui.events.adapter.CharacterAdapter
import java.net.URL
import java.util.*

class CharactersInfoFragment : Fragment() {

    private var _binding: CharactersInfoFragmentBinding? = null
    private val binding get() = _binding

    companion object {
        fun newInstance() = CharactersInfoFragment()
    }

    private val viewModel: EventsViewModel by viewModels(factoryProducer = { EventsViewModelFactory() })


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = CharactersInfoFragmentBinding.inflate(layoutInflater,container,false)
        return binding?.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initUi()
    }

    fun initUi(){
        val character1 = CharacterDto("123","Morty",
            Date(System.currentTimeMillis()), ImageDto(URL("https://rickandmortyapi.com/api/character/avatar/36.jpeg")),"Humano")

        val character2 = CharacterDto("123","Ricky Martin",
            Date(System.currentTimeMillis()), ImageDto(URL("https://rickandmortyapi.com/api/character/avatar/36.jpeg")),"Humano")

        val listCharacterDummy = listOf(character1,character2)


        binding?.charactersRecyclerView?.layoutManager = LinearLayoutManager(this.context)
        binding?.charactersRecyclerView?.adapter = CharacterAdapter(listCharacterDummy)
    }
}