package com.example.myapplication

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.databinding.DataBindingUtil.setContentView
import androidx.navigation.Navigation
import androidx.navigation.findNavController
import com.example.myapplication.databinding.FragmentHomeBinding

//import com.example.myapplication.databinding.FragmentHomeBinding

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER


/**
 * A simple [Fragment] subclass.
 * Use the [HomeFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class HomeFragment : Fragment() {
            // TODO: Rename and change types of parameters
            //private lateinit var binding: FragmentHomeBinding
            override fun onCreateView(
                inflater: LayoutInflater, container: ViewGroup?,
                savedInstanceState: Bundle?
            ): View? {
                // Inflate the layout for this fragment
               // return inflater.inflate(R.layout.fragment_home, container, false)
               val binding = DataBindingUtil.inflate<FragmentHomeBinding>(inflater, R.layout.fragment_home, container, false)
                binding.startButton.setOnClickListener( Navigation.createNavigateOnClickListener(R.id.action_homeFragment_to_listFragment))

                return binding.root
               // val binding: FragmentHomeBinding = DataBindingUtil.inflate(inflater, R. layout.fragment_home, container, false)
                //return binding.root
            }


}