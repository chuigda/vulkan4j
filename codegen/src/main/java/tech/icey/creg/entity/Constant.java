package tech.icey.creg.entity;

import tech.icey.creg.type.IdentifierType;
import tech.icey.xjbutil.container.Option;

public final class Constant extends Entity {
    public final String expr;
    public final Option<IdentifierType> type;

    public Constant(String name, String expr, IdentifierType type) {
        super(name);
        this.expr = expr;
        this.type = Option.some(type);
    }

    public Constant(String name, String expr) {
        super(name);
        this.expr = expr;
        this.type = Option.none();
    }
}
