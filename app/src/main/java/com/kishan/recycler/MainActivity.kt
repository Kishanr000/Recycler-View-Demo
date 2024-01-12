package com.kishan.recycler

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.kishan.recyclerview_demo.MyAdapter
import com.kishan.recyclerview_demo.News

class MainActivity : AppCompatActivity() {

    lateinit var reRecyclerView : RecyclerView
    lateinit var data : ArrayList<News>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportActionBar?.hide()
        reRecyclerView = findViewById(R.id.reRecycler)

        // images to show
        val image = arrayOf(
            R.drawable.zoro1,
            R.drawable.zoro2,
            R.drawable.zoro3,
            R.drawable.zoro4,
            R.drawable.zoro5,
            R.drawable.zoro5,
            R.drawable.zoro3,
            R.drawable.zoro4,
            R.drawable.zoro5,
            R.drawable.zoro5,
        )

//        texts
        val heading = arrayOf(
            "Android devs, and welcome to yet another article on another important feature of Android, the recycler view.",
            "Recyclerviews provide a dynamic way of showing items in a list in a scrollable manner.",
            "Compared to the ListView, the Recyclerview has more advantages for example it reuses",
            "Android devs, and welcome to yet another article on another important feature of Android, the recycler view.",
            "Recyclerviews provide a dynamic way of showing items in a list in a scrollable manner.",
            "Compared to the ListView, the Recyclerview has more advantages for example it reuses",
            "Compared to the ListView, the Recyclerview has more advantages for example it reuses",
            "Android devs, and welcome to yet another article on another important feature of Android, the recycler view.",
            "Recyclerviews provide a dynamic way of showing items in a list in a scrollable manner.",
            "Compared to the ListView, the Recyclerview has more advantages for example it reuses",
        )

        reRecyclerView.layoutManager = LinearLayoutManager(this)
        data = arrayListOf<News>()

        for (index in image.indices) {
            val news = News(heading[index], image[index])
            data.add(news)
        }

        reRecyclerView.adapter = MyAdapter(data, this)

    }
}