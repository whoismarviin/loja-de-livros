package br.com.example.livro.engine.database

import br.com.example.livro.subscriber.model.Livro
import com.datastax.oss.driver.api.core.CqlIdentifier
import com.datastax.oss.driver.api.core.CqlSession
import javax.inject.Singleton

@Singleton
class EngineRepositoryImpl(private val session: CqlSession) : EngineRepository {
    override fun buscaLivros(): MutableList<Livro> {
        val rows = session.execute("SELECT * FROM Livro").toList()
        val livros: MutableList<Livro> = mutableListOf()

        for (row in rows) {
            val id = row.getUuid(CqlIdentifier.fromCql("id"))
            val autor = row.getString(CqlIdentifier.fromCql("autor"))
            val description = row.getString(CqlIdentifier.fromCql("description"))
            val numero_de_paginas = row.getString(CqlIdentifier.fromCql("numero_de_paginas"))
            val isbn = row.getString(CqlIdentifier.fromCql("isbn"))
            val preco = row.getDouble(CqlIdentifier.fromCql("preco"))
        }

        return livros

    }
}
