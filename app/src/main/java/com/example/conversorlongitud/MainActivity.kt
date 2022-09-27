package com.example.conversorlongitud

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

import com.example.conversorlongitud.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(), View.OnClickListener {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.button1.setOnClickListener(this)
        binding.button2.setOnClickListener(this)
        binding.button3.setOnClickListener(this)
    }

    override fun onClick(viewClicked: View?) {
        val buttonText = (viewClicked as Button).text
        binding.valueTextView.text = buttonText

        binding.operationsSpinner.selectedItemId

    //selectedItem retorna cualquier cosa, selectedItemId retorna un numero de posicion
    }
}