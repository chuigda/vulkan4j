package tech.icey.creg.entity;

public final class Bitflag extends Entity {
    public final String value;

    public Bitflag(String name, String value) {
        super(name);
        this.value = value;
    }
}
