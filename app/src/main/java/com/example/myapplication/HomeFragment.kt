package com.example.myapplication

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.navigation.NavController
import androidx.navigation.Navigation
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView


class HomeFragment : Fragment() {
    lateinit var nav: NavController
    lateinit var Btn: Button
    lateinit var myRec2: RecyclerView
    lateinit var itemList2: ArrayList<data>
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        nav = Navigation.findNavController(view)
        Btn = view.findViewById(R.id.Btn)
        itemList2 = ArrayList()
        itemList2.add(data(R.drawable.n1, "john", 23))
        itemList2.add(data(R.drawable.n2, "jovany", 26))
        itemList2.add(data(R.drawable.n3, "tadrous", 23))
        itemList2.add(data(R.drawable.n4, "fady", 22))
        myRec2 = view.findViewById(R.id.rv2)
        myRec2.layoutManager = LinearLayoutManager(requireContext(), RecyclerView.VERTICAL, false)
        myRec2.adapter = Adapter(itemList2)
        Btn.setOnClickListener {
            val action = HomeFragmentDirections.actionHomeToProfile("Hello World")
            nav.navigate(action)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_home, container, false)
    }

}