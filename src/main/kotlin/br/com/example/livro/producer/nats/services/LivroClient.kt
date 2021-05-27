package br.com.example.livro.producer.nats.services

import br.com.example.livro.producer.model.Livro
import io.micronaut.nats.annotation.NatsClient
import io.micronaut.nats.annotation.Subject


@NatsClient
interface LivroClient {
    @Subject("livros")
    fun send(livro: Livro)
}