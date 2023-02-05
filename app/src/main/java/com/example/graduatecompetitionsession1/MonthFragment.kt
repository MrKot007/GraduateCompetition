package com.example.graduatecompetitionsession1

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import kotlinx.android.synthetic.main.fragment_calendar.*

class MonthFragment(): Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_calendar, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        calendarRecycler.adapter = CalendarAdapter(0)
        calendarRecycler.layoutManager = StaggeredGridLayoutManager(7, StaggeredGridLayoutManager.HORIZONTAL)
    }
}