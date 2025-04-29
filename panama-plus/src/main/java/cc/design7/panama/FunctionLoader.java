package cc.design7.panama;

import java.lang.foreign.FunctionDescriptor;
import java.lang.invoke.MethodHandle;

@FunctionalInterface
public interface FunctionLoader {
    MethodHandle apply(String name, FunctionDescriptor descriptor);
}
