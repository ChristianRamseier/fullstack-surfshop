package com.surfshop.common

import com.surfshop.common.info.DoubleSerializationInfo
import com.surfshop.common.info.LongSerializationInfo
import com.surfshop.common.info.StringSerializationInfo

@Suppress("UNCHECKED_CAST")
class CommonDomainSerialization {

    companion object {
        val stringSerializationInfo: List<StringSerializationInfo<Any>> = listOf()
        val doubleSerializationInfo: List<DoubleSerializationInfo<Any>> = listOf(
            DoubleSerializationInfo(Meters::class.java, Meters::meters, ::Meters),
            DoubleSerializationInfo(Liters::class.java, Liters::liters, ::Liters),
            DoubleSerializationInfo(SquareMeters::class.java, SquareMeters::squareMeters, ::SquareMeters)
        ) as List<DoubleSerializationInfo<Any>>
        val longSerializationInfo: List<LongSerializationInfo<Any>> = listOf(
                LongSerializationInfo(Speed::class.java, Speed::beaufort, ::Speed),
                LongSerializationInfo(CustomerId::class.java, CustomerId::id, ::CustomerId),
                LongSerializationInfo(BoardId::class.java, BoardId::id, ::BoardId),
                LongSerializationInfo(SailId::class.java, SailId::id, ::SailId)
        ) as List<LongSerializationInfo<Any>>
    }
}
