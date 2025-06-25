package example.openxr;

import club.doki7.ffm.IPointer;
import club.doki7.openxr.XR;
import club.doki7.openxr.XRConstants;
import club.doki7.openxr.datatype.XrDebugUtilsMessengerCreateInfoEXT;
import club.doki7.openxr.enumtype.XrStructureType;
import club.doki7.openxr.handle.XrDebugUtilsMessengerEXT;
import club.doki7.openxr.handle.XrInstance;
import org.jetbrains.annotations.NotNull;

import java.lang.foreign.Arena;

import static club.doki7.openxr.bitmask.XrDebugUtilsMessageSeverityFlagsEXT.*;
import static club.doki7.openxr.bitmask.XrDebugUtilsMessageTypeFlagsEXT.*;

public final class OpenXRDebugUtils {
    private OpenXRDebugUtils() {
    }

    /// @param arena used to create [XrDebugUtilsMessengerEXT] instance
    public static XrDebugUtilsMessengerEXT createOpenXRDebugUtilsMessenger(XR xr, @NotNull XrInstance instance, @NotNull Arena arena) {
        try (var local = Arena.ofConfined()) {
            var debugUtilsMessengerCI = XrDebugUtilsMessengerCreateInfoEXT.allocate(local);
            debugUtilsMessengerCI.type(XrStructureType.DEBUG_UTILS_MESSENGER_CREATE_INFO_EXT);
            debugUtilsMessengerCI.messageSeverities(VERBOSE | INFO | WARNING | ERROR);
            debugUtilsMessengerCI.messageTypes(GENERAL | VALIDATION | PERFORMANCE | CONFORMANCE);
            debugUtilsMessengerCI.userCallback();
            debugUtilsMessengerCI.userData((IPointer) null);

//            xr.xrGetInstanceProcAddr()
        }

        return null;
    }
}
