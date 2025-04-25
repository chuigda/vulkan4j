package tech.icey.creg.entity;

import tech.icey.creg.type.Type;

import java.util.List;

public final class FunctionTypedef extends Entity {
    public final List<Param> paramList;
    public final Type retType;

    public FunctionTypedef(String name, List<Param> paramList, Type retType) {
        super(name);
        this.paramList = paramList;
        this.retType = retType;
    }
}
