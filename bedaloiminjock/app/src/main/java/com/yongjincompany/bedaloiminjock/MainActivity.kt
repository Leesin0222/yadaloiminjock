package com.yongjincompany.bedaloiminjock

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.viewpager.widget.ViewPager
import com.yongjincompany.bedaloiminjock.databinding.ActivityMainBinding

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
            R.drawable.semicolonbanner,
            R.drawable.semicolonbanner,
            R.drawable.semicolonbanner
        )

        val txt = arrayOf(
            "프론트엔드",
            "백엔드",
            "안드로이드",
            "ios",
            "게임",
            "임베디드",
            "인공지능",
            "보안"
        )

        val gridviewAdapter = GridviewAdapter(this, img, txt)
        binding.gridview.adapter = gridviewAdapter
    }
}