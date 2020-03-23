package com.surfshop.database.converters

import com.surfshop.common.CustomerId
import javax.persistence.AttributeConverter
import javax.persistence.Converter

@Converter(autoApply = true)
class CustomerIdConverter: AttributeConverter<CustomerId, Long> {

    override fun convertToDatabaseColumn(attribute: CustomerId?): Long? {
        return attribute?.id
    }

    override fun convertToEntityAttribute(dbData: Long?): CustomerId? {
        if (dbData != null) {
            return CustomerId(dbData)
        }
        return null
    }

}
