package org.ktypeparser.type

private const val APPLICATION_TYPE = "application"
private const val AUDIO_TYPE = "audio"
private const val IMAGE_TYPE = "image"
private const val TEXT_TYPE = "text"
private const val VIDEO_TYPE = "video"

private const val WILDCARD = "*"

enum class MediaType(private val type: String, private val subType: String) {
    ANY_TYPE(WILDCARD, WILDCARD),
    ANY_TEXT_TYPE(TEXT_TYPE, WILDCARD),
    ANY_IMAGE_TYPE(IMAGE_TYPE, WILDCARD),
    ANY_AUDIO_TYPE(AUDIO_TYPE, WILDCARD),
    ANY_VIDEO_TYPE(VIDEO_TYPE, WILDCARD),
    ANY_APPLICATION_TYPE(APPLICATION_TYPE, WILDCARD),

    /* TEXT TYPES */
    CSS_UTF_8(TEXT_TYPE, "css"),
    CSV_UTF_8(TEXT_TYPE, "csv"),
    HTML_UTF_8(TEXT_TYPE, "html"),
    I_CALENDAR_UTF_8(TEXT_TYPE, "calendar"),
    PLAIN_TEXT_UTF_8(TEXT_TYPE, "plain"),
    TEXT_JAVASCRIPT_UTF_8(TEXT_TYPE, "javascript"),
    TSV_UTF_8(TEXT_TYPE, "tab-separated-values"),
    VCARD_UTF_8(TEXT_TYPE, "vcard"),
    WML_UTF_8(TEXT_TYPE, "vnd.wap.wml"),
    XML_UTF_8(TEXT_TYPE, "xml"),
    VTT_UTF_8(TEXT_TYPE, "vtt"),

    /* IMAGE TYPES */
    BMP(IMAGE_TYPE, "bmp"),
    CRW(IMAGE_TYPE, "x-canon-crw"),
    GIF(IMAGE_TYPE, "gif"),
    ICO(IMAGE_TYPE, "vnd.microsoft.icon"),
    JPEG(IMAGE_TYPE, "jpeg"),
    PNG(IMAGE_TYPE, "png"),
    PSD(IMAGE_TYPE, "vnd.adobe.photoshop"),
    SVG_UTF_8(IMAGE_TYPE, "svg+xml"),
    TIFF(IMAGE_TYPE, "tiff"),
    WEBP(IMAGE_TYPE, "webp"),
    HEIF(IMAGE_TYPE, "heif"),
    JP2K(IMAGE_TYPE, "jp2"),

    /* AUDIO TYPES */
    MP4_AUDIO(AUDIO_TYPE, "mp4"),
    MPEG_AUDIO(AUDIO_TYPE, "mpeg"),
    OGG_AUDIO(AUDIO_TYPE, "ogg"),
    WEBM_AUDIO(AUDIO_TYPE, "webm"),
    L16_AUDIO(AUDIO_TYPE, "l16"),
    L24_AUDIO(AUDIO_TYPE, "l24"),
    BASIC_AUDIO(AUDIO_TYPE, "basic"),
    AAC_AUDIO(AUDIO_TYPE, "aac"),
    VORBIS_AUDIO(AUDIO_TYPE, "vorbis"),
    WMA_AUDIO(AUDIO_TYPE, "x-ms-wma"),
    WAX_AUDIO(AUDIO_TYPE, "x-ms-wax"),
    VND_REAL_AUDIO(AUDIO_TYPE, "vnd.rn-realaudio"),
    VND_WAVE_AUDIO(AUDIO_TYPE, "vnd.wave"),

    /* VIDEO TYPES */
    MP4_VIDEO(VIDEO_TYPE, "mp4"),
    MPEG_VIDEO(VIDEO_TYPE, "mpeg"),
    OGG_VIDEO(VIDEO_TYPE, "ogg"),
    QUICKTIME(VIDEO_TYPE, "quicktime"),
    WEBM_VIDEO(VIDEO_TYPE, "webm"),
    WMV(VIDEO_TYPE, "x-ms-wmv"),
    FLV_VIDEO(VIDEO_TYPE, "x-flv"),
    THREE_GPP_VIDEO(VIDEO_TYPE, "3gpp"),
    THREE_GPP2_VIDEO(VIDEO_TYPE, "3gpp2"),

    /* APPLICATION TYPES */

}