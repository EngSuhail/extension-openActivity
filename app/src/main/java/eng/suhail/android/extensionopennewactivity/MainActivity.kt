package eng.suhail.android.extensionopennewactivity

import android.app.Activity
import android.content.ClipData.newIntent
import android.content.Context
import android.content.Intent
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



    }

    fun show(view: View) {
        fun <T> Context.openActivity(it: Class<T>, extras: Bundle.() -> Unit = {}) {
            val intent = Intent(this, it)
            intent.putExtras(Bundle().apply(extras))
            startActivity(intent)
        }
        openActivity(login::class.java) {
        }

    }

}