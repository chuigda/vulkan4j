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
/// typedef struct VkPipelineDiscardRectangleStateCreateInfoEXT {
///     VkStructureType sType;
///     const void* pNext;
///     VkPipelineDiscardRectangleStateCreateFlagsEXT flags;
///     VkDiscardRectangleModeEXT discardRectangleMode;
///     uint32_t discardRectangleCount;
///     const VkRect2D* pDiscardRectangles;
/// } VkPipelineDiscardRectangleStateCreateInfoEXT;}
///
/// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/VkPipelineDiscardRectangleStateCreateInfoEXT.html">VkPipelineDiscardRectangleStateCreateInfoEXT</a>
public record VkPipelineDiscardRectangleStateCreateInfoEXT(MemorySegment segment) implements IPointer {
    public VkPipelineDiscardRectangleStateCreateInfoEXT(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_PIPELINE_DISCARD_RECTANGLE_STATE_CREATE_INFO_EXT);
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

    public @enumtype(VkPipelineDiscardRectangleStateCreateFlagsEXT.class) int flags() {
        return segment.get(LAYOUT$flags, OFFSET$flags);
    }

    public void flags(@enumtype(VkPipelineDiscardRectangleStateCreateFlagsEXT.class) int value) {
        segment.set(LAYOUT$flags, OFFSET$flags, value);
    }

    public @enumtype(VkDiscardRectangleModeEXT.class) int discardRectangleMode() {
        return segment.get(LAYOUT$discardRectangleMode, OFFSET$discardRectangleMode);
    }

    public void discardRectangleMode(@enumtype(VkDiscardRectangleModeEXT.class) int value) {
        segment.set(LAYOUT$discardRectangleMode, OFFSET$discardRectangleMode, value);
    }

    public @unsigned int discardRectangleCount() {
        return segment.get(LAYOUT$discardRectangleCount, OFFSET$discardRectangleCount);
    }

    public void discardRectangleCount(@unsigned int value) {
        segment.set(LAYOUT$discardRectangleCount, OFFSET$discardRectangleCount, value);
    }

    public @pointer(comment="VkRect2D*") MemorySegment pDiscardRectanglesRaw() {
        return segment.get(LAYOUT$pDiscardRectangles, OFFSET$pDiscardRectangles);
    }

    public void pDiscardRectanglesRaw(@pointer(comment="VkRect2D*") MemorySegment value) {
        segment.set(LAYOUT$pDiscardRectangles, OFFSET$pDiscardRectangles, value);
    }

    public @nullable VkRect2D pDiscardRectangles() {
        MemorySegment s = pDiscardRectanglesRaw();
        if (s.address() == 0) {
            return null;
        }
        return new VkRect2D(s);
    }

    /// Note: this function is {@link unsafe} because it's up to user to provide the correct count of elements.
    @unsafe
    public @nullable VkRect2D[] pDiscardRectangles(int assumedCount) {
        MemorySegment s = pDiscardRectanglesRaw().reinterpret(assumedCount * VkRect2D.SIZE);
        VkRect2D[] arr = new VkRect2D[assumedCount];
        for (int i = 0; i < assumedCount; i++) {
            arr[i] = new VkRect2D(s.asSlice(i * VkRect2D.SIZE, VkRect2D.SIZE));
        }
        return arr;
    }

    public void pDiscardRectangles(@nullable VkRect2D value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pDiscardRectanglesRaw(s);
    }

    public static VkPipelineDiscardRectangleStateCreateInfoEXT allocate(Arena arena) {
        return new VkPipelineDiscardRectangleStateCreateInfoEXT(arena.allocate(LAYOUT));
    }
    
    public static VkPipelineDiscardRectangleStateCreateInfoEXT[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkPipelineDiscardRectangleStateCreateInfoEXT[] ret = new VkPipelineDiscardRectangleStateCreateInfoEXT[count];
        for (int i = 0; i < count; i++) {
            ret[i] = new VkPipelineDiscardRectangleStateCreateInfoEXT(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static VkPipelineDiscardRectangleStateCreateInfoEXT clone(Arena arena, VkPipelineDiscardRectangleStateCreateInfoEXT src) {
        VkPipelineDiscardRectangleStateCreateInfoEXT ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkPipelineDiscardRectangleStateCreateInfoEXT[] clone(Arena arena, VkPipelineDiscardRectangleStateCreateInfoEXT[] src) {
        VkPipelineDiscardRectangleStateCreateInfoEXT[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("flags"),
        ValueLayout.JAVA_INT.withName("discardRectangleMode"),
        ValueLayout.JAVA_INT.withName("discardRectangleCount"),
        ValueLayout.ADDRESS.withTargetLayout(VkRect2D.LAYOUT).withName("pDiscardRectangles")
    );
    public static final long SIZE = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$flags = PathElement.groupElement("flags");
    public static final PathElement PATH$discardRectangleMode = PathElement.groupElement("discardRectangleMode");
    public static final PathElement PATH$discardRectangleCount = PathElement.groupElement("discardRectangleCount");
    public static final PathElement PATH$pDiscardRectangles = PathElement.groupElement("pDiscardRectangles");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$flags = (OfInt) LAYOUT.select(PATH$flags);
    public static final OfInt LAYOUT$discardRectangleMode = (OfInt) LAYOUT.select(PATH$discardRectangleMode);
    public static final OfInt LAYOUT$discardRectangleCount = (OfInt) LAYOUT.select(PATH$discardRectangleCount);
    public static final AddressLayout LAYOUT$pDiscardRectangles = (AddressLayout) LAYOUT.select(PATH$pDiscardRectangles);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$flags = LAYOUT.byteOffset(PATH$flags);
    public static final long OFFSET$discardRectangleMode = LAYOUT.byteOffset(PATH$discardRectangleMode);
    public static final long OFFSET$discardRectangleCount = LAYOUT.byteOffset(PATH$discardRectangleCount);
    public static final long OFFSET$pDiscardRectangles = LAYOUT.byteOffset(PATH$pDiscardRectangles);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$flags = LAYOUT$flags.byteSize();
    public static final long SIZE$discardRectangleMode = LAYOUT$discardRectangleMode.byteSize();
    public static final long SIZE$discardRectangleCount = LAYOUT$discardRectangleCount.byteSize();
    public static final long SIZE$pDiscardRectangles = LAYOUT$pDiscardRectangles.byteSize();
}
