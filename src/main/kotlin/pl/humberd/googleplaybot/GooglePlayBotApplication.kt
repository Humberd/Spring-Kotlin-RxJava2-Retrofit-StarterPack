package pl.humberd.googleplaybot

import mu.KLogging
import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

@SpringBootApplication
class GooglePlayBotApplication

fun main(args: Array<String>) {
    SpringApplication.run(GooglePlayBotApplication::class.java, *args)
}