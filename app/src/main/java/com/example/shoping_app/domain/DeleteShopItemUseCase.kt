package com.example.shoping_app.domain

import com.example.shoping_app.data.ShopListRepository

class DeleteShopItemUseCase(private val shopListItem: ShopListRepository) {

    fun deleteShoppingList(id: Int) {
        shopListItem.deleteShopList(id)
    }
}