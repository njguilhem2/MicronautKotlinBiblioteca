package br.com.livros.controller

import br.com.livros.model.Livros
import br.com.livros.service.LivrosService
import br.com.livros.service.LivrosServiceImpl
import io.micronaut.http.HttpResponse
import io.micronaut.http.HttpStatus
import io.micronaut.http.MediaType
import io.micronaut.http.MediaType.APPLICATION_JSON
import io.micronaut.http.annotation.*
import javax.inject.Inject

@Controller("/livros")
class LivrosController(private val serviceImpl: LivrosServiceImpl){

    @Post("/salve")
    @Produces(APPLICATION_JSON)
    @Consumes(APPLICATION_JSON)
    fun salvaLivros(@Body livros: Livros): HttpResponse<Livros?>{
        return HttpResponse.created(HttpStatus.CREATED).body(this.serviceImpl.create(livros))
    }
    @Get("/salve")
    @Produces(APPLICATION_JSON)
    @Consumes(APPLICATION_JSON)
    fun getLivros(): HttpResponse<List<Livros?>>{
        return HttpResponse.ok(HttpStatus.CREATED).body(this.serviceImpl.getAll())
    }
    @Put("/salve/{id}")
    @Produces(APPLICATION_JSON)
    @Consumes(APPLICATION_JSON)
    fun putLivro(@PathVariable id:Long ,@Body livros: Livros): HttpResponse<Livros>{
        return HttpResponse.ok(HttpStatus.OK).body(this.serviceImpl.update(id, livros))
    }
}