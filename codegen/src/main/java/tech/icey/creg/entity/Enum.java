package tech.icey.creg.entity;

import java.util.List;

public final class Enum extends Entity {
    public final List<Variant> variantList;

    public Enum(String name, List<Variant> variantList) {
        super(name);
        this.variantList = variantList;
    }
}
