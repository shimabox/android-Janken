package net.shimabox.janken

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import net.shimabox.janken.databinding.ActivityResultBinding

class ResultActivity : AppCompatActivity() {
    private lateinit var binding: ActivityResultBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityResultBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val id = intent.getIntExtra("MY_HAND", 0)
        when (id) {
            R.id.gu -> binding.myHandImage.setImageResource(R.drawable.gu)
            R.id.choki -> binding.myHandImage.setImageResource(R.drawable.choki)
            R.id.pa -> binding.myHandImage.setImageResource(R.drawable.pa)
        }
    }
}