package org.ktypeparser.processors.impl

import org.ktypeparser.processors.AbstractMediaTypeProcessor
import org.ktypeparser.processors.MediaTypeProcessor
import java.io.File
import java.nio.file.Files

internal class FileMediaTypeProcessor : MediaTypeProcessor, AbstractMediaTypeProcessor() {
    override fun parseMediaTypeInternal(file: File): String? = Files.probeContentType(file.toPath())
}
