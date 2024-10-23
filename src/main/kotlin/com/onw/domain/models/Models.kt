package com.onw.domain.models

data class Player(

    val id: String,

    val name: String,

    var role: Role

)

enum class Role {
    WEREWOLF,
    MINION,
    VILLAGER,
    SEER,
    ROBBER,
    TROUBLEMAKER,
    TANNER
}

enum class GameStatus {
    WAITING_FOR_PLAYERS,
    IN_PROGRESS,
    COMPLETED
}

data class Game(
    val id: String,
    val players: MutableList<Player>,
    var status: GameStatus
)

data class Vote(
    val voterId: String,
    val targetId: String
)
