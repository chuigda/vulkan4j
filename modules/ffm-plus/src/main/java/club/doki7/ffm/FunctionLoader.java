package club.doki7.ffm;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.lang.foreign.FunctionDescriptor;
import java.lang.invoke.MethodHandle;

@FunctionalInterface
public interface FunctionLoader {
    @Nullable MethodHandle apply(
            @NotNull String name,
            @NotNull FunctionDescriptor descriptor
    );
}
