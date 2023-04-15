package com.example.testbutton

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import kotlin.random.Random
import kotlin.random.nextInt

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton: Button = findViewById(R.id.button)
        rollButton.setOnClickListener {


            val diceImage1 : ImageView = findViewById(R.id.imageView)
            val diceText : TextView = findViewById(R.id.textView3)

            val dice = Dice(
                sides = 6)
            val roll = dice.roll()

            val drawableResuorse = when(roll){
                1 -> R.drawable.dice_1
                2 -> R.drawable.dice_2
                3 -> R.drawable.dice_3
                4 -> R.drawable.dice_4
                5 -> R.drawable.dice_5
                else -> R.drawable.dice_6
                }
            diceImage1.setImageResource(drawableResuorse)
            diceText.text = roll.toString()


            val diceImage2 : ImageView = findViewById(R.id.imageView2)
            val diceText1 : TextView = findViewById(R.id.textView4)

            val dice1 = Dice(
                sides = 6)
            val roll1 = dice1.roll()


            val drawableResuorse1 = when(roll1){
                1 -> R.drawable.dice_1
                2 -> R.drawable.dice_2
                3 -> R.drawable.dice_3
                4 -> R.drawable.dice_4
                5 -> R.drawable.dice_5
                else -> R.drawable.dice_6
            }

            diceImage2.setImageResource(drawableResuorse1)
            diceText1.text = roll1.toString()
        }
    }
}



class Dice(private val sides: Int){
    fun roll(): Int{
        return (1..sides).random()
    }
}

//            val toast = Toast.makeText(this, "butt is clicked", Toast.LENGTH_SHORT)
//            toast.show()
//textResult.text = dice.roll().toString()