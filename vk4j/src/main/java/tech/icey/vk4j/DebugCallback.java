package tech.icey.vk4j;

import tech.icey.vk4j.annotation.enumtype;
import tech.icey.vk4j.annotation.pointer;
import tech.icey.vk4j.bitmask.VkDebugUtilsMessageSeverityFlagsEXT;
import tech.icey.vk4j.bitmask.VkDebugUtilsMessageTypeFlagsEXT;
import tech.icey.vk4j.datatype.VkDebugUtilsMessengerCallbackDataEXT;
import tech.icey.vk4j.datatype.VkDebugUtilsMessengerCreateInfoEXT;
import tech.icey.vk4j.enumtype.VkObjectType;

import java.lang.foreign.*;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.Objects;

/// An example vulkan validation layer debug callback
///
/// This debug callback prints debug information to {@code stderr} ({@link System#err}). You may want to take this
/// class as an example of how to implement a debug callback for your application, and make your own one. Or you can
/// just use this one by feeding {@link #pDebugCallback} to
/// {@link VkDebugUtilsMessengerCreateInfoEXT#pfnUserCallback(MemorySegment)}.
///
/// The callback implementation mostly comes from
/// <a href="https://github.com/KhronosGroup/Vulkan-Tools/blob/2020cec4111c87d85b167d583180b839f0c736c5/cube/cube.c#L451">VkCube</a>
public final class DebugCallback {
    private static /*VkBool32*/ int debugCallback(
            @enumtype(VkDebugUtilsMessageSeverityFlagsEXT.class) int messageSeverity,
            @enumtype(VkDebugUtilsMessageTypeFlagsEXT.class) int messageType,
            @pointer(target= VkDebugUtilsMessengerCallbackDataEXT.class) MemorySegment pCallbackData,
            @pointer(comment="void*") MemorySegment ignoredPUserData
    ) {
        pCallbackData = pCallbackData.reinterpret(VkDebugUtilsMessengerCallbackDataEXT.LAYOUT.byteSize());
        var callbackData = new VkDebugUtilsMessengerCallbackDataEXT(pCallbackData);

        String prefix;
        if ((messageSeverity & VkDebugUtilsMessageSeverityFlagsEXT.VK_DEBUG_UTILS_MESSAGE_SEVERITY_VERBOSE_BIT_EXT) != 0) {
            prefix = "VERBOSE : ";
        }
        else if ((messageSeverity & VkDebugUtilsMessageSeverityFlagsEXT.VK_DEBUG_UTILS_MESSAGE_SEVERITY_INFO_BIT_EXT) != 0) {
            prefix = "INFO : ";
        }
        else if ((messageSeverity & VkDebugUtilsMessageSeverityFlagsEXT.VK_DEBUG_UTILS_MESSAGE_SEVERITY_WARNING_BIT_EXT) != 0) {
            prefix = "WARNING : ";
        }
        else if ((messageSeverity & VkDebugUtilsMessageSeverityFlagsEXT.VK_DEBUG_UTILS_MESSAGE_SEVERITY_ERROR_BIT_EXT) != 0) {
            prefix = "ERROR : ";
        }
        else {
            prefix = "UNKNOWN";
        }

        if ((messageType & VkDebugUtilsMessageTypeFlagsEXT.VK_DEBUG_UTILS_MESSAGE_TYPE_GENERAL_BIT_EXT) != 0) {
            prefix += "GENERAL";
        }
        else {
            if ((messageType & VkDebugUtilsMessageTypeFlagsEXT.VK_DEBUG_UTILS_MESSAGE_TYPE_VALIDATION_BIT_EXT) != 0) {
                prefix += "VALIDATION";
            }

            if ((messageType & VkDebugUtilsMessageTypeFlagsEXT.VK_DEBUG_UTILS_MESSAGE_TYPE_PERFORMANCE_BIT_EXT) != 0) {
                if ((messageType & VkDebugUtilsMessageTypeFlagsEXT.VK_DEBUG_UTILS_MESSAGE_TYPE_VALIDATION_BIT_EXT) != 0) {
                    prefix += "|";
                }
                prefix += "PERFORMANCE";
            }
        }

        var messageIdName = callbackData.pMessageIdName();

        var messageBuilder = new StringBuilder();
        messageBuilder.append(String.format(
                "%s - Message Id Number: %d | Message Id Name: %s\n\t%s\n",
                prefix,
                callbackData.messageIdNumber(),
                messageIdName != null ? messageIdName.readString() : "(null)",
                Objects.requireNonNull(callbackData.pMessage()).readString()
        ));

        if (callbackData.objectCount() > 0) {
            messageBuilder.append(String.format(
                    "\tObjects - %s\n",
                    Integer.toUnsignedString(callbackData.objectCount()))
            );

            var objects = Objects.requireNonNull(callbackData.pObjects(callbackData.objectCount()));
            for (int i = 0; i < callbackData.objectCount(); i++) {
                var object = objects[i];
                messageBuilder.append(String.format("\t\tObject[%d] - %s", i, VkObjectType.explain(object.objectType())));
                messageBuilder.append(String.format(", handle = 0x%s", Long.toUnsignedString(object.objectHandle(), 16)));

                var objectName = object.pObjectName();
                if (objectName != null) {
                    messageBuilder.append(String.format(", name = %s", objectName.readString()));
                }

                messageBuilder.append("\n");
            }
        }

        if (callbackData.cmdBufLabelCount() > 0) {
            messageBuilder.append(String.format(
                    "\tCommand Buffer Labels - %s\n",
                    Integer.toUnsignedString(callbackData.cmdBufLabelCount()))
            );

            var labels = Objects.requireNonNull(callbackData.pCmdBufLabels(callbackData.cmdBufLabelCount()));
            for (int i = 0; i < callbackData.cmdBufLabelCount(); i++) {
                var label = labels[i];
                messageBuilder.append(String.format(
                        "\t\tLabel[%d] - %s",
                        i,
                        Objects.requireNonNull(label.pLabelName()).readString()
                ));

                var color = label.color();
                messageBuilder.append(String.format(
                        " { %.2f, %.2f, %.2f, %.2f }\n",
                        color.read(0),
                        color.read(1),
                        color.read(2),
                        color.read(3)
                ));
            }
        }

        System.err.print(messageBuilder);

        return Constants.VK_FALSE;
    }

    public static final MemorySegment pDebugCallback;

    static {
        try {
            FunctionDescriptor descriptor = FunctionDescriptor.of(
                    ValueLayout.JAVA_INT,
                    ValueLayout.JAVA_INT,
                    ValueLayout.JAVA_INT,
                    ValueLayout.ADDRESS.withTargetLayout(VkDebugUtilsMessengerCallbackDataEXT.LAYOUT),
                    ValueLayout.ADDRESS
            );
            MethodHandle handle = MethodHandles
                    .lookup()
                    .findStatic(DebugCallback.class, "debugCallback", descriptor.toMethodType());

            pDebugCallback = Linker.nativeLinker().upcallStub(handle, descriptor, Arena.global());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
