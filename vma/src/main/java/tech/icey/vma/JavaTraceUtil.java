package tech.icey.vma;

import java.lang.foreign.Arena;
import java.lang.foreign.FunctionDescriptor;
import java.lang.foreign.Linker;
import java.lang.foreign.MemorySegment;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public final class JavaTraceUtil {
    public static void trace() {
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        System.err.println("JVM stack trace:");
        for (StackTraceElement stackTraceElement : stackTrace) {
            System.err.println("\t" + stackTraceElement);
        }
    }

    public static final MemorySegment PTRACE;
    static {
        try {
            FunctionDescriptor descriptor = FunctionDescriptor.ofVoid();
            MethodHandle handle = MethodHandles
                    .lookup()
                    .findStatic(JavaTraceUtil.class, "trace", descriptor.toMethodType());
            PTRACE = Linker.nativeLinker().upcallStub(handle, descriptor, Arena.global());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
