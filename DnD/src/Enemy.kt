open class Enemy(val name: String, val level: Int, var hp: Double, var mana: Double, val expGain: Int) {
    var inRange = false
    fun isApproaching(){
        inRange = true
    }
    override fun toString(): String {
        return name
    }
}