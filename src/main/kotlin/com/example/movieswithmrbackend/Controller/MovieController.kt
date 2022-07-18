package com.example.movieswithmrbackend.Controller

import com.example.movieswithmrbackend.Model.Movie
import com.example.movieswithmrbackend.Service.MovieService
import org.apache.coyote.Response
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.CrossOrigin
import org.springframework.web.bind.annotation.DeleteMapping
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.Mapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.PutMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.ResponseStatus
import org.springframework.web.bind.annotation.RestController

@RestController
@CrossOrigin
@RequestMapping("/movies")
class MovieController(private val service: MovieService) {

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    fun create(@RequestBody movie: Movie): Movie = service.create(movie)

    @GetMapping
    fun getAll(): List<Movie> = service.getAll()

    @GetMapping("/{id}")
    fun getById(@PathVariable id: Long): ResponseEntity<Movie> =
        service.getById(id).map {
            ResponseEntity.ok(it)
        }.orElse(ResponseEntity.notFound().build())


    @PutMapping("/{id}")
    fun update(@PathVariable id: Long,@RequestBody movie: Movie): ResponseEntity<Movie> =
        service.update(id, movie).map {
            ResponseEntity.ok(it)
        }.orElse(ResponseEntity.notFound().build())



    @DeleteMapping("/{id}")
    fun delete(@PathVariable id: Long): ResponseEntity<Void> {
        service.delete(id)
        return ResponseEntity<Void>(HttpStatus.OK)
    }
}