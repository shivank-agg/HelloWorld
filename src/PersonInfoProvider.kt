interface PersonInfoProvider{
    val providerInfo: String
    fun printInfo(person:Person){
        println(providerInfo)
        person.printInfo()
    }
}
interface SessionInfoProvider{
    fun getSessionId(): String
}
open class BasicInfoProvider : PersonInfoProvider, SessionInfoProvider {
    protected open val sessionidPrefix:String = "Session"
    override val providerInfo: String
        get() = "BasicInfoProvider"

    override fun getSessionId(): String {
        return sessionidPrefix
    }
}

fun main(){
    val provider = FancyInfoProvider()
    provider.printInfo(Person())
    provider.getSessionId()
    checkTypes(provider)
}

fun checkTypes(infoProvider : PersonInfoProvider){
    if(infoProvider is BasicInfoProvider && infoProvider is SessionInfoProvider && infoProvider is PersonInfoProvider) {
        println(true)
    }else{
        println(false)
    }
}