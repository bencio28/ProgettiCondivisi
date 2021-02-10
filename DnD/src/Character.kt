open class Character(
    val name: String,
    var level: Int = 1,
    var hp: Double = 10.0,
    var mana: Double = 5.0,
    var inventory: Inventory = Inventory(),
    var gear: Gear,
    var exp: Int = 0
) {
    fun greet() {
        println("Ciao mi chiamo $name , un eroe di livello $level!")
    }

    fun levelUp() {

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

}