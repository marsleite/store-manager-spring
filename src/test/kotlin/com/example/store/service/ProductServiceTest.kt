package com.example.store.service

import com.example.store.entity.Product
import com.example.store.repository.ProductRepository
import com.winterbe.expekt.should
import io.mockk.every
import io.mockk.impl.annotations.InjectMockKs
import io.mockk.impl.annotations.MockK
import io.mockk.junit5.MockKExtension
import io.mockk.slot
import io.mockk.verify
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith
import org.springframework.beans.factory.annotation.Autowired
import reactor.test.StepVerifier.Assertions

@ExtendWith(MockKExtension::class)
internal class ProductServiceTest {
    @MockK
    lateinit var productRepository: ProductRepository

    @InjectMockKs
    lateinit var target: ProductService

    @Test
    fun `when create product successfully`() {
        // given
        val product = Product(1L, name = "Product 1", 10)

        every {
            productRepository.save(product)
        } returns product

        assertEquals(target.createProduct(product), product)
    }
}