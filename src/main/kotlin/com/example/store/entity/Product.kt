package com.example.store.entity

import javax.persistence.*
import javax.validation.constraints.NotNull
import javax.validation.constraints.Size

@Entity
@Table(name = "tb_products")
data class Product(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long,

    @NotNull
    @Size(min = 5, message = "precisa ter no minimo 5 caracters")
    val name: String,

    @NotNull
    @Size(min = 1, message = "quantidade deve ser maior que 0")
    var quantity: Int
)