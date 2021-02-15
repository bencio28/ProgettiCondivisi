package com.simplegames.dnd

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        create_char_button.setOnClickListener {
           val intent = Intent(this, CharacterCreation::class.java)
            startActivity(intent)
        }
    }


}