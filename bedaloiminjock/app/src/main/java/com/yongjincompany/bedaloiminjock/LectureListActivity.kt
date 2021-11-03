package com.yongjincompany.bedaloiminjock

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.widget.TextView
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
    }

    private fun createTabView(tabName: String): View {

        val tabView = LayoutInflater.from(baseContext).inflate(R.layout.custom_tab, null)

        val txt_name = tabView.findViewById(R.id.txt_name) as TextView

        txt_name.text = tabName

        return tabView
    }
}