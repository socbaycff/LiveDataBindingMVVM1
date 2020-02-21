package com.example.livedatabindingmvvm1.network.FoodService

class FoodService {
    val foodList = mutableListOf<Food>()
    init {

        foodList.add(
            Food(
                1,
                "Com suon",
                FoodType.KHO
            )
        )
        foodList.add(
            Food(
                2,
                "Bun bo",
                FoodType.NUOC
            )
        )
        foodList.add(
            Food(
                3,
                "Pho",
                FoodType.NUOC
            )
        )
        foodList.add(
            Food(
                4,
                "Snack Bi Do",
                FoodType.TRANGMIENG
            )
        )
        foodList.add(
            Food(
                5,
                "Nho",
                FoodType.TRANGMIENG
            )
        )
        foodList.add(
            Food(
                6,
                "Com chien",
                FoodType.KHO
            )
        )
        foodList.add(
            Food(
                7,
                "Bun thit nuoc",
                FoodType.KHO
            )
        )
        foodList.add(
            Food(
                8,
                "Trung chien",
                FoodType.KHO
            )
        )
        foodList.add(
            Food(
                9,
                "Com ga",
                FoodType.KHO
            )
        )
        foodList.add(
            Food(
                10,
                "Banh canh ca loc",
                FoodType.NUOC
            )
        )
        foodList.add(
            Food(
                11,
                "Xoi man",
                FoodType.KHO
            )
        )
        foodList.add(
            Food(
                12,
                "Sup cua",
                FoodType.NUOC
            )
        )
        foodList.add(
            Food(
                13,
                "Rau cau",
                FoodType.TRANGMIENG
            )
        )

    }

    fun getFoodById(id: Int): Food? {
        for (item in foodList) {
            if(item.id == id) return item
        }
        return null
    }


    fun updateFoodByID(id: Int, name: String, type: FoodType): Boolean {
        for (item in foodList) {
            if (item.id == id) {
                item.name = name
                item.type = type
                return true
            }
        }
        return false
    }


}