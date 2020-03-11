package com.surfshop.common

import com.surfshop.common.info.DoubleSerializationInfo
import com.surfshop.common.info.LongSerializationInfo
import com.surfshop.common.info.StringSerializationInfo

class CommonDomainSerialization {

    companion object {
        val stringSerializationInfo: List<StringSerializationInfo<Any>> = listOf(
                StringSerializationInfo(CustomerId::class.java, CustomerId::toString, ::CustomerId),
                StringSerializationInfo(RigId::class.java, RigId::toString, ::RigId)
        ) as List<StringSerializationInfo<Any>>
        val doubleSerializationInfo: List<DoubleSerializationInfo<Any>> = listOf(
            DoubleSerializationInfo(Meters::class.java, Meters::meters, ::Meters)
        ) as List<DoubleSerializationInfo<Any>>
        val longSerializationInfo: List<LongSerializationInfo<Any>> = listOf(
                LongSerializationInfo(Speed::class.java, Speed::beaufort, ::Speed)
        ) as List<LongSerializationInfo<Any>>
    }
}
