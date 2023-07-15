package daniel.brian.quizapp

import java.util.ArrayList


//import kotlin.collections.ArrayList

object Constants {

    const val CORRECT_ANSWERS : String = "Correct_Answers"
    const val TOTAL_QUESTIONS : String = "Total_Questions"
    const val USER_NAME : String = "User_name"
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

    fun getLogos() : ArrayList<Questions>  {
        val logoList  = ArrayList<Questions>()

        val Qtn1 = Questions (1,
            "Which car company does this logo belong to?",
            R.drawable.cardillac_logo,
            "Bentley",
            "Cadillac",
            "Chevrolet",
            "Elemental",
            2
        )
        logoList.add(Qtn1)

        val Qtn2 = Questions (2,
            "Which car company does this logo belong to?",
            R.drawable.alpine_logo,
            "Mercury",
            "Mazda",
            "Buick",
            "Alpine",
            4
        )
        logoList.add(Qtn2)

        val Qtn3 = Questions (3,
            "Which car company does this logo belong to?",
            R.drawable.bently_logo,
            "Bentley",
            "Irizar",
            "Chevrolet",
            "Audi",
            1
        )
        logoList.add(Qtn3)

        val Qtn4 = Questions (4,
            "Which car company does this logo belong to?",
            R.drawable.daewoo_logo,
            "Buick",
            "Arcfox",
            "Daewoo",
            "9ff",
            3
        )
        logoList.add(Qtn4)

        val Qtn5 = Questions (5,
            "Which car company does this logo belong to?",
            R.drawable.gaz_logo,
            "Skoda",
            "Gaz",
            "Infiniti",
            "Renault",
            2
        )
        logoList.add(Qtn5)

        val Qtn6 = Questions (6,
            "Which car company does this logo belong to?",
            R.drawable.inifiniti_logo,
            "Lexus",
            "Cadillac",
            "Infiniti",
            "Dodge Viper",
            3
        )
        logoList.add(Qtn6)

        val Qtn7 = Questions (7,
            "Which car company does this logo belong to?",
            R.drawable.nine_ff_logo,
            "Citroen",
            "Skoda",
            "Elemental",
            "9ff",
            4
        )
        logoList.add(Qtn7)

        val Qtn8 = Questions (8,
            "Which car company does this logo belong to?",
            R.drawable.pontiac_logo,
            "Pontiac",
            "Cadillac",
            "Chevrolet",
            "Elemental",
            1
        )
        logoList.add(Qtn8)

        val Qtn9 = Questions (9,
            "Which car company does this logo belong to?",
            R.drawable.renault_logo,
            "Arcfox",
            "Renault",
            "Dodge viper",
            "Mercury",
            2
        )
        logoList.add(Qtn9)

        val Qtn10 = Questions (10,
            "Which car company does this logo belong to?",
            R.drawable.vinfast_logo,
            "Bentley",
            "Cadillac",
            "Vinfast",
            "Honda",
            3
        )
        logoList.add(Qtn10)

        return  logoList
    }

    fun getTech () : ArrayList<Questions> {

        val techList = ArrayList<Questions>()

        val Qtn1 = Questions (1,
            "Which tech company do this logo belong to ?",
            R.drawable.microsoft_logo,
            "Airbnb",
            "Samsung",
            "Microsoft",
            "Google",
            3
        )
        techList.add(Qtn1)

        val Qtn2 = Questions (2,
            "Which tech company do this logo belong to ?",
            R.drawable.accenture_logo,
            "Accenture",
            "Samsung",
            "Paypal",
            "Taro",
            1
        )
        techList.add(Qtn2)


        val Qtn3 = Questions (3,
            "Which tech company do this logo belong to ?",
            R.drawable.airbnb_logo,
            "Pair AI",
            "Taro",
            "Airbnb",
            "Google",
            3
        )
        techList.add(Qtn3)

        val Qtn4 = Questions (4,
            "Which tech company do this logo belong to ?",
            R.drawable.apple_logo,
            "Airbnb",
            "Apple",
            "Ebay",
            "Paypal",
            2
        )
        techList.add(Qtn4)

        val Qtn5 = Questions (5,
            "Which tech company do this logo belong to ?",
            R.drawable.figma_logo,
            "Canva",
            "Zara",
            "Paypal",
            "Figma",
            4
        )
        techList.add(Qtn5)

        val Qtn6 = Questions (6,
            "Which tech company do this logo belong to ?",
            R.drawable.google_logo,
            "Airbnb",
            "Samsung",
            "Microsoft",
            "Google",
            4
        )
        techList.add(Qtn6)

        val Qtn7 = Questions (7,
            "Which tech company do this logo belong to ?",
            R.drawable.meta_logo,
            "Apple",
            "Samsung",
            "Meta",
            "Metaverse",
            3
        )
        techList.add(Qtn7)

        val Qtn8 = Questions (8,
            "Which tech company do this logo belong to ?",
            R.drawable.spotify_logo,
            "Spotify",
            "Tiktok",
            "Microsoft",
            "Threads",
            1
        )
        techList.add(Qtn8)

        val Qtn9 = Questions (9,
            "Which tech company do this logo belong to ?",
            R.drawable.threads_logo,
            "Instagram",
            "Threads",
            "Facebook",
            "Twitter Clone",
            2
        )
        techList.add(Qtn9)

        val Qtn10 = Questions (10,
            "Which tech company do this logo belong to ?",
            R.drawable.tiktok_logo,
            "Tencent",
            "Samsung",
            "Tiktok",
            "Taro",
            3
        )
        techList.add(Qtn10)

        return  techList
    }

    fun getCeos () : ArrayList<Questions> {

        val ceosList = ArrayList<Questions>()

        val Qtn1 = Questions (1,
            "Which tech company do this logo belong to ?",
            R.drawable.louis_vuiton,
            "Bernard Arnault",
            "Elon Musk",
            "Kim Harrington",
            "Wael Sawan",
            1
        )
        ceosList.add(Qtn1)

        return ceosList
    }
}