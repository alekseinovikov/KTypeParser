package org.ktypeparser

import org.ktypeparser.processors.MediaTypeSyncDetector
import org.ktypeparser.type.MediaType
import java.io.File
import java.io.InputStream

fun File.detectMediaType() = detect(this)
fun ByteArray.detectMediaType() = detect(this)
fun InputStream.detectMediaType() = detect(this)

fun detect(inputStream: InputStream): MediaType? = MediaTypeSyncDetector.detect(inputStream)
fun detect(bytes: ByteArray): MediaType? = MediaTypeSyncDetector.detect(bytes)
fun detect(file: File): MediaType? = MediaTypeSyncDetector.detect(file)