package org.ktypeparser.processors.impl

import org.ktypeparser.processors.AbstractMediaTypeProcessor
import org.ktypeparser.processors.MediaTypeProcessor
import net.sf.jmimemagic.Magic
import java.io.File

internal class jMimeMagicMediaTypeProcessor : MediaTypeProcessor, AbstractMediaTypeProcessor() {
    override fun parseMediaTypeInternal(file: File): String? = try {
        Magic.getMagicMatch(file, false).mimeType
    } catch (ex: Exception) {
        null
    }
}
