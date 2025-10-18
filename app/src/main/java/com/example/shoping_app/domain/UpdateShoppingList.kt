package com.example.shoping_app.domain

import com.example.shoping_app.data.ShopListRepository

class UpdateShoppingList(private val shopListItem: ShopListRepository) {

    fun updateShoppingList(id: Int) {
        shopListItem.updateShopList(id)
    }
}