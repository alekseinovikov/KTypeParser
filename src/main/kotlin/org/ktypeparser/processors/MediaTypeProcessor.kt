package org.ktypeparser.processors

import org.ktypeparser.processors.impl.*
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
