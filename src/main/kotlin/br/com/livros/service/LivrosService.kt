package br.com.livros.service

import br.com.livros.model.Livros

interface LivrosService {
    fun create(livros: Livros): Livros
    fun getById(id: Long): Livros?
    fun delete(id: Long)
    fun update(id: Long, promocao: Livros): Livros
    fun getAll(): List<Livros>
}