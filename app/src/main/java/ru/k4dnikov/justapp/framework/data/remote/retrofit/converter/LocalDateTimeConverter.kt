package ru.k4dnikov.justapp.framework.data.remote.retrofit.converter

import com.google.gson.*
import org.threeten.bp.*
import ru.k4dnikov.justapp.common.utils.toLocalDateTime
import ru.k4dnikov.justapp.common.utils.toTimestamp
import java.lang.reflect.Type

class LocalDateTimeConverter : JsonSerializer<LocalDateTime>, JsonDeserializer<LocalDateTime> {

    override fun serialize(src: LocalDateTime?, typeOfSrc: Type?, context: JsonSerializationContext?): JsonElement =
        src?.let { JsonPrimitive(it.toTimestamp()) } ?: JsonNull.INSTANCE

    override fun deserialize(json: JsonElement, typeOfT: Type, context: JsonDeserializationContext): LocalDateTime? =
        json.asLong.toLocalDateTime()
}