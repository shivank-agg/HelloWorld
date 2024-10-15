class Person (val firstName: String = "Peter", val lastName: String = "Parker"){
    private var nickName: String? = null
        set(value) {
            field = value
        }
        get() {
            return field
        }
    fun printInfo(){
        val nickNamefin = nickName?:"No nickname"
        println("$firstName ($nickNamefin) $lastName")
    }
}