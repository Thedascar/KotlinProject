package KotlinOO

fun main(){

    sayCityName()
}

fun sayCityName(name: String? = null){
    // if(name == null) "T.Borba" else name
    println(name ?: "T.Borba2")
}