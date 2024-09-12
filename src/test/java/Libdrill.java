import tech.icey.vk4j.Loader;
import tech.icey.vk4j.datatype.Example;

import java.lang.foreign.FunctionDescriptor;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.ValueLayout;
import java.lang.invoke.MethodHandle;

public final class Libdrill {
    static {
        System.loadLibrary("drill");
    }

    private static final FunctionDescriptor DESCRIPTOR$dump_example = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS.withTargetLayout(Example.LAYOUT)
    );

    private static final FunctionDescriptor DESCRIPTOR$dump_int_array = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT),
            ValueLayout.JAVA_INT
    );

    public static final MethodHandle HANDLE$dump_example =
            Loader.loadFunction("dump_example", DESCRIPTOR$dump_example);
    public static final MethodHandle HANDLE$dump_int_array =
            Loader.loadFunction("dump_int_array", DESCRIPTOR$dump_int_array);

    public static void dump_example(Example example) {
        try {
            HANDLE$dump_example.invokeExact(example.segment());
        } catch (Throwable e) {
            throw new RuntimeException("Error dumping example, this position should be unreachable", e);
        }
    }

    public static void dump_int_array(MemorySegment array, int count) {
        try {
            HANDLE$dump_int_array.invokeExact(array, count);
        } catch (Throwable e) {
            throw new RuntimeException("Error dumping int array, this position should be unreachable", e);
        }
    }
}
