package com.example.ehu.test_recycleviewanimation

import kotlin.random.Random

class DataRepository() {

    fun getData(): List<Hoo> {
        val list = (0..100).map { Hoo("名無し", Random(0).nextInt(), 0) }
        return list
    }
}