package com.example.shoping_app.data

import com.example.shoping_app.domain.ShopItem

interface ShopListRepository {

    fun addShopList(item: ShopItem)

    fun getShopList(): List<ShopItem>

    fun getShopItemUseCaseId(id: Int): ShopItem

    fun updateShopList(id: Int)

    fun deleteShopList(id: Int)
}