package com.example.kotlincoroutines

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import kotlinx.coroutines.withContext

fun main() {

    runBlocking {
        launch(Dispatchers.Default) {   //Default dan başlayıp;
            println("Context: $coroutineContext")
            withContext(Dispatchers.IO) {   //IO da devam ediyor
                println("Context: $coroutineContext")
            }
        }
    }

}