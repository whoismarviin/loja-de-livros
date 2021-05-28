package br.com.example.livro.subscriber.database

import br.com.example.livro.subscriber.model.Livro
import com.datastax.oss.driver.api.core.CqlSession
import com.datastax.oss.driver.api.core.cql.SimpleStatement
import javax.inject.Singleton

@Singleton
class RepositoryImpl(private val session: CqlSession) : Repository {
    override fun createBook(livro: Livro): Livro {
        val livro = Livro(
            livro.id,
            livro.autor,
            livro.description,
            livro.numero_de_paginas,
            livro.isbn,
            livro.preco
        )

        session.execute(
            SimpleStatement.newInstance(
                "INSERT INTO livro.Livro(id,autor,description,numero_de_paginas,isbn,preco) VALUES(?,?,?,?,?,?)",
                livro.id,
                livro.autor,
                livro.description,
                livro.numero_de_paginas,
                livro.isbn,
                livro.preco
            )
        )


        return livro
    }
}