package KotlinOO

fun main(){

    val foto = Foto()
    foto.visualizada()
    foto.visualizada()
    foto.visualizada()
    foto.visualizada()
    foto.curtir()
    foto.curtir()
    foto.curtir()
    foto.curtir()
    foto.curtir()
    foto.visualizarMetadados()

    val video = Video()
    video.visualizada()
    video.visualizada()
    video.visualizada()
    video.visualizada()
    video.curtir()
    video.curtir()
    video.curtir()
    video.curtir()
    video.visualizarMetadados()

}

abstract class Post{

    protected var qtdCurtidas = 0
    protected var qtdViews = 0
   abstract fun visualizarMetadados()

   fun visualizada(){
       qtdViews++
   }
    fun curtir(){
        qtdCurtidas++
    }
}

class Foto : Post(){
    override fun visualizarMetadados() {
        println("$qtdCurtidas curtidas")
    }
}

class Video : Post(){
    override fun visualizarMetadados() {
        println("$qtdViews View")
    }
}
