package cc.design7.vulkan.datatype;

import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;

import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.NotNull;
import cc.design7.ffm.IPointer;
import cc.design7.ffm.NativeLayout;
import cc.design7.ffm.annotation.*;
import cc.design7.ffm.ptr.*;
import cc.design7.vulkan.bitmask.*;
import cc.design7.vulkan.datatype.*;
import cc.design7.vulkan.enumtype.*;
import static cc.design7.vulkan.VkConstants.*;

/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkDebugUtilsMessengerCreateInfoEXT.html">VkDebugUtilsMessengerCreateInfoEXT</a>
@ValueBasedCandidate
public record VkDebugUtilsMessengerCreateInfoEXT(@NotNull MemorySegment segment) implements IPointer {
    public static final OfInt LAYOUT$sType = ValueLayout.JAVA_INT.withName("sType");
    public static final AddressLayout LAYOUT$pNext = ValueLayout.ADDRESS.withName("pNext");
    public static final OfInt LAYOUT$flags = ValueLayout.JAVA_INT.withName("flags");
    public static final OfInt LAYOUT$messageSeverity = ValueLayout.JAVA_INT.withName("messageSeverity");
    public static final OfInt LAYOUT$messageType = ValueLayout.JAVA_INT.withName("messageType");
    public static final AddressLayout LAYOUT$pfnUserCallback = ValueLayout.ADDRESS.withName("pfnUserCallback");
    public static final AddressLayout LAYOUT$pUserData = ValueLayout.ADDRESS.withName("pUserData");

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(LAYOUT$sType, LAYOUT$pNext, LAYOUT$flags, LAYOUT$messageSeverity, LAYOUT$messageType, LAYOUT$pfnUserCallback, LAYOUT$pUserData);
    public static final long SIZE = LAYOUT.byteSize();

    public static VkDebugUtilsMessengerCreateInfoEXT allocate(Arena arena) {
        return new VkDebugUtilsMessengerCreateInfoEXT(arena.allocate(LAYOUT));
    }

    public static VkDebugUtilsMessengerCreateInfoEXT[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkDebugUtilsMessengerCreateInfoEXT[] ret = new VkDebugUtilsMessengerCreateInfoEXT[count];
        for (int i = 0; i < count; i ++) {
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
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final PathElement PATH$sType = PathElement.groupElement("PATH$sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("PATH$pNext");
    public static final PathElement PATH$flags = PathElement.groupElement("PATH$flags");
    public static final PathElement PATH$messageSeverity = PathElement.groupElement("PATH$messageSeverity");
    public static final PathElement PATH$messageType = PathElement.groupElement("PATH$messageType");
    public static final PathElement PATH$pfnUserCallback = PathElement.groupElement("PATH$pfnUserCallback");
    public static final PathElement PATH$pUserData = PathElement.groupElement("PATH$pUserData");

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$flags = LAYOUT$flags.byteSize();
    public static final long SIZE$messageSeverity = LAYOUT$messageSeverity.byteSize();
    public static final long SIZE$messageType = LAYOUT$messageType.byteSize();
    public static final long SIZE$pfnUserCallback = LAYOUT$pfnUserCallback.byteSize();
    public static final long SIZE$pUserData = LAYOUT$pUserData.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$flags = LAYOUT.byteOffset(PATH$flags);
    public static final long OFFSET$messageSeverity = LAYOUT.byteOffset(PATH$messageSeverity);
    public static final long OFFSET$messageType = LAYOUT.byteOffset(PATH$messageType);
    public static final long OFFSET$pfnUserCallback = LAYOUT.byteOffset(PATH$pfnUserCallback);
    public static final long OFFSET$pUserData = LAYOUT.byteOffset(PATH$pUserData);

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

    public void pNext(IPointer pointer) {
        pNext(pointer.segment());
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

    public void pfnUserCallback(IPointer pointer) {
        pfnUserCallback(pointer.segment());
    }

    public @pointer(comment="void*") MemorySegment pUserData() {
        return segment.get(LAYOUT$pUserData, OFFSET$pUserData);
    }

    public void pUserData(@pointer(comment="void*") MemorySegment value) {
        segment.set(LAYOUT$pUserData, OFFSET$pUserData, value);
    }

    public void pUserData(IPointer pointer) {
        pUserData(pointer.segment());
    }

}
