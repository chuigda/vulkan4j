package tech.icey.vk4j.datatype;

import tech.icey.panama.IPointer;
import tech.icey.panama.NativeLayout;
import tech.icey.panama.annotation.enumtype;
import tech.icey.panama.annotation.nullable;
import tech.icey.panama.annotation.pointer;
import tech.icey.panama.annotation.unsigned;
import tech.icey.panama.buffer.IntBuffer;
import tech.icey.vk4j.bitmask.VkImageCompressionFixedRateFlagsEXT;
import tech.icey.vk4j.bitmask.VkImageCompressionFlagsEXT;
import tech.icey.vk4j.enumtype.VkStructureType;

import java.lang.foreign.*;

import static java.lang.foreign.ValueLayout.OfInt;
import static java.lang.foreign.ValueLayout.PathElement;
import static tech.icey.vk4j.enumtype.VkStructureType.VK_STRUCTURE_TYPE_IMAGE_COMPRESSION_CONTROL_EXT;

/// {@snippet lang=c :
/// typedef struct VkImageCompressionControlEXT {
///     VkStructureType sType;
///     const void* pNext;
///     VkImageCompressionFlagsEXT flags;
///     uint32_t compressionControlPlaneCount;
///     VkImageCompressionFixedRateFlagsEXT* pFixedRateFlags;
/// } VkImageCompressionControlEXT;}
///
/// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/VkImageCompressionControlEXT.html">VkImageCompressionControlEXT</a>
public record VkImageCompressionControlEXT(MemorySegment segment) implements IPointer {
    public VkImageCompressionControlEXT(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_IMAGE_COMPRESSION_CONTROL_EXT);
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

    public void pNext(IPointer pointer) {
        pNext(pointer.segment());
    }

    public @enumtype(VkImageCompressionFlagsEXT.class) int flags() {
        return segment.get(LAYOUT$flags, OFFSET$flags);
    }

    public void flags(@enumtype(VkImageCompressionFlagsEXT.class) int value) {
        segment.set(LAYOUT$flags, OFFSET$flags, value);
    }

    public @unsigned int compressionControlPlaneCount() {
        return segment.get(LAYOUT$compressionControlPlaneCount, OFFSET$compressionControlPlaneCount);
    }

    public void compressionControlPlaneCount(@unsigned int value) {
        segment.set(LAYOUT$compressionControlPlaneCount, OFFSET$compressionControlPlaneCount, value);
    }

    public @pointer(target=VkImageCompressionFixedRateFlagsEXT.class) MemorySegment pFixedRateFlagsRaw() {
        return segment.get(LAYOUT$pFixedRateFlags, OFFSET$pFixedRateFlags);
    }

    public void pFixedRateFlagsRaw(@pointer(target=VkImageCompressionFixedRateFlagsEXT.class) MemorySegment value) {
        segment.set(LAYOUT$pFixedRateFlags, OFFSET$pFixedRateFlags, value);
    }

    /// Note: the returned {@link IntBuffer} does not have correct
    /// {@link IntBuffer#size} property. It's up to user to track the size of the buffer,
    /// and use {@link IntBuffer#reinterpret} to set the size before actually
    /// {@link IntBuffer#read}ing or {@link IntBuffer#write}ing
    /// the buffer.
    public @nullable @enumtype(VkImageCompressionFixedRateFlagsEXT.class) IntBuffer pFixedRateFlags() {
        MemorySegment s = pFixedRateFlagsRaw();
        if (s.address() == 0) {
            return null;
        }

        return new IntBuffer(s);
    }

    public void pFixedRateFlags(@nullable @enumtype(VkImageCompressionFixedRateFlagsEXT.class) IntBuffer value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pFixedRateFlagsRaw(s);
    }

    public static VkImageCompressionControlEXT allocate(Arena arena) {
        return new VkImageCompressionControlEXT(arena.allocate(LAYOUT));
    }

    public static VkImageCompressionControlEXT[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkImageCompressionControlEXT[] ret = new VkImageCompressionControlEXT[count];
        for (int i = 0; i < count; i++) {
            ret[i] = new VkImageCompressionControlEXT(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static VkImageCompressionControlEXT clone(Arena arena, VkImageCompressionControlEXT src) {
        VkImageCompressionControlEXT ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkImageCompressionControlEXT[] clone(Arena arena, VkImageCompressionControlEXT[] src) {
        VkImageCompressionControlEXT[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("flags"),
        ValueLayout.JAVA_INT.withName("compressionControlPlaneCount"),
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT).withName("pFixedRateFlags")
    );
    public static final long SIZE = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$flags = PathElement.groupElement("flags");
    public static final PathElement PATH$compressionControlPlaneCount = PathElement.groupElement("compressionControlPlaneCount");
    public static final PathElement PATH$pFixedRateFlags = PathElement.groupElement("pFixedRateFlags");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$flags = (OfInt) LAYOUT.select(PATH$flags);
    public static final OfInt LAYOUT$compressionControlPlaneCount = (OfInt) LAYOUT.select(PATH$compressionControlPlaneCount);
    public static final AddressLayout LAYOUT$pFixedRateFlags = (AddressLayout) LAYOUT.select(PATH$pFixedRateFlags);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$flags = LAYOUT.byteOffset(PATH$flags);
    public static final long OFFSET$compressionControlPlaneCount = LAYOUT.byteOffset(PATH$compressionControlPlaneCount);
    public static final long OFFSET$pFixedRateFlags = LAYOUT.byteOffset(PATH$pFixedRateFlags);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$flags = LAYOUT$flags.byteSize();
    public static final long SIZE$compressionControlPlaneCount = LAYOUT$compressionControlPlaneCount.byteSize();
    public static final long SIZE$pFixedRateFlags = LAYOUT$pFixedRateFlags.byteSize();
}
