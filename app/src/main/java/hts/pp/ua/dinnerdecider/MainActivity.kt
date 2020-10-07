package hts.pp.ua.dinnerdecider

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {

    val foodList = arrayListOf("Chines", "Hamburger", "Pizza", "McDonalds", "Barros Pizza")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        selectedFoodTxt.text = "Burger King"
        decideBtn.setOnClickListener {
//            println("You clicked me!")
            val random = Random()
            val randomFood = random.nextInt(foodList.count())
            selectedFoodTxt.text = foodList[randomFood]
        }

        addFoodBtn.setOnClickListener {
            val newFood: String = addFoodTxt.text.toString()
            if (newFood != "") {
                foodList.add(newFood)
                addFoodTxt.text.clear()
            }
            println(foodList)

        }
    }
}