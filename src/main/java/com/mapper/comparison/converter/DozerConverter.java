package com.mapper.comparison.converter;

import com.github.dozermapper.core.DozerBeanMapper;
import com.github.dozermapper.core.DozerBeanMapperBuilder;
import com.github.dozermapper.core.Mapper;
import com.github.dozermapper.core.MappingProcessor;
import com.mapper.comparison.model.dto.ComplexRecord;
import com.mapper.comparison.model.dto.SimpleRecord;
import com.mapper.comparison.model.entity.ComplexEntity;
import com.mapper.comparison.model.entity.SimpleEntity;

public class DozerConverter implements Converter {

    private final Mapper mapper;

    public DozerConverter() {
        Mapper mapper = DozerBeanMapperBuilder.buildDefault();
        this.mapper = mapper;
    }

    @Override
    public SimpleRecord toRecord(SimpleEntity simpleEntity) {
        return mapper.map(simpleEntity, SimpleRecord.class);
    }

    @Override
    public SimpleEntity toEntity(SimpleRecord simpleRecord) {
        return mapper.map(simpleRecord, SimpleEntity.class);
    }

    @Override
    public ComplexRecord toRecord(ComplexEntity complexEntity) {
        return mapper.map(complexEntity, ComplexRecord.class);
    }

    @Override
    public ComplexEntity toEntity(ComplexRecord complexRecord) {
        return mapper.map(complexRecord, ComplexEntity.class);
    }
}
