package org.ktypeparser

import org.ktypeparser.processors.initProcessorChain
import org.ktypeparser.type.MediaType
import org.ktypeparser.type.parseMediaType
import java.io.ByteArrayInputStream
import java.io.File
import java.io.InputStream
import java.nio.file.Files
import java.nio.file.Paths
import java.util.*

object MediaTypeParser {

    private val processorChain = initProcessorChain()


    fun parse(inputStream: InputStream): MediaType? {
        val tempFile = createTempFile(inputStream)
        return parse(tempFile).also {
            deleteTempFile(tempFile)
        }
    }

    fun parse(bytes: ByteArray): MediaType? {
        val tempFile = createTempFile(bytes)
        return parse(tempFile).also {
            deleteTempFile(tempFile)
        }
    }

    fun parse(file: File): MediaType? {
        return processorChain.parseMediaType(file)?.parseMediaType()
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

}
