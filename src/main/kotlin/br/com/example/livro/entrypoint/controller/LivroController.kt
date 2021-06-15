package br.com.example.livro.entrypoint.controller

import br.com.example.livro.entrypoint.dto.LivroDto
import br.com.example.livro.producer.model.Livro
import io.micronaut.http.MediaType.APPLICATION_JSON
import io.micronaut.http.annotation.Body
import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Post
import io.micronaut.http.annotation.Produces

@Controller("api/livros")
class LivroController(private val service: LivroServicePort) {

    @Post("cadastro")
    @Produces(APPLICATION_JSON)
    fun createLivro(@Body request: LivroDto): Livro {
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

        return livro


    }


}