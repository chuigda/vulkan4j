package club.doki7.shaderc;

import java.lang.foreign.*;
import club.doki7.ffm.NativeLayout;
import club.doki7.shaderc.datatype.*;

public final class ShadercFunctionTypes {
    public static final FunctionDescriptor shaderc_include_resolve_fn = FunctionDescriptor.of(
        ValueLayout.ADDRESS.withTargetLayout(ShadercIncludeResult.LAYOUT),
        ValueLayout.ADDRESS,
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_BYTE),
        ValueLayout.JAVA_INT,
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_BYTE),
        NativeLayout.C_SIZE_T
    );

    public static final FunctionDescriptor shaderc_include_result_release_fn = FunctionDescriptor.ofVoid(
        ValueLayout.ADDRESS,
        ValueLayout.ADDRESS.withTargetLayout(ShadercIncludeResult.LAYOUT)
    );

    /// Constructing this class is nonsense so the constructor is made private.
    private ShadercFunctionTypes() {}
}
