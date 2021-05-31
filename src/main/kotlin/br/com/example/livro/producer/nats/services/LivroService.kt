package br.com.example.livro.producer.nats.services

import br.com.example.livro.producer.model.Livro
import javax.inject.Singleton

@Singleton
interface LivroService {
    fun send(livro: Livro): Livro


}