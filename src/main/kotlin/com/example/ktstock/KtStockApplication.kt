package com.example.ktstock

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

/**
 * Main Class
 */
@SpringBootApplication
class KtStockApplication

fun main(args: Array<String>) {
	@Suppress("SpreadOperator")
	runApplication<KtStockApplication>(*args)
}
