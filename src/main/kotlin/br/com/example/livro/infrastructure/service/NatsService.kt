package br.com.example.livro.infrastructure.service

import br.com.example.livro.core.mapper.LivroConverter
import br.com.example.livro.core.model.Livro
import br.com.example.livro.core.ports.NatsServicePort
import br.com.example.livro.infrastructure.client.NatsClient
import br.com.example.livro.infrastructure.model.Event
import br.com.example.livro.infrastructure.model.EventsInformationDto
import br.com.example.livro.infrastructure.model.LivroEvent
import javax.inject.Singleton

@Singleton
class NatsService(private val client: NatsClient) : NatsServicePort {

    override fun sendNats(livroEvent: LivroEvent): Livro {
        val eventsInformation = EventsInformationDto(
            Event.SAVE_BOOK,
            LivroEvent(
                livroEvent.id,
                livroEvent.autor,
                livroEvent.description,
                livroEvent.numero_de_paginas,
                livroEvent.isbn,
                livroEvent.preco
            )
        )
        client.send(eventsInformation)

        return LivroConverter.livroEventToLivro(livroEvent)


    }
}