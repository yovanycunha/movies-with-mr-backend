package com.example.movieswithmrbackend.Service

import com.example.movieswithmrbackend.Model.Movie
import java.util.Optional

interface MovieService {
    fun getAll(): List<Movie>

    fun create(movie: Movie): Movie

    fun delete(id: Long)

    fun getById(id: Long): Optional<Movie>

    fun update(id: Long, movie: Movie): Optional<Movie>
}