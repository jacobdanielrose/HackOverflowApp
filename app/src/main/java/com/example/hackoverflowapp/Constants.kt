package com.example.hackoverflowapp

object Constants {

    const val USER_NAME: String = "user_name"
    const val TOTAL_QUESTIONS: String = "total_questions"
    const val CORRECT_ANSWERS: String = "correct_answers"
    const val CURRENT_QUESTION: String = "current_question"

    fun getInfoHelp(): ArrayList<InfoHelp> {
        val infohelpList = ArrayList<InfoHelp>()

        val info1 = InfoHelp(1,
        "Phishing attacks!",
        R.drawable.ic_phishing,
        "hello"
        )

        infohelpList.add(info1)


        val info2 = InfoHelp(2,
            "Encryption!",
            R.drawable.ic_phishing,
            "hello"
        )

        infohelpList.add(info2)

        return infohelpList
    }

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

        val que2 = Question(2,
            "What is one benefit of e2e encryption?",
            R.drawable.ic_encryption,
            "Hackers can't see what you send across the network",
            "The hackers computer will spontaneously combust",
            "Hackers only see junk when intercepting traffic",
            "Grandma's computer won't get viruses anymore",
            3
        )

        questionsList.add(que2)

        return questionsList
    }
}