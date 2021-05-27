package br.com.example.livro.producer.dto

import br.com.example.livro.producer.model.Livro
import java.util.*

class LivroDto(
    val autor: String,
    val description: String,
    val numero_de_paginas: String,
    val isbn: String,
    val preco: Double
) {
    fun toModel(): Livro {
        return Livro(
            UUID.randomUUID(),
            autor, description, numero_de_paginas, isbn, preco
        )

    }

}
