package com.example.anotherday

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.viewpager2.widget.ViewPager2
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        var images= listOf(R.drawable.first,R.drawable.second,R.drawable.third)
        var adapter=ViewPagerAdapter(images)
        var viewPager: ViewPager2 =findViewById(R.id.viewpager)
        viewPager.adapter=adapter



        var tabLayout=findViewById<TabLayout>(R.id.tabLayout)
        TabLayoutMediator(tabLayout,viewPager){tab,position->
            tab.text="tab ${position+1}"


        }.attach()

    }
}