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

    fun useItemBeta(name: Item): Item {
        val blankItem = Item("")
        for (i in 0..inventory.size){
            if (inventory[i].name == name.name){
                return inventory[i]
            }else
                println("L'oggetto non è presente, rimani a mani vuote!")
        }
        return blankItem
    }

    fun useItemReturn(name: Item): Item {
        val blankItem = Item("")
        if(inventory.contains(name)){
            println("Stai usando $name")
            return name
        }else
            println("L'oggetto non è presente, rimani a mani vuote!")
            return blankItem
    }
    fun useItem(name: Item) {
        if (inventory.contains(name)) {
            println("Stai usando $name")

        } else
            println("L'oggetto non è presente, rimani a mani vuote!")

    }

}