# Functional Alice's Kotlin Extensions
A bunch of helper functions that I use on my Kotlin Development.

Everything bases itself of the work of `Arrow` (The base types most functions return are part of the `arrow.core.*` namespace, even if JVM implementations, like `Optional` exist).

Reasoning
--
I wrote this code multiple times in different projects and all of those helpers could be abstracted away.

The name is a pun and was retrofit, that's why it sucks. It originally was `Functional Alice's ~Ktor~ Extensions` but the project outgrew Ktor the moment I tried abstracting some JSON parsing logic.

I *may* venture on the world of DSLs, but that's for future me to add here. Having crazy ideas without knowing how to implement them usually leads to exploring too much and learning too little.

Contents
--
Contains (Mostly Functional) Helpers for:
- Ktor
- Java.UUID
- Ktx.Serialization.Json
