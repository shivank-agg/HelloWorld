class FancyInfoProvider : BasicInfoProvider(){
    override val providerInfo: String
        get() = "FancyInfoProvider"

    override fun printInfo(person: Person) {
        super.printInfo(person)
        println("FancyInfo")
    }

    override val sessionidPrefix: String
        get() = "Fancy Session"
}
