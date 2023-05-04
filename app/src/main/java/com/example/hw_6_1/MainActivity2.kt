package com.example.hw_6_1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.hw_6_1.databinding.ActivityMain2Binding

class MainActivity2 : AppCompatActivity() {

    lateinit var binding: ActivityMain2Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMain2Binding.inflate(layoutInflater)
        setContentView(binding.root)
        setText()
        clickListener()
    }

    private fun setText() {
        binding.etSecond.setText(intent.getStringExtra("inputEditText"))
    }

    private fun clickListener() {
        binding.btnSecond.setOnClickListener {
            val intent = Intent()
            intent.putExtra("outputEditText", binding.etSecond.text.toString())
            setResult(RESULT_OK, intent)
            finish()
        }
    }
}