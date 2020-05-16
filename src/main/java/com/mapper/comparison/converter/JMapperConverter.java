package com.mapper.comparison.converter;

import com.googlecode.jmapper.JMapper;
import com.googlecode.jmapper.api.JMapperAPI;
import com.mapper.comparison.model.dto.ComplexRecord;
import com.mapper.comparison.model.dto.SimpleRecord;
import com.mapper.comparison.model.entity.ComplexEntity;
import com.mapper.comparison.model.entity.SimpleEntity;

import static com.googlecode.jmapper.api.JMapperAPI.attribute;
import static com.googlecode.jmapper.api.JMapperAPI.mappedClass;

public class JMapperConverter implements Converter {

    @Override
    public SimpleRecord toRecord(SimpleEntity simpleEntity) {
        return new JMapper<>(SimpleRecord.class, SimpleEntity.class).getDestination(simpleEntity);
    }

    @Override
    public SimpleEntity toEntity(SimpleRecord simpleRecord) {
        return new JMapper<>(SimpleEntity.class, SimpleRecord.class).getDestination(simpleRecord);
    }

    @Override
    public ComplexRecord toRecord(ComplexEntity complexEntity) {
        JMapperAPI mapperAPI = new JMapperAPI()
                .add(mappedClass(ComplexRecord.class)
                        .add(attribute("id").value("id"))
                        .add(attribute("list").value("list"))
                        .add(attribute("simpleRecord").value("simple"))
                        .add(attribute("doubleValue").value("number"))
                        .add(attribute("name").value("name"))
                );
        return new JMapper<>(ComplexRecord.class, ComplexEntity.class, mapperAPI).getDestination(complexEntity);
    }

    @Override
    public ComplexEntity toEntity(ComplexRecord complexRecord) {
        JMapperAPI mapperAPI = new JMapperAPI()
                .add(mappedClass(ComplexEntity.class)
                        .add(attribute("id").value("id"))
                        .add(attribute("list").value("list"))
                        .add(attribute("simple").value("simpleRecord"))
                        .add(attribute("number").value("doubleValue"))
                        .add(attribute("name").value("name"))
                );
        return new JMapper<>(ComplexEntity.class, ComplexRecord.class, mapperAPI).getDestination(complexRecord);
    }
}
