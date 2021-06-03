package br.com.example.livro.subscriber.database.repository

import br.com.example.livro.subscriber.infrastructure.model.Livro
import javax.inject.Singleton

@Singleton
interface Repository {
    fun createBook(livro: Livro): Livro
}