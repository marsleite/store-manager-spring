package com.example.store.controller

import com.example.store.entity.Product
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/v1/product")
class JobProduct {

  @PostMapping("/create")
  fun createJobProduct(@RequestBody product: Product): ResponseEntity<Product> {
    val (_, name, quantity) = product
    val newProduct = Product(1, name, quantity)

    return ResponseEntity(newProduct, HttpStatus.CREATED)
  }

}