package com.example.movieswithmrbackend.Controller

import com.example.movieswithmrbackend.Model.Movie
import com.example.movieswithmrbackend.Service.MovieService
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.CrossOrigin
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.Mapping
import org.springframework.web.bind.annotation.PostMapping
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
}