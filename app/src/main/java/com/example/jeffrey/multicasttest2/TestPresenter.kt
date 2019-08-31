package com.example.jeffrey.multicasttest2

import android.view.ViewGroup
import androidx.leanback.widget.BaseCardView
import androidx.leanback.widget.ImageCardView
import androidx.leanback.widget.Presenter

class TestPresenter : Presenter() {
    override fun onCreateViewHolder(parent: ViewGroup?): ViewHolder {
        return ViewHolder(TestRowView(parent!!.context))
    }

    override fun onBindViewHolder(viewHolder: ViewHolder?, item: Any?) {
        (viewHolder?.view as TestRowView).bind(item as Card)
        //val card = item as Card
        //val cardView = viewHolder?.view as TestRowView
        //cardView.titleText = card.name
    }

    override fun onUnbindViewHolder(viewHolder: ViewHolder?) {
        //val cardView = viewHolder?.view as TestRowView
        //cardView.titleText = "-----"
    }

}