package com.example.newnavigation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation

class tree_fragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_tree_fragment, container, false)

        view.setOnClickListener {
            Navigation.findNavController(view).navigate(R.id.action_tree_fragment_to_five_fragment)
        }

        return view
    }
}



