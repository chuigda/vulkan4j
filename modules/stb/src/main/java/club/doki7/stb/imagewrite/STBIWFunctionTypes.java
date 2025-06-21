package club.doki7.stb.imagewrite;

import java.lang.foreign.*;
import club.doki7.ffm.NativeLayout;

public final class STBIWFunctionTypes {
    public static final FunctionDescriptor stbi_write_func = FunctionDescriptor.ofVoid(
        ValueLayout.ADDRESS,
        ValueLayout.ADDRESS,
        ValueLayout.JAVA_INT
    );

    /// Constructing this class is nonsense so the constructor is made private.
    private STBIWFunctionTypes() {}
}
