package com.eventbrite.androidchallenge.ui.events.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.paging.PagingDataAdapter
import androidx.recyclerview.widget.DiffUtil
import com.eventbrite.androidchallenge.R
import com.eventbrite.androidchallenge.repository.api.dto.CharacterResponseBody

class CharacterAdapter: PagingDataAdapter<CharacterResponseBody, CharacterViewHolder>(diffCallback)  {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CharacterViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        return CharacterViewHolder(layoutInflater.inflate(R.layout.character_card,parent,false))
    }

    override fun onBindViewHolder(holder: CharacterViewHolder, position: Int) {
        val item = getItem(position)
        holder.render(item)
    }

    companion object {
        val diffCallback = object :DiffUtil.ItemCallback<CharacterResponseBody>() {
            override fun areItemsTheSame(oldItem: CharacterResponseBody, newItem: CharacterResponseBody):Boolean =
                oldItem == newItem

            override fun areContentsTheSame(oldItem: CharacterResponseBody, newItem: CharacterResponseBody): Boolean =
            oldItem.name == newItem.name
            }
    }
}