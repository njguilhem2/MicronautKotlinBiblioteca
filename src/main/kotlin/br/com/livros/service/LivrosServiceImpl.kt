package br.com.livros.service

import br.com.livros.model.Livros
import br.com.livros.repository.LivrosRepository
import javax.inject.Inject
import javax.inject.Singleton


@Singleton
class LivrosServiceImpl @Inject constructor(private var livrosRepository: LivrosRepository)
    :LivrosService{

    override fun create(livros: Livros): Livros{
         return livrosRepository.save(livros)
    }

    override fun getById(id: Long): Livros? {
        TODO("Not yet implemented")
    }

    override fun delete(id: Long) {
        TODO("Not yet implemented")
    }

    override fun update(id: Long, promocao: Livros): Livros {
        promocao.id == id
        return livrosRepository.update(promocao)
    }

    override fun getAll(): List<Livros>{
        return livrosRepository.findAll().toList()
    }
}