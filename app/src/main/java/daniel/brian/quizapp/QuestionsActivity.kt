package daniel.brian.quizapp

import android.graphics.Color
import android.graphics.Typeface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.ImageView
import android.widget.ProgressBar
import android.widget.TextView
import androidx.core.content.ContextCompat

class QuestionsActivity : AppCompatActivity(), View.OnClickListener {
    private lateinit var progressBar : ProgressBar
    private lateinit var tv_progress : TextView
    private lateinit var tv_question : TextView
    private lateinit var iv_image : ImageView
    private lateinit var optionOne : TextView
    private lateinit var optionTwo : TextView
    private lateinit var optionThree : TextView
    private lateinit var optionFour : TextView


    private var mCurrentPosition : Int = 1
    private var mQuestionList : ArrayList<Questions>? = null
    private var mSelectedOptionPosition : Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_questions)

        // To access the buttons
        optionOne.setOnClickListener(this)
        optionTwo.setOnClickListener(this)
        optionThree.setOnClickListener(this)
        optionFour.setOnClickListener(this)

        // Finding elements buy Id
        progressBar = findViewById(R.id.progressBar)
        tv_progress = findViewById(R.id.tv_progress)
        tv_question = findViewById(R.id.tv_question)
        iv_image = findViewById(R.id.iv_image)
        optionOne = findViewById(R.id.optionOne)
        optionTwo = findViewById(R.id.optionTwo)
        optionThree = findViewById(R.id.optionThree)
        optionFour = findViewById(R.id.optionFour)

        mQuestionList = Constants.getQuestions()
        setQuestion()

    }

    private fun setQuestion () {

        mCurrentPosition = 1
        val question = mQuestionList!![mCurrentPosition  - 1]

        progressBar.progress = mCurrentPosition
        tv_progress.text = "$mCurrentPosition " + "/" + progressBar.max

        tv_question.text = question!!.Question
        iv_image.setImageResource(question.image)
        optionOne.text = question.optionOne
        optionTwo.text = question.optionTwo
        optionThree.text = question.optionThree
        optionFour.text = question.optionFour

        // This will be set the default after every question
        defaultOptionView()

    }

    private fun defaultOptionView () {

        val options = ArrayList<TextView>()

        options.add(0,optionOne)
        options.add(1,optionOne)
        options.add(2,optionOne)
        options.add(3,optionOne)

        for(option in options){

            // This code set the default background

            option.setTextColor(Color.parseColor("#7A8089"))
            option.typeface = Typeface.DEFAULT
            option.background = ContextCompat.getDrawable(this,
                R.drawable.default_option_border_bg)
        }

    }

    override fun onClick(v: View?) {

    }

    private fun selectedOptionView (tv: TextView, selectedOptionNum : Int){

        mSelectedOptionPosition = selectedOptionNum

        tv.setTextColor(Color.parseColor("#363A43"))
        tv.setTypeface(tv.typeface, Typeface.BOLD)
        tv.background = ContextCompat.getDrawable(this,
            R.drawable.selcected_option_border_bg)

        defaultOptionView()
    }
}