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
import kotlinx.android.synthetic.main.racer_row.view.*

class TestRowView(context: Context) : BaseCardView(context) {
    init {
        isFocusable = true
        isFocusableInTouchMode = true
        val inflater = LayoutInflater.from(context)
        inflater.inflate(R.layout.racer_row, this)
    }
    fun bind(racer: Racer) {
        name.text = racer.name
        lap_time.text = racer.lapTime.toString()
        best_lap.text = racer.bestLap.toString()
        remaining_time.text = racer.timeLeft.toString()
        kart.text = racer.kartNO.toString()
        status.text = racer.status
    }
}
// UPDATED TO TEST RACER INSTEAD OF CARD