package com.example.shoping_app.domain

class GetShopItemUseCaseId(private val shopListItem: ShopListRepository) {

    fun getShopItemUseCaseId(id: Int): ShopItem {
        return shopListItem.getShopItemUseCaseId(id)
    }
}