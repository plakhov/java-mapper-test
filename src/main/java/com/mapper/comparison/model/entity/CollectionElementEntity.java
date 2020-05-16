package com.mapper.comparison.model.entity;

import com.googlecode.jmapper.annotations.JMap;

import java.util.Objects;

public class CollectionElementEntity {

    @JMap("name")
    private String name;
    @JMap("value")
    private SimpleEntity entity;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public SimpleEntity getEntity() {
        return entity;
    }

    public void setEntity(SimpleEntity entity) {
        this.entity = entity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CollectionElementEntity entity1 = (CollectionElementEntity) o;
        return Objects.equals(name, entity1.name) &&
                Objects.equals(entity, entity1.entity);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, entity);
    }
}
