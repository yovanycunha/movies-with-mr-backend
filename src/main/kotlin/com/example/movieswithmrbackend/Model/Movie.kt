package com.example.movieswithmrbackend.Model

import javax.persistence.*

@Entity(name = "movies")
data class Movie(
    @Id @GeneratedValue
    val id: Long? = null,
    val title: String

    /*@OneToMany(cascade = arrayOf(CascadeType.ALL), fetch = FetchType.LAZY)
    private val watchListId: MutableList<WatchList>? = ArrayList(),*/
    /*val title: String,
    val imdbID: Long,
    val plot: String,*/
)

@Entity(name = "watchlists")
data class WatchList(
    @Id @GeneratedValue
    val id: Long? = null,
    val name: String
)
