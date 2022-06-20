package com.example.store.entity

import javax.persistence.*

@Entity
@Table(name = "tb_products")
data class Product(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private val id: Long,
    private val name: String,
    private val quantity: Int
)