package fes.aragon.androidmaster.imccalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.cardview.widget.CardView
import androidx.core.content.ContextCompat
import androidx.core.view.KeyEventDispatcher.Component
import fes.aragon.androidmaster.R

class ImcCalculatorActivity : AppCompatActivity() {

    private var isMaleSelected: Boolean = true
    private var isFemaleSelected: Boolean = false

    private lateinit var viewMale: CardView
    private lateinit var viewFemale: CardView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_imc_calculator)
        initComponent()
        initListteners()

    }

    private fun initComponent() {
        viewMale = findViewById(R.id.viewMale)
        viewFemale = findViewById(R.id.viewFemale)
    }

    private fun initListteners() {
        viewMale.setOnClickListener { setGenderColor(isMaleSelected) }
        viewFemale.setOnClickListener { setGenderColor(isFemaleSelected) }
    }

    private fun setGenderColor(isViewSelected: Boolean) {
        getBackgroundColor(isMaleSelected)
        getBackgroundColor(isFemaleSelected)
        viewMale.setCardBackgroundColor(maleColor)
        viewFemale.setCardBackgroundColor(femaleColor)
    }

    private fun getBackgroundColor(isSelectedComponent: Boolean){
        val colorReference = if(isSelectedComponent){
            ContextCompat.getColor(this, R.color.background_component_selected)
        }
        else{
            ContextCompat.getColor(this, R.color.background_component)
        }
        ContextCompat.getColor(this, colorReference)

    }
}