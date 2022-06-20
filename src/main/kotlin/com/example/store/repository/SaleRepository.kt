package com.example.store.repository

import com.example.store.entity.Sale
import org.springframework.data.jpa.repository.JpaRepository

interface SaleRepository: JpaRepository<Sale, Long> {
}