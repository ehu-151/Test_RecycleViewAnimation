package com.example.ehu.test_recycleviewanimation

import android.databinding.DataBindingUtil
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
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
        return binding.root
    }
}
