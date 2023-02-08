package com.example.graduatecompetitionsession1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.google.android.material.tabs.TabLayoutMediator
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val homework: List<Homework> = listOf(
            Homework("Повторить AlertDialog", false),
            Homework("Повторить Toast", false),
            Homework("Изучить яп kotlin", true),
            Homework("Повторить создание своего AlertDialog", false)
        )

        val materials: List<Material> = listOf(
            Material("AlertDialog, Toast, Snackbar", "Артемий, Евгений, Роман"),
            Material("Роберт Мартин: Чистый код. Создание, анализ и рефакторинг", "Артемий")
        )
        homework_recycler.adapter = CalendarAdapter(homework, null, 0)
        homework_recycler.layoutManager = LinearLayoutManager(this)
        material_recycler.adapter = CalendarAdapter(null, materials, 1)
        material_recycler.layoutManager = LinearLayoutManager(this)
    }
}