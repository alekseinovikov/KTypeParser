package org.ktypeparser.type

private const val APPLICATION_TYPE = "application"
private const val AUDIO_TYPE = "audio"
private const val IMAGE_TYPE = "image"
private const val TEXT_TYPE = "text"
private const val VIDEO_TYPE = "video"

private const val WILDCARD = "*"

enum class MediaType(val type: String, val subType: String) {
    EMPTY("application","x-empty"),

    ANY_TYPE(WILDCARD, WILDCARD),
    ANY_TEXT_TYPE(TEXT_TYPE, WILDCARD),
    ANY_IMAGE_TYPE(IMAGE_TYPE, WILDCARD),
    ANY_AUDIO_TYPE(AUDIO_TYPE, WILDCARD),
    ANY_VIDEO_TYPE(VIDEO_TYPE, WILDCARD),
    ANY_APPLICATION_TYPE(APPLICATION_TYPE, WILDCARD),

    /* TEXT TYPES */
    CSS(TEXT_TYPE, "css"),
    CSV(TEXT_TYPE, "csv"),
    HTML(TEXT_TYPE, "html"),
    I_CALENDAR(TEXT_TYPE, "calendar"),
    PLAIN_TEXT(TEXT_TYPE, "plain"),
    TEXT_JAVASCRIPT(TEXT_TYPE, "javascript"),
    TSV(TEXT_TYPE, "tab-separated-values"),
    VCARD(TEXT_TYPE, "vcard"),
    WML(TEXT_TYPE, "vnd.wap.wml"),
    XML(TEXT_TYPE, "xml"),
    VTT(TEXT_TYPE, "vtt"),

    /* IMAGE TYPES */
    BMP(IMAGE_TYPE, "bmp"),
    CRW(IMAGE_TYPE, "x-canon-crw"),
    GIF(IMAGE_TYPE, "gif"),
    ICO(IMAGE_TYPE, "vnd.microsoft.icon"),
    JPEG(IMAGE_TYPE, "jpeg"),
    PNG(IMAGE_TYPE, "png"),
    PSD(IMAGE_TYPE, "vnd.adobe.photoshop"),
    SVG(IMAGE_TYPE, "svg+xml"),
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
    APPLICATION_XML(APPLICATION_TYPE, "xml"),
    ATOM(APPLICATION_TYPE, "atom+xml"),
    BZIP2(APPLICATION_TYPE, "x-bzip2"),
    DART(APPLICATION_TYPE, "dart"),
    APPLE_PASSBOOK(APPLICATION_TYPE, "vnd.apple.pkpass"),
    EOT(APPLICATION_TYPE, "vnd.ms-fontobject"),
    EPUB(APPLICATION_TYPE, "epub+zip"),
    FORM_DATA(APPLICATION_TYPE, "x-www-form-urlencoded"),
    KEY_ARCHIVE(APPLICATION_TYPE, "pkcs12"),
    APPLICATION_BINARY(APPLICATION_TYPE, "binary"),
    GEO_JSON(APPLICATION_TYPE, "geo+json"),
    GZIP(APPLICATION_TYPE, "x-gzip"),
    HAL_JSON(APPLICATION_TYPE, "hal+json"),
    JAVASCRIPT(APPLICATION_TYPE, "javascript"),
    JOSE(APPLICATION_TYPE, "jose"),
    JOSE_JSON(APPLICATION_TYPE, "jose+json"),
    JSON(APPLICATION_TYPE, "json"),
    MANIFEST_JSON(APPLICATION_TYPE, "manifest+json"),
    KML(APPLICATION_TYPE, "vnd.google-earth.kml+xml"),
    KMZ(APPLICATION_TYPE, "vnd.google-earth.kmz"),
    MBOX(APPLICATION_TYPE, "mbox"),
    APPLE_MOBILE_CONFIG(APPLICATION_TYPE, "x-apple-aspen-config"),
    MICROSOFT_EXCEL(APPLICATION_TYPE, "vnd.ms-excel"),
    MICROSOFT_OUTLOOK(APPLICATION_TYPE, "vnd.ms-outlook"),
    MICROSOFT_POWERPOINT(APPLICATION_TYPE, "vnd.ms-powerpoint"),
    MICROSOFT_WORD(APPLICATION_TYPE, "msword"),
    MEDIA_PRESENTATION_DESCRIPTION(APPLICATION_TYPE, "dash+xml"),
    WASM_APPLICATION(APPLICATION_TYPE, "wasm"),
    NACL_APPLICATION(APPLICATION_TYPE, "x-nacl"),
    NACL_PORTABLE_APPLICATION(APPLICATION_TYPE, "x-pnacl"),
    OCTET_STREAM(APPLICATION_TYPE, "octet-stream"),
    OGG_CONTAINER(APPLICATION_TYPE, "ogg"),
    OOXML_DOCUMENT(APPLICATION_TYPE, "vnd.openxmlformats-officedocument.wordprocessingml.document"),
    OOXML_PRESENTATION(APPLICATION_TYPE, "vnd.openxmlformats-officedocument.presentationml.presentation"),
    OOXML_SHEET(APPLICATION_TYPE, "vnd.openxmlformats-officedocument.spreadsheetml.sheet"),
    OPENDOCUMENT_GRAPHICS(APPLICATION_TYPE, "vnd.oasis.opendocument.graphics"),
    OPENDOCUMENT_PRESENTATION(APPLICATION_TYPE, "vnd.oasis.opendocument.presentation"),
    OPENDOCUMENT_SPREADSHEET(APPLICATION_TYPE, "vnd.oasis.opendocument.spreadsheet"),
    OPENDOCUMENT_TEXT(APPLICATION_TYPE, "vnd.oasis.opendocument.text"),
    OPENSEARCH_DESCRIPTION(APPLICATION_TYPE, "opensearchdescription+xml"),
    PDF(APPLICATION_TYPE, "pdf"),
    POSTSCRIPT(APPLICATION_TYPE, "postscript"),
    PROTOBUF(APPLICATION_TYPE, "protobuf"),
    RDF_XML(APPLICATION_TYPE, "rdf+xml"),
    RTF(APPLICATION_TYPE, "rtf"),
    SFNT(APPLICATION_TYPE, "font-sfnt"),
    SHOCKWAVE_FLASH(APPLICATION_TYPE, "x-shockwave-flash"),
    SKETCHUP(APPLICATION_TYPE, "vnd.sketchup.skp"),
    SOAP_XML(APPLICATION_TYPE, "soap+xml"),
    TAR(APPLICATION_TYPE, "x-tar"),
    WOFF(APPLICATION_TYPE, "font-woff"),
    WOFF2(APPLICATION_TYPE, "font-woff2"),
    XHTML(APPLICATION_TYPE, "xhtml+xml"),
    XRD(APPLICATION_TYPE, "xrd+xml"),
    ZIP(APPLICATION_TYPE, "zip")
}

private val nameToMediaTypeMap: Map<String, MediaType> by lazy {
    MediaType.values().map { mediaTypeValue -> "${mediaTypeValue.type}/${mediaTypeValue.subType}" to mediaTypeValue }
        .toMap()
}

internal fun String.parseMediaType(): MediaType? = nameToMediaTypeMap[this]