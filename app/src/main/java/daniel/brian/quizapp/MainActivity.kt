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
import daniel.brian.quizapp.databinding.ActivityMainBinding

 class MainActivity : AppCompatActivity() {

     private lateinit var binding: ActivityMainBinding

     override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
         window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_LAYOUT_STABLE or View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
         window.statusBarColor = Color.TRANSPARENT
         binding = ActivityMainBinding.inflate(layoutInflater)
         val view = binding.root
         setContentView(view)


         binding.btnStart.setOnClickListener{

             if(binding.name.text.toString().isEmpty()){
               Toast.makeText(this,"Please Enter your name",Toast.LENGTH_SHORT).show()
             }else{
               val intent = Intent(this, SecondActivity::class.java)
               intent.putExtra(Constants.USER_NAME, binding.name.text.toString())
               startActivity(intent)
               finish()

             }

        }
    }
}