package ru.k4dnikov.justapp.framework.data.remote.retrofit.converter

import com.google.gson.*
import org.threeten.bp.*
import ru.k4dnikov.justapp.common.utils.toLocalDate
import ru.k4dnikov.justapp.common.utils.toTimestamp
import java.lang.reflect.Type

class LocalDateConverter : JsonSerializer<LocalDate>, JsonDeserializer<LocalDate> {

    override fun serialize(src: LocalDate?, typeOfSrc: Type, context: JsonSerializationContext): JsonElement =
        src?.let { JsonPrimitive(it.toTimestamp()) } ?: JsonNull.INSTANCE

    override fun deserialize(json: JsonElement, typeOfT: Type, context: JsonDeserializationContext): LocalDate? =
        json.asLong.toLocalDate()
}