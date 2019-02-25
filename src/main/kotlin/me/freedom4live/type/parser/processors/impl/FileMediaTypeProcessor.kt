package me.freedom4live.type.parser.processors.impl

import me.freedom4live.type.parser.processors.AbstractMediaTypeProcessor
import me.freedom4live.type.parser.processors.MediaTypeProcessor
import java.io.File
import java.nio.file.Files

internal class FileMediaTypeProcessor : MediaTypeProcessor, AbstractMediaTypeProcessor() {
    override fun parseMediaTypeInternal(file: File): String? = Files.probeContentType(file.toPath())
}
