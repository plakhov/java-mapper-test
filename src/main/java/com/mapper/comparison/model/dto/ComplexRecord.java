package com.mapper.comparison.model.dto;

import java.util.List;
import java.util.Objects;

public class ComplexRecord {

    private Long id;
    private List<CollectionElementRecord> list;
    private SimpleRecord simpleRecord;
    private Double doubleValue;
    private String name;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<CollectionElementRecord> getList() {
        return list;
    }

    public void setList(List<CollectionElementRecord> list) {
        this.list = list;
    }

    public SimpleRecord getSimpleRecord() {
        return simpleRecord;
    }

    public void setSimpleRecord(SimpleRecord simpleRecord) {
        this.simpleRecord = simpleRecord;
    }

    public Double getDoubleValue() {
        return doubleValue;
    }

    public void setDoubleValue(Double doubleValue) {
        this.doubleValue = doubleValue;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ComplexRecord that = (ComplexRecord) o;
        return id.equals(that.id) &&
                list.equals(that.list) &&
                simpleRecord.equals(that.simpleRecord) &&
                doubleValue.equals(that.doubleValue) &&
                name.equals(that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, list, simpleRecord, doubleValue, name);
    }
}
