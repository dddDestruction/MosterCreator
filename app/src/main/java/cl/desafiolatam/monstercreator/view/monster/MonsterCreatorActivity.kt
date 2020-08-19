package cl.desafiolatam.monstercreator.view.monster

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import cl.desafiolatam.monstercreator.R
import cl.desafiolatam.monstercreator.databinding.ActivityMonsterCreatorBinding
import cl.desafiolatam.monstercreator.view.allMonsters.MainActivity
import cl.desafiolatam.monstercreator.viewmodel.MonsterCreatorViewModel
import kotlinx.android.synthetic.main.activity_monster_creator.*

class MonsterCreatorActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMonsterCreatorBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_monster_creator)
        val model = ViewModelProvider(this).get(MonsterCreatorViewModel::class.java)

        saveButton.setOnClickListener {
            nameEditText.text.toString()
           // model.insertMonster()
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
        // in this activity must place a recyclerView with all the monster on the DB
    }
}
