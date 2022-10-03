package `in`.smilelover.dish

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    private lateinit var recyclerView: RecyclerView
    private lateinit var foodlist:ArrayList<Food>
    private lateinit var foodAdapter: FoodAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val recyclerView=findViewById<RecyclerView>(R.id.recycle_view)
        //recyclerView.hasFixedSize(true)
        recyclerView.layoutManager=LinearLayoutManager(this)

        foodlist=ArrayList()
        foodlist.add(Food(R.drawable.chowmein,"Chowmein","Hello"))
        foodlist.add(Food(R.drawable.momos,"Momo","NEWS"))
        foodlist.add(Food(R.drawable.fried_rice,"Fried Rice","You ARE AWESOME"))
        foodlist.add(Food(R.drawable.pasta,"Pasta","HWLLOEen"))
        foodlist.add(Food(R.drawable.pizzaa,"Pizza","WHAT DOING"))

        foodAdapter=FoodAdapter(foodlist)
        recyclerView.adapter=foodAdapter

        foodAdapter.onItemClickListener={
            val intent=Intent(this,Description::class.java)
            intent.putExtra("food",it)
            startActivity(intent)

        }


    }
}