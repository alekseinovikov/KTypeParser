# KTypeParser
[![Build Status](https://travis-ci.org/Isabek/media-type-parser.svg)](https://travis-ci.org/Isabek/es-response-parser)
![BUILD (Ubuntu 20.04)](https://github.com/alekseinovikov/KTypeParser/workflows/BUILD%20(Ubuntu%2020.04)/badge.svg?branch=master)

## Description
The parser determines a type of a file, byte array or input stream. 

## Build
You can build the project using Gradle.

## Usage

Add dependency into your Gradle project:
```groovy
repositories {
    ...

    maven {
        url  "https://dl.bintray.com/alekseinovikov/KTypeParser"
    }

    ...
}

dependencies {
    ...

    implementation 'org.ktypeparser:ktype-parser:2.0'
    
    ...
}
```

Functions:
* detect(inputStream: InputStream): MediaType?
* detect(bytes: ByteArray): MediaType?
* detect(file: File): MediaType?

* suspend fun detectAsync(inputStream: InputStream): Deferred<MediaType?>
* suspend fun detectAsync(bytes: ByteArray): Deferred<MediaType?>
* suspend fun detectAsync(file: File): Deferred<MediaType?>

Extension functions:
* File.detectMediaType(): MediaType?
* ByteArray.detectMediaType(): MediaType?
* InputStream.detectMediaType(): MediaType?

* suspend File.detectMediaTypeAsync(): Deferred<MediaType?>
* suspend ByteArray.detectMediaTypeAsync(): Deferred<MediaType?>
* suspend InputStream.detectMediaTypeAsync(): Deferred<MediaType?>

MediaType - is an enum with media types that can be determined by MIME Type

Extension functions and coroutines are in upcoming changes plans

Code example:

```kotlin
    val stream: InputStream = ByteArray::javaClass.javaClass.classLoader.getResourceAsStream("download.png")
    val streamMediaType = stream.detectMediaType()

    println(streamMediaType)

    val bytes: ByteArray = ByteArray::javaClass.javaClass.classLoader.getResourceAsStream("download.png").readAllBytes()
    val bytesMediaType = bytes.detectMediaType()

    println(bytesMediaType)

    val file: File = File(ByteArray::javaClass.javaClass.classLoader.getResource("download.png").toURI())
    val fileMediaType = file.detectMediaType()

    println(fileMediaType)
```

## Details
Using: https://github.com/overview/mime-types to detect mime-types as strings
Classifies to a known enum values 