package com.example.movieswithmrbackend.Service

import com.example.movieswithmrbackend.Model.Movie
import com.example.movieswithmrbackend.Repository.MovieRepository
import org.springframework.stereotype.Repository
import org.springframework.stereotype.Service
import java.util.Optional

@Service
class MovieServiceImpl(private val repository: MovieRepository): MovieService {
    override fun getAll(): List<Movie> {
        return repository.findAll()
    }

    override fun create(movie: Movie): Movie {
        return repository.save(movie)
    }

    override fun delete(id: Long) {
        repository.findById(id).map {
            repository.delete(it)
        }.orElseThrow {
            throw RuntimeException("Id not found $id")
        }
    }

    override fun getById(id: Long): Optional<Movie> {
        return repository.findById(id)
    }

    override fun update(id: Long, movie: Movie): Optional<Movie> {
        val optional = getById(id)

        if (optional.isEmpty) {
            return optional
        }

        return optional.map {
            val movieToUpdate = it.copy(
                title = movie.title,
                imdbID = movie.imdbID,
                poster = movie.poster
            )
            repository.save(movieToUpdate)
        }
    }

}