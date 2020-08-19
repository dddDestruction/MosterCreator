package cl.desafiolatam.monstercreator.view.allMonsters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import cl.desafiolatam.monstercreator.R
import cl.desafiolatam.monstercreator.model.Monster

class AllMonstersAdapter(
    private val monsters: List<Monster>
) : RecyclerView.Adapter<AllMonstersAdapter.ViewHolderMonster>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolderMonster {
        val view =
            LayoutInflater.from(parent.context).inflate(R.layout.monster_item, parent, false)
        return ViewHolderMonster(view)

    }

    override fun getItemCount() = monsters.size

    override fun onBindViewHolder(holder: ViewHolderMonster, position: Int) {
        holder.bind(monsters[position])
    }

    inner class ViewHolderMonster(itemView: View) : RecyclerView.ViewHolder(itemView) {

        private lateinit var monster: Monster

        private val imageView = itemView.findViewById<ImageView>(R.id.monsterImageView)
        private val nombre = itemView.findViewById<TextView>(R.id.name)
        private val puntos = itemView.findViewById<TextView>(R.id.MonsterPoints)

        fun bind(monster: Monster) {
            this.monster = monster
            imageView.setImageResource(monster.drawable)
            nombre.text = monster.name
            puntos.text = monster.monsterPoints.toString()
        }

    }
}
