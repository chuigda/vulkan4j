package club.doki7.stb.imageresize.enumtype;

import club.doki7.ffm.annotation.*;

public final class STBIR_Edge {
    public static final int CLAMP = 0x0;
    public static final int REFLECT = 0x1;
    public static final int WRAP = 0x2;
    public static final int ZERO = 0x3;

    public static String explain(@EnumType(STBIR_Edge.class) int value) {
        return switch (value) {
            case STBIR_Edge.CLAMP -> "STBIR_EDGE_CLAMP";
            case STBIR_Edge.REFLECT -> "STBIR_EDGE_REFLECT";
            case STBIR_Edge.WRAP -> "STBIR_EDGE_WRAP";
            case STBIR_Edge.ZERO -> "STBIR_EDGE_ZERO";
            default -> "UNKNOWN(" + value + ")";
        };
    }

    /// Constructing this class is nonsense so the constructor is made private.
    private STBIR_Edge() {}
}
