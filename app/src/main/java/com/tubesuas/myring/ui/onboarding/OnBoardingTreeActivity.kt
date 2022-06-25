package com.tubesuas.myring.ui.onboarding

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import com.tubesuas.myring.R
import com.tubesuas.myring.ui.auth.AuthActivity
import com.tubesuas.myring.ui.auth.signin.SigninFragment

class OnBoardingTreeActivity : AppCompatActivity(), View.OnClickListener{
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_on_boarding_tree)

        //inisialiasi id button buat pindah halaman
        val btnMemulaiAplikasi: Button = findViewById(R.id.id_memulaiAplikasi)
        btnMemulaiAplikasi.setOnClickListener(this)
    }
    //kondisi perpindahan saat menekan button
    override fun onClick(v: View?) {
        when (v?.id) {
            //pindah ke halaman onboarding kedua
            R.id.id_memulaiAplikasi -> {
                val intent = Intent(this@OnBoardingTreeActivity, AuthActivity::class.java)
                startActivity(intent)
            }
        }
    }
}