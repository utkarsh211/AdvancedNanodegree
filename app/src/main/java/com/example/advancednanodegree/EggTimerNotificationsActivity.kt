package com.example.advancednanodegree

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.advancednanodegree.ui.EggTimerFragment

class EggTimerNotificationsActivity: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_egg_timer_notifications)
        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .replace(R.id.container, EggTimerFragment.newInstance())
                .commitNow()
        }
    }
}