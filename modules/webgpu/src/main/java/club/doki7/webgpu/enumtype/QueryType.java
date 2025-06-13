package club.doki7.webgpu.enumtype;

import club.doki7.ffm.annotation.*;

public final class QueryType {
    public static final int QUERY_TYPE_OCCLUSION = 0x1;
    public static final int QUERY_TYPE_TIMESTAMP = 0x2;
    public static final int QUERY_TYPE_FORCE32 = 0x7fffffff;

    public static String explain(@EnumType(QueryType.class) int value) {
        return switch (value) {
            case QueryType.QUERY_TYPE_FORCE32 -> "QUERY_TYPE_FORCE32";
            case QueryType.QUERY_TYPE_OCCLUSION -> "QUERY_TYPE_OCCLUSION";
            case QueryType.QUERY_TYPE_TIMESTAMP -> "QUERY_TYPE_TIMESTAMP";
            default -> "UNKNOWN(" + value + ")";
        };
    }

    /// Constructing this class is nonsense so the constructor is made private.
    private QueryType() {}
}
