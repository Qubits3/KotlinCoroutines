package com.example.kotlincoroutines

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.coroutines.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Light Weightiness

        /*
        GlobalScope.launch {
            repeat(100000){
                launch {
                    println("android")
                }
            }
        }
        */

        //Scope
        //GlobalScope, runBlocking, CoroutineScope

        /*
        //runBlocking
        println("run blocking start")
        runBlocking {   //Mevcut thread i bloklayarak işlem yapar, kendi bloğunu bloklamaz
            launch {
                delay(2000)
                println("run blocking")
            }
        }
        println("run blocking end")
        */

        /*
        //GlobalScope
        println("globalScope start")
        GlobalScope.launch {    //Mevcut thread i bloklamadan işlem yapar, tüm program içinde çalıştırılabilir
            delay(2000)
            println("globalScope")
        }
        println("globalScope end")
        */

        /*
        //CoroutineScope
        println("CoroutineScope start")
        CoroutineScope(Dispatchers.Default).launch {    //Mevcut thread i bloklamadan işlem yapar, hangi thread lerde çalıştırılacağı seçilebilir
            delay(2000)
            println("CoroutineScope")
        }
        println("CoroutineScope end")
        */



    }
}