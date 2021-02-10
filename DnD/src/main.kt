fun main(){
    val newbieInventory = Inventory(3)
    val blankItem = Item("")
    val fists = Weapon("Pugni",1.0)
    val newbieGear = Gear(blankItem,fists)
    val norman = Character("Norman", 10, 500.0, 200.0, newbieInventory,newbieGear)
    norman.greet()


    val coltello = MeleeWeapon("Coltello",2.5)
    val katana = MeleeWeapon("Katana",5.0)
    val arco = RangedWeapon("Arco",3.4, 4)
    val swordTest3 = Weapon("coltello3",3.4)
    norman.inventory.open()
    norman.inventory.addItem(coltello)
    norman.inventory.addItem(katana)
    norman.inventory.addItem(arco)
    norman.inventory.open()
    norman.inventory.addItem(swordTest3)
    norman.inventory.open()
    val dummyTest = Enemy("Bersaglio di prova",5,40.0,20.0, 30)
    norman.inventory.useItem(coltello)
    norman.inventory.useItem(swordTest3)

    norman.wearWeapon(katana)
    norman.fight(dummyTest)



}