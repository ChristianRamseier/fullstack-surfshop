package com.surfshop.database.converters

import com.surfshop.common.BoardId
import javax.persistence.AttributeConverter
import javax.persistence.Converter

@Converter(autoApply = true)
class BoardIdConverter: AttributeConverter<BoardId, Long> {

    override fun convertToDatabaseColumn(attribute: BoardId?): Long? {
        return attribute?.id
    }

    override fun convertToEntityAttribute(dbData: Long?): BoardId? {
        if (dbData != null) {
            return BoardId(dbData)
        }
        return null
    }

}
