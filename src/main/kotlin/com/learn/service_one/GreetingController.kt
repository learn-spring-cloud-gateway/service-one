package com.learn.service_one

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/first")
class GreetingController {
    @GetMapping("/hello")
    fun greeting(@RequestParam(value = "name", defaultValue = "World") name: String) : String {
        return "hello $name, from Service 1"
    }

    @GetMapping
    fun getStudent(): List<Student> {
        println("getting students")
        return listOf(
            Student(1, "Ross", "Student"),
            Student(2, "Rachel", "Student")
        )
    }
}