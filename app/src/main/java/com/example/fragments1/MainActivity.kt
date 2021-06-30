package com.example.fragments1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatDialogFragment
import com.example.fragments1.fragmentos.PrimerFragment
import com.example.fragments1.fragmentos.SegundoFragment
import com.example.fragments1.fragmentos.TercerFragment

class MainActivity : AppCompatActivity() {

    lateinit var btnFragmento1:Button
    lateinit var btnFragmento2:Button
    lateinit var btnFragmento3:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnFragmento1 = findViewById(R.id.btnF1)
        btnFragmento2 = findViewById(R.id.btnF2)
        btnFragmento3 = findViewById(R.id.btnF3)

        btnFragmento1.setOnClickListener {
            supportFragmentManager.beginTransaction()
                    .replace(R.id.contenedor,PrimerFragment.newInstance("ndo","dsf"))
                    .commitNow()
        }

        btnFragmento2.setOnClickListener {
            supportFragmentManager.beginTransaction()
                .replace(R.id.contenedor,SegundoFragment.newInstance("ndo","dsf"))
                .commitNow()
        }

        btnFragmento3.setOnClickListener {
            supportFragmentManager.beginTransaction()
                .replace(R.id.contenedor,TercerFragment.newInstance("ndo","dsf"))
                .commitNow()
        }
    }
}