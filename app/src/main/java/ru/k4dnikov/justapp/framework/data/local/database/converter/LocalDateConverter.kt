package ru.k4dnikov.justapp.framework.data.local.database.converter

import androidx.room.TypeConverter
import org.threeten.bp.LocalDate
import ru.k4dnikov.justapp.common.utils.toLocalDate
import ru.k4dnikov.justapp.common.utils.toTimestamp

class LocalDateConverter {

    @TypeConverter
    fun toLocalDate(value: Long) = value.toLocalDate()

    @TypeConverter
    fun fromLocalDate(value: LocalDate) = value.toTimestamp()
}