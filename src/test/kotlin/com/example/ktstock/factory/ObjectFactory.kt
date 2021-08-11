
//Namespace
package com.example.ktstock.factory

import com.example.ktstock.domain.model.ProductStock
import org.apache.commons.lang3.RandomStringUtils

class ObjectFactory private constructor() {

    @Suppress("MagicNumber")
    companion object {
        fun generateSampleProductStock(): ProductStock {
            val productSock = ProductStock()

            productSock.productId = RandomStringUtils.randomNumeric(6).toLong() *-1
            productSock.quantity = RandomStringUtils.randomNumeric(1,2).toInt()

            return productSock
        }

    }
}
