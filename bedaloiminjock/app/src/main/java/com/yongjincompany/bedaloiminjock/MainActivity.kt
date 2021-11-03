package com.yongjincompany.bedaloiminjock

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.viewpager.widget.ViewPager
import com.yongjincompany.bedaloiminjock.databinding.ActivityMainBinding
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    internal lateinit var viewpager: ViewPager

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        val viewpager = findViewById(R.id.viewpager) as ViewPager

        val adapter = ViewPagerAdapter(this)
        viewpager.adapter = adapter

        val img = arrayOf(
            R.drawable.semicolonbanner,
            R.drawable.semicolonbanner,
            R.drawable.semicolonbanner,
            R.drawable.semicolonbanner,
            R.drawable.semicolonbanner,
            R.drawable.semicolonbanner
        )

        val txt = arrayOf(
            "웹",
            "앱",
            "게임",
            "임베(디드)",
            "AI",
            "보안"
        )

        val gridviewAdapter = GridviewAdapter(this, img, txt)
        binding.gridview.adapter = gridviewAdapter

        gridview.setOnItemClickListener { adapterView, view, i, l ->

            val intent = Intent(this, LectureListActivity::class.java)
            startActivity(intent)
        }
    }
}