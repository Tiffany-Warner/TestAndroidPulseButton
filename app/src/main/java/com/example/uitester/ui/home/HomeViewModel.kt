package com.example.uitester.ui.home

import android.animation.AnimatorInflater
import android.animation.AnimatorSet
import android.graphics.drawable.Animatable2
import android.graphics.drawable.AnimatedVectorDrawable
import android.graphics.drawable.Drawable
import android.os.Handler
import android.view.View
import android.view.animation.AnimationUtils
import android.widget.ImageButton
import androidx.core.content.ContextCompat
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.uitester.R

class HomeViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is home Fragment"
    }
    val text: LiveData<String> = _text

    val pulseButton = MutableLiveData<Boolean>(true)

    fun onButtonClicked() {
        pulseButton.value = true
        Handler().postDelayed({ pulseButton.value = false }, 2000)
    }
}