package com.example.shoping_app.domain

class GetShopItemUseCase(private val shopListItem: ShopListRepository) {

    fun getShoppingList(): List<ShopItem> {
        return shopListItem.getShopList()
    }

}