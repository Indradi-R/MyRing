package com.tubesuas.myring.ui.onboarding

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import com.tubesuas.myring.R
import com.tubesuas.myring.ui.auth.AuthActivity
import com.tubesuas.myring.ui.auth.signin.SigninFragment

class OnBoardingOneActivity : AppCompatActivity(), View.OnClickListener{
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_on_boarding_one)

        //inisialiasi id button buat pindah halaman
        val btnLanjutkan: Button = findViewById(R.id.btn_lanjutkan)
        btnLanjutkan.setOnClickListener(this)

        val btnLewati: Button = findViewById(R.id.btn_lewati)
        btnLewati.setOnClickListener(this)

    }

    //kondisi pindah halaman
    override fun onClick(v: View?) {
        when (v?.id) {
            //pindah ke halaman onboarding kedua
            R.id.btn_lanjutkan -> {
                val intent = Intent(this@OnBoardingOneActivity, OnBoardingTwoActivity::class.java)
                startActivity(intent)
            }
            //pindah ke halaman masuk
            R.id.btn_lewati -> {
                val intent = Intent(this@OnBoardingOneActivity, AuthActivity::class.java)
                startActivity(intent)
            }
        }
    }
}