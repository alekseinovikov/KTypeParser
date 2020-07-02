package org.ktypeparser.processors

import kotlinx.coroutines.Deferred
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.async
import kotlinx.coroutines.launch
import java.io.ByteArrayInputStream
import java.io.File
import java.io.InputStream
import java.nio.file.Files
import java.nio.file.Paths
import java.util.*

internal fun deleteTempFile(file: File?) = file?.delete()

internal suspend fun deleteTempFileAsync(file: File) = GlobalScope.launch { file.delete() }

internal suspend fun createTempFileAsync(bytes: ByteArray): Deferred<File?> =
    GlobalScope.async { createTempFile(bytes) }

internal suspend fun createTempFileAsync(inputStream: InputStream): Deferred<File?> =
    GlobalScope.async { createTempFile(inputStream) }

internal fun createTempFile(bytes: ByteArray): File? =
    bytes.takeIf { it.isNotEmpty() }?.let { createTempFile(ByteArrayInputStream(it)) }

internal fun createTempFile(inputStream: InputStream): File? = inputStream.takeIf { it.available() > 0 }?.use {
    val outputTempFilePath = "$tempDirectory/$randomName"
    Files.copy(it, Paths.get(outputTempFilePath))

    try {
        it.reset() //trying to reset input stream, if supported
    } catch (_: Exception) {
        //ignore reset
    }
    File(outputTempFilePath)
}

private val tempDirectory: String by lazy { System.getProperty("java.io.tmpdir") }

private val randomName: String
    get() = UUID.randomUUID().toString()