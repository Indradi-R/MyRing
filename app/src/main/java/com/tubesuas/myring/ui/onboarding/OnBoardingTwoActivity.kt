package com.tubesuas.myring.ui.onboarding

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import com.tubesuas.myring.R

class OnBoardingTwoActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_on_boarding_two)

        //inisialiasi id button buat pindah halaman
        val btnLanjutkan: Button = findViewById(R.id.id_lanjutkan)
        btnLanjutkan.setOnClickListener(this)

        val btnKembali: Button = findViewById(R.id.id_kembali)
        btnKembali.setOnClickListener(this)
    }

    //kondisi pindah halaman
    override fun onClick(v: View?) {
        when (v?.id) {
            //pindah ke halaman onboarding kedua
            R.id.id_lanjutkan -> {
                val intent = Intent(this@OnBoardingTwoActivity, OnBoardingTreeActivity::class.java)
                startActivity(intent)
            }
            //pindah ke halaman onbordingpertama
            R.id.id_kembali -> {
                val intent = Intent(this@OnBoardingTwoActivity, OnBoardingOneActivity::class.java)
                startActivity(intent)
            }
        }
    }
}