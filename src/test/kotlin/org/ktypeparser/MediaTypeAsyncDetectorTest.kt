package org.ktypeparser

import kotlinx.coroutines.runBlocking
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import org.ktypeparser.type.MediaType
import java.io.ByteArrayInputStream
import java.io.File
import java.nio.file.Files
import java.nio.file.Paths

internal class MediaTypeAsyncDetectorTest {

    @Test
    fun detectAsync_pdfFile_rightType() = runBlocking {
        val pdfFile = getFileFromResources("pdf.pdf")

        val mediaType = detectAsync(pdfFile)

        Assertions.assertEquals(MediaType.PDF, mediaType.await())
    }

    @Test
    fun detectAsync_pdfFileByteArray_rightType() = runBlocking {
        val pdfFile = getFileFromResources("pdf.pdf")
        val bytes = Files.readAllBytes(Paths.get(pdfFile.toURI()))

        val mediaType = detectAsync(bytes)

        Assertions.assertEquals(MediaType.PDF, mediaType.await())
    }

    @Test
    fun detectAsync_pdfFileInputStream_rightType() = runBlocking {
        val pdfFile = getFileFromResources("pdf.pdf")

        val mediaType = detectAsync(pdfFile.inputStream())

        Assertions.assertEquals(MediaType.PDF, mediaType.await())
    }

    @Test
    fun detectAsync_jpgFile_rightType() = runBlocking {
        val jpgFile = getFileFromResources("jpg.jpg")

        val mediaType = detectAsync(jpgFile)

        Assertions.assertEquals(MediaType.JPEG, mediaType.await())
    }

    @Test
    fun detectAsync_jpgFileByteArray_rightType() = runBlocking {
        val jpgFile = getFileFromResources("jpg.jpg")
        val bytes = Files.readAllBytes(Paths.get(jpgFile.toURI()))

        val mediaType = detectAsync(bytes)

        Assertions.assertEquals(MediaType.JPEG, mediaType.await())
    }

    @Test
    fun detectAsync_jpgFileInputStream_rightType() = runBlocking {
        val jpgFile = getFileFromResources("jpg.jpg")

        val mediaType = detectAsync(jpgFile.inputStream())

        Assertions.assertEquals(MediaType.JPEG, mediaType.await())
    }

    @Test
    fun detectAsync_emptyFileByteArray_null() = runBlocking {
        val bytes = ByteArray(0)

        val mediaType = detectAsync(bytes)

        Assertions.assertNull(mediaType.await())
    }

    @Test
    fun detectAsync_emptyFileInputStream_null() = runBlocking {
        val inputStream = ByteArrayInputStream(ByteArray(0))

        val mediaType = detectAsync(inputStream)

        Assertions.assertNull(mediaType.await())
    }

    @Test
    fun extension_detectAsync_pdqFile_rightType() = runBlocking {
        val pdfFile = getFileFromResources("pdf.pdf")

        val mediaType = pdfFile.detectMediaTypeAsync()

        Assertions.assertEquals(MediaType.PDF, mediaType.await())
    }

    @Test
    fun extension_detectAsync_pdfFileByteArray_rightType() = runBlocking {
        val pdfFile = getFileFromResources("pdf.pdf")
        val bytes = Files.readAllBytes(Paths.get(pdfFile.toURI()))

        val mediaType = bytes.detectMediaTypeAsync()

        Assertions.assertEquals(MediaType.PDF, mediaType.await())
    }

    @Test
    fun extension_detectAsync_pdfFileInputStream_rightType() = runBlocking {
        val pdfFile = getFileFromResources("pdf.pdf")

        val mediaType = pdfFile.inputStream().detectMediaTypeAsync()

        Assertions.assertEquals(MediaType.PDF, mediaType.await())
    }

    @Test
    fun extension_detectAsync_jpgFile_rightType() = runBlocking {
        val jpgFile = getFileFromResources("jpg.jpg")

        val mediaType = jpgFile.detectMediaTypeAsync()

        Assertions.assertEquals(MediaType.JPEG, mediaType.await())
    }

    @Test
    fun extension_detectAsync_jpgFileByteArray_rightType() = runBlocking {
        val jpgFile = getFileFromResources("jpg.jpg")
        val bytes = Files.readAllBytes(Paths.get(jpgFile.toURI()))

        val mediaType = bytes.detectMediaTypeAsync()

        Assertions.assertEquals(MediaType.JPEG, mediaType.await())
    }

    @Test
    fun extension_detectAsync_jpgFileInputStream_rightType() = runBlocking {
        val jpgFile = getFileFromResources("jpg.jpg")

        val mediaType = jpgFile.inputStream().detectMediaTypeAsync()

        Assertions.assertEquals(MediaType.JPEG, mediaType.await())
    }

    @Test
    fun extension_detectAsync_emptyFileByteArray_null() = runBlocking {
        val bytes = ByteArray(0)

        val mediaType = bytes.detectMediaTypeAsync()

        Assertions.assertNull(mediaType.await())
    }

    @Test
    fun extension_detectAsync_emptyFileInputStream_null() = runBlocking {
        val inputStream = ByteArrayInputStream(ByteArray(0))

        val mediaType = inputStream.detectMediaTypeAsync()

        Assertions.assertNull(mediaType.await())
    }

    private fun getFileFromResources(path: String): File = File(javaClass.classLoader.getResource(path)!!.file)

}