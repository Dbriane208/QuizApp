package daniel.brian.quizapp

import android.annotation.SuppressLint
import android.content.Intent
import android.graphics.Color
import android.graphics.Typeface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.Window
import android.view.WindowManager
import android.widget.Button
import android.widget.ImageView
import android.widget.ProgressBar
import android.widget.TextView
import android.widget.Toast
import androidx.core.content.ContextCompat
import daniel.brian.quizapp.databinding.ActivityQuestionsBinding

class QuestionsActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var  binding: ActivityQuestionsBinding

    private var mCurrentPosition : Int = 1
    private var mQuestionList : ArrayList<Questions>? = null
    private var mSelectedOptionPosition : Int = 0
    private var mCorrectAnswers : Int = 0
    private var mUserName : String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_LAYOUT_STABLE or View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
        window.statusBarColor = Color.TRANSPARENT
        binding = ActivityQuestionsBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        mUserName = intent.getStringExtra(Constants.USER_NAME)
        mQuestionList = Constants.getQuestions()


        // To access the buttons
        binding.optionOne.setOnClickListener(this)
        binding.optionTwo.setOnClickListener(this)
        binding.optionThree.setOnClickListener(this)
        binding.optionFour.setOnClickListener(this)
        binding.submitBtn.setOnClickListener(this)

        setQuestion()

    }

    @SuppressLint("SetTextI18n")
    private fun setQuestion () {

        val question = mQuestionList!![mCurrentPosition  - 1]

        if(mCurrentPosition == mQuestionList!!.size){
            binding.submitBtn.text = "FINISH"
        }else{
            binding.submitBtn.text = "SUBMIT"
        }

        binding.progressBar.progress = mCurrentPosition
        binding.tvProgress.text = "$mCurrentPosition " + "/" + binding.progressBar.max

        binding.tvQuestion.text = question .Question
        binding.ivImage.setImageResource(question.image)
        binding.optionOne.text = question.optionOne
        binding.optionTwo.text = question.optionTwo
        binding.optionThree.text = question.optionThree
        binding.optionFour.text = question.optionFour

        // This will be set the default after every question
        defaultOptionView()

    }

    private fun defaultOptionView () {

        val options = ArrayList<TextView>()

        options.add(0, this.binding.optionOne)
        options.add(1, this.binding.optionTwo)
        options.add(2, this.binding.optionThree)
        options.add(3, this.binding.optionFour)

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
                 selectedOptionView(binding.optionOne, 1)
             }
             R.id.optionTwo -> {
                 selectedOptionView(binding.optionTwo, 2)
             }
             R.id.optionThree -> {
                 selectedOptionView(binding.optionThree, 3)
             }
             R.id.optionFour -> {
                 selectedOptionView(binding.optionFour, 4)
             }
             R.id.submitBtn -> {

                 if(mSelectedOptionPosition == 0){
                     mCurrentPosition ++

                     when{
                         mCurrentPosition <= mQuestionList!!.size -> {
                             setQuestion()
                         }else -> {
                             val intent = Intent(this, ResultActivity::class.java)
                             intent.putExtra(Constants.USER_NAME, mUserName)
                             intent.putExtra(Constants.TOTAL_QUESTIONS, mQuestionList!!.size)
                             intent .putExtra(Constants.CORRECT_ANSWERS, mCorrectAnswers)
                             startActivity(intent)
                         }
                     }
                 }else{
                     val question = mQuestionList?.get(mCurrentPosition -1)

                     if(question!!.correctAnswer != mSelectedOptionPosition){
                         answerView(mSelectedOptionPosition, R.drawable.wrong_option_border_bg)
                     }else{
                         mCorrectAnswers++
                     }
                         answerView(question.correctAnswer, R.drawable.correct_option_border_bg)

                     if(mCurrentPosition == mQuestionList!!.size){
                         binding.submitBtn.text = "FINISH"

                     }else{
                         binding.submitBtn.text = "GO TO THE NEXT QUESTION"
                     }
                         mSelectedOptionPosition = 0
                 }
             }
        }
    }

    private  fun answerView(answer : Int, drawableView : Int){

        when(answer){
            1 -> {
              binding.optionOne.background = ContextCompat.getDrawable(this,drawableView)
            }
            2 -> {
                binding.optionTwo.background = ContextCompat.getDrawable(this,drawableView)
            }
            3 -> {
                binding.optionThree.background = ContextCompat.getDrawable(this,drawableView)
            }
            4 -> {
                binding.optionFour.background = ContextCompat.getDrawable(this,drawableView)
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