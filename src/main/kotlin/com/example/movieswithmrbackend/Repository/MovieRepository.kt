package com.example.movieswithmrbackend.Repository

import com.example.movieswithmrbackend.Model.Movie
import org.springframework.data.jpa.repository.JpaRepository
import java.util.*

interface MovieRepository : JpaRepository<Movie, Long> {
    fun findMovieById(id: Long): Optional<Movie>
}