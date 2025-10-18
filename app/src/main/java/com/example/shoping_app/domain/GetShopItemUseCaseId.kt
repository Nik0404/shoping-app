package com.example.shoping_app.domain

import com.example.shoping_app.data.ShopListRepository

class GetShopItemUseCaseId(private val shopListItem: ShopListRepository) {

    fun getShopItemUseCaseId(id: Int): ShopItem {
        return shopListItem.getShopItemUseCaseId(id)
    }
}