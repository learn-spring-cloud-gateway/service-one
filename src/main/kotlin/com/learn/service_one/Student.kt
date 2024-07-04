package com.learn.service_one

class Student(var id: Int, var name: String, var type: String) {
    override fun toString(): String {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", type='" + type + '\'' +
                '}'
    }
}