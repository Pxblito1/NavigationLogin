package com.example.navigationlogin

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import androidx.navigation.findNavController
import com.example.navigationlogin.databinding.FragmentSecondBinding

class SecondFragment : Fragment() {
    private var _binding: FragmentSecondBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentSecondBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.btnvolver.setOnClickListener {
            view.findNavController().navigate(R.id.action_secondFragment_to_firstFragment,null)
        }
        val email =  "Mail: " + arguments?.getString("Mail")
        binding.tvmail.text= email
        val teelefono = "Teléfono: " + arguments?.getString("Telefono")
        binding.tvtlfno.text= teelefono
        val name = "Nombre: " + arguments?.getString("Nombre")
        binding.tvnombre.text= name

    }
}