package br.com.example.livro.core.service

import br.com.example.livro.core.mapper.LivroConverter
import br.com.example.livro.core.model.Livro
import br.com.example.livro.core.ports.LivroServicePort
import br.com.example.livro.core.ports.NatsServicePort
import br.com.example.livro.entrypoint.dto.LivroDto
import javax.inject.Singleton

@Singleton
class LivroService(private val service: NatsServicePort) : LivroServicePort {
    override fun livroMessage(livro: Livro): LivroDto =
        LivroConverter.livroToLivroDto(service.sendNats(LivroConverter.livroToLivroEvent(livro)))
}