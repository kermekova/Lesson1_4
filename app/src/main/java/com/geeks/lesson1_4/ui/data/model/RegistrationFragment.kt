package com.geeks.lesson1_4.ui.data.model

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.geeks.lesson1_4.databinding.FragmentRegistrationBinding // Import the generated binding class

class RegistrationFragment : Fragment() {

    private var _binding: FragmentRegistrationBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentRegistrationBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        needList()
    }

    private fun needList() = with(binding) {
        buttonSend.setOnClickListener{
            findNavController().navigate(RegistrationFragmentDirections.actionRegistrationFragmentToDetailFragment(
                User(etName.text.toString(), etEmail.text.toString(), etPassword.text.toString())
            ))
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
