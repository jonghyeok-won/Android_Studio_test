package com.example.recyclerviewexample

enum class EGender {
    MALE,
    FEMAILE,
    LGBT
}

data class Student(val name: String,
                   val id: String,
                   val gender: EGender,
                   val attend: Int,
                   val absence: Int)