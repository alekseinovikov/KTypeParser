package org.ktypeparser.processors

import org.ktypeparser.type.MediaType
import org.ktypeparser.type.parseMediaType
import org.overviewproject.mime_types.MimeTypeDetector
import java.io.File

object MediaTypeProcessor {
    private val mimeTypeDetector = MimeTypeDetector()

    fun parseMediaType(file: File): MediaType? = mimeTypeDetector.detectMimeType(file)?.parseMediaType()
}