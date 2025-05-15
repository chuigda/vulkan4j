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

/// Represents a pointer to a <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkBufferImageCopy2.html"><code>VkBufferImageCopy2</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct VkBufferImageCopy2 {
///     VkStructureType sType;
///     void const* pNext; // optional
///     VkDeviceSize bufferOffset;
///     uint32_t bufferRowLength;
///     uint32_t bufferImageHeight;
///     VkImageSubresourceLayers imageSubresource;
///     VkOffset3D imageOffset;
///     VkExtent3D imageExtent;
/// } VkBufferImageCopy2;
/// }
///
/// ## Auto initialization
/// This structure has the following members that can be automatically initialized:
/// - `sType = VK_STRUCTURE_TYPE_BUFFER_IMAGE_COPY_2`
///
/// The {@link VkBufferImageCopy2#allocate} functions will automatically initialize these fields.
/// Also, you may call {@link VkBufferImageCopy2#autoInit} to initialize these fields manually for
/// non-allocated instances.
///
/// ## Contracts
///
/// The property {@link #segment()} should always be not-null
/// (({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to)
/// {@code LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
/// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
///
/// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
/// perform any runtime check. The constructor can be useful for automatic code generators.
///
/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkBufferImageCopy2.html"><code>VkBufferImageCopy2</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record VkBufferImageCopy2(@NotNull MemorySegment segment) implements IPointer {
    public static VkBufferImageCopy2 allocate(Arena arena) {
        VkBufferImageCopy2 ret = new VkBufferImageCopy2(arena.allocate(LAYOUT));
        ret.sType(VkStructureType.BUFFER_IMAGE_COPY_2);
        return ret;
    }

    public static VkBufferImageCopy2[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkBufferImageCopy2[] ret = new VkBufferImageCopy2[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkBufferImageCopy2(segment.asSlice(i * BYTES, BYTES));
            ret[i].sType(VkStructureType.BUFFER_IMAGE_COPY_2);
        }
        return ret;
    }

    public static VkBufferImageCopy2 clone(Arena arena, VkBufferImageCopy2 src) {
        VkBufferImageCopy2 ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkBufferImageCopy2[] clone(Arena arena, VkBufferImageCopy2[] src) {
        VkBufferImageCopy2[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public void autoInit() {
        sType(VkStructureType.BUFFER_IMAGE_COPY_2);
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
        pNext(pointer != null ? pointer.segment() : MemorySegment.NULL);
    }

    public @unsigned long bufferOffset() {
        return segment.get(LAYOUT$bufferOffset, OFFSET$bufferOffset);
    }

    public void bufferOffset(@unsigned long value) {
        segment.set(LAYOUT$bufferOffset, OFFSET$bufferOffset, value);
    }

    public @unsigned int bufferRowLength() {
        return segment.get(LAYOUT$bufferRowLength, OFFSET$bufferRowLength);
    }

    public void bufferRowLength(@unsigned int value) {
        segment.set(LAYOUT$bufferRowLength, OFFSET$bufferRowLength, value);
    }

    public @unsigned int bufferImageHeight() {
        return segment.get(LAYOUT$bufferImageHeight, OFFSET$bufferImageHeight);
    }

    public void bufferImageHeight(@unsigned int value) {
        segment.set(LAYOUT$bufferImageHeight, OFFSET$bufferImageHeight, value);
    }

    public VkImageSubresourceLayers imageSubresource() {
        return new VkImageSubresourceLayers(segment.asSlice(OFFSET$imageSubresource, LAYOUT$imageSubresource));
    }

    public void imageSubresource(VkImageSubresourceLayers value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$imageSubresource, SIZE$imageSubresource);
    }

    public VkOffset3D imageOffset() {
        return new VkOffset3D(segment.asSlice(OFFSET$imageOffset, LAYOUT$imageOffset));
    }

    public void imageOffset(VkOffset3D value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$imageOffset, SIZE$imageOffset);
    }

    public VkExtent3D imageExtent() {
        return new VkExtent3D(segment.asSlice(OFFSET$imageExtent, LAYOUT$imageExtent));
    }

    public void imageExtent(VkExtent3D value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$imageExtent, SIZE$imageExtent);
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_LONG.withName("bufferOffset"),
        ValueLayout.JAVA_INT.withName("bufferRowLength"),
        ValueLayout.JAVA_INT.withName("bufferImageHeight"),
        VkImageSubresourceLayers.LAYOUT.withName("imageSubresource"),
        VkOffset3D.LAYOUT.withName("imageOffset"),
        VkExtent3D.LAYOUT.withName("imageExtent")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("PATH$sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("PATH$pNext");
    public static final PathElement PATH$bufferOffset = PathElement.groupElement("PATH$bufferOffset");
    public static final PathElement PATH$bufferRowLength = PathElement.groupElement("PATH$bufferRowLength");
    public static final PathElement PATH$bufferImageHeight = PathElement.groupElement("PATH$bufferImageHeight");
    public static final PathElement PATH$imageSubresource = PathElement.groupElement("PATH$imageSubresource");
    public static final PathElement PATH$imageOffset = PathElement.groupElement("PATH$imageOffset");
    public static final PathElement PATH$imageExtent = PathElement.groupElement("PATH$imageExtent");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfLong LAYOUT$bufferOffset = (OfLong) LAYOUT.select(PATH$bufferOffset);
    public static final OfInt LAYOUT$bufferRowLength = (OfInt) LAYOUT.select(PATH$bufferRowLength);
    public static final OfInt LAYOUT$bufferImageHeight = (OfInt) LAYOUT.select(PATH$bufferImageHeight);
    public static final StructLayout LAYOUT$imageSubresource = (StructLayout) LAYOUT.select(PATH$imageSubresource);
    public static final StructLayout LAYOUT$imageOffset = (StructLayout) LAYOUT.select(PATH$imageOffset);
    public static final StructLayout LAYOUT$imageExtent = (StructLayout) LAYOUT.select(PATH$imageExtent);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$bufferOffset = LAYOUT$bufferOffset.byteSize();
    public static final long SIZE$bufferRowLength = LAYOUT$bufferRowLength.byteSize();
    public static final long SIZE$bufferImageHeight = LAYOUT$bufferImageHeight.byteSize();
    public static final long SIZE$imageSubresource = LAYOUT$imageSubresource.byteSize();
    public static final long SIZE$imageOffset = LAYOUT$imageOffset.byteSize();
    public static final long SIZE$imageExtent = LAYOUT$imageExtent.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$bufferOffset = LAYOUT.byteOffset(PATH$bufferOffset);
    public static final long OFFSET$bufferRowLength = LAYOUT.byteOffset(PATH$bufferRowLength);
    public static final long OFFSET$bufferImageHeight = LAYOUT.byteOffset(PATH$bufferImageHeight);
    public static final long OFFSET$imageSubresource = LAYOUT.byteOffset(PATH$imageSubresource);
    public static final long OFFSET$imageOffset = LAYOUT.byteOffset(PATH$imageOffset);
    public static final long OFFSET$imageExtent = LAYOUT.byteOffset(PATH$imageExtent);
}
