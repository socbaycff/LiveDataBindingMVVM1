package com.example.livedatabindingmvvm1.network.FoodService

data class Food(val id: Int, var name: String, var type: FoodType)

enum class FoodType {
    NUOC, KHO, TRANGMIENG
}