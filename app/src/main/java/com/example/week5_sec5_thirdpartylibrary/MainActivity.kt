package com.example.week5_sec5_thirdpartylibrary

import android.annotation.SuppressLint
import android.graphics.Color
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.annotation.RequiresApi
import androidx.core.content.ContextCompat
import com.skydoves.elasticviews.ElasticButton
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {
    @RequiresApi(Build.VERSION_CODES.M)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        var download_btn = findViewById<Button>(R.id.d_btn)
        var fail_btn = findViewById<Button>(R.id.f_btn)

        download_btn.setOnClickListener {
            download_btn.backgroundTintList = getColorStateList(R.color.green)
            fail_btn.backgroundTintList = getColorStateList(R.color.purple_500)
            elastic_download_view.startIntro()
            elastic_download_view.setProgress(25F)
            elastic_download_view.success()
        }
        fail_btn.setOnClickListener {
            fail_btn.backgroundTintList = getColorStateList(R.color.red)
            download_btn.backgroundTintList = getColorStateList(R.color.purple_500)

            elastic_download_view.startIntro()
            elastic_download_view.setProgress(25F)
            elastic_download_view.fail()
        }


    }
}