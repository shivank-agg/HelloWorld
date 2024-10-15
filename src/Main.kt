fun main(){
    val person = Person()
    person.printInfo()
}

fun sayHello(greeting:String,vararg itemsToGreet:String){
    greetPerson("hi","Nate")
}
fun greetPerson(greeting:String,name:String) = println("$greeting $name")


