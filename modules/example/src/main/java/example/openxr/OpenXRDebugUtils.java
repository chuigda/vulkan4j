package example.openxr;

import club.doki7.ffm.annotation.EnumType;
import club.doki7.openxr.XRFunctionTypes;
import club.doki7.openxr.datatype.XrDebugUtilsMessengerCallbackDataEXT;
import club.doki7.openxr.datatype.XrDebugUtilsMessengerCreateInfoEXT;
import club.doki7.openxr.enumtype.XrStructureType;
import club.doki7.openxr.handle.XrDebugUtilsMessengerEXT;
import org.jetbrains.annotations.NotNull;

import java.lang.foreign.Arena;
import java.lang.foreign.Linker;
import java.lang.foreign.MemorySegment;
import java.lang.invoke.MethodHandles;
import java.util.Objects;

import static club.doki7.openxr.bitmask.XrDebugUtilsMessageTypeFlagsEXT.*;
import static club.doki7.openxr.bitmask.XrDebugUtilsMessageSeverityFlagsEXT.*;
import static example.openxr.OpenXR.OPENXR_CHECK;

public final class OpenXRDebugUtils {
    private OpenXRDebugUtils() {
    }

    public static int openXRMessageCallback(
            long messageSeveriry,
            long messageType,
            @NotNull MemorySegment pCallbackData,
            @NotNull MemorySegment pUserData
    ) {
        var callbackData = new XrDebugUtilsMessengerCallbackDataEXT(pCallbackData);
        return 0;
    }

    /// @param arena must live long enough after [XrDebugUtilsMessengerEXT] is destroyed
    public static @NotNull XrDebugUtilsMessengerEXT createOpenXRDebugUtilsMessenger(@NotNull OpenXRContext context, @NotNull Arena arena) {
        try (var local = Arena.ofConfined()) {
            var lookup = MethodHandles.publicLookup();
            var handle = lookup.findStatic(
                    OpenXRDebugUtils.class,
                    "openXRMessageCallback",
                    XRFunctionTypes.PFN_xrDebugUtilsMessengerCallbackEXT.toMethodType()
            );

            var pCallback = Linker.nativeLinker().upcallStub(handle, XRFunctionTypes.PFN_xrDebugUtilsMessengerCallbackEXT, arena);

            var debugUtilsMessengerCI = XrDebugUtilsMessengerCreateInfoEXT.allocate(local)
                    .type(XrStructureType.DEBUG_UTILS_MESSENGER_CREATE_INFO_EXT)
                    .messageSeverities(VERBOSE | INFO | WARNING | ERROR)
                    .messageTypes(GENERAL | VALIDATION | PERFORMANCE | CONFORMANCE)
                    .userCallback(pCallback);

            var debugUtilsMessenger = XrDebugUtilsMessengerEXT.Ptr.allocate(local);
            OPENXR_CHECK(
                    context.xr().createDebugUtilsMessengerEXT(context.instance(), debugUtilsMessengerCI, debugUtilsMessenger),
                    "Failed to create DebugUtilsMessenger."
            );
            return Objects.requireNonNull(debugUtilsMessenger.read());
        } catch (NoSuchMethodException | IllegalAccessException e) {
            throw new RuntimeException(e);
        }

    }

    public static void destroyOpenXRDebugUtilsMessenger(@NotNull OpenXRContext context, @NotNull XrDebugUtilsMessengerEXT debugUtilsMessenger) {
        OPENXR_CHECK(context.xr().destroyDebugUtilsMessengerEXT(debugUtilsMessenger), "Failed to destroy DebugUtilsMessenger.");
    }
}
