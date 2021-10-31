package com.yongjincompany.bedaloiminjock

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.yongjincompany.bedaloiminjock.Fragment.FragmentAdapter
import kotlinx.android.synthetic.main.activity_lecture_list.*
import kotlinx.android.synthetic.main.activity_main.*

class LectureListActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lecture_list)

        val fragmentAdapter = FragmentAdapter(supportFragmentManager)
        list_viewpager.adapter = fragmentAdapter
    }
}