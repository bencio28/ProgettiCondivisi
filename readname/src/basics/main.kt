package basics

fun main() {
    println("Digita il tuo nome:")
    var name = readLine()
    var guard = true
    while(name.isNullOrBlank()){
        println("Per favore inserisci un nome:")
        name = readLine()
        guard = false
    }
    if (guard){
        println("Grazie, $name")
    }else{
        name += " , ce l'hai fatta"
        println("Grazie $name")
    }

}


