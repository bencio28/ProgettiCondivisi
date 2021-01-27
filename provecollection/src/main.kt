fun main(){
    val lista = mutableListOf<Int>()
    init(lista, 100)
    println(lista)
}

fun init(lista: MutableList<Int>, size: Int) {
    for(i in 1..100){
        lista.add(i)
    }
}