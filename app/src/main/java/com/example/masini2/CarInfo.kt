package com.example.masini2

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import com.example.masini2.data.CarData
import com.example.masini2.databinding.FragmentFirstBinding
import com.example.masini2.databinding.FragmentInfoBinding
import com.example.masini2.databinding.FragmentSecondBinding

/**
 * A simple [Fragment] subclass as the second destination in the navigation.
 */
class CarInfo : Fragment() {

    private var _binding: FragmentInfoBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    val args: CarInfoArgs by navArgs()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        _binding = FragmentInfoBinding.inflate(inflater, container, false)
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val carId = args.carIdArgument

        val infos = CarData().allCars()

        binding.carTitle.text=infos[carId-1].model
        binding.carDescription.text=infos[carId-1].descriere
        binding.imageView.setImageDrawable(ContextCompat.getDrawable(requireActivity(),infos[carId-1].photo))
        binding.numarOrdine.text=args.carIdArgument.toString()
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}