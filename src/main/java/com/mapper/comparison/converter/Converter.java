package com.mapper.comparison.converter;

import com.mapper.comparison.model.dto.ComplexRecord;
import com.mapper.comparison.model.dto.SimpleRecord;
import com.mapper.comparison.model.entity.ComplexEntity;
import com.mapper.comparison.model.entity.SimpleEntity;

public interface Converter {

    SimpleRecord toRecord(SimpleEntity simpleEntity);
    SimpleEntity toEntity(SimpleRecord simpleRecord);

    ComplexRecord toRecord(ComplexEntity complexEntity);
    ComplexEntity toEntity(ComplexRecord complexRecord);

}
