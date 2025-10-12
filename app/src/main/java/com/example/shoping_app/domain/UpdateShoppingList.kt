package com.example.shoping_app.domain

class UpdateShoppingList(private val shopListItem: ShopListRepository) {

    fun updateShoppingList(id: Int) {
        shopListItem.updateShopList(id)
    }
}