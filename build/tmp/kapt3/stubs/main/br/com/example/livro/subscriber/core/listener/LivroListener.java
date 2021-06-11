package br.com.example.livro.subscriber.core.listener;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0017\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0017R\u000e\u0010\u0002\u001a\u00020\u0003X\u0092\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lbr/com/example/livro/subscriber/core/listener/LivroListener;", "", "repository", "Lbr/com/example/livro/subscriber/database/repository/Repository;", "(Lbr/com/example/livro/subscriber/database/repository/Repository;)V", "received", "", "livro", "Lbr/com/example/livro/subscriber/infrastructure/model/Livro;", "loja-de-livros"})
@io.micronaut.nats.annotation.NatsClient
public class LivroListener {
    private final br.com.example.livro.subscriber.database.repository.Repository repository = null;
    
    @io.micronaut.nats.annotation.Subject(value = "livros")
    public void received(@org.jetbrains.annotations.NotNull
    br.com.example.livro.subscriber.infrastructure.model.Livro livro) {
    }
    
    public LivroListener(@org.jetbrains.annotations.NotNull
    br.com.example.livro.subscriber.database.repository.Repository repository) {
        super();
    }
}