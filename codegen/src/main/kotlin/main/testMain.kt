package main

import extract.isLikelyMacro

fun main() {
    assert("VMA_LEN_IF_NOT_NULL".isLikelyMacro())
}
