package com.example.jeffrey.multicasttest2

import android.content.Context
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.graphics.drawable.Drawable
import android.text.TextPaint
import android.util.AttributeSet
import android.view.LayoutInflater
import android.view.View
import androidx.leanback.widget.BaseCardView
import androidx.leanback.widget.ImageCardView
import androidx.leanback.widget.ListRowPresenter
import kotlinx.android.synthetic.main.partial_card.view.*

class TestRowView(context: Context) : BaseCardView(context) {
    init {
        isFocusable = true
        isFocusableInTouchMode = true
        val inflater = LayoutInflater.from(context)
        inflater.inflate(R.layout.partial_card, this)

        txt1.text = "REPLACED"
    }
    fun bind(card: Card) {
        txt2.text = card.name
    }
}