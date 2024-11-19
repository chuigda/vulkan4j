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
/// typedef struct VkImageDrmFormatModifierListCreateInfoEXT {
///     VkStructureType sType;
///     const void* pNext;
///     uint32_t drmFormatModifierCount;
///     const uint64_t* pDrmFormatModifiers;
/// } VkImageDrmFormatModifierListCreateInfoEXT;}
///
/// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/VkImageDrmFormatModifierListCreateInfoEXT.html">VkImageDrmFormatModifierListCreateInfoEXT</a>
public record VkImageDrmFormatModifierListCreateInfoEXT(MemorySegment segment) implements IPointer {
    public VkImageDrmFormatModifierListCreateInfoEXT(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_IMAGE_DRM_FORMAT_MODIFIER_LIST_CREATE_INFO_EXT);
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

    public @unsigned int drmFormatModifierCount() {
        return segment.get(LAYOUT$drmFormatModifierCount, OFFSET$drmFormatModifierCount);
    }

    public void drmFormatModifierCount(@unsigned int value) {
        segment.set(LAYOUT$drmFormatModifierCount, OFFSET$drmFormatModifierCount, value);
    }

    public @pointer(comment="uint64_t*") MemorySegment pDrmFormatModifiersRaw() {
        return segment.get(LAYOUT$pDrmFormatModifiers, OFFSET$pDrmFormatModifiers);
    }

    public void pDrmFormatModifiersRaw(@pointer(comment="uint64_t*") MemorySegment value) {
        segment.set(LAYOUT$pDrmFormatModifiers, OFFSET$pDrmFormatModifiers, value);
    }

    /// Note: the returned {@link LongBuffer} does not have correct
    /// {@link LongBuffer#size} property. It's up to user to track the size of the buffer,
    /// and use {@link LongBuffer#reinterpret} to set the size before actually
    /// {@link LongBuffer#read}ing or
    /// {@link LongBuffer#write}ing the buffer.
    public @Nullable @unsigned LongBuffer pDrmFormatModifiers() {
        MemorySegment s = pDrmFormatModifiersRaw();
        return s.address() == 0 ? null : new LongBuffer(s);
    }

    public void pDrmFormatModifiers(@Nullable @unsigned LongBuffer value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pDrmFormatModifiersRaw(s);
    }

    public static VkImageDrmFormatModifierListCreateInfoEXT allocate(Arena arena) {
        return new VkImageDrmFormatModifierListCreateInfoEXT(arena.allocate(LAYOUT));
    }

    public static VkImageDrmFormatModifierListCreateInfoEXT[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkImageDrmFormatModifierListCreateInfoEXT[] ret = new VkImageDrmFormatModifierListCreateInfoEXT[count];
        for (int i = 0; i < count; i++) {
            ret[i] = new VkImageDrmFormatModifierListCreateInfoEXT(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static VkImageDrmFormatModifierListCreateInfoEXT clone(Arena arena, VkImageDrmFormatModifierListCreateInfoEXT src) {
        VkImageDrmFormatModifierListCreateInfoEXT ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkImageDrmFormatModifierListCreateInfoEXT[] clone(Arena arena, VkImageDrmFormatModifierListCreateInfoEXT[] src) {
        VkImageDrmFormatModifierListCreateInfoEXT[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("drmFormatModifierCount"),
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_LONG).withName("pDrmFormatModifiers")
    );
    public static final long SIZE = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$drmFormatModifierCount = PathElement.groupElement("drmFormatModifierCount");
    public static final PathElement PATH$pDrmFormatModifiers = PathElement.groupElement("pDrmFormatModifiers");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$drmFormatModifierCount = (OfInt) LAYOUT.select(PATH$drmFormatModifierCount);
    public static final AddressLayout LAYOUT$pDrmFormatModifiers = (AddressLayout) LAYOUT.select(PATH$pDrmFormatModifiers);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$drmFormatModifierCount = LAYOUT.byteOffset(PATH$drmFormatModifierCount);
    public static final long OFFSET$pDrmFormatModifiers = LAYOUT.byteOffset(PATH$pDrmFormatModifiers);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$drmFormatModifierCount = LAYOUT$drmFormatModifierCount.byteSize();
    public static final long SIZE$pDrmFormatModifiers = LAYOUT$pDrmFormatModifiers.byteSize();
}
