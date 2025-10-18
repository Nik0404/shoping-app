package com.example.shoping_app.domain

class AddShopItemUseCase(private val shopListItem: ShopListRepository) {

    fun addShoppingList(item: ShopItem) {
        shopListItem.addShopList(item)
    }

}