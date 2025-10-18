package com.example.shoping_app.domain

import com.example.shoping_app.data.ShopListRepository

class AddShopItemUseCase(private val shopListItem: ShopListRepository) {

    fun addShoppingList(item: ShopItem) {
        shopListItem.addShopList(item)
    }

}