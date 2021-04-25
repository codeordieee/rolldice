 package com.example.rolldice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import java.util.*

 class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

     fun roll() {
         val random = Random().nextInt(6) + 1
         val toast = Toast.makeText(this, random.toString(), Toast.LENGTH_SHORT).show()
         val res = when (random) {
             1 -> R.drawable.dice_1;
             2 -> R.drawable.dice_2;
             3 -> R.drawable.dice_3;
             4 -> R.drawable.dice_4;
             5 -> R.drawable.dice_5;
             6 -> R.drawable.dice_6;
             else -> R.drawable.empty_dice;
         }

     }
 }