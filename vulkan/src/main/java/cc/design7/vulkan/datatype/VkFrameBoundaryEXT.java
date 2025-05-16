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
import cc.design7.vulkan.handle.*;
import cc.design7.vulkan.enumtype.*;
import static cc.design7.vulkan.VkConstants.*;

/// Represents a pointer to a <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkFrameBoundaryEXT.html"><code>VkFrameBoundaryEXT</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct VkFrameBoundaryEXT {
///     VkStructureType sType;
///     void const* pNext; // optional
///     VkFrameBoundaryFlagsEXT flags; // optional
///     uint64_t frameID;
///     uint32_t imageCount; // optional
///     VkImage const* pImages; // optional
///     uint32_t bufferCount; // optional
///     VkBuffer const* pBuffers; // optional
///     uint64_t tagName; // optional
///     size_t tagSize; // optional
///     void const* pTag; // optional
/// } VkFrameBoundaryEXT;
/// }
///
/// ## Auto initialization
/// This structure has the following members that can be automatically initialized:
/// - `sType = VK_STRUCTURE_TYPE_FRAME_BOUNDARY_EXT`
///
/// The {@link VkFrameBoundaryEXT#allocate} functions will automatically initialize these fields.
/// Also, you may call {@link VkFrameBoundaryEXT#autoInit} to initialize these fields manually for
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
/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkFrameBoundaryEXT.html"><code>VkFrameBoundaryEXT</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record VkFrameBoundaryEXT(@NotNull MemorySegment segment) implements IPointer {
    public static VkFrameBoundaryEXT allocate(Arena arena) {
        VkFrameBoundaryEXT ret = new VkFrameBoundaryEXT(arena.allocate(LAYOUT));
        ret.sType(VkStructureType.FRAME_BOUNDARY_EXT);
        return ret;
    }

    public static VkFrameBoundaryEXT[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkFrameBoundaryEXT[] ret = new VkFrameBoundaryEXT[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkFrameBoundaryEXT(segment.asSlice(i * BYTES, BYTES));
            ret[i].sType(VkStructureType.FRAME_BOUNDARY_EXT);
        }
        return ret;
    }

    public static VkFrameBoundaryEXT clone(Arena arena, VkFrameBoundaryEXT src) {
        VkFrameBoundaryEXT ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkFrameBoundaryEXT[] clone(Arena arena, VkFrameBoundaryEXT[] src) {
        VkFrameBoundaryEXT[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public void autoInit() {
        sType(VkStructureType.FRAME_BOUNDARY_EXT);
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

    public @enumtype(VkFrameBoundaryFlagsEXT.class) int flags() {
        return segment.get(LAYOUT$flags, OFFSET$flags);
    }

    public void flags(@enumtype(VkFrameBoundaryFlagsEXT.class) int value) {
        segment.set(LAYOUT$flags, OFFSET$flags, value);
    }

    public @unsigned long frameID() {
        return segment.get(LAYOUT$frameID, OFFSET$frameID);
    }

    public void frameID(@unsigned long value) {
        segment.set(LAYOUT$frameID, OFFSET$frameID, value);
    }

    public @unsigned int imageCount() {
        return segment.get(LAYOUT$imageCount, OFFSET$imageCount);
    }

    public void imageCount(@unsigned int value) {
        segment.set(LAYOUT$imageCount, OFFSET$imageCount, value);
    }

    public @pointer(comment="VkImage*") MemorySegment pImagesRaw() {
        return segment.get(LAYOUT$pImages, OFFSET$pImages);
    }

    public void pImagesRaw(@pointer(comment="VkImage*") MemorySegment value) {
        segment.set(LAYOUT$pImages, OFFSET$pImages, value);
    }

    /// Note: the returned {@link VkImage.Ptr} does not have correct {@link VkImage.Ptr#size}
    /// property. It's up to user to track the size of the buffer, and use
    /// {@link VkImage.Ptr#reinterpret} to set the size before actually reading from or writing to the
    /// buffer.
    public @Nullable VkImage.Ptr pImages() {
        MemorySegment s = pImagesRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }
        return new VkImage.Ptr(s);
    }


    public @unsigned int bufferCount() {
        return segment.get(LAYOUT$bufferCount, OFFSET$bufferCount);
    }

    public void bufferCount(@unsigned int value) {
        segment.set(LAYOUT$bufferCount, OFFSET$bufferCount, value);
    }

    public @pointer(comment="VkBuffer*") MemorySegment pBuffersRaw() {
        return segment.get(LAYOUT$pBuffers, OFFSET$pBuffers);
    }

    public void pBuffersRaw(@pointer(comment="VkBuffer*") MemorySegment value) {
        segment.set(LAYOUT$pBuffers, OFFSET$pBuffers, value);
    }

    /// Note: the returned {@link VkBuffer.Ptr} does not have correct {@link VkBuffer.Ptr#size}
    /// property. It's up to user to track the size of the buffer, and use
    /// {@link VkBuffer.Ptr#reinterpret} to set the size before actually reading from or writing to the
    /// buffer.
    public @Nullable VkBuffer.Ptr pBuffers() {
        MemorySegment s = pBuffersRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }
        return new VkBuffer.Ptr(s);
    }


    public @unsigned long tagName() {
        return segment.get(LAYOUT$tagName, OFFSET$tagName);
    }

    public void tagName(@unsigned long value) {
        segment.set(LAYOUT$tagName, OFFSET$tagName, value);
    }

    public @unsigned long tagSize() {
        return NativeLayout.readCSizeT(segment, OFFSET$tagSize);
    }

    public void tagSize(@unsigned long value) {
        NativeLayout.writeCSizeT(segment, OFFSET$tagSize, value);
    }

    public @pointer(comment="void*") MemorySegment pTag() {
        return segment.get(LAYOUT$pTag, OFFSET$pTag);
    }

    public void pTag(@pointer(comment="void*") MemorySegment value) {
        segment.set(LAYOUT$pTag, OFFSET$pTag, value);
    }

    public void pTag(@Nullable IPointer pointer) {
        pTag(pointer != null ? pointer.segment() : MemorySegment.NULL);
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("flags"),
        ValueLayout.JAVA_LONG.withName("frameID"),
        ValueLayout.JAVA_INT.withName("imageCount"),
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.ADDRESS).withName("pImages"),
        ValueLayout.JAVA_INT.withName("bufferCount"),
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.ADDRESS).withName("pBuffers"),
        ValueLayout.JAVA_LONG.withName("tagName"),
        NativeLayout.C_SIZE_T.withName("tagSize"),
        ValueLayout.ADDRESS.withName("pTag")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("PATH$sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("PATH$pNext");
    public static final PathElement PATH$flags = PathElement.groupElement("PATH$flags");
    public static final PathElement PATH$frameID = PathElement.groupElement("PATH$frameID");
    public static final PathElement PATH$imageCount = PathElement.groupElement("PATH$imageCount");
    public static final PathElement PATH$pImages = PathElement.groupElement("PATH$pImages");
    public static final PathElement PATH$bufferCount = PathElement.groupElement("PATH$bufferCount");
    public static final PathElement PATH$pBuffers = PathElement.groupElement("PATH$pBuffers");
    public static final PathElement PATH$tagName = PathElement.groupElement("PATH$tagName");
    public static final PathElement PATH$tagSize = PathElement.groupElement("PATH$tagSize");
    public static final PathElement PATH$pTag = PathElement.groupElement("PATH$pTag");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$flags = (OfInt) LAYOUT.select(PATH$flags);
    public static final OfLong LAYOUT$frameID = (OfLong) LAYOUT.select(PATH$frameID);
    public static final OfInt LAYOUT$imageCount = (OfInt) LAYOUT.select(PATH$imageCount);
    public static final AddressLayout LAYOUT$pImages = (AddressLayout) LAYOUT.select(PATH$pImages);
    public static final OfInt LAYOUT$bufferCount = (OfInt) LAYOUT.select(PATH$bufferCount);
    public static final AddressLayout LAYOUT$pBuffers = (AddressLayout) LAYOUT.select(PATH$pBuffers);
    public static final OfLong LAYOUT$tagName = (OfLong) LAYOUT.select(PATH$tagName);
    public static final AddressLayout LAYOUT$pTag = (AddressLayout) LAYOUT.select(PATH$pTag);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$flags = LAYOUT$flags.byteSize();
    public static final long SIZE$frameID = LAYOUT$frameID.byteSize();
    public static final long SIZE$imageCount = LAYOUT$imageCount.byteSize();
    public static final long SIZE$pImages = LAYOUT$pImages.byteSize();
    public static final long SIZE$bufferCount = LAYOUT$bufferCount.byteSize();
    public static final long SIZE$pBuffers = LAYOUT$pBuffers.byteSize();
    public static final long SIZE$tagName = LAYOUT$tagName.byteSize();
    public static final long SIZE$tagSize = NativeLayout.C_SIZE_T.byteSize();
    public static final long SIZE$pTag = LAYOUT$pTag.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$flags = LAYOUT.byteOffset(PATH$flags);
    public static final long OFFSET$frameID = LAYOUT.byteOffset(PATH$frameID);
    public static final long OFFSET$imageCount = LAYOUT.byteOffset(PATH$imageCount);
    public static final long OFFSET$pImages = LAYOUT.byteOffset(PATH$pImages);
    public static final long OFFSET$bufferCount = LAYOUT.byteOffset(PATH$bufferCount);
    public static final long OFFSET$pBuffers = LAYOUT.byteOffset(PATH$pBuffers);
    public static final long OFFSET$tagName = LAYOUT.byteOffset(PATH$tagName);
    public static final long OFFSET$tagSize = LAYOUT.byteOffset(PATH$tagSize);
    public static final long OFFSET$pTag = LAYOUT.byteOffset(PATH$pTag);
}
