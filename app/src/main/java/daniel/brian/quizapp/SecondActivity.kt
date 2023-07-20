package daniel.brian.quizapp

import android.annotation.SuppressLint
import android.content.Intent
import android.graphics.Color
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import daniel.brian.quizapp.databinding.SecondActivityBinding

class SecondActivity : AppCompatActivity() {

    private lateinit var binding: SecondActivityBinding

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?){
        super.onCreate(savedInstanceState)
        window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_LAYOUT_STABLE or View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
        window.statusBarColor = Color.TRANSPARENT
        binding = SecondActivityBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)


        val regName = intent.getStringExtra(Constants.USER_NAME)
        binding.regname.text = "Hello $regName\uD83D\uDC4B"

        binding.btnPlay1.setOnClickListener{
            val intent = Intent(this,QuestionsActivity::class.java)
            intent.putExtra(Constants.USER_NAME, regName)
            startActivity(intent)
        }

         binding.btnPlay2.setOnClickListener{
             val intent = Intent(this, LogoActivity::class.java)
             intent.putExtra(Constants.USER_NAME, regName)
             startActivity(intent)
         }

        binding.btnPlay3.setOnClickListener{
            val intent = Intent(this, TechActivity::class.java)
            intent.putExtra(Constants.USER_NAME, regName)
            startActivity(intent)
        }

        binding.btnPlay4.setOnClickListener{
            val intent = Intent(this, CeosActivity::class.java)
            intent.putExtra(Constants.USER_NAME, regName)
            startActivity(intent)
        }


    }
}