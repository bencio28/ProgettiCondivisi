class RangedWeapon(name: String, damage: Double, val range: Int) : Weapon(name, damage) {
    override fun attack(enemy: Enemy){
        if (enemy.inRange){
            enemy.hp -= damage
            println("$enemy ha subito $damage danni!")
        }
    }
}