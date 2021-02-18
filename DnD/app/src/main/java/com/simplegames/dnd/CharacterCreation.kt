package com.simplegames.dnd

import GameCharacter
import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.simplegames.dnd.MainActivity.Companion.charactersList

import kotlinx.android.synthetic.main.activity_character_creation.*
import kotlinx.android.synthetic.main.activity_character_creation.view.*
import kotlinx.android.synthetic.main.activity_main.*
import com.simplegames.dnd.MainActivity.*

class CharacterCreation : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_character_creation)
        val newCharacterName = input_name.text
        done_button.setOnClickListener {
            charactersList.add(GameCharacter(newCharacterName.toString()))
            finish()

        }
    }

}