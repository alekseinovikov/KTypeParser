package org.ktypeparser.processors

import org.ktypeparser.type.MediaType
import org.ktypeparser.type.parseMediaType
import org.overviewproject.mime_types.MimeTypeDetector
import java.io.ByteArrayInputStream
import java.io.File
import java.io.InputStream
import java.nio.file.Files
import java.nio.file.Paths
import java.util.*

internal object MediaTypeProcessor {

    private val mimeTypeDetector = MimeTypeDetector()

    fun detect(inputStream: InputStream): MediaType? {
        val tempFile = createTempFile(inputStream)
        return detect(tempFile).also {
            deleteTempFile(tempFile)
        }
    }

    fun detect(bytes: ByteArray): MediaType? {
        val tempFile = createTempFile(bytes)
        return detect(tempFile).also {
            deleteTempFile(tempFile)
        }
    }

    fun detect(file: File): MediaType? {
        return parseMediaType(file)
    }

    private fun deleteTempFile(file: File) = file.delete()

    private fun createTempFile(bytes: ByteArray): File {
        return createTempFile(ByteArrayInputStream(bytes))
    }

    private fun createTempFile(inputStream: InputStream): File = inputStream.use {
        val outputTempFilePath = "$tempDirectory/$randomName"
        Files.copy(it, Paths.get(outputTempFilePath))

        File(outputTempFilePath)
    }

    private val tempDirectory: String by lazy { System.getProperty("java.io.tmpdir") }

    private val randomName: String
        get() = UUID.randomUUID().toString()

    fun parseMediaType(file: File): MediaType? = mimeTypeDetector.detectMimeType(file)?.parseMediaType()

}