package com.example.graduatecompetitionsession1

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class DayViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView)
class CalendarAdapter(viewType: Int) : RecyclerView.Adapter<DayViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DayViewHolder {
        if(viewType == 0){
            return DayViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.day_item, parent, false))
        }
        if(viewType == 1){
            return DayViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.today_item, parent, false))
        }else{
            return DayViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.event_day_item, parent, false))
        }
    }

    override fun onBindViewHolder(holder: DayViewHolder, position: Int) {
        TODO("Not yet implemented")
    }

    override fun getItemCount(): Int {
        TODO("Not yet implemented")
    }

}