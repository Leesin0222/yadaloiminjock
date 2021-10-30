package com.yongjincompany.bedaloiminjock

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import kotlinx.android.synthetic.main.gridview_item.view.*

class GridviewAdapter(val context: Context, val img_list: Array<Int>, val text_list: Array<String>) : BaseAdapter(){

    override fun getView(p0: Int, p1: View?, p2: ViewGroup?): View {
        val view : View = LayoutInflater.from(context).inflate(R.layout.gridview_item, null)

        view.gridview_text.text = text_list[p0]
        view.gridview_img.setImageResource(img_list[p0])


        return view
    }

    override fun getItem(position: Int): Any {
        return 0
    }

    override fun getItemId(position: Int): Long {
        return 0
    }

    override fun getCount(): Int {
        return img_list.size
    }

}