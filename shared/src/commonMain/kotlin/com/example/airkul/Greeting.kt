package com.example.airkul

class Greeting {
    fun greeting(): String {
        return "Hello, ${Platform().platform}!"
    }
}