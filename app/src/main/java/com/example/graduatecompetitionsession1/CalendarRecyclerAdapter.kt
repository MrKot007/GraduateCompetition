package com.example.graduatecompetitionsession1

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.homework_item.view.*
import kotlinx.android.synthetic.main.material_item.view.*

class HWViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView)
class CalendarAdapter(val homework: List<Homework>? = null, val materials: List<Material>? = null, viewType: Int) : RecyclerView.Adapter<HWViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HWViewHolder {
        if (viewType == 0){
            return HWViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.homework_item, parent, false))
        }else{
            return HWViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.material_item, parent, false))
        }

    }

    override fun onBindViewHolder(holder: HWViewHolder, position: Int) {
        if (homework != null){
            holder.itemView.subject.text = homework[position].subj
            holder.itemView.isComplete.isChecked = homework[position].isComplete == true
        }
        if (materials != null) {
            holder.itemView.mat.text = materials[position].topic
            holder.itemView.authors.text = materials[position].authors
        }

    }

    override fun getItemCount(): Int {
        return homework!!.size
    }

}