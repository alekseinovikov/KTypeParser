package org.ktypeparser

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import org.ktypeparser.type.MediaType
import java.io.ByteArrayInputStream
import java.io.File
import java.nio.file.Files
import java.nio.file.Paths

internal class MediaTypeSyncDetectorTest {

    @Test
    fun detect_pdfFile_rightType() {
        val pdfFile = getFileFromResources("pdf.pdf")

        val mediaType = detect(pdfFile)

        Assertions.assertEquals(MediaType.PDF, mediaType)
    }

    @Test
    fun detect_pdfFileByteArray_rightType() {
        val pdfFile = getFileFromResources("pdf.pdf")
        val bytes = Files.readAllBytes(Paths.get(pdfFile.toURI()))

        val mediaType = detect(bytes)

        Assertions.assertEquals(MediaType.PDF, mediaType)
    }

    @Test
    fun detect_pdfFileInputStream_rightType() {
        val pdfFile = getFileFromResources("pdf.pdf")

        val mediaType = detect(pdfFile.inputStream())

        Assertions.assertEquals(MediaType.PDF, mediaType)
    }

    @Test
    fun detect_jpgFile_rightType() {
        val jpgFile = getFileFromResources("jpg.jpg")

        val mediaType = detect(jpgFile)

        Assertions.assertEquals(MediaType.JPEG, mediaType)
    }

    @Test
    fun detect_jpgFileByteArray_rightType() {
        val jpgFile = getFileFromResources("jpg.jpg")
        val bytes = Files.readAllBytes(Paths.get(jpgFile.toURI()))

        val mediaType = detect(bytes)

        Assertions.assertEquals(MediaType.JPEG, mediaType)
    }

    @Test
    fun detect_jpgFileInputStream_rightType() {
        val jpgFile = getFileFromResources("jpg.jpg")

        val mediaType = detect(jpgFile.inputStream())

        Assertions.assertEquals(MediaType.JPEG, mediaType)
    }

    @Test
    fun detect_emptyFileByteArray_null() {
        val bytes = ByteArray(0)

        val mediaType = detect(bytes)

        Assertions.assertNull(mediaType)
    }

    @Test
    fun detect_emptyFileInputStream_null() {
        val inputStream = ByteArrayInputStream(ByteArray(0))

        val mediaType = detect(inputStream)

        Assertions.assertNull(mediaType)
    }

    @Test
    fun extension_detect_pdqFile_rightType() {
        val pdfFile = getFileFromResources("pdf.pdf")

        val mediaType = pdfFile.detectMediaType()

        Assertions.assertEquals(MediaType.PDF, mediaType)
    }

    @Test
    fun extension_detect_pdfFileByteArray_rightType() {
        val pdfFile = getFileFromResources("pdf.pdf")
        val bytes = Files.readAllBytes(Paths.get(pdfFile.toURI()))

        val mediaType = bytes.detectMediaType()

        Assertions.assertEquals(MediaType.PDF, mediaType)
    }

    @Test
    fun extension_detect_pdfFileInputStream_rightType() {
        val pdfFile = getFileFromResources("pdf.pdf")

        val mediaType = pdfFile.inputStream().detectMediaType()

        Assertions.assertEquals(MediaType.PDF, mediaType)
    }

    @Test
    fun extension_detect_jpgFile_rightType() {
        val jpgFile = getFileFromResources("jpg.jpg")

        val mediaType = jpgFile.detectMediaType()

        Assertions.assertEquals(MediaType.JPEG, mediaType)
    }

    @Test
    fun extension_detect_jpgFileByteArray_rightType() {
        val jpgFile = getFileFromResources("jpg.jpg")
        val bytes = Files.readAllBytes(Paths.get(jpgFile.toURI()))

        val mediaType = bytes.detectMediaType()

        Assertions.assertEquals(MediaType.JPEG, mediaType)
    }

    @Test
    fun extension_detect_jpgFileInputStream_rightType() {
        val jpgFile = getFileFromResources("jpg.jpg")

        val mediaType = jpgFile.inputStream().detectMediaType()

        Assertions.assertEquals(MediaType.JPEG, mediaType)
    }

    @Test
    fun extension_detect_emptyFileByteArray_null() {
        val bytes = ByteArray(0)

        val mediaType = bytes.detectMediaType()

        Assertions.assertNull(mediaType)
    }

    @Test
    fun extension_detect_emptyFileInputStream_null() {
        val inputStream = ByteArrayInputStream(ByteArray(0))

        val mediaType = inputStream.detectMediaType()

        Assertions.assertNull(mediaType)
    }

    private fun getFileFromResources(path: String): File = File(javaClass.classLoader.getResource(path)!!.file)

}
