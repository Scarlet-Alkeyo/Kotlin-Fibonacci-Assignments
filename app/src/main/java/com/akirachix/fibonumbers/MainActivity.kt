package com.akirachix.fibonumbers

import android.app.Activity
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import com.akirachix.fibonumbers.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val numbers = listOf(1,1,2,3,5,8,13,21,34,55, 89,)

        binding.rvNumbers.layoutManager= LinearLayoutManager(this)
        val  namesAdapter =NamesRecyclerViewAdapter(numbers)
        binding.rvNumbers.adapter = numbers.Adapter


    }
}