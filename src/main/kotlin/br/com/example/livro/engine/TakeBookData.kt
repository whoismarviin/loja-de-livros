package br.com.example.livro.engine

import br.com.example.livro.engine.database.EngineRepository
import io.micronaut.http.HttpResponse
import io.micronaut.http.annotation.Get


class TakeBookData(private val repository: EngineRepository) {

    @Get("/")
    fun buscaLivros(): HttpResponse<Any> {
        val livros = repository.buscaLivros()
        return HttpResponse.ok(livros)
    }
}