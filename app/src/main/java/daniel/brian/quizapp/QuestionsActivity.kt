package daniel.brian.quizapp

import android.annotation.SuppressLint
import android.graphics.Color
import android.graphics.Typeface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.ProgressBar
import android.widget.TextView
import androidx.core.content.ContextCompat

class QuestionsActivity : AppCompatActivity(), View.OnClickListener {
    private lateinit var progressBar : ProgressBar
    private lateinit var tvProgress : TextView
    private lateinit var tvQuestion : TextView
    private lateinit var ivImage : ImageView
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

        mQuestionList = Constants.getQuestions()
        setQuestion()

        // Finding elements buy Id
        progressBar = findViewById(R.id.progressBar)
        tvProgress = findViewById(R.id.tv_progress)
        tvQuestion = findViewById(R.id.tv_question)
        ivImage = findViewById(R.id.iv_image)
        optionOne = findViewById(R.id.optionOne)
        optionTwo = findViewById(R.id.optionTwo)
        optionThree = findViewById(R.id.optionThree)
        optionFour = findViewById(R.id.optionFour)


        // To access the buttons
        optionOne.setOnClickListener(this)
        optionTwo.setOnClickListener(this)
        optionThree.setOnClickListener(this)
        optionFour.setOnClickListener(this)

    }

    @SuppressLint("SetTextI18n")
    private fun setQuestion () {

        mCurrentPosition = 1
        val question = mQuestionList!![mCurrentPosition  - 1]

        // This will be set the default after every question
        defaultOptionView()

        progressBar.progress = mCurrentPosition
        tvProgress.text = "$mCurrentPosition " + "/" + progressBar.max

        tvQuestion.text = question!!.Question
        ivImage.setImageResource(question.image)
        optionOne.text = question.optionOne
        optionTwo.text = question.optionTwo
        optionThree.text = question.optionThree
        optionFour.text = question.optionFour

    }

    private fun defaultOptionView () {

        val options = ArrayList<TextView>()

        options.add(0,optionOne)
        options.add(1,optionTwo)
        options.add(2,optionThree)
        options.add(3,optionFour)

        for(option in options){

            // This code set the default background

            option.setTextColor(Color.parseColor("#7A8089"))
            option.typeface = Typeface.DEFAULT
            option.background = ContextCompat.getDrawable(this,
                R.drawable.default_option_border_bg)
        }

    }

    override fun onClick(v: View?) {

         when(v?.id) {
             R.id.optionOne -> {
                 selectedOptionView(optionOne, 1)
             }
             R.id.optionTwo -> {
                 selectedOptionView(optionTwo, 2)
             }
             R.id.optionThree -> {
                 selectedOptionView(optionThree, 3)
             }
             R.id.optionFour -> {
                 selectedOptionView(optionFour, 4)
             }
        }
    }

    private fun selectedOptionView (tv: TextView, selectedOptionNum : Int){

        defaultOptionView()
        mSelectedOptionPosition = selectedOptionNum

        tv.setTextColor(Color.parseColor("#363A43"))
        tv.setTypeface(tv.typeface, Typeface.BOLD)
        tv.background = ContextCompat.getDrawable(this,
            R.drawable.selcected_option_border_bg)


    }
}