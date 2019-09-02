package com.example.jeffrey.multicasttest2

import android.content.Context
import android.util.Log
import android.view.ViewGroup
import androidx.leanback.widget.FocusHighlight
import androidx.leanback.widget.Presenter
import androidx.leanback.widget.VerticalGridPresenter
import androidx.leanback.widget.VerticalGridView

class GridPresenter() : VerticalGridPresenter(FocusHighlight.ZOOM_FACTOR_NONE, false) {
    override fun isUsingDefaultShadow(): Boolean {
        return false
    }

    override fun isUsingZOrder(context: Context?): Boolean {
        return false
    }
}