package org.ktypeparser.processors

import kotlinx.coroutines.Deferred
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.async
import kotlinx.coroutines.future.await
import org.ktypeparser.type.MediaType
import org.ktypeparser.type.parseMediaType
import org.overviewproject.mime_types.MimeTypeDetector
import java.io.File
import java.io.InputStream
import java.nio.file.Path

internal object MediaTypeAsyncDetector {

    private val mimeTypeDetector = MimeTypeDetector()

    suspend fun detectAsync(file: File): Deferred<MediaType?> = file.toPath().detectAsync()

    suspend fun detectAsync(bytes: ByteArray): Deferred<MediaType?> {
        val file = createTempFileAsync(bytes)
        return file.await().toPath().detectAsync()
    }

    suspend fun detectAsync(inputStream: InputStream): Deferred<MediaType?> =
        createTempFileAsync(inputStream).await().toPath().detectAsync()

    private suspend fun Path.detectAsync() =
        GlobalScope.async { mimeTypeDetector.detectMimeTypeAsync(this@detectAsync).await().parseMediaType() }

}