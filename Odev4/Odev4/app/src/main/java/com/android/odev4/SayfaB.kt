package com.android.odev4

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.android.odev4.databinding.FragmentAnasayfaBinding
import com.android.odev4.databinding.FragmentSayfaABinding
import com.android.odev4.databinding.FragmentSayfaBBinding

class SayfaB: Fragment() {
    private var _binding: FragmentSayfaBBinding? = null
    private val binding get() = _binding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentSayfaBBinding.inflate(inflater, container, false)
        val view = binding.root
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.gecisYButton.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.action_sayfaB_to_sayfaY)
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

}