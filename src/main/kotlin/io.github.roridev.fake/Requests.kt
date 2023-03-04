package io.github.roridev.fake

import arrow.core.Either
import arrow.core.Option
import io.ktor.client.*
import io.ktor.client.call.*
import io.ktor.client.request.*
import io.ktor.client.statement.*


suspend inline fun <reified A, reified B> HttpClient.eitherGet(
    path: String, block: HttpRequestBuilder.() -> Unit
): Either<A, B> {
    val req = this.get(path, block)
    return try {
        Either.Right(req.body())
    } catch (_: Throwable) {
        Either.Left(req.body())
    }
}

suspend inline fun <reified T> HttpClient.maybeGet(path: String, block: HttpRequestBuilder.() -> Unit): Option<T> {
    return Option.fromNullable(this.get(path, block).nullableBody<T>())
}

suspend inline fun <reified T> HttpResponse.nullableBody(): T? {
    return try {
        this.body<T>()
    } catch (e: Throwable) {
        println(e)
        println(e.cause)
        null
    }
}