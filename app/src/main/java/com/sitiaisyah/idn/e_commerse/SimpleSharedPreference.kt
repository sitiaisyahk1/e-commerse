package com.sitiaisyah.idn.e_commerse

import android.content.Context
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_simple_shared_preference.*

class SimpleSharedPreference : AppCompatActivity() {

    private var sharedP : SharedPreferences? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_simple_shared_preference)

        btn_add.setOnClickListener {
            sharedP = getSharedPreferences("addData", Context.MODE_PRIVATE)
            var myEditor = sharedP?.edit()
            myEditor?.putString("product_name", et_nama.text.toString())
            myEditor?.commit()
            Toast.makeText(this@SimpleSharedPreference,
                "this product is save", Toast.LENGTH_SHORT).show()
        }

        btn_get.setOnClickListener {
            tv_getnama.text = sharedP?.getString("product_name", "")
        }

    }
}