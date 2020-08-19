package cl.desafiolatam.monstercreator.viewmodel

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import cl.desafiolatam.monstercreator.model.*
import cl.desafiolatam.monstercreator.model.db.MonsterRoomDataBase

/**
 * Created by Cristian Vidal on 2019-10-02.
 */
class AllMonsterViewModel(application: Application) : AndroidViewModel(application){

    private val repository: MonsterRepository
    var allMonsters: LiveData<List<Monster>>

    init {
        val monsterDao = MonsterRoomDataBase.getDatabase(application.applicationContext).monsterDao()
        repository = MonsterRepository(monsterDao)
        allMonsters = repository.allMonsters
    }



}