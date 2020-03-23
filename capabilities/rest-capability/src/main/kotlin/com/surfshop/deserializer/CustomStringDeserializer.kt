package com.surfshop.deserializer

import com.fasterxml.jackson.core.JsonParser
import com.fasterxml.jackson.databind.DeserializationContext
import com.fasterxml.jackson.databind.deser.std.StdDeserializer

class CustomStringDeserializer<T>(typeClass: Class<T>, private val deserializerFunction: (String) -> T) : StdDeserializer<T>(typeClass) {

    override fun deserialize(p: JsonParser, ctxt: DeserializationContext): T? {
        val string: String? = p.getValueAsString(null)
        if (string == null) {
            return null
        }
        return deserializerFunction.invoke(string)
    }


}
