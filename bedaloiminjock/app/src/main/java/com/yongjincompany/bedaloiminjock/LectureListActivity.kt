package com.yongjincompany.bedaloiminjock

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.widget.TextView
import com.google.android.material.tabs.TabLayout
import com.yongjincompany.bedaloiminjock.Fragment.FragmentAdapter
import kotlinx.android.synthetic.main.activity_lecture_list.*
import kotlinx.android.synthetic.main.activity_main.*

class LectureListActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lecture_list)

        val fragmentAdapter = FragmentAdapter(supportFragmentManager)
        list_viewpager.adapter = fragmentAdapter

        tab_layout.addTab(tab_layout.newTab().setCustomView(createTabView("웹")))
        tab_layout.addTab(tab_layout.newTab().setCustomView(createTabView("앱")))
        tab_layout.addTab(tab_layout.newTab().setCustomView(createTabView("게임")))
        tab_layout.addTab(tab_layout.newTab().setCustomView(createTabView("임베")))
        tab_layout.addTab(tab_layout.newTab().setCustomView(createTabView("AI")))
        tab_layout.addTab(tab_layout.newTab().setCustomView(createTabView("보안")))


        list_viewpager.addOnPageChangeListener(TabLayout.TabLayoutOnPageChangeListener(tab_layout))


        tab_layout.addOnTabSelectedListener(object : TabLayout.OnTabSelectedListener {
            override fun onTabReselected(p0: TabLayout.Tab?) {

            }

            override fun onTabUnselected(p0: TabLayout.Tab?) {

            }

            override fun onTabSelected(p0: TabLayout.Tab?) {
                 Log.e("c", p0.toString())

                if(p0 != null) {
                    list_viewpager.currentItem = p0.position
                }
            }

        })
    }

    private fun createTabView(tabName: String): View {

        val tabView = LayoutInflater.from(baseContext).inflate(R.layout.custom_tab, null)

        val txt_name = tabView.findViewById(R.id.txt_name) as TextView

        txt_name.text = tabName

        return tabView
    }
}