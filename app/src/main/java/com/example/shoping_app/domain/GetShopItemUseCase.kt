package com.example.shoping_app.domain

import androidx.lifecycle.LiveData

class GetShopItemUseCase(private val shopListItem: ShopListRepository) {

    fun getShoppingList(): LiveData<List<ShopItem>> {
        return shopListItem.getShopList()
    }

}