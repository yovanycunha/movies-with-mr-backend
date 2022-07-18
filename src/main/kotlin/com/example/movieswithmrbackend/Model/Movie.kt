package com.example.movieswithmrbackend.Model

import javax.persistence.*

@Entity(name = "movies")
data class Movie(
    @Id @GeneratedValue
    val id: Long? = null,
    val title: String,
    val imdbID: String,
    val poster: String

    /*@OneToMany(cascade = arrayOf(CascadeType.ALL), fetch = FetchType.LAZY)
    private val watchListId: MutableList<WatchList>? = ArrayList(),*/
)

@Entity(name = "watchlists")
data class WatchList(
    @Id @GeneratedValue
    val id: Long? = null,
    val name: String
)
