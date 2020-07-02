package org.ktypeparser.processors

import org.ktypeparser.type.MediaType
import org.ktypeparser.type.parseMediaType
import org.overviewproject.mime_types.MimeTypeDetector
import java.io.File
import java.io.InputStream

internal object MediaTypeSyncDetector {

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

    fun detect(file: File?): MediaType? {
        return file?.let { parseMediaType(it) }
    }

    private fun parseMediaType(file: File): MediaType? = mimeTypeDetector.detectMimeType(file)?.parseMediaType()

}