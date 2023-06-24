package daniel.brian.quizapp

import android.annotation.SuppressLint
import android.graphics.Color
import android.graphics.Typeface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.ProgressBar
import android.widget.TextView
import android.widget.Toast
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
    private lateinit var submitButton : Button


    private var mCurrentPosition : Int = 1
    private var mQuestionList : ArrayList<Questions>? = null
    private var mSelectedOptionPosition : Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_questions)

        mQuestionList = Constants.getQuestions()

        // Finding elements by Id
        progressBar = findViewById(R.id.progressBar)
        tvProgress = findViewById(R.id.tv_progress)
        tvQuestion = findViewById(R.id.tv_question)
        ivImage = findViewById(R.id.iv_image)
        optionOne = findViewById(R.id.optionOne)
        optionTwo = findViewById(R.id.optionTwo)
        optionThree = findViewById(R.id.optionThree)
        optionFour = findViewById(R.id.optionFour)
        submitButton = findViewById(R.id.submitBtn)


        // To access the buttons
        optionOne.setOnClickListener(this)
        optionTwo.setOnClickListener(this)
        optionThree.setOnClickListener(this)
        optionFour.setOnClickListener(this)
        submitButton.setOnClickListener(this)

        setQuestion()

    }

    @SuppressLint("SetTextI18n")
    private fun setQuestion () {

        val question = mQuestionList!![mCurrentPosition  - 1]

        if(mSelectedOptionPosition == mQuestionList!!.size){
            submitButton.text = "FINISH"
        }else{
            submitButton.text = "SUBMIT"
        }

        progressBar.progress = mCurrentPosition
        tvProgress.text = "$mCurrentPosition " + "/" + progressBar.max

        tvQuestion.text = question!!.Question
        ivImage.setImageResource(question.image)
        optionOne.text = question.optionOne
        optionTwo.text = question.optionTwo
        optionThree.text = question.optionThree
        optionFour.text = question.optionFour

        // This will be set the default after every question
        defaultOptionView()

    }

    private fun defaultOptionView () {

        val options = ArrayList<TextView>()

        options.add(0, this.optionOne)
        options.add(1, this.optionTwo)
        options.add(2, this.optionThree)
        options.add(3, this.optionFour)

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
             R.id.submitBtn -> {

                 if(mSelectedOptionPosition == 0){
                     mCurrentPosition ++

                     when{
                         mCurrentPosition <= mQuestionList!!.size -> {
                             setQuestion()
                         }else -> {
                             Toast.makeText(this,"You have Successfully completed!!",Toast.LENGTH_SHORT).show()
                         }
                     }
                 }else{
                     val question = mQuestionList?.get(mCurrentPosition -1)

                     if(question!!.correctAnswer != mSelectedOptionPosition){
                         answerView(mSelectedOptionPosition, R.drawable.wrong_option_border_bg)
                     }
                         answerView(question.correctAnswer, R.drawable.correct_option_border_bg)

                     if(mCurrentPosition == mQuestionList!!.size){
                         submitButton.text = "FINISH"

                     }else{
                         submitButton.text = "GO TO THE NEXT QUESTION"
                     }
                         mSelectedOptionPosition = 0
                 }
             }
        }
    }

    private  fun answerView(answer : Int, drawableView : Int){

        when(answer){
            1 -> {
              optionOne.background = ContextCompat.getDrawable(this,drawableView)
            }
            2 -> {
                optionTwo.background = ContextCompat.getDrawable(this,drawableView)
            }
            3 -> {
                optionThree.background = ContextCompat.getDrawable(this,drawableView)
            }
            4 -> {
                optionFour.background = ContextCompat.getDrawable(this,drawableView)
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