package cl.desafiolatam.monstercreator.model

interface MonsterCreatorRepository {
    fun insertMonster(monster: Monster)
}