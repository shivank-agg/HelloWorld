import java.util.*
enum class EntityType {
    EASY,MEDIUM,HARD


}

object EntityFactory{
    fun create(type:EntityType) : Entity {
        val id = UUID.randomUUID().toString()
        val name = when(type){
            EntityType.EASY -> type.name
            EntityType.MEDIUM -> type.name
            EntityType.HARD -> type.name
        }
        return Entity.Easy(id,name)
    }
}

sealed class Entity () {
    data class Easy(val id:String,val name: String) : Entity()
    data class Medium(val id:String,val name: String) : Entity()
    data class Hard(val id:String,val name: String,val multiplier:Float) : Entity()
}

fun main(){
    val entity = EntityFactory.create(EntityType.EASY)
    println(entity)

    val entity2 = EntityFactory.create(EntityType.MEDIUM)
    println(entity2)

    val entity3 = EntityFactory.create(EntityType.HARD)
    println(entity3)
}