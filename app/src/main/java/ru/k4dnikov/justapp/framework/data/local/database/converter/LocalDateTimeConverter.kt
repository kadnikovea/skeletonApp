package ru.k4dnikov.justapp.framework.data.local.database.converter

import androidx.room.TypeConverter
import org.threeten.bp.LocalDateTime
import ru.k4dnikov.justapp.common.utils.toLocalDateTime
import ru.k4dnikov.justapp.common.utils.toTimestamp

class LocalDateTimeConverter {

    @TypeConverter
    fun toLocalDateTime(value: Long) = value.toLocalDateTime()

    @TypeConverter
    fun fromLocalDateTime(value: LocalDateTime) = value.toTimestamp()
}