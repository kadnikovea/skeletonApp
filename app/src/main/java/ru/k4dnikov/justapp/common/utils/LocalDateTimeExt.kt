package ru.k4dnikov.justapp.common.utils

import org.threeten.bp.LocalDate
import org.threeten.bp.LocalDateTime
import org.threeten.bp.ZoneOffset
import org.threeten.bp.ZonedDateTime

fun LocalDateTime.isCurrentYear(): Boolean = this.toLocalDate().year == LocalDate.now().year

fun LocalDateTime.isYesterday(): Boolean = this.toLocalDate().isEqual(LocalDate.now().minusDays(1L))

fun LocalDateTime.isToday(): Boolean = this.toLocalDate().isEqual(LocalDate.now())

fun LocalDateTime.isSameDay(date: LocalDateTime): Boolean = this.toLocalDate().isEqual(date.toLocalDate())

fun LocalDateTime.toTimestamp(): Long = ZonedDateTime.of(this, ZoneOffset.systemDefault())
    .withZoneSameInstant(ZoneOffset.UTC)
    .toInstant()
    .toEpochMilli()