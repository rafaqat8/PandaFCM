package com.pandalibs.pandafcm

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import com.google.firebase.FirebaseApp
import com.pandalibs.fcmlib.PandaFCM

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        FirebaseApp.initializeApp(this)

        Handler(Looper.getMainLooper()).postDelayed({
            PandaFCM.setupFCM(this, "com.pandalibs.pandafcm")
        },1000)

    }
}