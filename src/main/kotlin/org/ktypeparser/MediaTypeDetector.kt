package org.ktypeparser

import kotlinx.coroutines.Deferred
import org.ktypeparser.processors.MediaTypeAsyncDetector
import org.ktypeparser.processors.MediaTypeSyncDetector
import org.ktypeparser.type.MediaType
import java.io.File
import java.io.InputStream

fun File.detectMediaType() = detect(this)
fun ByteArray.detectMediaType() = detect(this)
fun InputStream.detectMediaType() = detect(this)

fun detect(inputStream: InputStream): MediaType? = MediaTypeSyncDetector.detect(inputStream)
fun detect(bytes: ByteArray): MediaType? = MediaTypeSyncDetector.detect(bytes)
fun detect(file: File): MediaType? = MediaTypeSyncDetector.detect(file)

suspend fun File.detectMediaTypeAsync() = detectAsync(this)
suspend fun ByteArray.detectMediaTypeAsync() = detectAsync(this)
suspend fun InputStream.detectMediaTypeAsync() = detectAsync(this)

suspend fun detectAsync(inputStream: InputStream): Deferred<MediaType?> =
    MediaTypeAsyncDetector.detectAsync(inputStream)

suspend fun detectAsync(bytes: ByteArray): Deferred<MediaType?> =
    MediaTypeAsyncDetector.detectAsync(bytes)

suspend fun detectAsync(file: File): Deferred<MediaType?> =
    MediaTypeAsyncDetector.detectAsync(file)