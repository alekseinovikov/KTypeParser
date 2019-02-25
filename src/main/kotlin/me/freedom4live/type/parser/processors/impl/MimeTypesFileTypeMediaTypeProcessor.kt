package me.freedom4live.type.parser.processors.impl

import me.freedom4live.type.parser.processors.AbstractMediaTypeProcessor
import me.freedom4live.type.parser.processors.MediaTypeProcessor
import java.io.File
import javax.activation.MimetypesFileTypeMap


internal class MimeTypesFileTypeMediaTypeProcessor : MediaTypeProcessor, AbstractMediaTypeProcessor() {
    override fun parseMediaTypeInternal(file: File): String? = MimetypesFileTypeMap().getContentType(file.name)
}
