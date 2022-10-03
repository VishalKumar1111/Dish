package `in`.smilelover.dish

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class SplashScreen :  AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.splash_screen)
        val imageView3=findViewById<ImageView>(R.id.imageView3)
        imageView3.alpha= 0f
        imageView3.animate().setDuration(1500).alpha(1f).withEndAction{
            val i= Intent(this,Home::class.java)
            startActivity(i)
            overridePendingTransition(android.R.anim.fade_in,android.R.anim.fade_out)
            finish()
        }


    }
}