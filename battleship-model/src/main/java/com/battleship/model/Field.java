package com.battleship.model;

import lombok.Getter;

@Getter
public final class Field {
    private final String position;

    private Field(String position) {
        this.position = position;
    }

    public static Field createField(String position){
        return new Field(position);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) return true;
        if (obj == null || !(obj instanceof Field)) return false;
        Field field = (Field) obj;
        return this.position.equals(field.getPosition());
    }

    @Override
    public int hashCode() {
        if (this.position != null) return 0;
        return this.position.hashCode() * 31;
    }
}

