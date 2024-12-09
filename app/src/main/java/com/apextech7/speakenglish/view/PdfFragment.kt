package com.apextech7.speakenglish.view

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.apextech7.speakenglish.R
import com.apextech7.speakenglish.databinding.FragmentPdfBinding


class PdfFragment : Fragment() {

    private lateinit var binding: FragmentPdfBinding
    private var id:Int? =null
    private var tId:Int? =null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding=FragmentPdfBinding.inflate(inflater,container,false)
        id=arguments?.getInt("id")
        id?.let {

            if (id==1){
                binding.pdfFile.fromAsset("subject.pdf").spacing(14).load()
            }
            else if (id==2){
                binding.pdfFile.fromAsset("object.pdf").spacing(14).load()
            }
            else if (id==3){
                binding.pdfFile.fromAsset("verb.pdf").spacing(14).load()
            }
            else if (id==4){
                binding.pdfFile.fromAsset("person.pdf").spacing(14).load()
            }
            else if (id==5){
                binding.pdfFile.fromAsset("number.pdf").spacing(14).load()
            }

        }

        tId=arguments?.getInt("tId")
        tId?.let {

            if (tId==1){
                Toast.makeText(context, ""+tId, Toast.LENGTH_SHORT).show()
            }
            else if (tId==2){
                Toast.makeText(context, ""+tId, Toast.LENGTH_SHORT).show()
            }
            else if (tId==3){
                Toast.makeText(context, ""+tId, Toast.LENGTH_SHORT).show()
            }
            else if (tId==4){
                Toast.makeText(context, ""+tId, Toast.LENGTH_SHORT).show()
            }
            else{
                Toast.makeText(context, ""+tId, Toast.LENGTH_SHORT).show()
            }

        }

        return binding.root
    }

}