package cl.desafiolatam.monstercreator.model

interface AllMonsterRepository {
    fun deleteAllMonsters(vararg monster: Monster)
}