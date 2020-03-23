package com.surfshop.database.converters

import com.surfshop.common.ReservationId
import javax.persistence.AttributeConverter
import javax.persistence.Converter

@Converter(autoApply = true)
class ReservationIdConverter: AttributeConverter<ReservationId, Long> {

    override fun convertToDatabaseColumn(attribute: ReservationId?): Long? {
        return attribute?.id
    }

    override fun convertToEntityAttribute(dbData: Long?): ReservationId? {
        if (dbData != null) {
            return ReservationId(dbData)
        }
        return null
    }

}
