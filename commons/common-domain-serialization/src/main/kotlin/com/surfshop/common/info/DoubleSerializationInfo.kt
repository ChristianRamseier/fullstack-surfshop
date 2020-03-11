package com.surfshop.common.info

class DoubleSerializationInfo<T>(
        val clazz: Class<T>,
        val serializerFunction: (T) -> Double,
        val deserializationFunction: (Double) -> T
) {
}
