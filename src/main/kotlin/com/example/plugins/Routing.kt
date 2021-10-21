package com.example.plugins

import com.example.routes.randomPerson
import io.ktor.routing.*
import io.ktor.http.*
import io.ktor.content.*
import io.ktor.http.content.*
import io.ktor.application.*
import io.ktor.response.*
import io.ktor.request.*

fun Application.configureRouting() {
    routing {
        randomPerson()
        static {
            resources("static")
        }
    }
}
