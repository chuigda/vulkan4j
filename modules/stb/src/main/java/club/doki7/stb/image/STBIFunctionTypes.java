package club.doki7.stb.image;

import java.lang.foreign.*;
import club.doki7.ffm.NativeLayout;
import club.doki7.stb.image.datatype.*;

public final class STBIFunctionTypes {
    public static final FunctionDescriptor PFN_stbi_io_callbacks_eof = FunctionDescriptor.of(
        ValueLayout.JAVA_INT,
        ValueLayout.ADDRESS
    );

    public static final FunctionDescriptor PFN_stbi_io_callbacks_read = FunctionDescriptor.of(
        ValueLayout.JAVA_INT,
        ValueLayout.ADDRESS,
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_BYTE),
        ValueLayout.JAVA_INT
    );

    public static final FunctionDescriptor PFN_stbi_io_callbacks_skip = FunctionDescriptor.ofVoid(
        ValueLayout.ADDRESS,
        ValueLayout.JAVA_INT
    );

    /// Constructing this class is nonsense so the constructor is made private.
    private STBIFunctionTypes() {}
}
