package org.ktypeparser.processors

import java.io.File

internal abstract class AbstractMediaTypeProcessor : MediaTypeProcessor {

    private var nextProcessor: MediaTypeProcessor? = null


    override fun addNextProcessor(processor: MediaTypeProcessor) = processor.run {
        nextProcessor = processor
        processor
    }

    override fun parseMediaType(file: File): String? {
        return this.parseMediaTypeInternal(file) ?: nextProcessor?.parseMediaType(file)
    }

    protected abstract fun parseMediaTypeInternal(file: File): String?

}
