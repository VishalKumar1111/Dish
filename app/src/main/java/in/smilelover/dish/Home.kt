package `in`.smilelover.dish

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.denzcoskun.imageslider.ImageSlider
import com.denzcoskun.imageslider.constants.ScaleTypes
import com.denzcoskun.imageslider.models.SlideModel
import com.google.android.material.floatingactionbutton.FloatingActionButton

class Home : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
        val button=findViewById<FloatingActionButton>(R.id.button)

        button.setOnClickListener {
           val intent=Intent(this,MainActivity::class.java)
            startActivity(intent)
        }

        val imageSlider = findViewById<ImageSlider>(R.id.image_slider)
        val imageList = ArrayList<SlideModel>()

        imageList.add(SlideModel(R.drawable.pizza," Meditation is not what you think"))
        imageList.add(SlideModel(R.drawable.pasta,"Helping you To fight your Depression"))
        imageList.add(SlideModel(R.drawable.chowmein,"Brilliant things happen in calm minds"))
        imageList.add(SlideModel(R.drawable.fried_rice,"A day thinking about what could happen, should happen, or what might have been is a day missed"))
        imageList.add(SlideModel(R.drawable.french_fries,"Distractions are everywhere. Notice what takes your attention, acknowledge it, and then let it go"))
        imageList.add(SlideModel(R.drawable.momos,"To know one's own mind is nothing short of life-changing"))
        imageList.add(SlideModel(R.drawable.pizzaa,"Look up and smile. But only if you feel like it"))

        imageSlider.setImageList(imageList, ScaleTypes.FIT)
        //this.setTitle("Home")





    }



}
