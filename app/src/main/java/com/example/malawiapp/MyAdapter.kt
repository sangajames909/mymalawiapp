package com.example.malawiapp

import android.content.Context
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter

class MyAdapter(var context: Context, fm: FragmentManager, var totalTabs: Int): FragmentPagerAdapter(fm) {
    override fun getItem(position: Int): Fragment {
        return when(position){
            0 ->{
                MusicFragment()
            }
            1 ->{
                SportsFragment()
            }
            2 ->{
                LakeFragment()
            }
            else -> getItem(position)
        }
    }
    override fun getCount(): Int {
        return totalTabs
    }

}