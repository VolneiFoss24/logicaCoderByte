/*
    - inicial letras de a .. z
    - somente letras, numeros, e underline
    - min 4 str - max 24 str
    - nao pode terminar com underline

*/

fun checkUser(user: String): String {
    var valid = user.length in 4..25 && user[0] in 'a'..'z' || user[0] in 'A'..'Z'

    user.forEach {
        valid =
            valid && (it in 'a'..'z' || it in 'A'..'Z' || it in '0'..'9' || it == '_') && !user.endsWith('_')
    }

    if (valid) {
        return "user valido"
    }

    return "user invalido"
}