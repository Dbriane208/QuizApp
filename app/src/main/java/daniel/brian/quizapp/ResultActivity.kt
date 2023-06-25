package daniel.brian.quizapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class ResultActivity : AppCompatActivity() {

    private lateinit var userName : TextView
    private lateinit var total_Score : TextView
    private lateinit var btnFinish  : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

        userName = findViewById(R.id.userName)
        total_Score = findViewById(R.id.total_Score)
        btnFinish = findViewById(R.id.btnFinish)

        val username = intent.getStringExtra(Constants.USER_NAME)
        userName.text = username

        val totalQuestions = intent.getIntExtra(Constants.TOTAL_QUESTIONS, 0)
        val correctAnswers = intent.getIntExtra(Constants.CORRECT_ANSWERS,0)

        "Your Score is $correctAnswers out of $totalQuestions".also { total_Score.text = it }

        btnFinish.setOnClickListener{
            startActivity(Intent(this,  MainActivity::class.java))
            finish()
        }

    }
}