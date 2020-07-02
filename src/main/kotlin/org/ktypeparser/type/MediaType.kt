package org.ktypeparser.type

import org.ktypeparser.type.MediaSuperType.*

private const val APPLICATION_TYPE = "application"
private const val AUDIO_TYPE = "audio"
private const val IMAGE_TYPE = "image"
private const val TEXT_TYPE = "text"
private const val VIDEO_TYPE = "video"

private const val WILDCARD = "*"

enum class MediaSuperType {
    OTHER,
    TEXT,
    IMAGE,
    AUDIO,
    VIDEO,
    APPLICATION
}

enum class MediaType(val type: String, val subType: String, val superType: MediaSuperType) {
    EMPTY("application", "x-empty", OTHER),

    ANY_TYPE(WILDCARD, WILDCARD, OTHER),
    ANY_TEXT_TYPE(TEXT_TYPE, WILDCARD, TEXT),
    ANY_IMAGE_TYPE(IMAGE_TYPE, WILDCARD, IMAGE),
    ANY_AUDIO_TYPE(AUDIO_TYPE, WILDCARD, AUDIO),
    ANY_VIDEO_TYPE(VIDEO_TYPE, WILDCARD, VIDEO),
    ANY_APPLICATION_TYPE(APPLICATION_TYPE, WILDCARD, APPLICATION),

    /* TEXT TYPES */
    CSS(TEXT_TYPE, "css", TEXT),
    CSV(TEXT_TYPE, "csv", TEXT),
    HTML(TEXT_TYPE, "html", TEXT),
    I_CALENDAR(TEXT_TYPE, "calendar", TEXT),
    PLAIN_TEXT(TEXT_TYPE, "plain", TEXT),
    TEXT_JAVASCRIPT(TEXT_TYPE, "javascript", TEXT),
    TSV(TEXT_TYPE, "tab-separated-values", TEXT),
    VCARD(TEXT_TYPE, "vcard", TEXT),
    WML(TEXT_TYPE, "vnd.wap.wml", TEXT),
    XML(TEXT_TYPE, "xml", TEXT),
    VTT(TEXT_TYPE, "vtt", TEXT),

    /* IMAGE TYPES */
    BMP(IMAGE_TYPE, "bmp", IMAGE),
    CRW(IMAGE_TYPE, "x-canon-crw", IMAGE),
    GIF(IMAGE_TYPE, "gif", IMAGE),
    ICO(IMAGE_TYPE, "vnd.microsoft.icon", IMAGE),
    JPEG(IMAGE_TYPE, "jpeg", IMAGE),
    PNG(IMAGE_TYPE, "png", IMAGE),
    PSD(IMAGE_TYPE, "vnd.adobe.photoshop", IMAGE),
    SVG(IMAGE_TYPE, "svg+xml", IMAGE),
    TIFF(IMAGE_TYPE, "tiff", IMAGE),
    WEBP(IMAGE_TYPE, "webp", IMAGE),
    HEIF(IMAGE_TYPE, "heif", IMAGE),
    JP2K(IMAGE_TYPE, "jp2", IMAGE),

    /* AUDIO TYPES */
    MP4_AUDIO(AUDIO_TYPE, "mp4", AUDIO),
    MPEG_AUDIO(AUDIO_TYPE, "mpeg", AUDIO),
    OGG_AUDIO(AUDIO_TYPE, "ogg", AUDIO),
    WEBM_AUDIO(AUDIO_TYPE, "webm", AUDIO),
    L16_AUDIO(AUDIO_TYPE, "l16", AUDIO),
    L24_AUDIO(AUDIO_TYPE, "l24", AUDIO),
    BASIC_AUDIO(AUDIO_TYPE, "basic", AUDIO),
    AAC_AUDIO(AUDIO_TYPE, "aac", AUDIO),
    VORBIS_AUDIO(AUDIO_TYPE, "vorbis", AUDIO),
    WMA_AUDIO(AUDIO_TYPE, "x-ms-wma", AUDIO),
    WAX_AUDIO(AUDIO_TYPE, "x-ms-wax", AUDIO),
    VND_REAL_AUDIO(AUDIO_TYPE, "vnd.rn-realaudio", AUDIO),
    VND_WAVE_AUDIO(AUDIO_TYPE, "vnd.wave", AUDIO),

    /* VIDEO TYPES */
    MP4_VIDEO(VIDEO_TYPE, "mp4", VIDEO),
    MPEG_VIDEO(VIDEO_TYPE, "mpeg", VIDEO),
    OGG_VIDEO(VIDEO_TYPE, "ogg", VIDEO),
    QUICKTIME(VIDEO_TYPE, "quicktime", VIDEO),
    WEBM_VIDEO(VIDEO_TYPE, "webm", VIDEO),
    WMV(VIDEO_TYPE, "x-ms-wmv", VIDEO),
    FLV_VIDEO(VIDEO_TYPE, "x-flv", VIDEO),
    THREE_GPP_VIDEO(VIDEO_TYPE, "3gpp", VIDEO),
    THREE_GPP2_VIDEO(VIDEO_TYPE, "3gpp2", VIDEO),

    /* APPLICATION TYPES */
    APPLICATION_XML(APPLICATION_TYPE, "xml", APPLICATION),
    ATOM(APPLICATION_TYPE, "atom+xml", APPLICATION),
    BZIP2(APPLICATION_TYPE, "x-bzip2", APPLICATION),
    DART(APPLICATION_TYPE, "dart", APPLICATION),
    APPLE_PASSBOOK(APPLICATION_TYPE, "vnd.apple.pkpass", APPLICATION),
    EOT(APPLICATION_TYPE, "vnd.ms-fontobject", APPLICATION),
    EPUB(APPLICATION_TYPE, "epub+zip", APPLICATION),
    FORM_DATA(APPLICATION_TYPE, "x-www-form-urlencoded", APPLICATION),
    KEY_ARCHIVE(APPLICATION_TYPE, "pkcs12", APPLICATION),
    APPLICATION_BINARY(APPLICATION_TYPE, "binary", APPLICATION),
    GEO_JSON(APPLICATION_TYPE, "geo+json", APPLICATION),
    GZIP(APPLICATION_TYPE, "x-gzip", APPLICATION),
    HAL_JSON(APPLICATION_TYPE, "hal+json", APPLICATION),
    JAVASCRIPT(APPLICATION_TYPE, "javascript", APPLICATION),
    JOSE(APPLICATION_TYPE, "jose", APPLICATION),
    JOSE_JSON(APPLICATION_TYPE, "jose+json", APPLICATION),
    JSON(APPLICATION_TYPE, "json", APPLICATION),
    MANIFEST_JSON(APPLICATION_TYPE, "manifest+json", APPLICATION),
    KML(APPLICATION_TYPE, "vnd.google-earth.kml+xml", APPLICATION),
    KMZ(APPLICATION_TYPE, "vnd.google-earth.kmz", APPLICATION),
    MBOX(APPLICATION_TYPE, "mbox", APPLICATION),
    APPLE_MOBILE_CONFIG(APPLICATION_TYPE, "x-apple-aspen-config", APPLICATION),
    MICROSOFT_EXCEL(APPLICATION_TYPE, "vnd.ms-excel", APPLICATION),
    MICROSOFT_OUTLOOK(APPLICATION_TYPE, "vnd.ms-outlook", APPLICATION),
    MICROSOFT_POWERPOINT(APPLICATION_TYPE, "vnd.ms-powerpoint", APPLICATION),
    MICROSOFT_WORD(APPLICATION_TYPE, "msword", APPLICATION),
    MEDIA_PRESENTATION_DESCRIPTION(APPLICATION_TYPE, "dash+xml", APPLICATION),
    WASM_APPLICATION(APPLICATION_TYPE, "wasm", APPLICATION),
    NACL_APPLICATION(APPLICATION_TYPE, "x-nacl", APPLICATION),
    NACL_PORTABLE_APPLICATION(APPLICATION_TYPE, "x-pnacl", APPLICATION),
    OCTET_STREAM(APPLICATION_TYPE, "octet-stream", APPLICATION),
    OGG_CONTAINER(APPLICATION_TYPE, "ogg", APPLICATION),
    OOXML_DOCUMENT(APPLICATION_TYPE, "vnd.openxmlformats-officedocument.wordprocessingml.document", APPLICATION),
    OOXML_PRESENTATION(APPLICATION_TYPE, "vnd.openxmlformats-officedocument.presentationml.presentation", APPLICATION),
    OOXML_SHEET(APPLICATION_TYPE, "vnd.openxmlformats-officedocument.spreadsheetml.sheet", APPLICATION),
    OPENDOCUMENT_GRAPHICS(APPLICATION_TYPE, "vnd.oasis.opendocument.graphics", APPLICATION),
    OPENDOCUMENT_PRESENTATION(APPLICATION_TYPE, "vnd.oasis.opendocument.presentation", APPLICATION),
    OPENDOCUMENT_SPREADSHEET(APPLICATION_TYPE, "vnd.oasis.opendocument.spreadsheet", APPLICATION),
    OPENDOCUMENT_TEXT(APPLICATION_TYPE, "vnd.oasis.opendocument.text", APPLICATION),
    OPENSEARCH_DESCRIPTION(APPLICATION_TYPE, "opensearchdescription+xml", APPLICATION),
    PDF(APPLICATION_TYPE, "pdf", APPLICATION),
    POSTSCRIPT(APPLICATION_TYPE, "postscript", APPLICATION),
    PROTOBUF(APPLICATION_TYPE, "protobuf", APPLICATION),
    RDF_XML(APPLICATION_TYPE, "rdf+xml", APPLICATION),
    RTF(APPLICATION_TYPE, "rtf", APPLICATION),
    SFNT(APPLICATION_TYPE, "font-sfnt", APPLICATION),
    SHOCKWAVE_FLASH(APPLICATION_TYPE, "x-shockwave-flash", APPLICATION),
    SKETCHUP(APPLICATION_TYPE, "vnd.sketchup.skp", APPLICATION),
    SOAP_XML(APPLICATION_TYPE, "soap+xml", APPLICATION),
    TAR(APPLICATION_TYPE, "x-tar", APPLICATION),
    WOFF(APPLICATION_TYPE, "font-woff", APPLICATION),
    WOFF2(APPLICATION_TYPE, "font-woff2", APPLICATION),
    XHTML(APPLICATION_TYPE, "xhtml+xml", APPLICATION),
    XRD(APPLICATION_TYPE, "xrd+xml", APPLICATION),
    ZIP(APPLICATION_TYPE, "zip", APPLICATION)
}

private val nameToMediaTypeMap: Map<String, MediaType> by lazy {
    MediaType.values().map { mediaTypeValue -> "${mediaTypeValue.type}/${mediaTypeValue.subType}" to mediaTypeValue }
        .toMap()
}

internal fun String.parseMediaType(): MediaType? = nameToMediaTypeMap[this]