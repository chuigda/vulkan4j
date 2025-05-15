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

/// Represents a pointer to a <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkImageDrmFormatModifierListCreateInfoEXT.html"><code>VkImageDrmFormatModifierListCreateInfoEXT</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct VkImageDrmFormatModifierListCreateInfoEXT {
///     VkStructureType sType;
///     void const* pNext; // optional
///     uint32_t drmFormatModifierCount;
///     uint64_t const* pDrmFormatModifiers;
/// } VkImageDrmFormatModifierListCreateInfoEXT;
/// }
///
/// ## Auto initialization
/// This structure has the following members that can be automatically initialized:
/// - `sType = VK_STRUCTURE_TYPE_IMAGE_DRM_FORMAT_MODIFIER_LIST_CREATE_INFO_EXT`
///
/// The {@link VkImageDrmFormatModifierListCreateInfoEXT#allocate} functions will automatically initialize these fields.
/// Also, you may call {@link VkImageDrmFormatModifierListCreateInfoEXT#autoInit} to initialize these fields manually for
/// non-allocated instances.
///
/// ## Contracts
/// The property {@link #segment()} should always be not-null
/// (({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to)
/// {@code LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
/// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
///
/// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
/// perform any runtime check. The constructor can be useful for automatic code generators.
///
/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkImageDrmFormatModifierListCreateInfoEXT.html"><code>VkImageDrmFormatModifierListCreateInfoEXT</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record VkImageDrmFormatModifierListCreateInfoEXT(@NotNull MemorySegment segment) implements IPointer {
    public static VkImageDrmFormatModifierListCreateInfoEXT allocate(Arena arena) {
        VkImageDrmFormatModifierListCreateInfoEXT ret = new VkImageDrmFormatModifierListCreateInfoEXT(arena.allocate(LAYOUT));
        ret.sType(VkStructureType.IMAGE_DRM_FORMAT_MODIFIER_LIST_CREATE_INFO_EXT);
        return ret;
    }

    public static VkImageDrmFormatModifierListCreateInfoEXT[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkImageDrmFormatModifierListCreateInfoEXT[] ret = new VkImageDrmFormatModifierListCreateInfoEXT[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkImageDrmFormatModifierListCreateInfoEXT(segment.asSlice(i * BYTES, BYTES));
            ret[i].sType(VkStructureType.IMAGE_DRM_FORMAT_MODIFIER_LIST_CREATE_INFO_EXT);
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
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public void autoInit() {
        sType(VkStructureType.IMAGE_DRM_FORMAT_MODIFIER_LIST_CREATE_INFO_EXT);
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

    public @unsigned int drmFormatModifierCount() {
        return segment.get(LAYOUT$drmFormatModifierCount, OFFSET$drmFormatModifierCount);
    }

    public void drmFormatModifierCount(@unsigned int value) {
        segment.set(LAYOUT$drmFormatModifierCount, OFFSET$drmFormatModifierCount, value);
    }

    public @pointer(comment="long*") MemorySegment pDrmFormatModifiersRaw() {
        return segment.get(LAYOUT$pDrmFormatModifiers, OFFSET$pDrmFormatModifiers);
    }

    public void pDrmFormatModifiersRaw(@pointer(comment="long*") MemorySegment value) {
        segment.set(LAYOUT$pDrmFormatModifiers, OFFSET$pDrmFormatModifiers, value);
    }

    /// Note: the returned {@link LongPtr} does not have correct
    /// {@link LongPtr#size} property. It's up to user to track the size of the buffer,
    /// and use {@link LongPtr#reinterpret} to set the size before actually reading from or
    /// writing to the buffer.
    public @Nullable @unsigned LongPtr pDrmFormatModifiers() {
        MemorySegment s = pDrmFormatModifiersRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }
        return new LongPtr(s);
    }

    public void pDrmFormatModifiers(@Nullable @unsigned LongPtr value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pDrmFormatModifiersRaw(s);
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("drmFormatModifierCount"),
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_LONG).withName("pDrmFormatModifiers")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("PATH$sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("PATH$pNext");
    public static final PathElement PATH$drmFormatModifierCount = PathElement.groupElement("PATH$drmFormatModifierCount");
    public static final PathElement PATH$pDrmFormatModifiers = PathElement.groupElement("PATH$pDrmFormatModifiers");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$drmFormatModifierCount = (OfInt) LAYOUT.select(PATH$drmFormatModifierCount);
    public static final AddressLayout LAYOUT$pDrmFormatModifiers = (AddressLayout) LAYOUT.select(PATH$pDrmFormatModifiers);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$drmFormatModifierCount = LAYOUT$drmFormatModifierCount.byteSize();
    public static final long SIZE$pDrmFormatModifiers = LAYOUT$pDrmFormatModifiers.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$drmFormatModifierCount = LAYOUT.byteOffset(PATH$drmFormatModifierCount);
    public static final long OFFSET$pDrmFormatModifiers = LAYOUT.byteOffset(PATH$pDrmFormatModifiers);
}
