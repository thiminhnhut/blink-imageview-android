package io.github.thiminhnhut.blinkimageviewdemo

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.Animation
import android.view.animation.LinearInterpolator
import android.view.animation.AlphaAnimation
import android.widget.ImageView


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val im_blink = findViewById<ImageView>(R.id.im_blink)
        val animation = AlphaAnimation(0.5.toFloat(), 0f)
        animation.duration = 500
        animation.interpolator = LinearInterpolator()
        animation.repeatCount = Animation.INFINITE
        animation.repeatMode = Animation.REVERSE
        im_blink.startAnimation(animation)
    }
}
