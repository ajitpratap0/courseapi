package com.learning.javabrains.hello

import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class HelloController {

    @RequestMapping("hello")
    fun sayHi(): String {
        return "Hi"

    }

    @RequestMapping("bye")
    fun sayBye():String{
        return "Bye"
    }
}
