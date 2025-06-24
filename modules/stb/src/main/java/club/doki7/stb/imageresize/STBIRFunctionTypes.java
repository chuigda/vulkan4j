package club.doki7.stb.imageresize;

import java.lang.foreign.*;
import club.doki7.ffm.NativeLayout;
import club.doki7.stb.imageresize.datatype.*;

public final class STBIRFunctionTypes {
    public static final FunctionDescriptor stbir__kernel_callback = FunctionDescriptor.of(
        ValueLayout.JAVA_FLOAT,
        ValueLayout.JAVA_FLOAT,
        ValueLayout.JAVA_FLOAT,
        ValueLayout.ADDRESS
    );

    public static final FunctionDescriptor stbir__support_callback = FunctionDescriptor.of(
        ValueLayout.JAVA_FLOAT,
        ValueLayout.JAVA_FLOAT,
        ValueLayout.ADDRESS
    );

    public static final FunctionDescriptor stbir_input_callback = FunctionDescriptor.of(
        ValueLayout.ADDRESS,
        ValueLayout.ADDRESS,
        ValueLayout.ADDRESS,
        ValueLayout.JAVA_INT,
        ValueLayout.JAVA_INT,
        ValueLayout.JAVA_INT,
        ValueLayout.ADDRESS
    );

    public static final FunctionDescriptor stbir_output_callback = FunctionDescriptor.ofVoid(
        ValueLayout.ADDRESS,
        ValueLayout.JAVA_INT,
        ValueLayout.JAVA_INT,
        ValueLayout.ADDRESS
    );

    /// Constructing this class is nonsense so the constructor is made private.
    private STBIRFunctionTypes() {}
}
