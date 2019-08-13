package com.lambdaschool.recyclerviewdemo.ui

import android.graphics.drawable.Drawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.lambdaschool.recyclerviewdemo.R
import com.lambdaschool.recyclerviewdemo.adapter.ConversationListAdapter
import com.lambdaschool.recyclerviewdemo.model.Conversation
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val data = mutableListOf<Conversation>()

        val contactImage: Drawable? = ContextCompat.getDrawable(this, R.drawable.ic_action_name)
        if(contactImage != null) {
            data.add(Conversation(contactImage, "Bill", "lorem ipsum", 12837698))
            data.add(Conversation(contactImage, "Bill", "lorem ipsum", 12837698))
            data.add(Conversation(contactImage, "Bill", "lorem ipsum", 12837698))
            data.add(Conversation(contactImage, "Bill", "lorem ipsum", 12837698))
            data.add(Conversation(contactImage, "Bill", "lorem ipsum", 12837698))
            data.add(Conversation(contactImage, "Bill", "lorem ipsum", 12837698))
            data.add(Conversation(contactImage, "Bill", "lorem ipsum", 12837698))
            data.add(Conversation(contactImage, "Bill", "lorem ipsum", 12837698))
            data.add(Conversation(contactImage, "Bill", "lorem ipsum", 12837698))
            data.add(Conversation(contactImage, "Bill", "lorem ipsum", 12837698))
            data.add(Conversation(contactImage, "Bill", "lorem ipsum", 12837698))
            data.add(Conversation(contactImage, "Bill", "lorem ipsum", 12837698))
            data.add(Conversation(contactImage, "Bill", "lorem ipsum", 12837698))
            data.add(Conversation(contactImage, "Bill", "lorem ipsum", 12837698))
            data.add(Conversation(contactImage, "Bill", "lorem ipsum", 12837698))
            data.add(Conversation(contactImage, "Bill", "lorem ipsum", 12837698))
            data.add(Conversation(contactImage, "Bill", "lorem ipsum", 12837698))
            data.add(Conversation(contactImage, "Bill", "lorem ipsum", 12837698))
            data.add(Conversation(contactImage, "Bill", "lorem ipsum", 12837698))
            data.add(Conversation(contactImage, "Bill", "lorem ipsum", 12837698))
            data.add(Conversation(contactImage, "Bill", "lorem ipsum", 12837698))
            data.add(Conversation(contactImage, "Bill", "lorem ipsum", 12837698))
            data.add(Conversation(contactImage, "Bill", "lorem ipsum", 12837698))
            data.add(Conversation(contactImage, "Bill", "lorem ipsum", 12837698))
            data.add(Conversation(contactImage, "Bill", "lorem ipsum", 12837698))
            data.add(Conversation(contactImage, "Bill", "lorem ipsum", 12837698))
        }

        list_view.setHasFixedSize(true)
        val manager = LinearLayoutManager(this, RecyclerView.VERTICAL, false)
        val adapter = ConversationListAdapter(data)
        list_view.layoutManager = manager
        list_view.adapter = adapter
    }
}
