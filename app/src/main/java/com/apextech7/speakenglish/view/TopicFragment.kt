package com.apextech7.speakenglish.view

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.os.bundleOf
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.apextech7.speakenglish.R
import com.apextech7.speakenglish.adapter.TopicAdapter
import com.apextech7.speakenglish.databinding.FragmentTopicBinding
import com.apextech7.speakenglish.model.Topics
import com.apextech7.speakenglish.utils.topicList


class TopicFragment : Fragment() {

    private lateinit var binding:FragmentTopicBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding=FragmentTopicBinding.inflate(inflater,container,false)
        val topicAdapter=TopicAdapter(::itemClicked)
        binding.topicRecyclerView.layoutManager=LinearLayoutManager(requireContext())
        binding.topicRecyclerView.adapter=topicAdapter
        topicAdapter.submitList(topicList)
        return binding.root
    }

    private fun itemClicked(topics: Topics){
        val bundle= bundleOf("tId" to topics.id)
        findNavController().navigate(R.id.action_topicFragment_to_pdfFragment, bundle)

    }

}