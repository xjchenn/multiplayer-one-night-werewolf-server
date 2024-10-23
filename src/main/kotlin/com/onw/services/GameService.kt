package com.onw.services

import io.github.oshai.kotlinlogging.KotlinLogging
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.launch

private val logger = KotlinLogging.logger {}

class GameService {
    private val test: String = "test"

    fun test() {
        logger.info { "test" }
    }

    fun CoroutineScope.gameSession() = launch {
        var currentState = GameState("Player 1", List(3) { List(3) { "-" } }, false)
    }
}