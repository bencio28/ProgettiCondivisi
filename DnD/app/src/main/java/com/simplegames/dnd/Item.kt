open class Item(val name: String) {
    override fun toString(): String {
        return name
    }
    companion object BlankItem: Item("Slot vuoto") {

    }
}