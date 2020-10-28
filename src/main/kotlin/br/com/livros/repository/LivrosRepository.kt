package br.com.livros.repository

import br.com.livros.model.Livros
import io.micronaut.data.annotation.Repository
import io.micronaut.data.jpa.repository.JpaRepository

@Repository
interface LivrosRepository: JpaRepository<Livros,Long>{
}