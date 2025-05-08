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
import com.android.odev4.databinding.FragmentSayfaXBinding
import com.android.odev4.databinding.FragmentSayfaYBinding

class SayfaY: Fragment() {
    private var _binding: FragmentSayfaYBinding? = null
    private val binding get() = _binding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentSayfaYBinding.inflate(inflater, container, false)
        val view = binding.root
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.geriAnasayfaButton.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.action_sayfaY_to_anasayfa)
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

}