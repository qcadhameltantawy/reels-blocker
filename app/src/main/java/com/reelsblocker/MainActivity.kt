package com.reelsblocker

import android.app.Activity
import android.content.Intent
import android.graphics.Color
import android.os.Bundle
import android.provider.Settings
import android.view.Gravity
import android.widget.Button
import android.widget.LinearLayout
import android.widget.TextView

class MainActivity : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val layout = LinearLayout(this)
        layout.orientation = LinearLayout.VERTICAL
        layout.gravity = Gravity.CENTER
        layout.setPadding(64, 64, 64, 64)
        layout.setBackgroundColor(Color.WHITE)

        val info = TextView(this)
        info.text = "Reels Blocker\n\n1) اضغط الزرار تحت\n2) افتح Installed apps / Downloaded apps\n3) اختار Reels Blocker وفعّله\n\nبعدها افتح انستجرام وجرب."
        info.textSize = 18f
        info.setTextColor(Color.BLACK)
        info.gravity = Gravity.CENTER

        val button = Button(this)
        button.text = "فتح إعدادات Accessibility"
        button.setOnClickListener {
            startActivity(Intent(Settings.ACTION_ACCESSIBILITY_SETTINGS))
        }

        layout.addView(info)
        layout.addView(button)
        setContentView(layout)
    }
}
