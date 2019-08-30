package com.example.jeffrey.multicasttest2

import android.os.Bundle
import android.util.Log
import androidx.leanback.app.BrowseSupportFragment

class MainFragment : BrowseSupportFragment() {
    override fun onActivityCreated(savedInstanceState: Bundle?) {
        Log.d("Jeffrey Sun", "fragment!")
        super.onActivityCreated(savedInstanceState)
    }
}
