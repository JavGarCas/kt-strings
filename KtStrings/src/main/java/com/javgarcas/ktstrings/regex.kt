package com.javgarcas.ktstrings

import java.util.regex.Pattern

const val EMAIL_PATTERN = "[a-zA-Z0-9\\+\\.\\_\\%\\-\\+]{1,256}\\@[a-zA-Z0-9][a-zA-Z0-9\\-]{0,64}(\\.[a-zA-Z0-9][a-zA-Z0-9\\-]{1,25})+"
const val PHONE_PATTERN = "[0-9]{10}"

fun String.isValidEmail(pattern: Pattern = Pattern.compile(EMAIL_PATTERN)) = pattern.matcher(this).matches()

fun String.isValidPhone(pattern: Pattern = Pattern.compile(PHONE_PATTERN)) = pattern.matcher(this).matches()
