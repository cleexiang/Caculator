package com.lixiang

import android.os.Bundle
import android.support.v4.app.FragmentActivity

import com.lixiang.caculator.R

class MainActivity : FragmentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}
