package com.apextech7.speakenglish.view

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.core.os.bundleOf
import androidx.navigation.fragment.findNavController
import com.apextech7.speakenglish.R
import com.apextech7.speakenglish.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {
    private lateinit var binding: FragmentHomeBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding= FragmentHomeBinding.inflate(layoutInflater,container,false)
        clickListener()
        return binding.root
    }

    private fun clickListener() {
        binding.subjectCardView.setOnClickListener {
            findNavController().navigate(R.id.action_homeFragment_to_pdfFragment, args = bundleOf("id" to 1))
        }
        binding.objectCardView.setOnClickListener {
            findNavController().navigate(R.id.action_homeFragment_to_pdfFragment,args = bundleOf("id" to 2))
        }
        binding.verbCardView.setOnClickListener {
            findNavController().navigate(R.id.action_homeFragment_to_pdfFragment,args = bundleOf("id" to 3))
        }
        binding.personCardView.setOnClickListener {
            findNavController().navigate(R.id.action_homeFragment_to_pdfFragment,args = bundleOf("id" to 4))
        }
        binding.numberCardView.setOnClickListener {
            findNavController().navigate(R.id.action_homeFragment_to_pdfFragment,args = bundleOf("id" to 5))
        }
        binding.patternCardView.setOnClickListener {
            findNavController().navigate(R.id.action_homeFragment_to_topicFragment)
        }
    }
}