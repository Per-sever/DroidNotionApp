package com.example.droidnotionapp.presentation.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.ListAdapter
import com.example.droidnotionapp.databinding.ItemCompetenceBinding
import com.example.droidnotionapp.domain.models.CompetenceEntity

class CompetenceListAdapter() : ListAdapter<CompetenceEntity, CompetenceItemViewHolder>
    (CompetenceDiffCallback()) {

    var onCompetenceClickListener: ((CompetenceEntity) -> Unit)? = null


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CompetenceItemViewHolder {
        val binding = ItemCompetenceBinding.inflate(
            LayoutInflater.from(parent.context), parent,
            false
        )
        return CompetenceItemViewHolder(binding)
    }

    override fun onBindViewHolder(holder: CompetenceItemViewHolder, position: Int) {
        val item = getItem(position)
        holder.binding.tvTextCard.text = item.name

        holder.itemView.setOnClickListener {
            onCompetenceClickListener?.invoke(item)
        }
    }
}
