package tech.icey.creg.entity;

import tech.icey.creg.type.Type;

public final class Param extends Entity {
    public final Type type;
    public final boolean optional;

    public Param(String name, Type type, boolean optional) {
        super(name);
        this.type = type;
        this.optional = optional;
    }

    public Param(String name, Type type) {
        this(name, type, false);
    }
}
