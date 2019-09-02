package com.example.jeffrey.multicasttest2

import android.view.View
import android.view.ViewGroup
import androidx.leanback.widget.*

class TestPresenter : Presenter() {
    override fun onCreateViewHolder(parent: ViewGroup?): ViewHolder {
        return ViewHolder(TestRowView(parent!!.context))
    }

    override fun onBindViewHolder(viewHolder: ViewHolder?, item: Any?) {
        (viewHolder?.view as TestRowView).bind(item as Racer) // now using racer not card
        //val card = item as Card
        //val cardView = viewHolder?.view as TestRowView
        //cardView.titleText = card.name
    }

    override fun onUnbindViewHolder(viewHolder: ViewHolder?) {
        //val cardView = viewHolder?.view as TestRowView
        //cardView.titleText = "-----"
    }
}
//
//class TestPresenter2 : ListRowPresenter() {
//    override fun onBindRowViewHolder(holder: RowPresenter.ViewHolder?, item: Any?) {
//
////        (holder?.view as TestRowView).bind(item as Card)
//    }
//
//    override fun isUsingDefaultShadow(): Boolean {
//        return false
//    }
//
//    override fun isUsingDefaultListSelectEffect(): Boolean {
//        return false
//    }
//
//    override fun onSelectLevelChanged(holder: RowPresenter.ViewHolder?) {
//    }
//}