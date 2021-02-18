open class GameCharacter(
    val name: String ,
    open var level: Int = 1,
    open var hp: Double = 10.0,
    open var mana: Double = 5.0,
    private var inventory: Inventory = Inventory(),
    var gear: Gear = Gear(),
    var exp: Int = 0
) {

   //FUNZIONI DA RIADATTARE PER LA VERSIONE ANDROID
    fun greet() {
        println("Ciao mi chiamo $name , un eroe di livello $level!")
    }

    fun target() {
        println("Inserisci il nome del target: ")
        val input = readLine()



    }


    fun fight(enemy: Enemy) {
        gear.weapon.attack(enemy)
    }

    fun wearArmour(name: Item){
        gear.armour = name
        println("Stai indossando $name")
    }

    fun wearWeapon(name: Weapon){
        gear.weapon = name
        println("Stai indossando $name")
    }
    fun addItem(item: Item){
        inventory.addItem(item)
    }
    fun removeItem(item: Item){
        inventory.removeItem(item)
    }

    fun openInventory(){
        inventory.open()
    }

    fun useItem(item: Item){
        inventory.useItem(item)
    }

    override fun toString(): String {
        return this.name
    }
}