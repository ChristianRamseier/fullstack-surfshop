package com.surfshop.common.info

class StringSerializationInfo<T>(
        val clazz: Class<T>,
        val serializerFunction: (T) -> String,
        val deserializationFunction: (String) -> T
) {
}
