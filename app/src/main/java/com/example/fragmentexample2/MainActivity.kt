package com.example.fragmentexample2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.FragmentActivity
import org.w3c.dom.Text

class MainActivity : FragmentActivity(), ToolbarFragment.ToolbarListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onButtonClick(fontSize: Int, text: String) {
        val textFragment = supportFragmentManager.findFragmentById(R.id.textFragment) as TextFragment
        textFragment.changeTextProperties(fontSize , text)
    }
}