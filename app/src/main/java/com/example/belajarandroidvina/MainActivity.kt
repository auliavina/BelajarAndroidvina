package com.example.belajarandroidvina

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import org.w3c.dom.Text

class MainActivity : AppCompatActivity() {

    private lateinit var nameEditText: EditText
    private lateinit var nameButton: Button
    private lateinit var buttonText: TextView

    private fun initComponens(){
        nameEditText = findViewById(R.id.namaEditText)
        nameButton = findViewById(R.id.namaEditText)
        buttonText = findViewById(R.id.buttonTextView)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.hello_world)

        val nameEditText: EditText = findViewById(R.id.namaEditText)
        val buttonButton: Button = findViewById(R.id.buttonButton)
        val buttonTextView: TextView = findViewById(R.id.buttonTextView)

        buttonTextView.text = resources.getString(R.string.app_name)

        buttonButton.setOnClickListener{
            val name = nameEditText.text.toString()
            buttonTextView.text = "Hallo $name"
        }
    }
}