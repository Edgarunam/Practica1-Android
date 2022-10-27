package com.etobon.mathapplication

import android.content.Intent
import android.os.Bundle
import android.text.Editable
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.EditText
import android.widget.Toast
import androidx.core.graphics.toColor
import androidx.fragment.app.FragmentActivity
import com.etobon.mathapplication.databinding.ActivityMain2Binding.bind
import com.etobon.mathapplication.databinding.ActivityMain2Binding.inflate
import com.etobon.mathapplication.databinding.FragmentBlankBinding
import com.etobon.mathapplication.databinding.FragmentBlankBinding.inflate
import java.text.DecimalFormat


class Fragment1 : Fragment(){

    private var _binding: FragmentBlankBinding? = null
    private val binding get() = _binding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {

        }
    }

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



        binding.btnDensidad.setOnClickListener {
            val bundle = Bundle()
            var Status: Int = 0
            if (binding.etMasa.text.isEmpty() && binding.etVolumen.text.isNotEmpty()) {

                Status = 1

            } else if (binding.etVolumen.text.isEmpty() && binding.etMasa.text.isNotEmpty()) {

                Status = 2
            }
            else if (binding.etVolumen.text.isEmpty() && binding.etMasa.text.isEmpty()) {

                Status = 3
            }

            when (Status) {
                1 -> {binding.etMasa.hint = "Ingrese la Masa"}
                2 -> {binding.etVolumen.hint = "Ingrese el Volumen"}
                3 -> {binding.etMasa.hint = "Ingrese la Masa"
                      binding.etVolumen.hint = "Ingrese el Volumen"}
                else -> {
                    var masa: Float = binding.etMasa.text.toString().toFloat()
                    var volumen:Float = binding.etVolumen.text.toString().toFloat()
                    if(masa < 0 ){
                        binding.Answertv.text = "No se permiten masas negativas"
                    }
                    else if(volumen < 0 ){
                        binding.Answertv.text = "No se permiten volumenes Negativos"
                    }
                    else if(volumen == 0.toFloat() ){
                        binding.Answertv.text = "No se permiten volumenes nulos"
                    }
                    else{
                        var DensityAns:String = Density(masa,volumen).toString()
                        bundle.putString("Density", DensityAns)
                        val intent = Intent(context, Resultado::class.java)
                        intent.putExtras(bundle)
                        startActivity(intent)

                    }

                }


            }


        }
    }


        override fun onDestroyView() {
            super.onDestroyView()
            _binding = null
        }

        fun Density(masaInput: Float, volumenInput: Float): Float {
            return masaInput / volumenInput

            }



}



