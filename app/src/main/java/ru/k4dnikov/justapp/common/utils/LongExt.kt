package ru.k4dnikov.justapp.common.utils

import org.threeten.bp.Instant
import org.threeten.bp.ZoneId

fun Long.toLocalDateTime() = Instant.ofEpochMilli(this).atZone(ZoneId.systemDefault()).toLocalDateTime()

fun Long.toLocalDate() = Instant.ofEpochMilli(this).atZone(ZoneId.systemDefault()).toLocalDate()