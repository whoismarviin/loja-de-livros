package br.com.example.livro.subscriber.core.listener

import br.com.example.livro.subscriber.database.repository.Repository
import br.com.example.livro.subscriber.infrastructure.model.Livro
import io.micronaut.nats.annotation.NatsClient
import io.micronaut.nats.annotation.Subject

@NatsClient
class LivroListener(private val repository: Repository) {

    @Subject("livros")
    fun received(livro: Livro) {
        repository.createBook(livro)
    }

}