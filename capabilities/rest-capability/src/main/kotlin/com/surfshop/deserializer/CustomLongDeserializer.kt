package com.surfshop.deserializer

import com.fasterxml.jackson.core.JsonParser
import com.fasterxml.jackson.databind.DeserializationContext
import com.fasterxml.jackson.databind.deser.std.StdDeserializer

class CustomLongDeserializer<T>(typeClass: Class<T>, private val deserializerFunction: (Long) -> T) : StdDeserializer<T>(typeClass) {

    override fun deserialize(p: JsonParser, ctxt: DeserializationContext): T? {
        val double = p.valueAsLong
        if (double == null) {
            return null
        }
        return deserializerFunction.invoke(double)
    }
}
