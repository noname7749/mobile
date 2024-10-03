class Song(
    val title: String,
    val artist: String,
    val releaseYear: Int,
    var playCount: Int
) {

    val isPopular: Boolean
        get() = playCount >= 1000
    
    fun describe() {
        println("$title, do $artist thực hiện, được phát hành vào $releaseYear.")
    }
}class 5 {
}