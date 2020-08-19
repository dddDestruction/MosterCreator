package cl.desafiolatam.monstercreator.viewmodel

import android.app.Application
import android.util.Log
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import cl.desafiolatam.monstercreator.R
import cl.desafiolatam.monstercreator.model.Monster
import cl.desafiolatam.monstercreator.model.MonsterAttributes

/**
 * Created by Cristian Vidal on 2019-10-02.
 */
class AllMonsterViewModel(application: Application) : AndroidViewModel(application) {

    lateinit var allMonsters: MutableLiveData<List<Monster>>

    fun getMonsters(): LiveData<List<Monster>>{
        Log.d("AAA", "getMonsters()")
        allMonsters = MutableLiveData(listOf(Monster(MonsterAttributes(), 200, "lulu", R.drawable.asset05)))
        loadMonsters()

        return allMonsters
    }

    private fun loadMonsters() {

    }
}