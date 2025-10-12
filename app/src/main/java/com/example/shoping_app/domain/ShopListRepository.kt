package com.example.shoping_app.domain

interface ShopListRepository {

    fun addShopList(item: ShopItem)

    fun getShopList(): List<ShopItem>

    fun getShopItemUseCaseId(id: Int): ShopItem

    fun updateShopList(id: Int)

    fun deleteShopList(id: Int)
}