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

/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkDeviceQueueCreateInfo.html">VkDeviceQueueCreateInfo</a>
@ValueBasedCandidate
public record VkDeviceQueueCreateInfo(@NotNull MemorySegment segment) implements IPointer {
    public static final OfInt LAYOUT$sType = ValueLayout.JAVA_INT.withName("sType");
    public static final AddressLayout LAYOUT$pNext = ValueLayout.ADDRESS.withName("pNext");
    public static final OfInt LAYOUT$flags = ValueLayout.JAVA_INT.withName("flags");
    public static final OfInt LAYOUT$queueFamilyIndex = ValueLayout.JAVA_INT.withName("queueFamilyIndex");
    public static final OfInt LAYOUT$queueCount = ValueLayout.JAVA_INT.withName("queueCount");
    public static final AddressLayout LAYOUT$pQueuePriorities = ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_FLOAT).withName("pQueuePriorities");

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(LAYOUT$sType, LAYOUT$pNext, LAYOUT$flags, LAYOUT$queueFamilyIndex, LAYOUT$queueCount, LAYOUT$pQueuePriorities);
    public static final long SIZE = LAYOUT.byteSize();

    public static VkDeviceQueueCreateInfo allocate(Arena arena) {
        return new VkDeviceQueueCreateInfo(arena.allocate(LAYOUT));
    }

    public static VkDeviceQueueCreateInfo[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkDeviceQueueCreateInfo[] ret = new VkDeviceQueueCreateInfo[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkDeviceQueueCreateInfo(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static VkDeviceQueueCreateInfo clone(Arena arena, VkDeviceQueueCreateInfo src) {
        VkDeviceQueueCreateInfo ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkDeviceQueueCreateInfo[] clone(Arena arena, VkDeviceQueueCreateInfo[] src) {
        VkDeviceQueueCreateInfo[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final PathElement PATH$sType = PathElement.groupElement("PATH$sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("PATH$pNext");
    public static final PathElement PATH$flags = PathElement.groupElement("PATH$flags");
    public static final PathElement PATH$queueFamilyIndex = PathElement.groupElement("PATH$queueFamilyIndex");
    public static final PathElement PATH$queueCount = PathElement.groupElement("PATH$queueCount");
    public static final PathElement PATH$pQueuePriorities = PathElement.groupElement("PATH$pQueuePriorities");

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$flags = LAYOUT$flags.byteSize();
    public static final long SIZE$queueFamilyIndex = LAYOUT$queueFamilyIndex.byteSize();
    public static final long SIZE$queueCount = LAYOUT$queueCount.byteSize();
    public static final long SIZE$pQueuePriorities = LAYOUT$pQueuePriorities.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$flags = LAYOUT.byteOffset(PATH$flags);
    public static final long OFFSET$queueFamilyIndex = LAYOUT.byteOffset(PATH$queueFamilyIndex);
    public static final long OFFSET$queueCount = LAYOUT.byteOffset(PATH$queueCount);
    public static final long OFFSET$pQueuePriorities = LAYOUT.byteOffset(PATH$pQueuePriorities);

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

    public @enumtype(VkDeviceQueueCreateFlags.class) int flags() {
        return segment.get(LAYOUT$flags, OFFSET$flags);
    }

    public void flags(@enumtype(VkDeviceQueueCreateFlags.class) int value) {
        segment.set(LAYOUT$flags, OFFSET$flags, value);
    }

    public @unsigned int queueFamilyIndex() {
        return segment.get(LAYOUT$queueFamilyIndex, OFFSET$queueFamilyIndex);
    }

    public void queueFamilyIndex(@unsigned int value) {
        segment.set(LAYOUT$queueFamilyIndex, OFFSET$queueFamilyIndex, value);
    }

    public @unsigned int queueCount() {
        return segment.get(LAYOUT$queueCount, OFFSET$queueCount);
    }

    public void queueCount(@unsigned int value) {
        segment.set(LAYOUT$queueCount, OFFSET$queueCount, value);
    }

    public @pointer(comment="float*") MemorySegment pQueuePrioritiesRaw() {
        return segment.get(LAYOUT$pQueuePriorities, OFFSET$pQueuePriorities);
    }

    public void pQueuePrioritiesRaw(@pointer(comment="float*") MemorySegment value) {
        segment.set(LAYOUT$pQueuePriorities, OFFSET$pQueuePriorities, value);
    }

    /// Note: the returned {@link FloatPtr} does not have correct
    /// {@link FloatPtr#size} property. It's up to user to track the size of the buffer,
    /// and use {@link FloatPtr#reinterpret} to set the size before actually reading from or
    /// writing to the buffer.
    public @Nullable FloatPtr pQueuePriorities() {
        MemorySegment s = pQueuePrioritiesRaw();
        if (s.address() == 0) {
            return null;
        }
        return new FloatPtr(s);
    }

    public void pQueuePriorities(@Nullable FloatPtr value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pQueuePrioritiesRaw(s);
    }

}
