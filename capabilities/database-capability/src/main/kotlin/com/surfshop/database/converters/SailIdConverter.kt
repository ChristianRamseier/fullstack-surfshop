package com.surfshop.database.converters

import com.surfshop.common.SailId
import javax.persistence.AttributeConverter
import javax.persistence.Converter

@Converter(autoApply = true)
class SailIdConverter: AttributeConverter<SailId, Long> {

    override fun convertToDatabaseColumn(attribute: SailId?): Long? {
        return attribute?.id
    }

    override fun convertToEntityAttribute(dbData: Long?): SailId? {
        if (dbData != null) {
            return SailId(dbData)
        }
        return null
    }

}
