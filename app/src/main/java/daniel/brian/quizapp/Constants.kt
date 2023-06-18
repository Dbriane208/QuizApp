package daniel.brian.quizapp

import java.util.ArrayList
//import kotlin.collections.ArrayList

object Constants {

    fun getQuestions(): ArrayList<Questions>{
        val questionsList = ArrayList<Questions>()

        val Qtn1 = Questions (1,
            "Which country do this flag belong to ?",
            R.drawable.ic_kenya_flag,
            "Uganda",
            "Kenya",
            "Somalia",
            "Ethiopia",
            2
        )
        questionsList.add(Qtn1)

        val Qtn2 = Questions (2,
            "Which country do this flag belong to ?",
            R.drawable.ic_uganda_flag,
            "Djibouti",
            "Kenya",
            "Uganda",
            "Ethiopia",
            3
        )
        questionsList.add(Qtn2)

        val Qtn3 = Questions (3,
            "Which country do this flag belong to ?",
            R.drawable.ic_tanzania_flag,
            "Uganda",
            "Kenya",
            "Tanzania",
            "Ethiopia",
            3
        )
        questionsList.add(Qtn3)

        val Qtn4 = Questions (4,
            "Which country do this flag belong to ?",
            R.drawable.ic_rwanda_flag,
            "Rwanda",
            "Kenya",
            "Somalia",
            "Congo",
            1
        )
        questionsList.add(Qtn4)

        val Qtn5 = Questions (5,
            "Which country do this flag belong to ?",
            R.drawable.ic_burundi_flag,
            "Egypt",
            "Kenya",
            "Malawi",
            "Burundi",
            4
        )
        questionsList.add(Qtn5)

        val Qtn6 = Questions (6,
            "Which country do this flag belong to ?",
            R.drawable.ic_somalia_flag,
            "Uganda",
            "Senegal",
            "Somalia",
            "Ethiopia",
            3
        )
        questionsList.add(Qtn6)

        val Qtn7 = Questions (7,
            "Which country do this flag belong to ?",
            R.drawable.ic_ethiopia_flag,
            "Zimbambwe",
            "Kenya",
            "Mexico",
            "Ethiopia",
            4
        )
        questionsList.add(Qtn7)

        val Qtn8 = Questions (8,
            "Which country do this flag belong to ?",
            R.drawable.ic_sudan_flag,
            "Sudan",
            "Kenya",
            "Burundi",
            "Uganda",
            1
        )
        questionsList.add(Qtn8)

        val Qtn9 = Questions (9,
            "Which country do this flag belong to ?",
            R.drawable.ic_djibouti_flag,
            "Nigeria",
            "Congo",
            "Djibouti",
            "Benin",
            3
        )
        questionsList.add(Qtn9)

        val Qtn10 = Questions (10,
            "Which country do this flag belong to ?",
            R.drawable.ic_eritriea_flag,
            "Burundi",
            "Eritriea",
            "Somalia",
            "Rwanda",
            2
        )
        questionsList.add(Qtn10)

        return questionsList
    }
}