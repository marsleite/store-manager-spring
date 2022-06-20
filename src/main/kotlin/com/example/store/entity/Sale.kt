package com.example.store.entity

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id
import javax.persistence.Table

@Entity
@Table(name = "tb_sales")
data class Sale(
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private val id: Long,
  private val productId: Long,
  private val quantity: Int
)