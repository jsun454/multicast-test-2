package com.example.jeffrey.multicasttest2

import android.os.Bundle
import androidx.fragment.app.FragmentActivity

class MainActivity : FragmentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val fragment = MainFragment()
        val fm = supportFragmentManager
        fm.beginTransaction().replace(R.id.activity_main_fragment, fragment).commit()
    }
}
