package `in`.smilelover.dish

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class Description : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.description)
        val food=intent.getParcelableExtra<Food>("food" )
        if (food!=null){
            val textView:TextView=findViewById(R.id.textView)
            val imageview:ImageView=findViewById(R.id.imageView)
            val des:TextView=findViewById(R.id.des)

            textView.text=food.name
            imageview.setImageResource(food.image)
            des.text=food.des


        }


    }
}