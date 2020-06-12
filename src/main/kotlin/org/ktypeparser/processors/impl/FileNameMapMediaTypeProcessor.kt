package org.ktypeparser.processors.impl

import org.ktypeparser.processors.AbstractMediaTypeProcessor
import org.ktypeparser.processors.MediaTypeProcessor
import java.io.File
import java.net.URLConnection


internal class FileNameMapMediaTypeProcessor: MediaTypeProcessor, AbstractMediaTypeProcessor() {
    override fun parseMediaTypeInternal(file: File): String? = URLConnection.getFileNameMap().getContentTypeFor(file.name)
}
