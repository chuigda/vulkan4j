package club.doki7.openxr.enumtype;

import club.doki7.ffm.annotation.*;

/// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrWindingOrderFB.html"><code>XrWindingOrderFB</code></a>
public final class XrWindingOrderFB {
    public static final int UNKNOWN = 0x0;
    public static final int CW = 0x1;
    public static final int CCW = 0x2;

    public static String explain(@EnumType(XrWindingOrderFB.class) int value) {
        return switch (value) {
            case XrWindingOrderFB.CCW -> "XR_WINDING_ORDER_CCW_FB";
            case XrWindingOrderFB.CW -> "XR_WINDING_ORDER_CW_FB";
            case XrWindingOrderFB.UNKNOWN -> "XR_WINDING_ORDER_UNKNOWN_FB";
            default -> "UNKNOWN(" + value + ")";
        };
    }

    /// Constructing this class is nonsense so the constructor is made private.
    private XrWindingOrderFB() {}
}
