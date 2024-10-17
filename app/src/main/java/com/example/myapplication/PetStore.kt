package com.example.myapplication

class PetStore {
    private val pets = mutableListOf<Animal>()

    fun addPet(pet: Animal) {
        pets.add(pet)
    }

    fun getPetType(pet: Animal): String {
        return when (pet) {
            is Dog -> "Это собака."
            is Cat -> "Это кошка."
            else -> "Неизвестное животное."
        }
    }

    fun showPets() {
        for (pet in pets) {
            println("${getPetType(pet)} ${pet.getFoodType()}")
        }
    }
}
