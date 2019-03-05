package com.example.ehu.test_recycleviewanimation

import android.arch.lifecycle.LiveData
import android.arch.lifecycle.MutableLiveData
import android.arch.lifecycle.ViewModel

class FeedListViewModel : ViewModel() {
    val repository: DataRepository = DataRepository()

    private lateinit var _hooData: MutableLiveData<List<Hoo>>
    var hooData = _hooData

    fun getData() {
        //coroutuine
        _hooData.value = repository.getData()
    }
}