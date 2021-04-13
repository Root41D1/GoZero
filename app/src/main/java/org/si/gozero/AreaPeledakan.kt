package org.si.gozero

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView
import androidx.viewpager.widget.ViewPager
import com.google.android.material.tabs.TabLayout
import org.si.gozero.fragment.ArealedakFragment
import org.si.gozero.fragment.GudangBahanFragment
import org.si.gozero.fragment.adapters.ViewPagerAdapter

class AreaPeledakan : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_area_peledakan)

        setUpTabs()
    }

    private fun setUpTabs() {
        val adapter = ViewPagerAdapter(supportFragmentManager)
        adapter.addFragment(ArealedakFragment(), "AreaLedak")
        adapter.addFragment(GudangBahanFragment(), "GudangBahan")
        val viewPager = findViewById<ViewPager>(R.id.viewPager) as ViewPager
        val tabs = findViewById<TabLayout>(R.id.tabs) as TabLayout

        viewPager.adapter = adapter
        tabs.setupWithViewPager(viewPager)

        tabs.getTabAt(0)
        tabs.getTabAt(1)
    }
}