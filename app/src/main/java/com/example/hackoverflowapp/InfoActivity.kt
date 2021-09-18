package com.example.hackoverflowapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_info.*
import kotlinx.android.synthetic.main.activity_quiz_questions.*

class InfoActivity : AppCompatActivity(), View.OnClickListener {

    private var mCurrentPosition:Int = 0
    private var mhelpTitle:String? = null
    private var mhelpContent:String? = null
    private var mInfohelpList:ArrayList<InfoHelp>? = null
    private var mCorrectAnswers: Int = 0
    private var mUserName: String? = null



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_info)

        mCurrentPosition = intent.getIntExtra(Constants.CURRENT_QUESTION, 0)
        mUserName = intent.getStringExtra(Constants.USER_NAME)

        mInfohelpList = Constants.getInfoHelp()
        printHelp()

        btn_continue.setOnClickListener(this)

    }

    private fun printHelp() {
        val infoHelp = mInfohelpList!![mCurrentPosition - 1]

        tv_title.text = infoHelp.info_title
        tv_content.text = infoHelp.info_body
        iv_info.setImageResource(infoHelp.image)

    }

    override fun onClick(v: View?) {
        if (v == btn_continue){
            when {
                mCurrentPosition <= mInfohelpList!!.size -> {
                    val intent = Intent(this, QuizQuestionsActivity::class.java)
                    intent.putExtra(Constants.USER_NAME, mUserName)
                    intent.putExtra(Constants.CORRECT_ANSWERS, mCorrectAnswers)
                    intent.putExtra(Constants.TOTAL_QUESTIONS, mInfohelpList!!.size)
                    // this forces the quiz question activity to proceed to next question
                    intent.putExtra(Constants.CURRENT_QUESTION, mCurrentPosition + 1)
                    startActivity(intent)
                    finish()
                } else -> {
                val intent = Intent(this, ResultActivity::class.java)
                intent.putExtra(Constants.USER_NAME, mUserName)
                intent.putExtra(Constants.CORRECT_ANSWERS, mCorrectAnswers)
                intent.putExtra(Constants.TOTAL_QUESTIONS, mInfohelpList!!.size)
                // this forces the quiz question activity to proceed to next question
                startActivity(intent)
                finish()
                }
            }
        }
    }
}