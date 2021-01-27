package basics

fun main() {
    println("Digita il tuo nome:")
    var name = readLine()
    var counter = 0
    while(name.isNullOrBlank()){
        println("Per favore inserisci un nome:")
        name = readLine()
        counter++
    }
    if (counter == 0){
        println("Grazie, $name")
    }else{
        name += " , ce l'hai fatta"
        println("Grazie $name")
    }

}


