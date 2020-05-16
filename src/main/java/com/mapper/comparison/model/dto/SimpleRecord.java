package com.mapper.comparison.model.dto;

import com.googlecode.jmapper.annotations.JMap;

import java.util.Objects;

public class SimpleRecord {
    @JMap("booleanValue")
    private boolean success;
    @JMap("character")
    private char character;
    @JMap("byteValue")
    private byte byteNumber;
    @JMap("shortValue")
    private short shortNumber;
    @JMap("integer")
    private int intNumber;
    @JMap("longNumber")
    private long longNumber;
    @JMap("floatNumber")
    private float floatNumber;
    @JMap("doubleNumber")
    private double doubleNumber;
    @JMap("string")
    private String string;

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public char getCharacter() {
        return character;
    }

    public void setCharacter(char character) {
        this.character = character;
    }

    public byte getByteNumber() {
        return byteNumber;
    }

    public void setByteNumber(byte byteNumber) {
        this.byteNumber = byteNumber;
    }

    public short getShortNumber() {
        return shortNumber;
    }

    public void setShortNumber(short shortNumber) {
        this.shortNumber = shortNumber;
    }

    public int getIntNumber() {
        return intNumber;
    }

    public void setIntNumber(int intNumber) {
        this.intNumber = intNumber;
    }

    public long getLongNumber() {
        return longNumber;
    }

    public void setLongNumber(long longNumber) {
        this.longNumber = longNumber;
    }

    public float getFloatNumber() {
        return floatNumber;
    }

    public void setFloatNumber(float floatNumber) {
        this.floatNumber = floatNumber;
    }

    public double getDoubleNumber() {
        return doubleNumber;
    }

    public void setDoubleNumber(double doubleNumber) {
        this.doubleNumber = doubleNumber;
    }

    public String getString() {
        return string;
    }

    public void setString(String string) {
        this.string = string;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SimpleRecord that = (SimpleRecord) o;
        return success == that.success &&
                character == that.character &&
                byteNumber == that.byteNumber &&
                shortNumber == that.shortNumber &&
                intNumber == that.intNumber &&
                longNumber == that.longNumber &&
                Float.compare(that.floatNumber, floatNumber) == 0 &&
                Double.compare(that.doubleNumber, doubleNumber) == 0 &&
                string.equals(that.string);
    }

    @Override
    public int hashCode() {
        return Objects.hash(success, character, byteNumber, shortNumber, intNumber, longNumber, floatNumber, doubleNumber, string);
    }
}
