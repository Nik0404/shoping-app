package com.example.shoping_app.domain

class DeleteShopItemUseCase(private val shopListItem: ShopListRepository) {

    fun deleteShoppingList(id: Int) {
        shopListItem.deleteShopList(id)
    }
}