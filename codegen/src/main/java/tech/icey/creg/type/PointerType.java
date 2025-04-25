package tech.icey.creg.type;

public final class PointerType implements Type {
    public final Type pointee;
    public final boolean isConst;

    public PointerType(Type pointee, boolean isConst) {
        this.pointee = pointee;
        this.isConst = isConst;
    }
}
