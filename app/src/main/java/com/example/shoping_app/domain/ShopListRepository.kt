package com.example.shoping_app.domain

import androidx.lifecycle.LiveData

interface ShopListRepository {

    fun addShopList(item: ShopItem)

    fun getShopList(): LiveData<List<ShopItem>>

    fun getShopItemUseCaseId(id: Int): ShopItem

    fun updateShopList(item: ShopItem)

    fun deleteShopList(item: ShopItem)
}