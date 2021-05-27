package br.com.example.livro.producer.database

import br.com.example.livro.subscriber.model.Livro
import javax.inject.Singleton

@Singleton
interface Repository {
    fun createBook(livro: Livro):Livro
}