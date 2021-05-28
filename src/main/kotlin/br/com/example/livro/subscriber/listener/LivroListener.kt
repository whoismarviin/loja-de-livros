package br.com.example.livro.subscriber.listener

import br.com.example.livro.subscriber.database.Repository
import br.com.example.livro.subscriber.model.Livro
import io.micronaut.nats.annotation.NatsClient
import io.micronaut.nats.annotation.Subject

@NatsClient
class LivroListener(private val repository: Repository) {

    @Subject("livros")
    fun received(livro: Livro) {
        repository.createBook(livro)
    }

}