package ro.twodoors.customcomponent

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.custom_component.*
import kotlinx.android.synthetic.main.custom_component.view.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        my_switch.setOnCheckedChangeListener { _, b ->
            Toast.makeText(
                this,
                "${custom_comp_1.my_title.text} selected : $b",
                Toast.LENGTH_SHORT).show()
        }

    }
}