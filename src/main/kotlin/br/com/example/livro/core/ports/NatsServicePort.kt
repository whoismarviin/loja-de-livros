package br.com.example.livro.core.ports

import br.com.example.livro.core.model.Livro
import br.com.example.livro.infrastructure.model.LivroEvent
import javax.inject.Singleton

@Singleton
interface NatsServicePort {
    fun sendNats(livroEvent: LivroEvent): Livro
}