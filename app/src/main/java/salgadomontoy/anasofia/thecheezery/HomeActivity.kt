package salgadomontoy.anasofia.thecheezery

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import kotlinx.android.synthetic.main.activity_home.*

class HomeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        var intento: Intent = Intent(this, ProductsActivity::class.java)

        button_coldDrinks.setOnClickListener {
            intent.putExtra("type", "coldDrinks")
            startActivity(intento)
        }

        button_hotDrinks.setOnClickListener {
            intent.putExtra("type", "hotDrinks")
            startActivity(intento)
        }

        button_sweets.setOnClickListener {
            intent.putExtra("type", "sweets")
            startActivity(intento)

        }
        button_salties.setOnClickListener {
            intent.putExtra("type", "salties")
            startActivity(intento)
        }

    }


}
