package com.example.store.service

import com.example.store.entity.Product
import com.example.store.repository.ProductRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
data class ProductService(
  @Autowired
  private val productRepository: ProductRepository
){
  fun createProduct(product: Product): Product {
    return productRepository.save(product)
  }
}