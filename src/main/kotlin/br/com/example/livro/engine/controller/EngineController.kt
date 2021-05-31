package br.com.example.livro.engine.controller

import br.com.example.livro.engine.database.EngineRepository
import io.micronaut.http.HttpResponse
import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get

@Controller
class EngineController(private val repository: EngineRepository) {

    @Get("/")
    fun buscaLivros(): HttpResponse<Any> {
        val livros = repository.buscaLivros()
        return HttpResponse.ok(livros)
    }
}