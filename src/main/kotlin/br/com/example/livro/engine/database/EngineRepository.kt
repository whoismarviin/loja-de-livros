package br.com.example.livro.engine.database

import br.com.example.livro.subscriber.model.Livro
import javax.inject.Singleton

@Singleton
interface EngineRepository {
    fun buscaLivros(): MutableList<Livro>
}