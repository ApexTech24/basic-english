package com.apextech7.speakenglish.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.apextech7.speakenglish.databinding.TopicItemRowBinding
import com.apextech7.speakenglish.model.Topics

class TopicAdapter(val itemClickedCallback:(Topics)->Unit): ListAdapter<Topics, TopicAdapter.TopicViewHolder>(TopicsDiffUtils()) {

   override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TopicViewHolder {
      val binding=TopicItemRowBinding.inflate(
         LayoutInflater.from(parent.context),parent,false)
      return TopicViewHolder(binding)
   }

   override fun onBindViewHolder(holder: TopicViewHolder, position: Int) {
      val topics:Topics=getItem(position)
      holder.bind(topics)

      holder.itemView.setOnClickListener {
         itemClickedCallback(topics)
      }
   }

   class TopicViewHolder(val topicRowBinding:TopicItemRowBinding):RecyclerView.ViewHolder(topicRowBinding.root){
      fun bind(topics: Topics){
         topicRowBinding.topic=topics
      }

   }

   class TopicsDiffUtils:DiffUtil.ItemCallback<Topics>() {
      override fun areItemsTheSame(oldItem: Topics, newItem: Topics): Boolean {
         return oldItem.id==newItem.id
      }

      override fun areContentsTheSame(oldItem: Topics, newItem: Topics): Boolean {
         return oldItem==newItem
      }

   }

}