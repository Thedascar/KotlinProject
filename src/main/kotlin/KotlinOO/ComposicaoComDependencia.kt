package KotlinOO

fun main() {
    val likedReference = Liked()
    val photo = Photo(likedReference)
    photo.like()
    photo.showLikes()

    val film = Film(likedReference)
    film.like()
    film.like()
    film.showLikes()

}

class Liked : HasLike {

    private var qtdLike: Int = 0
    override fun like() {
        qtdLike++
    }

    override fun showLikes() {
        println("Tem $qtdLike Likes")
    }
}
interface HasLike{
    fun like()
    fun showLikes()
}
class Photo constructor(
    private val liked: Liked
) : HasLike by liked{

}
class Film constructor(
    private val liked: Liked
) : HasLike by liked {
}