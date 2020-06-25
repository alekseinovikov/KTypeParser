# Media Type Parser
[![Build Status](https://travis-ci.org/Isabek/media-type-parser.svg)](https://travis-ci.org/Isabek/es-response-parser)
![BUILD (Ubuntu 20.04)](https://github.com/alekseinovikov/media-type-parser/workflows/BUILD%20(Ubuntu%2020.04)/badge.svg?branch=master)

## Description
The parser determines a type of a file, byte array or input stream. 
It represents the result as Google Guava's MediaType class instance that can be converted to String.

## Build
You can build the project using Gradle.

## Usage

* org.ktypeparser.MediaTypeParser.parse(inputStream: InputStream): MediaType?
* org.ktypeparser.MediaTypeParser.parse(bytes: ByteArray): MediaType?
* org.ktypeparser.MediaTypeParser.parse(file: File): MediaType?

MediaType - is an enum with media types that can be determined by MIME Type

Extension functions and coroutines are in upcoming changes plans

## Details
The implementation uses a few Java's standard approaches and a few of third-part ones.

The code is designed with Chain Of Responsibility pattern.

The approaches:

* Files.probeContentType
* URLConnection
* MimetypesFileTypeMap
* jMimeMagic
* Apache Tika

## Authors

* Aleksei Novikov - https://github.com/alekseinovikov
