package com.example.myapplication

class Main {
}

fun main() {
    val store = PetStore()

    val husky = Husky(weight = 20.0, age = 3, biteType = "прямой")
    val corgi = Corgi(weight = 12.0, age = 2, biteType = "перекус")
    val scottishCat = ScottishFold(weight = 5.0, age = 4, behaviorType = "пассивная")
    val siameseCat = SiameseCat(weight = 6.0, age = 5, behaviorType = "активная")

    store.addPet(husky)
    store.addPet(corgi)
    store.addPet(scottishCat)
    store.addPet(siameseCat)

    store.showPets()
}