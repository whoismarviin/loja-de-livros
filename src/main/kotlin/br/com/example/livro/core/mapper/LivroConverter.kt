package br.com.example.livro.core.mapper

import br.com.example.livro.core.model.Livro
import br.com.example.livro.entrypoint.dto.LivroDto
import br.com.example.livro.infrastructure.model.LivroEvent

class LivroConverter {
    companion object {
        fun livroDtoToLivro(livroDto: LivroDto) = Livro(
            livroDto.id,
            livroDto.autor,
            livroDto.description,
            livroDto.isbn,
            livroDto.numero_de_paginas,
            livroDto.preco
        )

        fun livroToLivroEvent(livro: Livro) = LivroEvent(
            livro.id,
            livro.autor,
            livro.description,
            livro.numero_de_paginas,
            livro.isbn,
            livro.preco.toBigDecimal()
        )

        fun livroEventToLivro(livroEvent: LivroEvent): Livro = Livro(
            livroEvent.id!!,
            livroEvent.autor!!,
            livroEvent.description,
            livroEvent.numero_de_paginas,
            livroEvent.isbn,
            livroEvent.preco.toDouble()
        )

        fun livroToLivroDto(livro: Livro): LivroDto = LivroDto(
            livro.id,
            livro.autor,
            livro.description,
            livro.numero_de_paginas,
            livro.isbn,
            livro.preco
        )

    }
}