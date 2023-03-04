package io.github.roridev.fake

import arrow.core.None
import arrow.core.Option
import arrow.core.Some
import kotlinx.serialization.json.Json
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.decodeFromJsonElement

inline fun <reified T> JsonObject.serializeIf(predicate: (JsonObject) -> Boolean ) : Option<T> {
    return if (predicate(this)) {
        Some(Json.decodeFromJsonElement(this))
    } else {
        None
    }
}