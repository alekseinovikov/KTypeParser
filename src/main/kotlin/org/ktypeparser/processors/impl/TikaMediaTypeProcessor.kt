package org.ktypeparser.processors.impl

import org.ktypeparser.processors.AbstractMediaTypeProcessor
import org.ktypeparser.processors.MediaTypeProcessor
import org.apache.tika.Tika
import java.io.File

internal class TikaMediaTypeProcessor : MediaTypeProcessor, AbstractMediaTypeProcessor() {
    override fun parseMediaTypeInternal(file: File): String? = Tika().detect(file)
}
