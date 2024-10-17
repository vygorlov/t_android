package com.example.myapplication

class Animals {
}

// Базовый класс для животных
abstract class Animal(val weight: Double, val age: Int) {
    abstract fun getFoodType(): String
}

// Класс для собак
abstract class Dog(weight: Double, age: Int, val biteType: String) : Animal(weight, age)

// Конкретные классы пород собак
class Husky(weight: Double, age: Int, biteType: String) : Dog(weight, age, biteType) {
    override fun getFoodType(): String {
        return "Хаски: Корм для веса $weight кг и возраста $age лет с прикусом $biteType"
    }
}

class Corgi(weight: Double, age: Int, biteType: String) : Dog(weight, age, biteType) {
    override fun getFoodType(): String {
        return "Корги: Корм для веса $weight кг и возраста $age лет с прикусом $biteType"
    }
}

// Класс для кошек
abstract class Cat(weight: Double, age: Int, val behaviorType: String) : Animal(weight, age)

// Конкретные классы пород кошек
class ScottishFold(weight: Double, age: Int, behaviorType: String) : Cat(weight, age, behaviorType) {
    override fun getFoodType(): String {
        return "Шотландская кошка: Корм для веса $weight кг и возраста $age лет с поведением $behaviorType"
    }
}

class SiameseCat(weight: Double, age: Int, behaviorType: String) : Cat(weight, age, behaviorType) {
    override fun getFoodType(): String {
        return "Сиамская кошка: Корм для веса $weight кг и возраста $age лет с поведением $behaviorType"
    }
}
