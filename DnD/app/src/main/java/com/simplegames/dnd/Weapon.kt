open class Weapon(name: String, val damage: Double) : Item(name) {

    companion object Fists: Weapon("Pugni", 1.0){
    }
    open fun attack(enemy: Enemy){
        enemy.hp -= damage
        println("${enemy.toString()} ha subito $damage danni!")
    }
}

