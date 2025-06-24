package club.doki7.openxr.enumtype;

import club.doki7.ffm.annotation.*;

/// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrSenseDataProviderStateBD.html"><code>XrSenseDataProviderStateBD</code></a>
public final class XrSenseDataProviderStateBD {
    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XR_SENSE_DATA_PROVIDER_STATE_INITIALIZED_BD.html"><code>XR_SENSE_DATA_PROVIDER_STATE_INITIALIZED_BD</code></a>
    public static final int INITIALIZED = 0x0;
    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XR_SENSE_DATA_PROVIDER_STATE_RUNNING_BD.html"><code>XR_SENSE_DATA_PROVIDER_STATE_RUNNING_BD</code></a>
    public static final int RUNNING = 0x1;
    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XR_SENSE_DATA_PROVIDER_STATE_STOPPED_BD.html"><code>XR_SENSE_DATA_PROVIDER_STATE_STOPPED_BD</code></a>
    public static final int STOPPED = 0x2;

    public static String explain(@EnumType(XrSenseDataProviderStateBD.class) int value) {
        return switch (value) {
            case XrSenseDataProviderStateBD.INITIALIZED -> "XR_SENSE_DATA_PROVIDER_STATE_INITIALIZED_BD";
            case XrSenseDataProviderStateBD.RUNNING -> "XR_SENSE_DATA_PROVIDER_STATE_RUNNING_BD";
            case XrSenseDataProviderStateBD.STOPPED -> "XR_SENSE_DATA_PROVIDER_STATE_STOPPED_BD";
            default -> "UNKNOWN(" + value + ")";
        };
    }

    /// Constructing this class is nonsense so the constructor is made private.
    private XrSenseDataProviderStateBD() {}
}
