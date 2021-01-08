package com.example.alpha.activities.leaderboard.detail.ui.main

import android.content.Context
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.example.alpha.R
import com.example.alpha.fragments.dashboard.SekolahFragment
import com.example.alpha.fragments.dashboard.SemuaFragment

private val TAB_TITLES = arrayOf(
        R.string.semua,
        R.string.sekolah
)


class SectionsPagerAdapter(private val context: Context, fm: FragmentManager)
    : FragmentPagerAdapter(fm) {

    override fun getItem(position: Int): Fragment {
        // getItem is called to instantiate the fragment for the given page.
        // Return a PlaceholderFragment (defined as a static inner class below).
//        return PlaceholderFragment.newInstance(position + 1)
        if (position==0){
            return SemuaFragment()
        }else if (position==1){
            return SekolahFragment()
        }else{
            return SemuaFragment()
        }
    }

    override fun getPageTitle(position: Int): CharSequence? {
        return context.resources.getString(TAB_TITLES[position])
    }

    override fun getCount(): Int {
        return 2
    }
}