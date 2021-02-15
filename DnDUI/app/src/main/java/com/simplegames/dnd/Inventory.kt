open class Inventory (var size: Int = 10){
    val inventory = mutableListOf<Item>()
    fun open(){
        if (inventory.isEmpty()){
            println("L'inventario è vuoto")
        }else{
            println(inventory.toString())
        }
    }

    fun addItem(item: Item){
        if (inventory.size < size){
            inventory.add(item)
        }else{
            println("L'inventario è pieno, libera dello spazio prima di aggiungere qualcosa")
        }
    }

    fun removeItem(name: Item) {
        if (inventory.contains(name)) {
            inventory.remove(name)
            println("${name.name} rimosso dall'inventario")
        }
    }


    fun useItemReturn(name: Item): Item {
        if(inventory.contains(name)){
            println("Stai usando $name")
            return name
        }else
            println("L'oggetto non è presente, rimani a mani vuote!")
            return Item.BlankItem
    }
    fun useItem(name: Item) {
        if (inventory.contains(name)) {
            println("Stai usando $name")

        } else
            println("L'oggetto non è presente, rimani a mani vuote!")

    }

}