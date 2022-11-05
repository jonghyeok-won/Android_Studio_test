package com.example.recyclerviewexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.recyclerviewexample.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    val students = arrayOf(
        Student("풍자", "2030125100", EGender.LGBT, 10, 0),
        Student("홍길동", "2030125100", EGender.MALE, 9, 1),
        Student("성춘향", "2030125100", EGender.FEMAILE, 10, 0),
        Student("이몽룡", "2030125100", EGender.MALE, 10, 0),
        Student("이순신", "2030125100", EGender.MALE, 8, 2),
        Student("이효리", "2030125100", EGender.FEMAILE, 7, 3),
        Student("성유리", "2030125100", EGender.FEMAILE, 10, 0),
        Student("아이유", "2030125100", EGender.FEMAILE, 5, 5),
        Student("조정석", "2030125100", EGender.MALE, 6, 4),
        Student("한가인", "2030125100", EGender.FEMAILE, 10, 0),
        Student("신유환", "2030125100", EGender.MALE, 10, 0),
    )

    lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.recStudents.layoutManager = LinearLayoutManager(this)
        binding.recStudents.adapter = StudentsAdapter(students)
    }
}