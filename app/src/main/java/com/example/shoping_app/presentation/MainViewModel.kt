package com.example.shoping_app.presentation

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.shoping_app.data.ShopListRepositoryImpl
import com.example.shoping_app.domain.DeleteShopItemUseCase
import com.example.shoping_app.domain.GetShopItemUseCase
import com.example.shoping_app.domain.ShopItem
import com.example.shoping_app.domain.UpdateShoppingList

class MainViewModel : ViewModel() {

    private val repository = ShopListRepositoryImpl()

    private val getShopListUseCase = GetShopItemUseCase(repository)

    private val deleteShopItemUseCase = DeleteShopItemUseCase(repository)

    private val edditShopItemUseCase = UpdateShoppingList(repository)

    val shopList = getShopListUseCase.getShoppingList()

    fun delete(shopItem: ShopItem) {
        deleteShopItemUseCase.deleteShoppingList(shopItem)
    }

    fun changeEnableState(item: ShopItem) {
        val newItem = item.copy(activity = !item.activity)
        edditShopItemUseCase.updateShoppingList(newItem)
    }

}