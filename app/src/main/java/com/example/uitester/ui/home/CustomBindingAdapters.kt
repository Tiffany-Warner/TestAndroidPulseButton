package com.example.uitester.ui.home

import android.view.View
import android.view.animation.AnimationUtils
import androidx.databinding.BindingAdapter
import com.example.uitester.R

@BindingAdapter("pulse")
fun setPulseAnimation(view: View, shouldPulse: Boolean) {
    if (shouldPulse) {
        view.setBackgroundResource(R.drawable.button_bg_pulse)
        val pulseAnimation = AnimationUtils.loadAnimation(view.context, R.animator.button_pulse)
        view.startAnimation(pulseAnimation)
    } else {
        view.setBackgroundResource(R.drawable.button_bg)
        view.clearAnimation()
    }
}