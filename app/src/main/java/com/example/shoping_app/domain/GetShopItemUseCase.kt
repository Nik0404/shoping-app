package com.example.shoping_app.domain

import com.example.shoping_app.data.ShopListRepository

class GetShopItemUseCase(private val shopListItem: ShopListRepository) {

    fun getShoppingList(): List<ShopItem> {
        return shopListItem.getShopList()
    }

}