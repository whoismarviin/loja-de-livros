package br.com.example.livro.infrastructure.client

import br.com.example.livro.infrastructure.model.EventsInformationDto
import io.micronaut.nats.annotation.NatsClient
import io.micronaut.nats.annotation.Subject
import javax.inject.Singleton

@NatsClient
@Singleton
interface NatsClient {
    @Subject("livros")
    fun send(eventsInformationDto: EventsInformationDto)
}