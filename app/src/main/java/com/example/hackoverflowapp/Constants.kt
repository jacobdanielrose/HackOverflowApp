package com.example.hackoverflowapp

object Constants {

    const val USER_NAME: String = "user_name"
    const val TOTAL_QUESTIONS: String = "total_questions"
    const val CORRECT_ANSWERS: String = "correct_answers"

    fun getQuestions(): ArrayList<Question> {
        val questionsList = ArrayList<Question>()

        val que1 = Question(1,
            "When receiving an email like this, what should you NOT do?",
            R.drawable.ic_phishing_email,
            "Click the link!",
            "Send a mean reply back",
            "Delete the email",
            "Call your mom",
            1
        )

        questionsList.add(que1)
        return questionsList
    }
}