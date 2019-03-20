package co.cantina.dinnerdecider

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {

    val foodList = arrayListOf("Chinese", "Indian", "Mexican", "Thai", "Pizza")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        decideButton.setOnClickListener {
            val random = Random()
            val randomFood = random.nextInt(foodList.count())
            selectedFoodTextView.text = foodList[randomFood]

        }

        addFoodButton.setOnClickListener {
            val newFood = addFoodText.text.toString()
            foodList.add(newFood)
            println("new food was added")
            addFoodText.text.clear()
        }
    }
}
