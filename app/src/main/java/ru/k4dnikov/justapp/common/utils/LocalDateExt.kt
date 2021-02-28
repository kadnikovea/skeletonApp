package ru.k4dnikov.justapp.common.utils

import org.threeten.bp.*

fun LocalDate.isCurrentYear(): Boolean = this.year == LocalDate.now().year

fun LocalDate.isYesterday(): Boolean = this.isEqual(LocalDate.now().minusDays(1L))

fun LocalDate.isToday(): Boolean = this.isEqual(LocalDate.now())

fun LocalDate.isSameDay(date: LocalDateTime): Boolean = this.isEqual(date.toLocalDate())

fun LocalDate.toTimestamp(): Long = ZonedDateTime.of(this, LocalTime.now(), ZoneOffset.systemDefault())
    .withZoneSameInstant(ZoneOffset.UTC)
    .toInstant()
    .toEpochMilli()