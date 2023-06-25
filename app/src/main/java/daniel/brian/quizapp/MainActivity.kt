 package daniel.brian.quizapp

import android.content.Intent
import android.graphics.Color
import android.os.Bundle
import android.view.View
import android.view.Window
import android.view.WindowManager
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

 class MainActivity : AppCompatActivity() {

    private  lateinit var name : EditText
    private lateinit var btnStart : Button
     override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
         window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_LAYOUT_STABLE or View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
         window.statusBarColor = Color.TRANSPARENT

         setContentView(R.layout.activity_main)

         name = findViewById(R.id.name)
         btnStart = findViewById(R.id.btnStart)

         btnStart.setOnClickListener{

             if(name.text.toString().isEmpty()){
               Toast.makeText(this,"Please Enter your name",Toast.LENGTH_SHORT).show()
             }else{
               val intent = Intent(this, QuestionsActivity::class.java)
               intent.putExtra(Constants.USER_NAME, name.text.toString())
               startActivity(intent)
               finish()

             }

        }
    }
}