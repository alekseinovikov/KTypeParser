package me.freedom4live.type.parser.processors.impl

import me.freedom4live.type.parser.processors.AbstractMediaTypeProcessor
import me.freedom4live.type.parser.processors.MediaTypeProcessor
import org.apache.tika.Tika
import java.io.File

internal class TikaMediaTypeProcessor : MediaTypeProcessor, AbstractMediaTypeProcessor() {
    override fun parseMediaTypeInternal(file: File): String? = Tika().detect(file)
}
