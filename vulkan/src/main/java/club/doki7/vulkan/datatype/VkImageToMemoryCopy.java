package club.doki7.vulkan.datatype;

import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;

import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.NotNull;
import club.doki7.ffm.IPointer;
import club.doki7.ffm.NativeLayout;
import club.doki7.ffm.annotation.*;
import club.doki7.ffm.ptr.*;
import club.doki7.vulkan.bitmask.*;
import club.doki7.vulkan.handle.*;
import club.doki7.vulkan.enumtype.*;
import static club.doki7.vulkan.VkConstants.*;

/// Represents a pointer to a <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkImageToMemoryCopy.html"><code>VkImageToMemoryCopy</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct VkImageToMemoryCopy {
///     VkStructureType sType;
///     void const* pNext; // optional
///     void* pHostPointer;
///     uint32_t memoryRowLength;
///     uint32_t memoryImageHeight;
///     VkImageSubresourceLayers imageSubresource;
///     VkOffset3D imageOffset;
///     VkExtent3D imageExtent;
/// } VkImageToMemoryCopy;
/// }
///
/// ## Auto initialization
/// This structure has the following members that can be automatically initialized:
/// - `sType = VK_STRUCTURE_TYPE_IMAGE_TO_MEMORY_COPY`
///
/// The {@link VkImageToMemoryCopy#allocate} functions will automatically initialize these fields.
/// Also, you may call {@link VkImageToMemoryCopy#autoInit} to initialize these fields manually for
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
/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkImageToMemoryCopy.html"><code>VkImageToMemoryCopy</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record VkImageToMemoryCopy(@NotNull MemorySegment segment) implements IPointer {
    public static VkImageToMemoryCopy allocate(Arena arena) {
        VkImageToMemoryCopy ret = new VkImageToMemoryCopy(arena.allocate(LAYOUT));
        ret.sType(VkStructureType.IMAGE_TO_MEMORY_COPY);
        return ret;
    }

    public static VkImageToMemoryCopy[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkImageToMemoryCopy[] ret = new VkImageToMemoryCopy[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkImageToMemoryCopy(segment.asSlice(i * BYTES, BYTES));
            ret[i].sType(VkStructureType.IMAGE_TO_MEMORY_COPY);
        }
        return ret;
    }

    public static VkImageToMemoryCopy clone(Arena arena, VkImageToMemoryCopy src) {
        VkImageToMemoryCopy ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkImageToMemoryCopy[] clone(Arena arena, VkImageToMemoryCopy[] src) {
        VkImageToMemoryCopy[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public void autoInit() {
        sType(VkStructureType.IMAGE_TO_MEMORY_COPY);
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

    public @pointer(comment="void*") MemorySegment pHostPointer() {
        return segment.get(LAYOUT$pHostPointer, OFFSET$pHostPointer);
    }

    public void pHostPointer(@pointer(comment="void*") MemorySegment value) {
        segment.set(LAYOUT$pHostPointer, OFFSET$pHostPointer, value);
    }

    public void pHostPointer(@Nullable IPointer pointer) {
        pHostPointer(pointer != null ? pointer.segment() : MemorySegment.NULL);
    }

    public @unsigned int memoryRowLength() {
        return segment.get(LAYOUT$memoryRowLength, OFFSET$memoryRowLength);
    }

    public void memoryRowLength(@unsigned int value) {
        segment.set(LAYOUT$memoryRowLength, OFFSET$memoryRowLength, value);
    }

    public @unsigned int memoryImageHeight() {
        return segment.get(LAYOUT$memoryImageHeight, OFFSET$memoryImageHeight);
    }

    public void memoryImageHeight(@unsigned int value) {
        segment.set(LAYOUT$memoryImageHeight, OFFSET$memoryImageHeight, value);
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
        ValueLayout.ADDRESS.withName("pHostPointer"),
        ValueLayout.JAVA_INT.withName("memoryRowLength"),
        ValueLayout.JAVA_INT.withName("memoryImageHeight"),
        VkImageSubresourceLayers.LAYOUT.withName("imageSubresource"),
        VkOffset3D.LAYOUT.withName("imageOffset"),
        VkExtent3D.LAYOUT.withName("imageExtent")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("PATH$sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("PATH$pNext");
    public static final PathElement PATH$pHostPointer = PathElement.groupElement("PATH$pHostPointer");
    public static final PathElement PATH$memoryRowLength = PathElement.groupElement("PATH$memoryRowLength");
    public static final PathElement PATH$memoryImageHeight = PathElement.groupElement("PATH$memoryImageHeight");
    public static final PathElement PATH$imageSubresource = PathElement.groupElement("PATH$imageSubresource");
    public static final PathElement PATH$imageOffset = PathElement.groupElement("PATH$imageOffset");
    public static final PathElement PATH$imageExtent = PathElement.groupElement("PATH$imageExtent");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final AddressLayout LAYOUT$pHostPointer = (AddressLayout) LAYOUT.select(PATH$pHostPointer);
    public static final OfInt LAYOUT$memoryRowLength = (OfInt) LAYOUT.select(PATH$memoryRowLength);
    public static final OfInt LAYOUT$memoryImageHeight = (OfInt) LAYOUT.select(PATH$memoryImageHeight);
    public static final StructLayout LAYOUT$imageSubresource = (StructLayout) LAYOUT.select(PATH$imageSubresource);
    public static final StructLayout LAYOUT$imageOffset = (StructLayout) LAYOUT.select(PATH$imageOffset);
    public static final StructLayout LAYOUT$imageExtent = (StructLayout) LAYOUT.select(PATH$imageExtent);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$pHostPointer = LAYOUT$pHostPointer.byteSize();
    public static final long SIZE$memoryRowLength = LAYOUT$memoryRowLength.byteSize();
    public static final long SIZE$memoryImageHeight = LAYOUT$memoryImageHeight.byteSize();
    public static final long SIZE$imageSubresource = LAYOUT$imageSubresource.byteSize();
    public static final long SIZE$imageOffset = LAYOUT$imageOffset.byteSize();
    public static final long SIZE$imageExtent = LAYOUT$imageExtent.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$pHostPointer = LAYOUT.byteOffset(PATH$pHostPointer);
    public static final long OFFSET$memoryRowLength = LAYOUT.byteOffset(PATH$memoryRowLength);
    public static final long OFFSET$memoryImageHeight = LAYOUT.byteOffset(PATH$memoryImageHeight);
    public static final long OFFSET$imageSubresource = LAYOUT.byteOffset(PATH$imageSubresource);
    public static final long OFFSET$imageOffset = LAYOUT.byteOffset(PATH$imageOffset);
    public static final long OFFSET$imageExtent = LAYOUT.byteOffset(PATH$imageExtent);
}
