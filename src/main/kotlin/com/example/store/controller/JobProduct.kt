package com.example.store.controller

import com.example.store.entity.Product
import com.example.store.service.ProductService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import javax.validation.Valid

@RestController
@RequestMapping("/api/v1/product")
class JobProduct(
  @Autowired
  private val productService: ProductService
) {

  @PostMapping("/create")
  fun createJobProduct(@RequestBody @Valid product: Product): ResponseEntity<Product> {
    val result = productService.createProduct(product)

    return ResponseEntity(result, HttpStatus.CREATED)
  }

}