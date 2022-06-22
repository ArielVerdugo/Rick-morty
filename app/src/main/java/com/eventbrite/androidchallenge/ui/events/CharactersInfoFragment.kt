package com.eventbrite.androidchallenge.ui.events

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.lifecycleScope
import androidx.recyclerview.widget.LinearLayoutManager
import com.eventbrite.androidchallenge.databinding.CharactersInfoFragmentBinding
import com.eventbrite.androidchallenge.ui.events.adapter.CharacterAdapter
import com.eventbrite.androidchallenge.viewmodel.CharactersInfoViewModel
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.flow.collectLatest
import kotlinx.coroutines.launch

@AndroidEntryPoint
class CharactersInfoFragment : Fragment() {

    private var _binding: CharactersInfoFragmentBinding? = null
    private val binding get() = _binding
    private val viewModel: CharactersInfoViewModel by viewModels()
    private lateinit var charactersInfoAdapter: CharacterAdapter

    companion object {
        fun newInstance() = CharactersInfoFragment()
    }

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
        initConfig()
    }

    private fun initConfig(){

        binding?.charactersRecyclerView?.layoutManager = LinearLayoutManager(this.context)
        charactersInfoAdapter = CharacterAdapter()

        lifecycleScope.launch{
            viewModel.charactersList.collectLatest {
                charactersInfoAdapter.submitData(it)
            }
        }


    }
}