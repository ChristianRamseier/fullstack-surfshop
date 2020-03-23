package com.surfshop.deserializer

import com.fasterxml.jackson.core.JsonParser
import com.fasterxml.jackson.databind.DeserializationContext
import com.fasterxml.jackson.databind.deser.std.StdDeserializer

class CustomLongDeserializer<T>(typeClass: Class<T>, private val deserializerFunction: (Long) -> T) : StdDeserializer<T>(typeClass) {

    override fun deserialize(p: JsonParser, ctxt: DeserializationContext): T? {
        val long: String? = p.getValueAsString(null)
        if (long == null) {
            return null
        }
        return deserializerFunction.invoke(long.toLong())
    }
}
