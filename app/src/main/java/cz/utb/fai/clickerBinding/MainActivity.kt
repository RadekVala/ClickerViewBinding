package cz.utb.fai.clickerBinding

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import cz.utb.fai.clickerBinding.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private var counter = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.increaseButton.setOnClickListener {
            counter++
            binding.counterTextView.text = counter.toString()
        }
    }
}