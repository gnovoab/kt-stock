package com.example.ktstock.repository

import com.example.ktstock.domain.model.ProductStock
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository

@Repository
interface StockRepository: CrudRepository<ProductStock, Long> {
}
