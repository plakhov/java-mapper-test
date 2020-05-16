package com.mapper.comparison.bulder;

import com.github.javafaker.Faker;
import com.mapper.comparison.model.dto.SimpleRecord;
import com.mapper.comparison.model.entity.SimpleEntity;

import java.util.Random;

public final class SimpleBuilder {

    private final Faker faker;

    public SimpleBuilder(Faker faker) {
        this.faker = faker;
    }

    public SimpleRecord buildRecord() {
        SimpleRecord simpleRecord = new SimpleRecord();

        simpleRecord.setByteNumber((byte) faker.number().numberBetween(Byte.MIN_VALUE, Byte.MAX_VALUE));
        simpleRecord.setShortNumber((short) faker.number().numberBetween(Short.MIN_VALUE, Short.MAX_VALUE));
        simpleRecord.setIntNumber(faker.number().numberBetween(Integer.MIN_VALUE, Integer.MAX_VALUE));
        simpleRecord.setLongNumber(faker.number().numberBetween(Long.MIN_VALUE, Long.MAX_VALUE));

        simpleRecord.setFloatNumber(new Random().nextFloat());
        simpleRecord.setDoubleNumber(new Random().nextDouble());

        simpleRecord.setCharacter((char) faker.number().numberBetween(Character.MIN_VALUE, Character.MAX_VALUE));
        simpleRecord.setString(faker.gameOfThrones().quote());

        simpleRecord.setSuccess(faker.bool().bool());

        return simpleRecord;
    }

    public SimpleEntity buildEntity() {
        SimpleEntity simpleEntity = new SimpleEntity();

        simpleEntity.setByteValue((byte) faker.number().numberBetween(Byte.MIN_VALUE, Byte.MAX_VALUE));
        simpleEntity.setShortValue((short) faker.number().numberBetween(Short.MIN_VALUE, Short.MAX_VALUE));
        simpleEntity.setInteger(faker.number().numberBetween(Integer.MIN_VALUE, Integer.MAX_VALUE));
        simpleEntity.setLongNumber(faker.number().numberBetween(Long.MIN_VALUE, Long.MAX_VALUE));

        simpleEntity.setFloatNumber(new Random().nextFloat());
        simpleEntity.setDoubleNumber(new Random().nextDouble());

        simpleEntity.setCharacter((char) faker.number().numberBetween(Character.MIN_VALUE, Character.MAX_VALUE));
        simpleEntity.setString(faker.gameOfThrones().quote());

        simpleEntity.setBooleanValue(faker.bool().bool());

        return simpleEntity;
    }
}
