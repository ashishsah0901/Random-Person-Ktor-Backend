package com.example.routes

import com.example.data.model.Person
import com.example.data.model.PersonRequest
import io.ktor.application.*
import io.ktor.http.*
import io.ktor.request.*
import io.ktor.response.*
import io.ktor.routing.*

private const val BASE_URL = "YOUR_SERVER_URL"

private val persons = mutableListOf(
    Person(1,"Haley Francis", "$BASE_URL/images/image1.jpg"),
    Person(2,"Kay Martin", "$BASE_URL/images/image2.jpg"),
    Person(3,"Celia Baldwin", "$BASE_URL/images/image3.jpg"),
    Person(4,"Sybil Herrera", "$BASE_URL/images/image4.jpg"),
    Person(5,"Clarissa Slater", "$BASE_URL/images/image5.jpg"),
    Person(6,"Prudence Aguilar", "$BASE_URL/images/image6.jpg"),
    Person(7,"Emily Manwaring", "$BASE_URL/images/image7.jpg"),
    Person(8,"Trina Jacobs", "$BASE_URL/images/image8.jpg"),
    Person(9,"Rosemary Wolfe", "$BASE_URL/images/image9.jpg"),
    Person(10,"Alanna Sherman", "$BASE_URL/images/image10.jpg"),
    Person(11,"Belinda Tillery", "$BASE_URL/images/image11.jpg"),
    Person(12,"Wynne Barker", "$BASE_URL/images/image12.jpg"),
    Person(13,"Miranda Chavez", "$BASE_URL/images/image13.jpg")
)

fun Route.randomPerson() {

    get("/randomperson") {
        call.respond(
            HttpStatusCode.OK,
            persons.random()
        )
    }

    post("/randomperson") {
        val params = call.receive<PersonRequest>()
        val name = params.name
        val imageUrl = params.imageUrl
        val newPerson = Person(persons.size + 1 ,name , imageUrl)
        persons.add(newPerson)
        call.respond(
            HttpStatusCode.OK,
            newPerson
        )
    }

}