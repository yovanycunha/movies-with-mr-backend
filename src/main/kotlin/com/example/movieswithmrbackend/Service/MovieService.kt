package com.example.movieswithmrbackend.Service

import com.example.movieswithmrbackend.Model.Movie

interface MovieService {
    fun getAll(): List<Movie>

    fun create(movie: Movie): Movie
}