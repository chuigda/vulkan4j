package tech.icey.creg.entity;

public final class Variant extends Entity {
    public final String value;

    public Variant(String name, String value) {
        super(name);
        this.value = value;
    }
}
