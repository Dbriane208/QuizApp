package daniel.brian.quizapp

import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.Window
import android.view.WindowManager
import android.widget.Button
import android.widget.TextView
import daniel.brian.quizapp.databinding.ActivityResultBinding

class ResultActivity : AppCompatActivity() {

    private  lateinit var binding: ActivityResultBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_LAYOUT_STABLE or View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
        window.statusBarColor = Color.TRANSPARENT
        binding = ActivityResultBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        val username = intent.getStringExtra(Constants.USER_NAME)
        binding.userName.text = username

        val totalQuestions = intent.getIntExtra(Constants.TOTAL_QUESTIONS, 0)
        val correctAnswers = intent.getIntExtra(Constants.CORRECT_ANSWERS,0)

        "Your Score is $correctAnswers out of $totalQuestions".also { binding.totalScore.text = it }

        binding.btnFinish.setOnClickListener{
            startActivity(Intent(this,  MainActivity::class.java))
            finish()
        }

    }
}