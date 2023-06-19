package com.example.droidnotionapp.presentation.adapters

import androidx.recyclerview.widget.DiffUtil
import com.example.droidnotionapp.domain.models.CompetenceEntity

class CompetenceDiffCallback : DiffUtil.ItemCallback<CompetenceEntity>() {
    override fun areItemsTheSame(oldItem: CompetenceEntity, newItem: CompetenceEntity): Boolean {
        return oldItem.id == newItem.id
    }

    override fun areContentsTheSame(oldItem: CompetenceEntity, newItem: CompetenceEntity): Boolean {
        return oldItem == newItem
    }
}