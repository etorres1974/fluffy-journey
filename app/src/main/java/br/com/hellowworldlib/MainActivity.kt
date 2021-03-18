package br.com.hellowworldlib

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import br.com.mylibrary.HelloWorld

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button = findViewById<Button>(R.id.test_button)
        button.setOnClickListener { HelloWorld().showToast(this, "Testando abacate")  }
    }
}