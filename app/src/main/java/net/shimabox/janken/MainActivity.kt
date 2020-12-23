package net.shimabox.janken

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.preference.PreferenceManager
import net.shimabox.janken.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.gu.setOnClickListener { onJankenButtonTapped(it) }
        binding.choki.setOnClickListener { onJankenButtonTapped(it) }
        binding.pa.setOnClickListener { onJankenButtonTapped(it) }

        val pref = PreferenceManager.getDefaultSharedPreferences(this)
        // 動かない Too many arguments for public abstract fun edit(): SharedPreferences.Editor! defined in android.content.SharedPreferences
        // pref.edit {
        //     clear()
        // }
        val editor = pref.edit()
        editor.clear()
    }

    fun onJankenButtonTapped(view: View?) {
        var intent = Intent(this, ResultActivity::class.java)
        intent.putExtra("MY_HAND", view?.id)
        startActivity(intent)
    }
}