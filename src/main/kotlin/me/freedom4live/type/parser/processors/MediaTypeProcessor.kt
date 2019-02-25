package me.freedom4live.type.parser.processors

import me.freedom4live.type.parser.processors.impl.*
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
