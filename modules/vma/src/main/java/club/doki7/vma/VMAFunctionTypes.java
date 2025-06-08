package club.doki7.vma;

import java.lang.foreign.*;

public final class VMAFunctionTypes {
    public static final FunctionDescriptor PFN_vmaAllocateDeviceMemoryFunction = FunctionDescriptor.ofVoid(
        ValueLayout.ADDRESS,
        ValueLayout.JAVA_INT,
        ValueLayout.ADDRESS,
        ValueLayout.JAVA_LONG,
        ValueLayout.ADDRESS
    );

    public static final FunctionDescriptor PFN_vmaCheckDefragmentationBreakFunction = FunctionDescriptor.of(
        ValueLayout.JAVA_INT,
        ValueLayout.ADDRESS
    );

    public static final FunctionDescriptor PFN_vmaFreeDeviceMemoryFunction = FunctionDescriptor.ofVoid(
        ValueLayout.ADDRESS,
        ValueLayout.JAVA_INT,
        ValueLayout.ADDRESS,
        ValueLayout.JAVA_LONG,
        ValueLayout.ADDRESS
    );

    /// Constructing this class is nonsense so the constructor is made private.
    private VMAFunctionTypes() {}
}
