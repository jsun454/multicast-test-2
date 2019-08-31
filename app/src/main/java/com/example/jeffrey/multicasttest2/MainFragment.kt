package com.example.jeffrey.multicasttest2

import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.util.Log
import androidx.core.content.ContextCompat
import androidx.leanback.app.BrowseSupportFragment
import androidx.leanback.widget.ArrayObjectAdapter
import androidx.leanback.widget.HeaderItem
import androidx.leanback.widget.ListRow
import androidx.leanback.widget.ListRowPresenter

class MainFragment : BrowseSupportFragment() {
    override fun onActivityCreated(savedInstanceState: Bundle?) {
        Log.d("Jeffrey Sun", "fragment!")
        super.onActivityCreated(savedInstanceState)

        val adapter = ArrayObjectAdapter(ListRowPresenter())
        for(i in 1..3) {
            val row = TestRow("Row $i", ArrayObjectAdapter(TestPresenter()))
            //TestRowView(activity!!.baseContext)
            val headerItem = HeaderItem(row.name)
            val listRow = ListRow(headerItem, row.adapter)
            adapter.add(listRow)

            //Handler(Looper.getMainLooper()).post { adapter.add(TestRowView(activity!!.baseContext)) }
        }
        setAdapter(adapter)

        //badgeDrawable = ContextCompat.getDrawable(activity!!.baseContext,
        //    R.drawable.app_icon_your_company)
        title = "Racers"
        headersState = BrowseSupportFragment.HEADERS_ENABLED
        isHeadersTransitionOnBackEnabled = true // ?
    }
}
