package com.surfshop.common.info

class LongSerializationInfo<T>(
        val clazz: Class<T>,
        val serializerFunction: (T) -> Long,
        val deserializationFunction: (Long) -> T
) {
}
