package com.onw

import com.onw.plugins.*
import io.ktor.server.application.*

fun main(args: Array<String>) {
    io.ktor.server.netty.EngineMain.main(args)

    
}

fun Application.module() {
    configureSerialization()
//    configureDatabases()
    configureHTTP()
    configureSecurity()
    configureSockets()
    configureMonitoring()
    configureRouting()
    configureDatabase()
}
