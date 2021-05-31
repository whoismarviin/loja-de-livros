package br.com.example.livro.engine.database

import br.com.example.livro.subscriber.model.Livro
import java.util.*
import javax.inject.Singleton

@Singleton
interface EngineRepository {
    fun buscaLivros(): MutableList<Livro>
    fun buscaLivroPorId(id: UUID):Livro
}