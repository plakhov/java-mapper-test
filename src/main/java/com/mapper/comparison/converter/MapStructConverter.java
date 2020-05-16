package com.mapper.comparison.converter;

import com.mapper.comparison.model.dto.CollectionElementRecord;
import com.mapper.comparison.model.dto.ComplexRecord;
import com.mapper.comparison.model.dto.SimpleRecord;
import com.mapper.comparison.model.entity.CollectionElementEntity;
import com.mapper.comparison.model.entity.ComplexEntity;
import com.mapper.comparison.model.entity.SimpleEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface MapStructConverter extends Converter {

    MapStructConverter CONVERTER = Mappers.getMapper(MapStructConverter.class);

    @Mapping(target = "success", source = "booleanValue")
    @Mapping(target = "shortNumber", source = "shortValue")
    @Mapping(target = "intNumber", source = "integer")
    @Mapping(target = "byteNumber", source = "byteValue")
    @Override
    SimpleRecord toRecord(SimpleEntity simpleEntity);

    @Mapping(target = "integer", source = "intNumber")
    @Mapping(target = "shortValue", source = "shortNumber")
    @Mapping(target = "byteValue", source = "byteNumber")
    @Mapping(target = "booleanValue", source = "success")
    @Override
    SimpleEntity toEntity(SimpleRecord simpleRecord);

    @Mapping(target = "simpleRecord", source = "simple")
    @Mapping(target = "doubleValue", source = "number")
    @Override
    ComplexRecord toRecord(ComplexEntity complexEntity);

    @Mapping(target = "simple", source = "simpleRecord")
    @Mapping(target = "number", source = "doubleValue")
    @Override
    ComplexEntity toEntity(ComplexRecord complexRecord);

    @Mapping(target = "entity", source = "value")
    CollectionElementEntity toEntity(CollectionElementRecord collectionElementRecord);

    @Mapping(target = "value", source = "entity")
    CollectionElementRecord toRecord(CollectionElementEntity collectionElementEntity);
}
