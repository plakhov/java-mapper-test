package com.mapper.comparison.model.dto;

import com.googlecode.jmapper.annotations.JMap;

import java.util.Objects;

public class CollectionElementRecord {

    @JMap("name")
    private String name;
    @JMap("entity")
    private SimpleRecord value;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public SimpleRecord getValue() {
        return value;
    }

    public void setValue(SimpleRecord value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CollectionElementRecord record = (CollectionElementRecord) o;
        return name.equals(record.name) &&
                value.equals(record.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, value);
    }
}
