package com.example.newnavigation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.Navigation


class firts_fragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_firts_fragment, container, false)
        val Button1: Button = view.findViewById(R.id.botao1)
        val Button2: Button = view.findViewById(R.id.botao2)

        Button1.setOnClickListener {
            Navigation.findNavController(view).navigate(R.id.action_firts_fragment_to_second_fragment)
        }

        Button2.setOnClickListener {
            Navigation.findNavController(view).navigate(R.id.action_firts_fragment_to_tree_fragment)
        }



        return view
    }
}



