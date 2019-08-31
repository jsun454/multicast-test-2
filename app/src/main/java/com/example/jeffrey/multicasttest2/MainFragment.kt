package com.example.jeffrey.multicasttest2

import android.os.Bundle
import android.util.Log
import androidx.leanback.app.BrowseSupportFragment
import androidx.leanback.widget.ArrayObjectAdapter

class MainFragment : BrowseSupportFragment() {
    override fun onActivityCreated(savedInstanceState: Bundle?) {
        Log.d("Jeffrey Sun", "fragment!")
        super.onActivityCreated(savedInstanceState)
        val adapter = ArrayObjectAdapter(TestPresenter())
        setAdapter(adapter)
    }
}
