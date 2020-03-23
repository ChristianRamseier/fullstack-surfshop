package com.surfshop.deserializer

import com.fasterxml.jackson.core.JsonParser
import com.fasterxml.jackson.databind.DeserializationContext
import com.fasterxml.jackson.databind.deser.std.StdDeserializer

class CustomDoubleDeserializer<T>(typeClass: Class<T>, private val deserializerFunction: (Double) -> T) : StdDeserializer<T>(typeClass) {

    override fun deserialize(p: JsonParser, ctxt: DeserializationContext): T? {
        val double: String? = p.getValueAsString(null)
        if (double == null) {
            return null
        }
        return deserializerFunction.invoke(double.toDouble())
    }
}
