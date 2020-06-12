package org.ktypeparser.processors.impl

import org.ktypeparser.processors.AbstractMediaTypeProcessor
import org.ktypeparser.processors.MediaTypeProcessor
import java.io.File
import javax.activation.MimetypesFileTypeMap


internal class MimeTypesFileTypeMediaTypeProcessor : MediaTypeProcessor, AbstractMediaTypeProcessor() {
    override fun parseMediaTypeInternal(file: File): String? = MimetypesFileTypeMap().getContentType(file.name)
}
