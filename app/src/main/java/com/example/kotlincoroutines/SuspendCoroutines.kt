package com.example.kotlincoroutines

import kotlinx.coroutines.*

fun main() {

    runBlocking {
        myFunction()
    }

}

suspend fun myFunction(){
    coroutineScope {
        delay(4000)
        println("suspend function")
    }
}