package com.example.battleship.game;

import java.util.Objects;

public class Field {
    private String position;

    public Field(String position) {
        this.position = position;
    }

    public String getPosition() {
        return position;
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

