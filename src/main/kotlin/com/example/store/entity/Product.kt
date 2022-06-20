package com.example.store.entity

import javax.persistence.*

@Entity
@Table(name = "tb_products")
data class Product(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long,
    val name: String,
    val quantity: Int
)