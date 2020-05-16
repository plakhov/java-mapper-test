package com.mapper.comparison.model.entity;

import java.util.List;
import java.util.Objects;

public class ComplexEntity {

    private long id;
    private List<CollectionElementEntity> list;
    private SimpleEntity simple;
    private double number;
    private String name;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public List<CollectionElementEntity> getList() {
        return list;
    }

    public void setList(List<CollectionElementEntity> list) {
        this.list = list;
    }

    public SimpleEntity getSimple() {
        return simple;
    }

    public void setSimple(SimpleEntity simple) {
        this.simple = simple;
    }

    public double getNumber() {
        return number;
    }

    public void setNumber(double number) {
        this.number = number;
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
        ComplexEntity that = (ComplexEntity) o;
        return id == that.id &&
                Double.compare(that.number, number) == 0 &&
                list.equals(that.list) &&
                simple.equals(that.simple) &&
                name.equals(that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, list, simple, number, name);
    }
}
