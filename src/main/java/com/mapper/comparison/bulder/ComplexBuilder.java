package com.mapper.comparison.bulder;

import com.github.javafaker.Faker;
import com.mapper.comparison.model.dto.CollectionElementRecord;
import com.mapper.comparison.model.dto.ComplexRecord;
import com.mapper.comparison.model.entity.CollectionElementEntity;
import com.mapper.comparison.model.entity.ComplexEntity;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public final class ComplexBuilder {

    private final Faker faker;
    private final SimpleBuilder simpleBuilder;
    private final CollectionElementBuilder collectionElementBuilder;

    public ComplexBuilder(Faker faker, SimpleBuilder simpleBuilder) {
        this.faker = faker;
        this.simpleBuilder = simpleBuilder;
        collectionElementBuilder = new CollectionElementBuilder();
    }

    public ComplexRecord buildRecord(){
        ComplexRecord complexRecord = new ComplexRecord();
        complexRecord.setName(faker.name().name());
        complexRecord.setId(faker.number().randomNumber());
        complexRecord.setDoubleValue(new Random().nextDouble());
        complexRecord.setSimpleRecord(simpleBuilder.buildRecord());
        int size = faker.number().numberBetween(10000, 20000);
        List<CollectionElementRecord> records = new ArrayList<>(size);
        for (int i = 0; i < size; i++) {
            records.add(collectionElementBuilder.buildRecord());
        }
        complexRecord.setList(records);
        return complexRecord;
    }

    public ComplexEntity buildEntity(){
        ComplexEntity entity = new ComplexEntity();
        entity.setName(faker.name().name());
        entity.setId(faker.number().randomNumber());
        entity.setNumber(new Random().nextDouble());
        entity.setSimple(simpleBuilder.buildEntity());
        int size = faker.number().numberBetween(10000, 20000);
        List<CollectionElementEntity> records = new ArrayList<>(size);
        for (int i = 0; i < size; i++) {
            records.add(collectionElementBuilder.buildEntity());
        }
        entity.setList(records);
        return entity;
    }

    private final class CollectionElementBuilder{
        public CollectionElementRecord buildRecord(){
            CollectionElementRecord record = new CollectionElementRecord();
            record.setName(faker.name().name());
            record.setValue(simpleBuilder.buildRecord());
            return record;
        }

        public CollectionElementEntity buildEntity(){
            CollectionElementEntity entity = new CollectionElementEntity();
            entity.setName(faker.name().name());
            entity.setEntity(simpleBuilder.buildEntity());
            return entity;
        }
    }
}
