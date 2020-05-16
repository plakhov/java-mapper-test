package com.mapper.comparison.converter;

import com.mapper.comparison.model.dto.CollectionElementRecord;
import com.mapper.comparison.model.dto.ComplexRecord;
import com.mapper.comparison.model.dto.SimpleRecord;
import com.mapper.comparison.model.entity.CollectionElementEntity;
import com.mapper.comparison.model.entity.ComplexEntity;
import com.mapper.comparison.model.entity.SimpleEntity;
import org.modelmapper.ModelMapper;

public class ModelMapperConverter implements Converter {

    private final ModelMapper modelMapper;

    public ModelMapperConverter() {
        modelMapper = new ModelMapper();
        modelMapper.createTypeMap(SimpleEntity.class, SimpleRecord.class)
                .addMapping(SimpleEntity::getBooleanValue, SimpleRecord::setSuccess)
                .addMapping(SimpleEntity::getByteValue, SimpleRecord::setByteNumber)
                .addMapping(SimpleEntity::getShortValue, SimpleRecord::setShortNumber)
                .addMapping(SimpleEntity::getInteger, SimpleRecord::setIntNumber);

        modelMapper.createTypeMap(SimpleRecord.class, SimpleEntity.class)
                .addMapping(SimpleRecord::isSuccess, SimpleEntity::setBooleanValue)
                .addMapping(SimpleRecord::getByteNumber, SimpleEntity::setByteValue)
                .addMapping(SimpleRecord::getShortNumber, SimpleEntity::setShortValue)
                .addMapping(SimpleRecord::getIntNumber, SimpleEntity::setInteger);

        modelMapper.createTypeMap(ComplexEntity.class, ComplexRecord.class)
                .addMapping(ComplexEntity::getSimple, ComplexRecord::setSimpleRecord)
                .addMapping(ComplexEntity::getNumber, ComplexRecord::setDoubleValue);

        modelMapper.createTypeMap(ComplexRecord.class, ComplexEntity.class)
                .addMapping(ComplexRecord::getSimpleRecord, ComplexEntity::setSimple)
                .addMapping(ComplexRecord::getDoubleValue, ComplexEntity::setNumber);

        modelMapper.createTypeMap(CollectionElementEntity.class, CollectionElementRecord.class)
                .addMapping(CollectionElementEntity::getEntity, CollectionElementRecord::setValue);

        modelMapper.createTypeMap(CollectionElementRecord.class, CollectionElementEntity.class)
                .addMapping(CollectionElementRecord::getValue, CollectionElementEntity::setEntity);
    }

    @Override
    public SimpleRecord toRecord(SimpleEntity simpleEntity) {
        return modelMapper.map(simpleEntity, SimpleRecord.class);
    }

    @Override
    public SimpleEntity toEntity(SimpleRecord simpleRecord) {
        return modelMapper.map(simpleRecord, SimpleEntity.class);
    }

    @Override
    public ComplexRecord toRecord(ComplexEntity complexEntity) {
        return modelMapper.map(complexEntity, ComplexRecord.class);
    }

    @Override
    public ComplexEntity toEntity(ComplexRecord complexRecord) {
        return modelMapper.map(complexRecord, ComplexEntity.class);
    }
}
