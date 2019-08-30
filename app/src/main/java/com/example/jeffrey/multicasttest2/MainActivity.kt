package com.example.jeffrey.multicasttest2

import android.os.Bundle
import androidx.leanback.app.BrowseSupportFragment
import androidx.fragment.app.FragmentActivity

class MainActivity : FragmentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // maybe dont even use this
        val fm = supportFragmentManager
        // play around with the functions in this and read the apis/look up project examples
        BrowseSupportFragment.instantiate(this, "")
    }
}
