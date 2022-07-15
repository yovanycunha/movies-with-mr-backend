package com.example.movieswithmrbackend.Service

import com.example.movieswithmrbackend.Model.Movie
import com.example.movieswithmrbackend.Repository.MovieRepository
import org.springframework.stereotype.Repository
import org.springframework.stereotype.Service

@Service
class MovieServiceImpl(private val repository: MovieRepository): MovieService {
    override fun getAll(): List<Movie> {
        return repository.findAll()
    }

    override fun create(movie: Movie): Movie {
        return repository.save(movie)
    }

}