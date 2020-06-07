package com.example.kotlincoroutines

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.invoke
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main() {

    //Dispatchers
    //Dispatchers.Default -> CPU intensive. Görsel işleme, array leri sıraya dizme gibi uzun süren işlerde kullanılır
    //Dispatchers.IO -> Input/Output. Networking gibi internetten veri çeken işlerde kullanılır
    //Dispatchers.Main -> UI
    //Dispatchers.Unconfined -> Inherited dispatcher. çağrıldığı yeri alıyor

    runBlocking {

        launch(Dispatchers.Main) {
            println("Main Thread: ${Thread.currentThread().name}")
        }

        launch(Dispatchers.IO) {
            println("IO Thread: ${Thread.currentThread().name}")
        }

        launch(Dispatchers.Default) {
            println("Default Thread: ${Thread.currentThread().name}")
        }

        launch (Dispatchers.Unconfined) {
            println("Unconfined Thread: ${Thread.currentThread().name}")
        }
    }


}