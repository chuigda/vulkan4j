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
/// typedef struct VkPhysicalDeviceTexelBufferAlignmentProperties {
///     VkStructureType sType;
///     void* pNext;
///     VkDeviceSize storageTexelBufferOffsetAlignmentBytes;
///     VkBool32 storageTexelBufferOffsetSingleTexelAlignment;
///     VkDeviceSize uniformTexelBufferOffsetAlignmentBytes;
///     VkBool32 uniformTexelBufferOffsetSingleTexelAlignment;
/// } VkPhysicalDeviceTexelBufferAlignmentProperties;}
///
/// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/VkPhysicalDeviceTexelBufferAlignmentProperties.html">VkPhysicalDeviceTexelBufferAlignmentProperties</a>
public record VkPhysicalDeviceTexelBufferAlignmentProperties(MemorySegment segment) implements IPointer {
    public VkPhysicalDeviceTexelBufferAlignmentProperties(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_TEXEL_BUFFER_ALIGNMENT_PROPERTIES);
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

    public @unsigned long storageTexelBufferOffsetAlignmentBytes() {
        return segment.get(LAYOUT$storageTexelBufferOffsetAlignmentBytes, OFFSET$storageTexelBufferOffsetAlignmentBytes);
    }

    public void storageTexelBufferOffsetAlignmentBytes(@unsigned long value) {
        segment.set(LAYOUT$storageTexelBufferOffsetAlignmentBytes, OFFSET$storageTexelBufferOffsetAlignmentBytes, value);
    }

    public @unsigned int storageTexelBufferOffsetSingleTexelAlignment() {
        return segment.get(LAYOUT$storageTexelBufferOffsetSingleTexelAlignment, OFFSET$storageTexelBufferOffsetSingleTexelAlignment);
    }

    public void storageTexelBufferOffsetSingleTexelAlignment(@unsigned int value) {
        segment.set(LAYOUT$storageTexelBufferOffsetSingleTexelAlignment, OFFSET$storageTexelBufferOffsetSingleTexelAlignment, value);
    }

    public @unsigned long uniformTexelBufferOffsetAlignmentBytes() {
        return segment.get(LAYOUT$uniformTexelBufferOffsetAlignmentBytes, OFFSET$uniformTexelBufferOffsetAlignmentBytes);
    }

    public void uniformTexelBufferOffsetAlignmentBytes(@unsigned long value) {
        segment.set(LAYOUT$uniformTexelBufferOffsetAlignmentBytes, OFFSET$uniformTexelBufferOffsetAlignmentBytes, value);
    }

    public @unsigned int uniformTexelBufferOffsetSingleTexelAlignment() {
        return segment.get(LAYOUT$uniformTexelBufferOffsetSingleTexelAlignment, OFFSET$uniformTexelBufferOffsetSingleTexelAlignment);
    }

    public void uniformTexelBufferOffsetSingleTexelAlignment(@unsigned int value) {
        segment.set(LAYOUT$uniformTexelBufferOffsetSingleTexelAlignment, OFFSET$uniformTexelBufferOffsetSingleTexelAlignment, value);
    }

    public static VkPhysicalDeviceTexelBufferAlignmentProperties allocate(Arena arena) {
        return new VkPhysicalDeviceTexelBufferAlignmentProperties(arena.allocate(LAYOUT));
    }

    public static VkPhysicalDeviceTexelBufferAlignmentProperties[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkPhysicalDeviceTexelBufferAlignmentProperties[] ret = new VkPhysicalDeviceTexelBufferAlignmentProperties[count];
        for (int i = 0; i < count; i++) {
            ret[i] = new VkPhysicalDeviceTexelBufferAlignmentProperties(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static VkPhysicalDeviceTexelBufferAlignmentProperties clone(Arena arena, VkPhysicalDeviceTexelBufferAlignmentProperties src) {
        VkPhysicalDeviceTexelBufferAlignmentProperties ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkPhysicalDeviceTexelBufferAlignmentProperties[] clone(Arena arena, VkPhysicalDeviceTexelBufferAlignmentProperties[] src) {
        VkPhysicalDeviceTexelBufferAlignmentProperties[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_LONG.withName("storageTexelBufferOffsetAlignmentBytes"),
        ValueLayout.JAVA_INT.withName("storageTexelBufferOffsetSingleTexelAlignment"),
        ValueLayout.JAVA_LONG.withName("uniformTexelBufferOffsetAlignmentBytes"),
        ValueLayout.JAVA_INT.withName("uniformTexelBufferOffsetSingleTexelAlignment")
    );
    public static final long SIZE = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$storageTexelBufferOffsetAlignmentBytes = PathElement.groupElement("storageTexelBufferOffsetAlignmentBytes");
    public static final PathElement PATH$storageTexelBufferOffsetSingleTexelAlignment = PathElement.groupElement("storageTexelBufferOffsetSingleTexelAlignment");
    public static final PathElement PATH$uniformTexelBufferOffsetAlignmentBytes = PathElement.groupElement("uniformTexelBufferOffsetAlignmentBytes");
    public static final PathElement PATH$uniformTexelBufferOffsetSingleTexelAlignment = PathElement.groupElement("uniformTexelBufferOffsetSingleTexelAlignment");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfLong LAYOUT$storageTexelBufferOffsetAlignmentBytes = (OfLong) LAYOUT.select(PATH$storageTexelBufferOffsetAlignmentBytes);
    public static final OfInt LAYOUT$storageTexelBufferOffsetSingleTexelAlignment = (OfInt) LAYOUT.select(PATH$storageTexelBufferOffsetSingleTexelAlignment);
    public static final OfLong LAYOUT$uniformTexelBufferOffsetAlignmentBytes = (OfLong) LAYOUT.select(PATH$uniformTexelBufferOffsetAlignmentBytes);
    public static final OfInt LAYOUT$uniformTexelBufferOffsetSingleTexelAlignment = (OfInt) LAYOUT.select(PATH$uniformTexelBufferOffsetSingleTexelAlignment);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$storageTexelBufferOffsetAlignmentBytes = LAYOUT.byteOffset(PATH$storageTexelBufferOffsetAlignmentBytes);
    public static final long OFFSET$storageTexelBufferOffsetSingleTexelAlignment = LAYOUT.byteOffset(PATH$storageTexelBufferOffsetSingleTexelAlignment);
    public static final long OFFSET$uniformTexelBufferOffsetAlignmentBytes = LAYOUT.byteOffset(PATH$uniformTexelBufferOffsetAlignmentBytes);
    public static final long OFFSET$uniformTexelBufferOffsetSingleTexelAlignment = LAYOUT.byteOffset(PATH$uniformTexelBufferOffsetSingleTexelAlignment);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$storageTexelBufferOffsetAlignmentBytes = LAYOUT$storageTexelBufferOffsetAlignmentBytes.byteSize();
    public static final long SIZE$storageTexelBufferOffsetSingleTexelAlignment = LAYOUT$storageTexelBufferOffsetSingleTexelAlignment.byteSize();
    public static final long SIZE$uniformTexelBufferOffsetAlignmentBytes = LAYOUT$uniformTexelBufferOffsetAlignmentBytes.byteSize();
    public static final long SIZE$uniformTexelBufferOffsetSingleTexelAlignment = LAYOUT$uniformTexelBufferOffsetSingleTexelAlignment.byteSize();
}
