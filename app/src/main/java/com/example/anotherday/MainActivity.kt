package com.example.anotherday

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.viewpager2.widget.ViewPager2

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        var images= listOf(R.drawable.first,R.drawable.second,R.drawable.third)
        var adapter=ViewPagerAdapter(images)
        var viewPager: ViewPager2 =findViewById(R.id.viewpager)
        viewPager.adapter=adapter
    }
}