package com.eventbrite.androidchallenge.ui.events.adapter

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.eventbrite.androidchallenge.databinding.CharacterCardBinding
import com.eventbrite.androidchallenge.repository.api.dto.CharacterResponseBody

class CharacterViewHolder(view: View): RecyclerView.ViewHolder(view) {

    private val binding = CharacterCardBinding.bind(view)

    fun render(character: CharacterResponseBody?){
        binding.characterName.text = character?.name
        binding.characterType.text = character?.type
        Glide.with(binding.characterImage.context).load(character?.image).into(binding.characterImage)
    }
}