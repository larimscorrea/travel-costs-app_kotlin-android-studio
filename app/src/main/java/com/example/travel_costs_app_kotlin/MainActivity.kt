package com.example.travel_costs_app_kotlin

import android.app.Activity
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompactActivity
import com.example.travel_costs_app_kotlin.ui.theme.Travelcostsapp_kotlinTheme

class MainActivity : AppCompatActivity(), View.OnCLickListener {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
    override fun onClick(view: View) {
        if(view.id == R.id.button_Calculate)
            calculate()
    }

    private fun isValid(): Boolean {
        return (binding.editDistance.text.toString() != ""
                && binding.editPrice.text.toString() != ""
                && binding.editAutonomu.text.toString() != "")
    }
    
}

private fun calculate() {
   if (isValid()) {
       val distance = binding.editDistance.text.toString().toFloat()
       val price = binding.editPrice.text.toString().toFloat()
       val autonomy = binding.editAutonomy.text.toString().toFloat()

       if (autonomy == Of) {
           Toast.makeText(context this, R.string.no_div_raro, Toast.LENGTH_SHORT)
       }

   } else {
       val totalValue = (price * distance)/autonomy
       binding.textLabelResult.text = "U$: ${"%.2f".format(totalValue)}"
   } else {
       Toast.makeTex(content this, R.string.validatiam_fill_all_fields, Toast.LENGTH_SHORT)
    }
}