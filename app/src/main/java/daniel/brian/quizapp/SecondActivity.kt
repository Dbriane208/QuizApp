package daniel.brian.quizapp

import android.annotation.SuppressLint
import android.content.Intent
import android.graphics.Color
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class SecondActivity : AppCompatActivity() {

    private lateinit var btn_play1 : Button
    private lateinit var btn_play2 : Button
    private lateinit var btn_play3 : Button
    private lateinit var btn_play4 : Button
    private lateinit var reg_name : TextView


    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?){
        super.onCreate(savedInstanceState)
        window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_LAYOUT_STABLE or View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
        window.statusBarColor = Color.TRANSPARENT
        setContentView(R.layout.second_activity)

        btn_play1 = findViewById(R.id.btn_play1)
        btn_play2 = findViewById(R.id.btn_play2)
        btn_play3 = findViewById(R.id.btn_play3)
        btn_play4 = findViewById(R.id.btn_play4)
        reg_name = findViewById(R.id.reg_name)

        val regName = intent.getStringExtra(Constants.USER_NAME)
        reg_name.text = "Hello $regName\uD83D\uDC4B"

        btn_play1.setOnClickListener{
            val intent = Intent(this,QuestionsActivity::class.java)
            intent.putExtra(Constants.USER_NAME, regName)
            startActivity(intent)
        }

         btn_play2.setOnClickListener{
             val intent = Intent(this, LogoActivity::class.java)
             intent.putExtra(Constants.USER_NAME, regName)
             startActivity(intent)
         }

        btn_play3.setOnClickListener{
            val intent = Intent(this, TechActivity::class.java)
            intent.putExtra(Constants.USER_NAME, regName)
            startActivity(intent)
        }

        btn_play4.setOnClickListener{
            val intent = Intent(this, CeosActivity::class.java)
            intent.putExtra(Constants.USER_NAME, regName)
            startActivity(intent)
        }


    }
}