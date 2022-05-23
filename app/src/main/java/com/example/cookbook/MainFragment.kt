package com.example.cookbook

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.cookbook.databinding.ActivityMainBinding


class MainFragment : Fragment() {



    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val data = listOf<String>("dish 1", "dish 2", "dish 3", "dish 4", "dish5")
        val view = inflater.inflate(R.layout.fragment_main, container, false)
        val list = view.findViewById<RecyclerView>(R.id.list)
        val adapter = MainListAdapter()
        adapter.data = data
        list.adapter = adapter
        return view
    }
}