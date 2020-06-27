package org.ktypeparser.processors

import java.io.ByteArrayInputStream
import java.io.File
import java.io.InputStream
import java.nio.file.Files
import java.nio.file.Paths
import java.util.*

internal fun deleteTempFile(file: File) = file.delete()

internal fun createTempFile(bytes: ByteArray): File {
    return createTempFile(ByteArrayInputStream(bytes))
}

internal fun createTempFile(inputStream: InputStream): File = inputStream.use {
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