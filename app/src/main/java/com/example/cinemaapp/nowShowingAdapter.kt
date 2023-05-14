package com.example.cinemaapp

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter

class nowShowingAdapter(fragment: FragmentActivity, films: List<Film>) : FragmentStateAdapter(fragment) {
    val films = films
    override fun getItemCount(): Int = films.size

    override fun createFragment(position: Int): Fragment {
        val film = films[position]
        return NowShowingFrag.newInstance(film.title, film.image, film.rate)
    }
}