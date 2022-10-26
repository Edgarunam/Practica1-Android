package com.etobon.mathapplication

import android.os.Bundle
import android.text.Editable
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.View.inflate
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.Spinner
import android.widget.Toast
import androidx.core.graphics.toColor
import androidx.fragment.app.FragmentActivity
import com.etobon.mathapplication.databinding.ActivityMain2Binding.inflate
import com.etobon.mathapplication.databinding.FragmentBlankBinding
import com.etobon.mathapplication.databinding.FragmentBlankBinding.inflate


class Fragment1 : Fragment(){

    private var _binding: FragmentBlankBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View?{

        _binding = FragmentBlankBinding.inflate(inflater,container,false)
        val view = binding.root
        return view

    }

    override fun onStart() {
        super.onStart()
        binding.button2.setOnClickListener {
            binding.volumentv.text = "Hola desde Fragment"
        }
    }
    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}



