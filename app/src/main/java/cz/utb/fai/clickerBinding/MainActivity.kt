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

        if (savedInstanceState != null) {
            // Obnovit hodnotu "counter" ze stavu, pokud je dostupný
            counter = savedInstanceState.getInt("counter", 0)
            binding.counterTextView.text = counter.toString()
        }
    }

    override fun onSaveInstanceState(outState: Bundle) {
        // Uložit hodnotu "counter" do stavu před změnou orientace displeje
        outState.putInt("counter", counter)
        super.onSaveInstanceState(outState)
    }
}