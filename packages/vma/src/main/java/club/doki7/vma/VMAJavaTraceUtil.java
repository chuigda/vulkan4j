package club.doki7.vma;

import club.doki7.ffm.Loader;
import club.doki7.ffm.RawFunctionLoader;

import java.lang.foreign.*;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public final class VMAJavaTraceUtil {
    public static void trace() {
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        System.err.println("JVM stack trace:");
        for (StackTraceElement stackTraceElement : stackTrace) {
            System.err.println("\t" + stackTraceElement);
        }
    }

    public static void enableJavaTraceForVMA() {
        MemorySegment vk4jSetJavaTraceSegment = Loader.loadFunctionOrNull("vk4jSetJavaTrace");
        if (vk4jSetJavaTraceSegment == null || vk4jSetJavaTraceSegment.address() == 0) {
            System.err.println("warn: enableJavaTraceForVMA: vk4jSetJavaTrace not found");
            System.err.println("note: obviously you're not using a VMA build supporting Java trace");
            System.err.println("note: checkout vulkan4j/vma/vma_build to see how to enable Java trace");
            return;
        }

        FunctionDescriptor descriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS);
        MethodHandle handle = RawFunctionLoader.link(vk4jSetJavaTraceSegment, descriptor);

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
                    .findStatic(VMAJavaTraceUtil.class, "trace", descriptor.toMethodType());
            PTRACE = Linker.nativeLinker().upcallStub(handle, descriptor, Arena.global());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
