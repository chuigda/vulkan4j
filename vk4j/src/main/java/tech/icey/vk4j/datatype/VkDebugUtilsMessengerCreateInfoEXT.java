package tech.icey.vk4j.datatype;

import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;

import org.jetbrains.annotations.Nullable;
import tech.icey.panama.IPointer;
import tech.icey.panama.NativeLayout;
import tech.icey.panama.annotation.*;
import tech.icey.panama.buffer.*;
import tech.icey.vk4j.bitmask.*;
import tech.icey.vk4j.datatype.*;
import tech.icey.vk4j.enumtype.*;
import tech.icey.vk4j.handle.*;
import static tech.icey.vk4j.Constants.*;
import static tech.icey.vk4j.enumtype.VkStructureType.*;

/// {@snippet lang=c :
/// typedef struct VkDebugUtilsMessengerCreateInfoEXT {
///     VkStructureType sType;
///     const void* pNext;
///     VkDebugUtilsMessengerCreateFlagsEXT flags;
///     VkDebugUtilsMessageSeverityFlagsEXT messageSeverity;
///     VkDebugUtilsMessageTypeFlagsEXT messageType;
///     PFN_vkDebugUtilsMessengerCallbackEXT pfnUserCallback;
///     void* pUserData;
/// } VkDebugUtilsMessengerCreateInfoEXT;}
///
/// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/VkDebugUtilsMessengerCreateInfoEXT.html">VkDebugUtilsMessengerCreateInfoEXT</a>
public record VkDebugUtilsMessengerCreateInfoEXT(MemorySegment segment) implements IPointer {
    public VkDebugUtilsMessengerCreateInfoEXT(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_DEBUG_UTILS_MESSENGER_CREATE_INFO_EXT);
    }

    public @enumtype(VkStructureType.class) int sType() {
        return segment.get(LAYOUT$sType, OFFSET$sType);
    }

    public void sType(@enumtype(VkStructureType.class) int value) {
        segment.set(LAYOUT$sType, OFFSET$sType, value);
    }

    public @pointer(comment="void*") MemorySegment pNext() {
        return segment.get(LAYOUT$pNext, OFFSET$pNext);
    }

    public void pNext(@pointer(comment="void*") MemorySegment value) {
        segment.set(LAYOUT$pNext, OFFSET$pNext, value);
    }

    public void pNext(@Nullable IPointer pointer) {
        pNext(pointer == null ? MemorySegment.NULL : pointer.segment());
    }

    public @enumtype(VkDebugUtilsMessengerCreateFlagsEXT.class) int flags() {
        return segment.get(LAYOUT$flags, OFFSET$flags);
    }

    public void flags(@enumtype(VkDebugUtilsMessengerCreateFlagsEXT.class) int value) {
        segment.set(LAYOUT$flags, OFFSET$flags, value);
    }

    public @enumtype(VkDebugUtilsMessageSeverityFlagsEXT.class) int messageSeverity() {
        return segment.get(LAYOUT$messageSeverity, OFFSET$messageSeverity);
    }

    public void messageSeverity(@enumtype(VkDebugUtilsMessageSeverityFlagsEXT.class) int value) {
        segment.set(LAYOUT$messageSeverity, OFFSET$messageSeverity, value);
    }

    public @enumtype(VkDebugUtilsMessageTypeFlagsEXT.class) int messageType() {
        return segment.get(LAYOUT$messageType, OFFSET$messageType);
    }

    public void messageType(@enumtype(VkDebugUtilsMessageTypeFlagsEXT.class) int value) {
        segment.set(LAYOUT$messageType, OFFSET$messageType, value);
    }

    public @pointer(comment="PFN_vkDebugUtilsMessengerCallbackEXT") MemorySegment pfnUserCallback() {
        return segment.get(LAYOUT$pfnUserCallback, OFFSET$pfnUserCallback);
    }

    public void pfnUserCallback(@pointer(comment="PFN_vkDebugUtilsMessengerCallbackEXT") MemorySegment value) {
        segment.set(LAYOUT$pfnUserCallback, OFFSET$pfnUserCallback, value);
    }

    public void pfnUserCallback(@Nullable IPointer pointer) {
        pfnUserCallback(pointer == null ? MemorySegment.NULL : pointer.segment());
    }

    public @pointer(comment="void*") MemorySegment pUserData() {
        return segment.get(LAYOUT$pUserData, OFFSET$pUserData);
    }

    public void pUserData(@pointer(comment="void*") MemorySegment value) {
        segment.set(LAYOUT$pUserData, OFFSET$pUserData, value);
    }

    public void pUserData(@Nullable IPointer pointer) {
        pUserData(pointer == null ? MemorySegment.NULL : pointer.segment());
    }

    public static VkDebugUtilsMessengerCreateInfoEXT allocate(Arena arena) {
        return new VkDebugUtilsMessengerCreateInfoEXT(arena.allocate(LAYOUT));
    }

    public static VkDebugUtilsMessengerCreateInfoEXT[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkDebugUtilsMessengerCreateInfoEXT[] ret = new VkDebugUtilsMessengerCreateInfoEXT[count];
        for (int i = 0; i < count; i++) {
            ret[i] = new VkDebugUtilsMessengerCreateInfoEXT(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static VkDebugUtilsMessengerCreateInfoEXT clone(Arena arena, VkDebugUtilsMessengerCreateInfoEXT src) {
        VkDebugUtilsMessengerCreateInfoEXT ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkDebugUtilsMessengerCreateInfoEXT[] clone(Arena arena, VkDebugUtilsMessengerCreateInfoEXT[] src) {
        VkDebugUtilsMessengerCreateInfoEXT[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("flags"),
        ValueLayout.JAVA_INT.withName("messageSeverity"),
        ValueLayout.JAVA_INT.withName("messageType"),
        ValueLayout.ADDRESS.withName("pfnUserCallback"),
        ValueLayout.ADDRESS.withName("pUserData")
    );
    public static final long SIZE = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$flags = PathElement.groupElement("flags");
    public static final PathElement PATH$messageSeverity = PathElement.groupElement("messageSeverity");
    public static final PathElement PATH$messageType = PathElement.groupElement("messageType");
    public static final PathElement PATH$pfnUserCallback = PathElement.groupElement("pfnUserCallback");
    public static final PathElement PATH$pUserData = PathElement.groupElement("pUserData");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$flags = (OfInt) LAYOUT.select(PATH$flags);
    public static final OfInt LAYOUT$messageSeverity = (OfInt) LAYOUT.select(PATH$messageSeverity);
    public static final OfInt LAYOUT$messageType = (OfInt) LAYOUT.select(PATH$messageType);
    public static final AddressLayout LAYOUT$pfnUserCallback = (AddressLayout) LAYOUT.select(PATH$pfnUserCallback);
    public static final AddressLayout LAYOUT$pUserData = (AddressLayout) LAYOUT.select(PATH$pUserData);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$flags = LAYOUT.byteOffset(PATH$flags);
    public static final long OFFSET$messageSeverity = LAYOUT.byteOffset(PATH$messageSeverity);
    public static final long OFFSET$messageType = LAYOUT.byteOffset(PATH$messageType);
    public static final long OFFSET$pfnUserCallback = LAYOUT.byteOffset(PATH$pfnUserCallback);
    public static final long OFFSET$pUserData = LAYOUT.byteOffset(PATH$pUserData);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$flags = LAYOUT$flags.byteSize();
    public static final long SIZE$messageSeverity = LAYOUT$messageSeverity.byteSize();
    public static final long SIZE$messageType = LAYOUT$messageType.byteSize();
    public static final long SIZE$pfnUserCallback = LAYOUT$pfnUserCallback.byteSize();
    public static final long SIZE$pUserData = LAYOUT$pUserData.byteSize();
}
