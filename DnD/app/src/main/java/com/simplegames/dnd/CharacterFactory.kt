class CharacterFactory {
    companion object {
        fun createChar(name: String): GameCharacter{
            return GameCharacter(name)
        }
    }
}