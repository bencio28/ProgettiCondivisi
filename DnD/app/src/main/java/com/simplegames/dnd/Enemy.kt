open class Enemy(name: String = "Nemico di default", val expGain: Int = 30, override var hp : Double = 100.0,
                 override var mana: Double = 50.0) : GameCharacter(name) {
    var inRange = false
    fun isApproaching(){
        inRange = true
    }


    override fun toString(): String {
       return name
    }
}