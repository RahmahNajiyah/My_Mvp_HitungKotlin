package com.rahmahnajiyahimtihan.my_mvp_hitungkotlin

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), HitungView {


    var presenter : HitungPresenter? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        presenter = HitungPresenter(this)

        btnHitung.setOnClickListener {
            presenter?.hitung(input1.text.toString(),input2.text.toString())
        }
    }

    override fun error(error: String) {
        //tampilin alert
    }

    override fun hasil(a: Double) {
        txthasil.text = "$a"
    }
}
