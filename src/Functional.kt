fun main(){
    val list = listOf("Kotlin","Java","C++","Javascript")
    list
        .filterNotNull()
        .filter{
            it.startsWith("K")
        }
        .forEach{
            println(it.length)
        }
}