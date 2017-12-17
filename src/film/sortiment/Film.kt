package film.sortiment

data class Film(val titel: String,
                val genre: Genre,
                val preis: Double,
                var istVerfuegbar: Boolean = true)
