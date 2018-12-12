package com.learning.javabrains

import org.springframework.boot.runApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

@SpringBootApplication

open class CourseApiApp

fun main(args: Array<String>) {
    runApplication<CourseApiApp>(*args)
}