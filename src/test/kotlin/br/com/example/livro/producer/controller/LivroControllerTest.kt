package br.com.example.livro.producer.controller

import br.com.example.livro.producer.dto.LivroDto
import br.com.example.livro.producer.model.Livro
import br.com.example.livro.producer.nats.services.LivroService
import io.kotest.core.spec.style.FunSpec
import io.kotest.matchers.shouldBe
import io.micronaut.http.HttpResponse
import io.mockk.MockKAnnotations
import io.mockk.every
import io.mockk.impl.annotations.InjectMockKs
import io.mockk.impl.annotations.MockK
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import java.util.*

class LivroControllerTest : FunSpec({
    @InjectMockKs
    lateinit var livroController: LivroController

    @MockK
    lateinit var livroService: LivroService
    lateinit var livroDto: LivroDto
    lateinit var livro: Livro
    lateinit var httpResponse: HttpResponse<Any>

    @BeforeEach
    fun setUp() {
        MockKAnnotations.init(this)
        livroDto = LivroDto(
            autor = "Vinicius Cruz da Rosa",
            description = "Um livro sobre um lugar bonito preso nos sonhos de um rapaz comum",
            numero_de_paginas = "111",
            isbn = "282901930",
            preco = 89.9
        )
    }


    @Test
    fun `request product with sucess`() {
        every { livroService.send(any()) } returns livro
        val result = livroController.createLivro(livroDto)
        result.shouldBe(livroDto)
    }


})
