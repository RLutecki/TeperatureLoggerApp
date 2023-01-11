package com.example.loggerfinal.Adapter

import android.content.Context
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.example.loggerfinal.Fragments.Graph
import com.example.loggerfinal.Fragments.Home
import com.example.loggerfinal.Fragments.Settings

internal class MyAdapter(var context: Context, fm: FragmentManager, var totalTabs: Int): FragmentPagerAdapter(fm) {
    override fun getCount(): Int {
        return totalTabs
    }

    override fun getItem(position: Int): Fragment  {
        return when(position){
            0 -> {
                Home()
            }
            1 -> {
                Settings()
            }
            2 -> {
                Graph()
            }

            else -> getItem(position)
        }
    }


}