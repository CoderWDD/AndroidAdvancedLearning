package com.example.customview

import android.animation.AnimatorSet
import android.animation.Keyframe
import android.animation.ObjectAnimator
import android.animation.PropertyValuesHolder
import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import com.example.customview.util.PropertiesView
import com.example.customview.util.dp

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val imageView = findViewById<CameraView>(R.id.picture)
        imageView.animate()
            .translationXBy(100.dp)
            .translationY(100.dp)
            .scaleX(2f)
            .scaleY(2f)
            .startDelay = 2000

        val propertiesView = findViewById<PropertiesView>(R.id.properties_view)

//        val radiusAnimator = ObjectAnimator.ofFloat(propertiesView, "radius", 100.dp)
//        val colorAnimator = ObjectAnimator.ofFloat(propertiesView, "myAlpha", 0.5f)
//
//        val animatorSet = AnimatorSet()
//        animatorSet.playSequentially(radiusAnimator, colorAnimator)
//        animatorSet.startDelay = 1000
//        animatorSet.start()

//        val propertiesView = findViewById<PropertiesView>(R.id.properties_view)
//        val radiusHolder = PropertyValuesHolder.ofFloat( "radius", 100.dp)
//        val colorHolder = PropertyValuesHolder.ofFloat("myAlpha", 0.5f)
//        val propertyValuesHolder =
//            ObjectAnimator.ofPropertyValuesHolder(propertiesView, radiusHolder, colorHolder)
//        propertyValuesHolder.startDelay = 1000
//        propertyValuesHolder.duration = 2000
//        propertyValuesHolder.start()

//        val total = 100.dp
//        val keyframe1 = Keyframe.ofFloat(0f, 0f)
//        val keyframe2 = Keyframe.ofFloat(0.2f, 15f * total)
//        val keyframe3 = Keyframe.ofFloat(0.6f, 0.6f * total)
//        val keyframe4 = Keyframe.ofFloat(1f, 1f * total)
//
//        val propertyValuesHolder =
//            PropertyValuesHolder.ofKeyframe("radius", keyframe1, keyframe2, keyframe3, keyframe4)
//        val objectAnimator =
//            ObjectAnimator.ofPropertyValuesHolder(propertiesView, propertyValuesHolder)
//        objectAnimator.startDelay = 2000
//        objectAnimator.duration = 2000
//        objectAnimator.start()


    }
}