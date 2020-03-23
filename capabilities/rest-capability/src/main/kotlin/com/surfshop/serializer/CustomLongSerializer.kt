package com.surfshop.serializer

import com.fasterxml.jackson.core.JsonGenerator
import com.fasterxml.jackson.databind.SerializerProvider
import com.fasterxml.jackson.databind.ser.std.StdSerializer

class CustomLongSerializer<T>(typeClass: Class<T>, private val serializerFunction: (T) -> Long) : StdSerializer<T>(typeClass) {
    override fun serialize(value: T?, gen: JsonGenerator, provider: SerializerProvider?) {
        if (value == null) {
            gen.writeNull()
        } else {
            gen.writeNumber(serializerFunction.invoke(value))
        }
    }
}
