package club.doki7.stb;

import club.doki7.ffm.RawFunctionLoader;

import java.lang.foreign.*;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.Objects;

public final class STBJavaTraceUtil {
    public static void trace() {
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        System.err.println("JVM stack trace:");
        for (StackTraceElement stackTraceElement : stackTrace) {
            System.err.println("\t" + stackTraceElement);
        }
    }

    public static void enableJavaTraceForSTB(RawFunctionLoader loader) {
        MemorySegment vk4jSetJavaTraceSegment = loader.load("vk4jSetSTBJavaTrace");
        if (vk4jSetJavaTraceSegment.equals(MemorySegment.NULL)) {
            System.err.println("warn: enableJavaTraceForSTB: vk4jSetSTBJavaTrace not found");
            System.err.println("note: obviously you're not using a STB build supporting Java trace");
            System.err.println("note: checkout vulkan4j/stb/stb_build to see how to enable Java trace");
            return;
        }

        FunctionDescriptor descriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS);
        MethodHandle handle = Objects.requireNonNull(RawFunctionLoader.link(vk4jSetJavaTraceSegment, descriptor));

        try {
            handle.invoke(PTRACE);
        } catch (Throwable e) {
            System.err.println("error: failed invoking vk4jSetJavaTrace, please open an issue");
        }
    }

    public static final MemorySegment PTRACE;
    static {
        try {
            FunctionDescriptor descriptor = FunctionDescriptor.ofVoid();
            MethodHandle handle = MethodHandles
                    .lookup()
                    .findStatic(STBJavaTraceUtil.class, "trace", descriptor.toMethodType());
            PTRACE = Linker.nativeLinker().upcallStub(handle, descriptor, Arena.global());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    private STBJavaTraceUtil() {}
}
