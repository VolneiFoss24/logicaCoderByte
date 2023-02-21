fun longhestWord(str: String): String {

    val words = str.split(' ')
    var longhest = " "

    for (word in words){
        if (word.length > longhest.length) {
            longhest = word
        }
    }

    return longhest
}