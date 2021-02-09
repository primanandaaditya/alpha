package com.example.alpha.activities.leaderboard.global.ui.main

import android.content.Context
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.example.alpha.R
import com.example.alpha.fragments.dashboard.SaintekFragment
import com.example.alpha.fragments.dashboard.SekolahFragment
import com.example.alpha.fragments.dashboard.SemuaFragment
import com.example.alpha.fragments.dashboard.SoshumFragment

private val TAB_TITLES = arrayOf(
        R.string.saintek,
        R.string.soshum
)


class SectionsPagerAdapter(private val context: Context, fm: FragmentManager)
    : FragmentPagerAdapter(fm) {

    override fun getItem(position: Int): Fragment {
        when (position) {
            0 -> return SaintekFragment()
            1 -> return SoshumFragment()
            else -> { // Note the block
                return SekolahFragment()
            }
        }
    }

    override fun getPageTitle(position: Int): CharSequence? {
        return context.resources.getString(TAB_TITLES[position])
    }

    override fun getCount(): Int {
        // Show 2 total pages.
        return 2
    }
}