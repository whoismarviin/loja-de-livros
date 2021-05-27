package br.com.example.livro.producer.controller

import br.com.example.livro.producer.dto.LivroDto
import br.com.example.livro.producer.model.Livro
import br.com.example.livro.producer.nats.services.LivroService
import io.micronaut.http.HttpResponse
import io.micronaut.http.MediaType.APPLICATION_JSON
import io.micronaut.http.annotation.Body
import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Post
import io.micronaut.http.annotation.Produces
import java.util.*

@Controller("api/livros")
class LivroController(private val service: LivroService) {

    @Post("cadastro")
    @Produces(APPLICATION_JSON)
    fun createLivro(@Body request: LivroDto): HttpResponse<Any> {
        val livro = request.toModel()
        service.send(
            Livro(
                livro.id,
                livro.autor,
                livro.description,
                livro.numero_de_paginas,
                livro.isbn,
                livro.preco
            )
        )

        return HttpResponse.ok(livro)


    }


}