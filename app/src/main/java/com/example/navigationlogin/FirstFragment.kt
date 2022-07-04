package com.example.navigationlogin

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.os.bundleOf
import androidx.navigation.Navigation
import androidx.navigation.findNavController
import com.example.navigationlogin.databinding.FragmentFirstBinding

class FirstFragment : Fragment() {
    private var _binding: FragmentFirstBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentFirstBinding.inflate(inflater,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.btnir.setOnClickListener{
            val bundle= bundleOf("Mail" to binding.etmail.text.toString(),
                "Telefono" to binding.ettfno.text.toString(),
                "Nombre" to binding.etnombre.text.toString())
            view.findNavController().navigate(R.id.action_firstFragment_to_secondFragment,bundle)        }


    }
}