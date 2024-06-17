package com.example.materialtodo

import android.app.Application
import com.google.android.material.color.DynamicColors

class DynamicApplication : Application() {
    override fun onCreate() {
        super.onCreate()
        DynamicColors.applyToActivitiesIfAvailable(this)
    }
}