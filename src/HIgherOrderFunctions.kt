fun printFilteredStrings(list: List<String>,predicate: (String) -> Boolean) {
    list.forEach{
        if(predicate(it)) println(it)

    }
}
fun getPrintPredicate(num:String): (String) -> Boolean{
    return {it.startsWith(num)}
}
fun main(){
    val list = listOf("Kotlin","Java","C++","Javascript")
    printFilteredStrings(list,getPrintPredicate("J"))
}
