package com.mapper.comparison.bulder;

import com.github.javafaker.Faker;

public abstract class Builders {
    public static SimpleBuilder simpleBuilder(){
        return new SimpleBuilder(Faker.instance());
    }
}
