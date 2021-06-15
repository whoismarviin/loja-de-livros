package br.com.example.livro.infrastructure.model

import java.math.BigDecimal

data class EventsInformationDto(
    val events: Event = Event.SAVE_BOOK,
    val livroEvent: LivroEvent = LivroEvent(null, "", "", "", "", BigDecimal.ZERO)
)