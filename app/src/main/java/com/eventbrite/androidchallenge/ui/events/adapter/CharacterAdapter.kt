package com.eventbrite.androidchallenge.ui.events.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.eventbrite.androidchallenge.R
import com.eventbrite.androidchallenge.data.events.model.CharacterDto

class CharacterAdapter(private val charactersList:List<CharacterDto>) : RecyclerView.Adapter<CharacterViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CharacterViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        return CharacterViewHolder(layoutInflater.inflate(R.layout.character_card,parent,false))
    }

    override fun onBindViewHolder(holder: CharacterViewHolder, position: Int) {
        val characterItem = charactersList[position]
        holder.render(characterItem)
    }

    override fun getItemCount(): Int = charactersList.size

}