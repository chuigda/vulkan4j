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

/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkFrameBoundaryEXT.html">VkFrameBoundaryEXT</a>
@ValueBasedCandidate
public record VkFrameBoundaryEXT(@NotNull MemorySegment segment) implements IPointer {
    public static final OfInt LAYOUT$sType = ValueLayout.JAVA_INT.withName("sType");
    public static final AddressLayout LAYOUT$pNext = ValueLayout.ADDRESS.withName("pNext");
    public static final OfInt LAYOUT$flags = ValueLayout.JAVA_INT.withName("flags");
    public static final OfLong LAYOUT$frameID = ValueLayout.JAVA_LONG.withName("frameID");
    public static final OfInt LAYOUT$imageCount = ValueLayout.JAVA_INT.withName("imageCount");
    public static final AddressLayout LAYOUT$pImages = ValueLayout.ADDRESS.withTargetLayout(ValueLayout.ADDRESS).withName("pImages");
    public static final OfInt LAYOUT$bufferCount = ValueLayout.JAVA_INT.withName("bufferCount");
    public static final AddressLayout LAYOUT$pBuffers = ValueLayout.ADDRESS.withTargetLayout(ValueLayout.ADDRESS).withName("pBuffers");
    public static final OfLong LAYOUT$tagName = ValueLayout.JAVA_LONG.withName("tagName");
    public static final ValueLayout LAYOUT$tagSize = NativeLayout.C_SIZE_T.withName("tagSize");
    public static final AddressLayout LAYOUT$pTag = ValueLayout.ADDRESS.withName("pTag");

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(LAYOUT$sType, LAYOUT$pNext, LAYOUT$flags, LAYOUT$frameID, LAYOUT$imageCount, LAYOUT$pImages, LAYOUT$bufferCount, LAYOUT$pBuffers, LAYOUT$tagName, LAYOUT$tagSize, LAYOUT$pTag);
    public static final long SIZE = LAYOUT.byteSize();

    public static VkFrameBoundaryEXT allocate(Arena arena) {
        return new VkFrameBoundaryEXT(arena.allocate(LAYOUT));
    }

    public static VkFrameBoundaryEXT[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkFrameBoundaryEXT[] ret = new VkFrameBoundaryEXT[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkFrameBoundaryEXT(segment.asSlice(i * SIZE, SIZE));
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

    /// Note: the returned {@link VkImage.Buffer} does not have correct {@link VkImage.Buffer#size}
    /// property. It's up to user to track the size of the buffer, and use
    /// {@link VkImage.Buffer#reinterpret} to set the size before actually reading from or writing to the
    /// buffer.
    public @Nullable VkImage.Buffer pImages() {
        MemorySegment s = pImagesRaw();
        if (s.address() == 0) {
            return null;
        }
        return new VkImage.Buffer(s);
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

    /// Note: the returned {@link VkBuffer.Buffer} does not have correct {@link VkBuffer.Buffer#size}
    /// property. It's up to user to track the size of the buffer, and use
    /// {@link VkBuffer.Buffer#reinterpret} to set the size before actually reading from or writing to the
    /// buffer.
    public @Nullable VkBuffer.Buffer pBuffers() {
        MemorySegment s = pBuffersRaw();
        if (s.address() == 0) {
            return null;
        }
        return new VkBuffer.Buffer(s);
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

    public void pTag(IPointer pointer) {
        pTag(pointer.segment());
    }

}
