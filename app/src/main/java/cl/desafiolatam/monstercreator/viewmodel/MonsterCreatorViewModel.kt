package cl.desafiolatam.monstercreator.viewmodel

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.viewModelScope
import cl.desafiolatam.monstercreator.model.Monster
import cl.desafiolatam.monstercreator.model.MonsterCreatorRepository
import cl.desafiolatam.monstercreator.model.MonsterRepository
import cl.desafiolatam.monstercreator.model.db.MonsterRoomDataBase
import kotlinx.coroutines.launch

/**
 * Created by Cristian Vidal on 2019-09-27.
 */

// Class extends AndroidViewModel and requires application as a parameter.
class MonsterCreatorViewModel(application: Application) : AndroidViewModel(application), MonsterCreatorRepository {
    private val repository: MonsterRepository

     init {
         val monsterDao = MonsterRoomDataBase.getDatabase(application.applicationContext).monsterDao()
         repository = MonsterRepository(monsterDao)
     }

    override fun insertMonster(monster: Monster) {
        viewModelScope.launch {
            repository.insertarMonster(monster)
        }
    }


}