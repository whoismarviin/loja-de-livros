package br.com.example.livro.subscriber.listener

import br.com.example.livro.subscriber.model.Livro
import io.micronaut.nats.annotation.NatsClient
import io.micronaut.nats.annotation.Subject

@NatsClient
class LivroListener {

    @Subject("livros")
    fun received(livro: Livro) {

    }

}