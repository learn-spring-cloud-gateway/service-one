package com.learn.service_one

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/hello")
class GreetingController {
    @GetMapping
    fun greeting(@RequestParam(value = "name", defaultValue = "World") name: String) : String {
        return "hello $name, from Service 1"
    }
}