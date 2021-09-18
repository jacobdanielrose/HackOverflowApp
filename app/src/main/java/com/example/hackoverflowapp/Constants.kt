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
                "information from you. e.g. banking info, credit card numbers. In the example photo, they " +
                "claimed to be amazon but the email was from accounts@mazon.com which was missing the first a. " +
                "Many people might mistake the @ for an A and click on the link thinking it was legitimate, which is a common " +
                "tactic. If one hovers over the link one sees that it actually links to a different website, which is common as well " +
                "as these sites are typically mockups that look similar to the company being \"represented\" so that you feel " +
                "comfortable entering your personal info."
        )

        infohelpList.add(info1)


        val info2 = InfoHelp(2,
            "Encryption",
            R.drawable.ic_pgp,
            "Encryption will not actually prevent a hacker from extracting " +
                    "data traveling across a network, if they have managed to gain access. " +
                    "However, all the data that the hacker obtains will be encrypted and therefore " +
                    "useless unless they also happens to have the private key used in the encryption. " +
                    "The data they obtain will just look a bunch of random junk like the message above."
        )

        infohelpList.add(info2)

        val info3 = InfoHelp(3,
            "SQL Injection",
            R.drawable.ic_sql,
            "SQL Injection is one of the most common cyberattacks in the world. Although it is relatively simple " +
                    "to guard against, it is shockingly common how many big companies still manage to get hacked by this method. " +
                    "There are many types but most of them boil down to entering malicious SQL code as a disguised as a normal query. " +
                    "If proper measures are not taken, this can allow the hacker to run whatever SQL code they please and possibly retrieve any data " +
                    "stored on the system. To prevent this one should parameterize queries, which allows one to predefine query types, minimizing the hackers ability " +
                    "to run malicious code. Also making use of the principle of lease privilege (POLP), making sure that standard users accounts have only those " +
                    "privileges necessary to do their tasks, and nothing more, which minimizes the hackers attack surface."
        )

        infohelpList.add(info3)

        val info4 = InfoHelp(4,
            "2 Factor Authentication",
            R.drawable.ic_2FA_1,
            "2 Factor authentication would work in python by using the PyOTP library and a JS front end with a simple authentication app like " +
                    "google authenticator or duo mobile. 2FA drastically reduces the ability of someone to hack an account by brute force " +
                    "attacking the password or obtaining it in another data breach."
        )

        infohelpList.add(info4)

        val info5 = InfoHelp(5,
            "Proper Logging",
            R.drawable.ic_logs,
            "Another way to prevent data breaches, is by logging all log-ins, server queries, transfers, emails, etc. All of this can be " +
                    "logged on both ends and then compared at the end of the day. If the logs do not match up on both ends, " +
                    "it will be flagged as an unauthorized access, allowing you to lock out the given account and prevent further theft."
        )

        infohelpList.add(info5)

        val info6 = InfoHelp(6,
            "Proper Logging",
            R.drawable.ic_email,
            "A simple way to deal with email phishing and malware related attacks is to utilize, again the third party email providers IT tools for disabling links on " +
                    "all external emails preventing inadvertent execution of malware. Another interesting tool, would be to use machine learning (specifically a neural net) " +
                    "to do language recognition for the sending emails address. Often times, malicious emails are sent from randomly generated addresses, " +
                    "with a display name that mimics a known sender. A NN in python could be used to recognize real names and words in the email address " +
                    "(info@gmail.com, or  paypal@mail.paypal.com vs jcjuap0jguhoja7-nqtuhieiidqtassc@mail.com see image below) to filter out potentially dangerous emails."
        )

        infohelpList.add(info6)

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

        val que3 = Question(3,
            "What is the main way to prevent SQL Injection attacks?",
            R.drawable.ic_sql_inject,
            "To filter and escape inputs on your website",
            "Parameterize queries with bound, typed parameters",
            "Turn off your computer",
            "Pray",
            2
        )

        questionsList.add(que3)

        val que4 = Question(4,
            "What is the advantage of utilizing multi-factor authetication?",
            R.drawable.ic_2fa,
            "Make logging in slower and more annoying",
            "Eliminate unauthorized logins with your account info",
            "Make logging in simpler",
            "IT workers have nothing better to do",
            2
        )

        questionsList.add(que4)

        val que5 = Question(5,
            "Why do we log/monitor all logins and server queries?",
            R.drawable.ic_logging,
            "We are nosy and want to know what you're doing",
            "We enjoy wasting memory on cataloging",
            "Allows us to confirm authorized access of sensitive data",
            "All of the above",
            3
        )

        questionsList.add(que5)

        val que6 = Question(6,
            "How do we discriminate real email accounts from malicious ones?",
            R.drawable.ic_disable_links,
            "Neural net language recognition of sending address",
            "Flagging all emails from external accounts and disabling links ",
            "This app educating you on simple steps to better cyber security practices!",
            "All of the above",
            4
        )

        questionsList.add(que6)

        return questionsList
    }
}