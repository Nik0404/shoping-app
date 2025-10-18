package com.example.shoping_app.data

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.example.shoping_app.domain.ShopItem
import com.example.shoping_app.domain.ShopListRepository
import kotlin.random.Random

class ShopListRepositoryImpl : ShopListRepository {

    private val shopListLiveData = MutableLiveData<List<ShopItem>>()

    private val shopList = mutableListOf<ShopItem>()

    private var autoIncrementId = 0

    init {
        for (i in 0 until 10) {
            val item = ShopItem("test $i", i, Random(i).nextBoolean())
            addShopList(item)
        }
    }

    override fun addShopList(item: ShopItem) {
        if (item.id == ShopItem.UNDEFINED_ID) {
            item.id = autoIncrementId++
        }
        shopList.add(item)
        updateList()
    }

    override fun getShopList(): LiveData<List<ShopItem>> {
        return shopListLiveData
    }

    override fun getShopItemUseCaseId(id: Int): ShopItem {
        return shopList.get(id)
    }

    override fun updateShopList(item: ShopItem) {
        val oldItem = getShopItemUseCaseId(item.id)
        shopList.remove(oldItem)
        addShopList(item)

    }

    override fun deleteShopList(item: ShopItem) {
        shopList.remove(item)
        updateList()
    }

    private fun updateList() {
        shopListLiveData.value = shopList
    }
}