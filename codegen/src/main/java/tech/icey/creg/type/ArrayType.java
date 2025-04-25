package tech.icey.creg.type;

public final class ArrayType implements Type {
    public final Type element;
    public final String length;

    public ArrayType(Type element, String length) {
        this.element = element;
        this.length = length;
    }
}
