package me.freedom4live.type.parser.processors.impl

import me.freedom4live.type.parser.processors.AbstractMediaTypeProcessor
import me.freedom4live.type.parser.processors.MediaTypeProcessor
import net.sf.jmimemagic.Magic
import java.io.File

internal class jMimeMagicMediaTypeProcessor : MediaTypeProcessor, AbstractMediaTypeProcessor() {
    override fun parseMediaTypeInternal(file: File): String? = try {
        Magic.getMagicMatch(file, false).mimeType
    } catch (ex: Exception) {
        null
    }
}
