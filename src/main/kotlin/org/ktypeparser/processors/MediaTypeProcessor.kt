package org.ktypeparser.processors

import me.freedom4live.type.parser.processors.impl.*
import org.ktypeparser.processors.impl.*
import org.ktypeparser.processors.impl.FileMediaTypeProcessor
import org.ktypeparser.processors.impl.FileNameMapMediaTypeProcessor
import org.ktypeparser.processors.impl.MimeTypesFileTypeMediaTypeProcessor
import org.ktypeparser.processors.impl.TikaMediaTypeProcessor
import org.ktypeparser.processors.impl.URLMediaTypeProcessor
import org.ktypeparser.processors.impl.jMimeMagicMediaTypeProcessor
import java.io.File

interface MediaTypeProcessor {
    fun parseMediaType(file: File): String?
    fun addNextProcessor(processor: MediaTypeProcessor): MediaTypeProcessor
}

internal fun initProcessorChain(): MediaTypeProcessor {
    val root = FileMediaTypeProcessor()

    root
        .addNextProcessor(jMimeMagicMediaTypeProcessor())
        .addNextProcessor(TikaMediaTypeProcessor())
        .addNextProcessor(URLMediaTypeProcessor())
        .addNextProcessor(FileNameMapMediaTypeProcessor())
        .addNextProcessor(MimeTypesFileTypeMediaTypeProcessor())

    return root
}
