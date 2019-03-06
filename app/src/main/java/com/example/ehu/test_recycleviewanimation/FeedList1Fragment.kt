package com.example.ehu.test_recycleviewanimation

import android.databinding.DataBindingUtil
import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.widget.LinearLayoutManager
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import com.example.ehu.test_recycleviewanimation.databinding.FragmentFeedList1Binding

class FeedList1Fragment : Fragment() {
    lateinit var binding: FragmentFeedList1Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding =
            DataBindingUtil.inflate(inflater, R.layout.fragment_feed_list1, container, false)
        val list =
            listOf<String>("a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k","a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k","a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k")
        // LayoutManagerの設定
        val layoutManager = LinearLayoutManager(context)
        binding.recyclerview.layoutManager = layoutManager
        binding.recyclerview.adapter = DataAdapter(list)
        return binding.root
    }
}
