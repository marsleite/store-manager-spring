package com.example.store.service

import com.example.store.entity.Product
import com.example.store.repository.ProductRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import java.util.*

@Service
data class ProductService(
  @Autowired
  private val productRepository: ProductRepository
){
  fun createProduct(product: Product): Product {
    return productRepository.save(product)
  }

  fun findAllProducts(): List<Product> {
    return productRepository.findAll()
  }

  fun findProductById(id: Long): Optional<Product> {
    return productRepository.findById(id)
  }
}