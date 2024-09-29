package tech.icey.vk4j.datatype;

import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;

import tech.icey.vk4j.IPointer;
import tech.icey.vk4j.annotation.*;
import tech.icey.vk4j.bitmask.*;
import tech.icey.vk4j.buffer.*;
import tech.icey.vk4j.datatype.*;
import tech.icey.vk4j.enumtype.*;
import tech.icey.vk4j.handle.*;
import tech.icey.vk4j.NativeLayout;
import static tech.icey.vk4j.Constants.*;
import static tech.icey.vk4j.enumtype.VkStructureType.*;

/// {@snippet lang=c :
/// typedef struct VkQueueFamilyProperties {
///     VkQueueFlags queueFlags;
///     uint32_t queueCount;
///     uint32_t timestampValidBits;
///     VkExtent3D minImageTransferGranularity;
/// } VkQueueFamilyProperties;}
///
/// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/VkQueueFamilyProperties.html">VkQueueFamilyProperties</a>
public record VkQueueFamilyProperties(MemorySegment segment) implements IPointer {
    public VkQueueFamilyProperties(MemorySegment segment) {
        this.segment = segment;
    }

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

    public static VkQueueFamilyProperties allocate(Arena arena) {
        return new VkQueueFamilyProperties(arena.allocate(LAYOUT));
    }
    
    public static VkQueueFamilyProperties[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkQueueFamilyProperties[] ret = new VkQueueFamilyProperties[count];
        for (int i = 0; i < count; i++) {
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
        for (int i = 0; i < src.length; i++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("queueFlags"),
        ValueLayout.JAVA_INT.withName("queueCount"),
        ValueLayout.JAVA_INT.withName("timestampValidBits"),
        VkExtent3D.LAYOUT.withName("minImageTransferGranularity")
    );
    public static final long SIZE = LAYOUT.byteSize();

    public static final PathElement PATH$queueFlags = PathElement.groupElement("queueFlags");
    public static final PathElement PATH$queueCount = PathElement.groupElement("queueCount");
    public static final PathElement PATH$timestampValidBits = PathElement.groupElement("timestampValidBits");
    public static final PathElement PATH$minImageTransferGranularity = PathElement.groupElement("minImageTransferGranularity");

    public static final OfInt LAYOUT$queueFlags = (OfInt) LAYOUT.select(PATH$queueFlags);
    public static final OfInt LAYOUT$queueCount = (OfInt) LAYOUT.select(PATH$queueCount);
    public static final OfInt LAYOUT$timestampValidBits = (OfInt) LAYOUT.select(PATH$timestampValidBits);
    public static final StructLayout LAYOUT$minImageTransferGranularity = (StructLayout) LAYOUT.select(PATH$minImageTransferGranularity);

    public static final long OFFSET$queueFlags = LAYOUT.byteOffset(PATH$queueFlags);
    public static final long OFFSET$queueCount = LAYOUT.byteOffset(PATH$queueCount);
    public static final long OFFSET$timestampValidBits = LAYOUT.byteOffset(PATH$timestampValidBits);
    public static final long OFFSET$minImageTransferGranularity = LAYOUT.byteOffset(PATH$minImageTransferGranularity);

    public static final long SIZE$queueFlags = LAYOUT$queueFlags.byteSize();
    public static final long SIZE$queueCount = LAYOUT$queueCount.byteSize();
    public static final long SIZE$timestampValidBits = LAYOUT$timestampValidBits.byteSize();
    public static final long SIZE$minImageTransferGranularity = LAYOUT$minImageTransferGranularity.byteSize();
}
