# KTypeParser
[![Build Status](https://travis-ci.org/Isabek/media-type-parser.svg)](https://travis-ci.org/Isabek/es-response-parser)
![BUILD (Ubuntu 20.04)](https://github.com/alekseinovikov/KTypeParser/workflows/BUILD%20(Ubuntu%2020.04)/badge.svg?branch=master)

## Description
The parser determines a type of a file, byte array or input stream. 

## Build
You can build the project using Gradle.

## Usage

Functions:
* detect(inputStream: InputStream): MediaType?
* detect(bytes: ByteArray): MediaType?
* detect(file: File): MediaType?

Extension functions:
* File.detectMediaType(): MediaType?
* ByteArray.detectMediaType(): MediaType?
* InputStream.detectMediaType(): MediaType?

MediaType - is an enum with media types that can be determined by MIME Type

Extension functions and coroutines are in upcoming changes plans

## Details
Using: https://github.com/overview/mime-types to detect mime-types as strings
Classifies to a known enum values 