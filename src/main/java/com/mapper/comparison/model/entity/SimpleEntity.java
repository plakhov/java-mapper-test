package com.mapper.comparison.model.entity;

import com.googlecode.jmapper.annotations.JMap;

import java.util.Objects;


public class SimpleEntity {
    @JMap("success")
    private Boolean booleanValue;
    @JMap("character")
    private Character character;
    @JMap("byteNumber")
    private Byte byteValue;
    @JMap("shortNumber")
    private Short shortValue;
    @JMap("intNumber")
    private Integer integer;
    @JMap("longNumber")
    private Long longNumber;
    @JMap("floatNumber")
    private Float floatNumber;
    @JMap("doubleNumber")
    private Double doubleNumber;
    @JMap("string")
    private String string;



    public Integer getInteger() {
        return integer;
    }

    public void setInteger(Integer integer) {
        this.integer = integer;
    }

    public Long getLongNumber() {
        return longNumber;
    }

    public void setLongNumber(Long longNumber) {
        this.longNumber = longNumber;
    }

    public Float getFloatNumber() {
        return floatNumber;
    }

    public void setFloatNumber(Float floatNumber) {
        this.floatNumber = floatNumber;
    }

    public Double getDoubleNumber() {
        return doubleNumber;
    }

    public void setDoubleNumber(Double doubleNumber) {
        this.doubleNumber = doubleNumber;
    }

    public String getString() {
        return string;
    }

    public void setString(String string) {
        this.string = string;
    }

    public Boolean getBooleanValue() {
        return booleanValue;
    }

    public void setBooleanValue(Boolean booleanValue) {
        this.booleanValue = booleanValue;
    }

    public Character getCharacter() {
        return character;
    }

    public void setCharacter(Character character) {
        this.character = character;
    }

    public Byte getByteValue() {
        return byteValue;
    }

    public void setByteValue(Byte byteValue) {
        this.byteValue = byteValue;
    }

    public Short getShortValue() {
        return shortValue;
    }

    public void setShortValue(Short shortValue) {
        this.shortValue = shortValue;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SimpleEntity that = (SimpleEntity) o;
        return booleanValue.equals(that.booleanValue) &&
                character.equals(that.character) &&
                byteValue.equals(that.byteValue) &&
                shortValue.equals(that.shortValue) &&
                integer.equals(that.integer) &&
                longNumber.equals(that.longNumber) &&
                floatNumber.equals(that.floatNumber) &&
                doubleNumber.equals(that.doubleNumber) &&
                string.equals(that.string);
    }

    @Override
    public int hashCode() {
        return Objects.hash(booleanValue, character, byteValue, shortValue, integer, longNumber, floatNumber, doubleNumber, string);
    }
}
