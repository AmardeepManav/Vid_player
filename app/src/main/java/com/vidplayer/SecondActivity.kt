package com.vidplayer

import android.media.MediaPlayer.OnPreparedListener
import android.os.Bundle
import android.view.View
import android.widget.MediaController
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_second.*


class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val path = "android.resource://com.vidplayer/" + R.raw.sample_video
        video_view.setVideoPath(path)
        video_view.setMediaController(MediaController(this))
        video_view.requestFocus()


        video_view.setOnPreparedListener(OnPreparedListener {
            progress_bar.visibility = View.GONE
            video_view.bringToFront()
            video_view.isFocusable = true
            video_view.start()
        })
    }
}