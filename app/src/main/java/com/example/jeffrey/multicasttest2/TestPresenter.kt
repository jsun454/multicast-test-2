package com.example.jeffrey.multicasttest2

import android.view.ViewGroup
import androidx.leanback.widget.BaseCardView
import androidx.leanback.widget.ImageCardView
import androidx.leanback.widget.Presenter

class TestPresenter : Presenter() {
    override fun onCreateViewHolder(parent: ViewGroup?): ViewHolder {
        return ViewHolder(BaseCardView(parent?.context))
    }

    override fun onBindViewHolder(viewHolder: ViewHolder?, item: Any?) {
        val card = item as Card
        val cardView = viewHolder?.view as ImageCardView
        cardView.titleText = card.name
    }

    override fun onUnbindViewHolder(viewHolder: ViewHolder?) {
        val cardView = viewHolder?.view as ImageCardView
        cardView.titleText = "-----"
    }

}