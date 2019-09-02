//package com.example.jeffrey.multicasttest2
//
//import android.os.Bundle
//import android.os.Handler
//import android.os.Looper
//import android.util.Log
//import androidx.core.content.ContextCompat
//import androidx.leanback.app.BrowseSupportFragment
//import androidx.leanback.widget.*
//
//class MainFragment : BrowseSupportFragment() {
//    override fun onActivityCreated(savedInstanceState: Bundle?) {
//        Log.d("Jeffrey Sun", "fragment!")
//        super.onActivityCreated(savedInstanceState)
//
////        val ps = ClassPresenterSelector()
////        ps.addClassPresenter(Card::class.java, TestPresenter())
//
//        val adapter = ArrayObjectAdapter(ListRowPresenter())
//        for(i in 1..3) {
//            val rowAdapter = ArrayObjectAdapter(TestPresenter())
//            rowAdapter.add(Card("Racer!! $i"))
//            val row = TestRow("Row $i", rowAdapter)
//            //TestRowView(activity!!.baseContext)
//            val headerItem = HeaderItem(row.name)
//            val listRow = ListRow(headerItem, row.adapter)
//            adapter.add(listRow)
//
//            //Handler(Looper.getMainLooper()).post { adapter.add(TestRowView(activity!!.baseContext)) }
//        }
//        setAdapter(adapter)
//
//        for(i in 1..3) {
//            var count = 0
//
//            val handler = Handler(Looper.getMainLooper())
//            handler.post(object : Runnable {
//                override fun run() {
//                    val rowAdapter = ArrayObjectAdapter(TestPresenter())
//                    rowAdapter.add(Card(" Racer ${++count}"))
//                    val row = TestRow("Row $i", rowAdapter)
//                    val headerItem = HeaderItem(row.name)
//                    val listRow = ListRow(headerItem, row.adapter)
//
//                    adapter.replace(i-1, listRow)
//                    handler.postDelayed(this, 100)
//                }
//            })
//        }
//
//        //badgeDrawable = ContextCompat.getDrawable(activity!!.baseContext,
//        //    R.drawable.app_icon_your_company)
//        title = "Racers"
//        headersState = BrowseSupportFragment.HEADERS_ENABLED
//        //isHeadersTransitionOnBackEnabled = true // ?
//    }
//}

/* --------------------------- TESTING VERTICAL GRID SUPPORT FRAGMENT ----------------------------*/

package com.example.jeffrey.multicasttest2

import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.util.Log
import androidx.leanback.app.VerticalGridSupportFragment
import androidx.leanback.widget.*

class MainFragment : VerticalGridSupportFragment() {
    override fun onCreate(savedInstanceState: Bundle?) {
        Log.d("Jeffrey Sun", "fragment!")
        super.onCreate(savedInstanceState)

        val mGridPresenter = GridPresenter()
        mGridPresenter.numberOfColumns = 1
        gridPresenter = mGridPresenter

        val mAdapter = ArrayObjectAdapter(TestPresenter())
        val strArr = ArrayList<String>()
        strArr.add("Bob")
        strArr.add("Joe")
        strArr.add("Will")
        strArr.add("Billy")
        strArr.add("Caleb")
        strArr.add("Steve")
        strArr.add("Kate")
        strArr.add("Lily")
        for(i in 1..8) {
            mAdapter.add(Racer(strArr[i-1], 300, 300, 600, i, "Driving"))

            //Handler(Looper.getMainLooper()).post { adapter.add(TestRowView(activity!!.baseContext)) }
        }
        adapter = mAdapter

        for(i in 1..8) {
            var count = 0

            val handler = Handler(Looper.getMainLooper())
            handler.post(object : Runnable {
                override fun run() {
                    val racer = mAdapter[i-1] as Racer
                    racer.apply {
                        mAdapter.replace(i - 1,
                            Racer(name, lapTime, bestLap, timeLeft-1, kartNO, status))
                    }
                    handler.postDelayed(this, 100)
                }
            })
        }

        //badgeDrawable = ContextCompat.getDrawable(activity!!.baseContext,
        //    R.drawable.app_icon_your_company)
//        title = "Racers"
        //isHeadersTransitionOnBackEnabled = true // ?
    }
}