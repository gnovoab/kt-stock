package com.example.ktstock.service

import com.example.ktstock.domain.model.ProductStock

interface StockService {
    fun save(productStock: ProductStock): ProductStock
}
