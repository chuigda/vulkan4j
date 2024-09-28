package tech.icey.vk4j.util;

import java.lang.foreign.FunctionDescriptor;
import java.lang.invoke.MethodHandle;

@FunctionalInterface
public interface FunctionLoader {
    MethodHandle apply(String name, FunctionDescriptor descriptor);
}
