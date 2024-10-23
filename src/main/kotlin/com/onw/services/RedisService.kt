package com.onw.services

import io.lettuce.core.RedisClient
import io.lettuce.core.api.StatefulRedisConnection
import io.lettuce.core.api.sync.RedisCommands

class RedisService {
  private val client: RedisClient = RedisClient.create("redis://localhost:6379")
  private val connection: StatefulRedisConnection<String, String> = client.connect()
  private val syncCommands: RedisCommands<String, String> = connection.sync()

  fun setValue(key: String, value: String) {
    syncCommands.set(key, value)
  }

  fun getValue(key: String): String? {
    return syncCommands.get(key)
  }

  fun close() {
    connection.close()
    client.shutdown()
  }
}