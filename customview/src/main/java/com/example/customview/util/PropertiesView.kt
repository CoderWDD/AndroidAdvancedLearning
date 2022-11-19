package com.example.customview.util

import android.content.Context
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.util.AttributeSet
import android.view.View

class PropertiesView(context: Context?, attrs: AttributeSet?): View(context, attrs) {
    private val paint = Paint(Paint.ANTI_ALIAS_FLAG)
    var myAlpha = 1
        set(value) {
            field = value
            invalidate()
        }

    var radius = 30.dp
        set(value) {
            field = value
            invalidate()
        }

    override fun onDraw(canvas: Canvas?) {
        super.onDraw(canvas)
        paint.alpha = myAlpha
        canvas?.drawCircle((width / 2).toFloat(), (height / 2).toFloat(), radius, paint)
    }
}