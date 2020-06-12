package org.ktypeparser

import com.google.common.net.MediaType
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import java.io.File
import java.nio.file.Files
import java.nio.file.Paths

internal class MediaTypeParserTest {

    @Test
    fun parse_pdfFile_rightType() {
        val pdfFile = getFileFromResources("pdf.pdf")

        val mediaType = MediaTypeParser.parse(pdfFile)

        Assertions.assertEquals(MediaType.PDF, mediaType)
    }

    @Test
    fun parse_pdfFileByteArray_rightType() {
        val pdfFile = getFileFromResources("pdf.pdf")
        val bytes = Files.readAllBytes(Paths.get(pdfFile.toURI()))

        val mediaType = MediaTypeParser.parse(bytes)

        Assertions.assertEquals(MediaType.PDF, mediaType)
    }

    @Test
    fun parse_pdfFileInputStream_rightType() {
        val pdfFile = getFileFromResources("pdf.pdf")

        val mediaType = MediaTypeParser.parse(pdfFile.inputStream())

        Assertions.assertEquals(MediaType.PDF, mediaType)
    }

    @Test
    fun parse_jpgFile_rightType() {
        val jpgFile = getFileFromResources("jpg.jpg")

        val mediaType = MediaTypeParser.parse(jpgFile)

        Assertions.assertEquals(MediaType.JPEG, mediaType)
    }

    @Test
    fun parse_jpgFileByteArray_rightType() {
        val jpgFile = getFileFromResources("jpg.jpg")
        val bytes = Files.readAllBytes(Paths.get(jpgFile.toURI()))

        val mediaType = MediaTypeParser.parse(bytes)

        Assertions.assertEquals(MediaType.JPEG, mediaType)
    }

    @Test
    fun parse_jpgFileInputStream_rightType() {
        val jpgFile = getFileFromResources("jpg.jpg")

        val mediaType = MediaTypeParser.parse(jpgFile.inputStream())

        Assertions.assertEquals(MediaType.JPEG, mediaType)
    }

    private fun getFileFromResources(path: String): File = File(javaClass.classLoader.getResource(path).file)

}
