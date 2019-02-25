# Media Type Parser

## Description
The parser determines a type of a file, byte array or input stream. 
It represents the result as Google Guava's MediaType class instance that can be converted to String.

## Build
You can build the project using Gradle.

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

* Alexey Novikov (freedom4live) - https://github.com/freedom4live
