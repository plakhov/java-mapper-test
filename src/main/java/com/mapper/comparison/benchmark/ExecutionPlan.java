package com.mapper.comparison.benchmark;

import com.github.javafaker.Faker;
import com.mapper.comparison.bulder.ComplexBuilder;
import com.mapper.comparison.bulder.SimpleBuilder;
import com.mapper.comparison.converter.*;
import com.mapper.comparison.model.dto.ComplexRecord;
import com.mapper.comparison.model.dto.SimpleRecord;
import com.mapper.comparison.model.entity.ComplexEntity;
import com.mapper.comparison.model.entity.SimpleEntity;
import org.openjdk.jmh.annotations.Scope;
import org.openjdk.jmh.annotations.State;

@State(Scope.Benchmark)
public class ExecutionPlan {
    SimpleBuilder simpleBuilder = new SimpleBuilder(Faker.instance());
    ComplexBuilder complexBuilder = new ComplexBuilder(Faker.instance(), simpleBuilder);
    public SimpleRecord simpleRecord = simpleBuilder.buildRecord();
    public ComplexRecord complexRecord = complexBuilder.buildRecord();
    public SimpleEntity simpleEntity = simpleBuilder.buildEntity();
    public ComplexEntity complexEntity = complexBuilder.buildEntity();

    public Converter mapStructConverter = MapStructConverter.CONVERTER;
    public Converter jmapperConverter = new JMapperConverter();
    public Converter dozerConverter = new DozerConverter();
    public Converter modelMapperConverter = new ModelMapperConverter();

}
