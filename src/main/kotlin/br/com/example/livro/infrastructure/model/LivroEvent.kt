package br.com.example.livro.infrastructure.model

import java.math.BigDecimal
import java.util.*

data class LivroEvent(
    val id: UUID? = null,
    val autor: String? = "",
    val description: String = "",
    val numero_de_paginas: String = "",
    val isbn: String = "",
    val preco: BigDecimal = BigDecimal.ZERO,

    ) {
}