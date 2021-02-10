open class Weapon(name: String, val damage: Double) : Item(name) {

    open fun attack(enemy: Enemy){
        enemy.hp -= damage
        println("${enemy.toString()} ha subito $damage danni!")
    }
}