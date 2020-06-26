package org.ktypeparser

import org.ktypeparser.processors.MediaTypeProcessor
import org.ktypeparser.type.MediaType
import java.io.File
import java.io.InputStream

fun File.detectMediaType() = detect(this)
fun ByteArray.detectMediaType() = detect(this)
fun InputStream.detectMediaType() = detect(this)

fun detect(inputStream: InputStream): MediaType? = MediaTypeProcessor.detect(inputStream)
fun detect(bytes: ByteArray): MediaType? = MediaTypeProcessor.detect(bytes)
fun detect(file: File): MediaType? = MediaTypeProcessor.detect(file)