package com.example.hackoverflowapp

import java.net.URL

object Constants {

    const val USER_NAME: String = "user_name"
    const val TOTAL_QUESTIONS: String = "total_questions"
    const val CORRECT_ANSWERS: String = "correct_answers"
    const val CURRENT_QUESTION: String = "current_question"

    fun getInfoHelp(): ArrayList<InfoHelp> {
        val infohelpList = ArrayList<InfoHelp>()

        val info1 = InfoHelp(1,
        "Phishing attacks",
        R.drawable.ic_phishing,
        "Phishing attacks are emails or text messages that attempt to " +
                "imitate a well-known and respected company in an attempt to extract sensitive " +
                "information from you. e.g. banking info, credit card numbers"
        )

        infohelpList.add(info1)


        val info2 = InfoHelp(2,
            "Encryption",
            R.drawable.ic_pgp,
            "Encryption will not actually prevent a hacker from extracting " +
                    "data traveling across a network, if they have managed to gain access " +
                    "however, all the data that the hacker obtains will be encrypted and therefore " +
                    "useless unless they also happens to have the private key used in the encryption. " +
                    "The data they obtain will just look a bunch of random junk like the message above."
        )

        infohelpList.add(info2)

        val info3 = InfoHelp(2,
            "SQL Injection",
            R.drawable.ic_sql,
            "SQL Injection is one of the most common cyberattacks in the world. Although it is relatively simple " +
                    "to guard against, it is shockingly common how many big companies still manage to get hacked by this method. " +
                    ""
        )

        infohelpList.add(info3)

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

        val que3 = Question(2,
            "What is the main way to prevent SQL Injection attacks?",
            R.drawable.ic_sql_inject,
            "To filter and escape inputs on your website",
            "Parameterize queries with bound, typed parameters",
            "Turn off your computer",
            "Pray",
            3
        )

        questionsList.add(que3)

        return questionsList
    }
}