package br.com.livros.service

import br.com.livros.model.Livros
import br.com.livros.repository.LivrosRepository
import io.micronaut.websocket.annotation.OnOpen
import javax.inject.Inject
import javax.inject.Singleton
import javax.persistence.EntityManager
import javax.transaction.Transactional

@Singleton
class LivrosServiceImpl @Inject constructor(private var livrosRepository: LivrosRepository,private
var funcionarioService: FuncionarioService): LivrosService{

    override fun create(livros: Livros): Livros{
        println(funcionarioService.nomefuncionario())
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