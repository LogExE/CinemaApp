package com.example.cinemaapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.os.bundleOf
import androidx.fragment.app.add
import androidx.fragment.app.commit
import androidx.viewpager2.widget.ViewPager2

class MainActivity : AppCompatActivity() {
    private lateinit var adapter: nowShowingAdapter
    private lateinit var viewPager: ViewPager2
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val films = listOf(
            Film("Matrix 4",
            "https://m.media-amazon.com/images/M/MV5BMGJkNDJlZWUtOGM1Ny00YjNkLThiM2QtY2ZjMzQxMTIxNWNmXkEyXkFqcGdeQXVyMDM2NDM2MQ@@._V1_.jpg",
            4.0f),
            Film("The Shawshank Redemption",
                "https://avatars.dzeninfra.ru/get-zen_doc/2046228/pub_5ef1b191cdb4fa71ebbfc5d9_5ef1f1970928c04e7dd792f6/scale_1200",
                2.0f))
        adapter = nowShowingAdapter(this, films)
        viewPager = findViewById(R.id.now_showing)
        viewPager.adapter = adapter
    }
}