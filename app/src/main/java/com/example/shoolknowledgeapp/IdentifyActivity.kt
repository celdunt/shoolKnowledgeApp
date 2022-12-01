package com.example.shoolknowledgeapp

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class IdentifyActivity : AppCompatActivity() {

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_identify)

        val nerd: ImageView = findViewById(R.id.nerd)
        val nerdDialog: ImageView = findViewById(R.id.nerd_dialog)
        animateNerd(nerd, nerdDialog)
        animateNerdSecond(nerd)
    }

    private fun animateNerdSecond(nerd: ImageView) {
        nerd.animate().apply {
            duration = 2000
            translationYBy(20f)
        }.withEndAction {
            nerd.animate().apply {
                duration = 2000
                translationYBy(-20f)
            }.withEndAction {
                animateNerdSecond(nerd)
            }
        }.start()
    }

    private fun animateNerd(nerd: ImageView, nerdDialog: ImageView) {
        nerd.x = 200f
        nerdDialog.y = 150f
        nerdDialog.alpha = 0f

        nerd.animate().apply {
            duration = 500
        }.withEndAction {
            nerd.animate().apply {
                duration = 300
                translationXBy(-200f)
            }.withEndAction {
                nerd.animate().apply {
                    duration = 300
                    translationXBy(10f)
                }
            }
            nerdDialog.animate().apply {
                duration = 300
                translationYBy(-150f)
                alphaBy(1f)
            }.withEndAction {
                nerdDialog.animate().apply {
                    duration = 300
                    translationYBy(10f)
                }
            }
        }.start()
    }
}