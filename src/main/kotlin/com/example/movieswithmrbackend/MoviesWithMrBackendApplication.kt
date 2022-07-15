package com.example.movieswithmrbackend

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration
import org.springframework.boot.runApplication

@SpringBootApplication(exclude = [SecurityAutoConfiguration::class])
class MoviesWithMrBackendApplication()

fun main(args: Array<String>) {
    runApplication<MoviesWithMrBackendApplication>(*args)
}
