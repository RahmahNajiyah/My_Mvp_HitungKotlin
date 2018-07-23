package com.rahmahnajiyahimtihan.my_mvp_hitungkotlin

class HitungPresenter (var main : HitungView) {

    fun hitung(a : String, b : String){

        if (a == "" && b == ""){

            main.error("error tidak blh kosong")
        }
        else{

            val a1 = a.toDouble()
            val a2 = a.toDouble()
            val hasil = a1 * a2
            main.hasil(hasil)
        }
    }
}