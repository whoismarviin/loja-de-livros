package br.com.example.livro.producer.nats.services

import br.com.example.livro.producer.model.Livro
import javax.inject.Singleton

@Singleton
class LivroServiceImpl(private val client: LivroClient) : LivroService {
    override fun send(livro: Livro): Livro {
        client.send(livro)
        return livro
    }
}