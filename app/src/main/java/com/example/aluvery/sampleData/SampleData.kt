package com.example.aluvery.sampleData

import com.example.aluvery.R
import com.example.aluvery.model.Product
import java.math.BigDecimal

val sampleProducts = listOf(
    Product(
        name = "Hamburguer",
        price = BigDecimal("12.99"),
        image = R.drawable.burger
    ),
    Product(
        name = "Pizza",
        price = BigDecimal("19.99"),
        image = R.drawable.pizza
    ),
    Product(
        name = "Batata Frita",
        price = BigDecimal("7.99"),
        image = R.drawable.fries
    )
)


val sampleDoces = listOf(
    Product(
        name = "Chocolate",
        price = BigDecimal("4.99"),
        image = R.drawable.chocolate
    ),
    Product(
        name = "Sorvete",
        price = BigDecimal("5.99"),
        image = R.drawable.sorvete
    )
)

val sampleBebidas = listOf(
    Product(
        name = "Café",
        price = BigDecimal("2.99"),
        image = R.drawable.cafe
    ),
    Product(
        name = "Refrigerante",
        price = BigDecimal("4.99"),
        image = R.drawable.refrigerante
    )
)
