package br.com.example.livro.subscriber.database.repository.impl;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\b"}, d2 = {"Lbr/com/example/livro/subscriber/database/repository/impl/RepositoryImpl;", "Lbr/com/example/livro/subscriber/database/repository/Repository;", "session", "Lcom/datastax/oss/driver/api/core/CqlSession;", "(Lcom/datastax/oss/driver/api/core/CqlSession;)V", "createBook", "Lbr/com/example/livro/subscriber/infrastructure/model/Livro;", "livro", "loja-de-livros"})
@javax.inject.Singleton
public final class RepositoryImpl implements br.com.example.livro.subscriber.database.repository.Repository {
    private final com.datastax.oss.driver.api.core.CqlSession session = null;
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public br.com.example.livro.subscriber.infrastructure.model.Livro createBook(@org.jetbrains.annotations.NotNull
    br.com.example.livro.subscriber.infrastructure.model.Livro livro) {
        return null;
    }
    
    public RepositoryImpl(@org.jetbrains.annotations.NotNull
    com.datastax.oss.driver.api.core.CqlSession session) {
        super();
    }
}