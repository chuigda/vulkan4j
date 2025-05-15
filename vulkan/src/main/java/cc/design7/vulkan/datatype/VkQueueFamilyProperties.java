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

/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkQueueFamilyProperties.html">VkQueueFamilyProperties</a>
@ValueBasedCandidate
public record VkQueueFamilyProperties(@NotNull MemorySegment segment) implements IPointer {
    public static final OfInt LAYOUT$queueFlags = ValueLayout.JAVA_INT.withName("queueFlags");
    public static final OfInt LAYOUT$queueCount = ValueLayout.JAVA_INT.withName("queueCount");
    public static final OfInt LAYOUT$timestampValidBits = ValueLayout.JAVA_INT.withName("timestampValidBits");
    public static final StructLayout LAYOUT$minImageTransferGranularity = VkExtent3D.LAYOUT.withName("minImageTransferGranularity");

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(LAYOUT$queueFlags, LAYOUT$queueCount, LAYOUT$timestampValidBits, LAYOUT$minImageTransferGranularity);
    public static final long SIZE = LAYOUT.byteSize();

    public static VkQueueFamilyProperties allocate(Arena arena) {
        return new VkQueueFamilyProperties(arena.allocate(LAYOUT));
    }

    public static VkQueueFamilyProperties[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkQueueFamilyProperties[] ret = new VkQueueFamilyProperties[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkQueueFamilyProperties(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static VkQueueFamilyProperties clone(Arena arena, VkQueueFamilyProperties src) {
        VkQueueFamilyProperties ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkQueueFamilyProperties[] clone(Arena arena, VkQueueFamilyProperties[] src) {
        VkQueueFamilyProperties[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final PathElement PATH$queueFlags = PathElement.groupElement("PATH$queueFlags");
    public static final PathElement PATH$queueCount = PathElement.groupElement("PATH$queueCount");
    public static final PathElement PATH$timestampValidBits = PathElement.groupElement("PATH$timestampValidBits");
    public static final PathElement PATH$minImageTransferGranularity = PathElement.groupElement("PATH$minImageTransferGranularity");

    public static final long SIZE$queueFlags = LAYOUT$queueFlags.byteSize();
    public static final long SIZE$queueCount = LAYOUT$queueCount.byteSize();
    public static final long SIZE$timestampValidBits = LAYOUT$timestampValidBits.byteSize();
    public static final long SIZE$minImageTransferGranularity = LAYOUT$minImageTransferGranularity.byteSize();

    public static final long OFFSET$queueFlags = LAYOUT.byteOffset(PATH$queueFlags);
    public static final long OFFSET$queueCount = LAYOUT.byteOffset(PATH$queueCount);
    public static final long OFFSET$timestampValidBits = LAYOUT.byteOffset(PATH$timestampValidBits);
    public static final long OFFSET$minImageTransferGranularity = LAYOUT.byteOffset(PATH$minImageTransferGranularity);

    public @enumtype(VkQueueFlags.class) int queueFlags() {
        return segment.get(LAYOUT$queueFlags, OFFSET$queueFlags);
    }

    public void queueFlags(@enumtype(VkQueueFlags.class) int value) {
        segment.set(LAYOUT$queueFlags, OFFSET$queueFlags, value);
    }

    public @unsigned int queueCount() {
        return segment.get(LAYOUT$queueCount, OFFSET$queueCount);
    }

    public void queueCount(@unsigned int value) {
        segment.set(LAYOUT$queueCount, OFFSET$queueCount, value);
    }

    public @unsigned int timestampValidBits() {
        return segment.get(LAYOUT$timestampValidBits, OFFSET$timestampValidBits);
    }

    public void timestampValidBits(@unsigned int value) {
        segment.set(LAYOUT$timestampValidBits, OFFSET$timestampValidBits, value);
    }

    public VkExtent3D minImageTransferGranularity() {
        return new VkExtent3D(segment.asSlice(OFFSET$minImageTransferGranularity, LAYOUT$minImageTransferGranularity));
    }

    public void minImageTransferGranularity(VkExtent3D value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$minImageTransferGranularity, SIZE$minImageTransferGranularity);
    }

}
