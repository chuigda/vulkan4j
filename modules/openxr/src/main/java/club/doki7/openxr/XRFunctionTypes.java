package club.doki7.openxr;

import java.lang.foreign.*;
import java.lang.invoke.*;
import club.doki7.ffm.annotation.*;
import club.doki7.ffm.NativeLayout;
import org.jetbrains.annotations.NotNull;
import club.doki7.openxr.datatype.*;
import club.doki7.openxr.bitmask.*;
import club.doki7.openxr.enumtype.*;
import club.doki7.openxr.handle.*;
import club.doki7.vulkan.bitmask.*;
import club.doki7.vulkan.datatype.*;
import club.doki7.vulkan.enumtype.*;
import club.doki7.vulkan.handle.*;

public final class XRFunctionTypes {
    public static final FunctionDescriptor PFN_xrCreateApiLayerInstance = FunctionDescriptor.of(
        ValueLayout.JAVA_INT,
        ValueLayout.ADDRESS.withTargetLayout(XrInstanceCreateInfo.LAYOUT),
        ValueLayout.ADDRESS.withTargetLayout(XrApiLayerCreateInfo.LAYOUT),
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.ADDRESS)
    );

    public static final FunctionDescriptor PFN_xrDebugUtilsMessengerCallbackEXT = FunctionDescriptor.of(
        ValueLayout.JAVA_INT,
        ValueLayout.JAVA_LONG,
        ValueLayout.JAVA_LONG,
        ValueLayout.ADDRESS.withTargetLayout(XrDebugUtilsMessengerCallbackDataEXT.LAYOUT),
        ValueLayout.ADDRESS
    );

    public static final FunctionDescriptor PFN_xrEglGetProcAddressMNDX = FunctionDescriptor.of(
        ValueLayout.ADDRESS,
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_BYTE)
    );

    public static final FunctionDescriptor PFN_xrGetInstanceProcAddr = FunctionDescriptor.of(
        ValueLayout.JAVA_INT,
        ValueLayout.ADDRESS,
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_BYTE),
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.ADDRESS)
    );

    public static final FunctionDescriptor PFN_xrVoidFunction = FunctionDescriptor.ofVoid();

    @FunctionalInterface
    public interface IPFN_xrCreateApiLayerInstance {
        @EnumType(XrResult.class) int invoke(
            @Pointer(comment="void*") @NotNull MemorySegment p0,
            @Pointer(comment="void*") @NotNull MemorySegment p1,
            @Pointer(comment="void*") @NotNull MemorySegment p2
        );

        static MethodHandle of(@NotNull IPFN_xrCreateApiLayerInstance lambda) {
            try {
                return MethodHandles.lookup().findVirtual(IPFN_xrCreateApiLayerInstance.class, "invoke", PFN_xrCreateApiLayerInstance.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull IPFN_xrCreateApiLayerInstance lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull IPFN_xrCreateApiLayerInstance lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), PFN_xrCreateApiLayerInstance, arena);
        }
    }

    @FunctionalInterface
    public interface IPFN_xrDebugUtilsMessengerCallbackEXT {
        @NativeType("XrBool32") @Unsigned int invoke(
            @Bitmask(XrDebugUtilsMessageSeverityFlagsEXT.class) long p0,
            @Bitmask(XrDebugUtilsMessageTypeFlagsEXT.class) long p1,
            @Pointer(comment="void*") @NotNull MemorySegment p2,
            @Pointer(comment="void*") @NotNull MemorySegment p3
        );

        static MethodHandle of(@NotNull IPFN_xrDebugUtilsMessengerCallbackEXT lambda) {
            try {
                return MethodHandles.lookup().findVirtual(IPFN_xrDebugUtilsMessengerCallbackEXT.class, "invoke", PFN_xrDebugUtilsMessengerCallbackEXT.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull IPFN_xrDebugUtilsMessengerCallbackEXT lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull IPFN_xrDebugUtilsMessengerCallbackEXT lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), PFN_xrDebugUtilsMessengerCallbackEXT, arena);
        }
    }

    @FunctionalInterface
    public interface IPFN_xrEglGetProcAddressMNDX {
        @Pointer(comment="PFN_xrVoidFunction") @NotNull MemorySegment invoke(
            @Pointer(comment="void*") @NotNull MemorySegment p0
        );

        static MethodHandle of(@NotNull IPFN_xrEglGetProcAddressMNDX lambda) {
            try {
                return MethodHandles.lookup().findVirtual(IPFN_xrEglGetProcAddressMNDX.class, "invoke", PFN_xrEglGetProcAddressMNDX.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull IPFN_xrEglGetProcAddressMNDX lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull IPFN_xrEglGetProcAddressMNDX lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), PFN_xrEglGetProcAddressMNDX, arena);
        }
    }

    @FunctionalInterface
    public interface IPFN_xrGetInstanceProcAddr {
        @EnumType(XrResult.class) int invoke(
            @NativeType("XrInstance") MemorySegment p0,
            @Pointer(comment="void*") @NotNull MemorySegment p1,
            @Pointer(comment="void*") @NotNull MemorySegment p2
        );

        static MethodHandle of(@NotNull IPFN_xrGetInstanceProcAddr lambda) {
            try {
                return MethodHandles.lookup().findVirtual(IPFN_xrGetInstanceProcAddr.class, "invoke", PFN_xrGetInstanceProcAddr.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull IPFN_xrGetInstanceProcAddr lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull IPFN_xrGetInstanceProcAddr lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), PFN_xrGetInstanceProcAddr, arena);
        }
    }

    @FunctionalInterface
    public interface IPFN_xrVoidFunction {
        void invoke(
        );

        static MethodHandle of(@NotNull IPFN_xrVoidFunction lambda) {
            try {
                return MethodHandles.lookup().findVirtual(IPFN_xrVoidFunction.class, "invoke", PFN_xrVoidFunction.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull IPFN_xrVoidFunction lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull IPFN_xrVoidFunction lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), PFN_xrVoidFunction, arena);
        }
    }

    /// Constructing this class is nonsense so the constructor is made private.
    private XRFunctionTypes() {}
}
