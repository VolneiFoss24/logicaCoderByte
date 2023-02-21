fun firstFatorial(num: Int): String {

    var fatorial = 1
    for (i in num downTo 1){
        fatorial *= i
    }

    return "O fatorial do numero dado é ${fatorial}"
}