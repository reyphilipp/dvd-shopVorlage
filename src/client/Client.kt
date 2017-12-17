package client

import film.sortiment.Film
import film.sortiment.Genre
import shop.FilmShop

fun main(args: Array<String>) {

    val starWars = Film("Star Wars", Genre.SCIFI, 55.2, true)
    val starTrek = Film("Star Trek", Genre.SCIFI, 55.2, true)
    val sameShop = FilmShop(arrayListOf(starWars.copy(genre = Genre.ACTION), starTrek))
    val maxiShop = FilmShop(arrayListOf(starWars, starTrek))

}