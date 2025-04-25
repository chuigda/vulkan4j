package tech.icey.creg.entity;

import tech.icey.xjbutil.container.Option;

public abstract sealed class Entity permits
        Bitflag,
        Bitmask,
        Constant,
        Enum,
        Function,
        FunctionTypedef,
        Member,
        OpaqueHandle,
        OpaqueTypedef,
        Param,
        Structure,
        Variant
{
    public final String name;

    protected Entity(String name) {
        this.name = name;
    }

    public final <T> void setExtra(T extra) {
        assert this.extra.isNone();
        this.extra = Option.some(extra);
    }

    public final <T> T getExtra() {
        if (extra.isNone()) {
            throw new IllegalStateException("Entity::extra is not set");
        }

        //noinspection unchecked
        return (T) extra.get();
    }

    private Option<Object> extra = Option.none();
}
