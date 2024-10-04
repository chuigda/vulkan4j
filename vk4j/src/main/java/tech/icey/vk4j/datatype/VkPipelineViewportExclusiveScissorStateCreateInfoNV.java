package tech.icey.vk4j.datatype;

import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;

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
/// typedef struct VkPipelineViewportExclusiveScissorStateCreateInfoNV {
///     VkStructureType sType;
///     const void* pNext;
///     uint32_t exclusiveScissorCount;
///     const VkRect2D* pExclusiveScissors;
/// } VkPipelineViewportExclusiveScissorStateCreateInfoNV;}
///
/// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/VkPipelineViewportExclusiveScissorStateCreateInfoNV.html">VkPipelineViewportExclusiveScissorStateCreateInfoNV</a>
public record VkPipelineViewportExclusiveScissorStateCreateInfoNV(MemorySegment segment) implements IPointer {
    public VkPipelineViewportExclusiveScissorStateCreateInfoNV(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_PIPELINE_VIEWPORT_EXCLUSIVE_SCISSOR_STATE_CREATE_INFO_NV);
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

    public void pNext(@nullable IPointer pointer) {
        pNext(pointer == null ? MemorySegment.NULL : pointer.segment());
    }

    public @unsigned int exclusiveScissorCount() {
        return segment.get(LAYOUT$exclusiveScissorCount, OFFSET$exclusiveScissorCount);
    }

    public void exclusiveScissorCount(@unsigned int value) {
        segment.set(LAYOUT$exclusiveScissorCount, OFFSET$exclusiveScissorCount, value);
    }

    public @pointer(comment="VkRect2D*") MemorySegment pExclusiveScissorsRaw() {
        return segment.get(LAYOUT$pExclusiveScissors, OFFSET$pExclusiveScissors);
    }

    public void pExclusiveScissorsRaw(@pointer(comment="VkRect2D*") MemorySegment value) {
        segment.set(LAYOUT$pExclusiveScissors, OFFSET$pExclusiveScissors, value);
    }

    public @nullable VkRect2D pExclusiveScissors() {
        MemorySegment s = pExclusiveScissorsRaw();
        if (s.address() == 0) {
            return null;
        }
        return new VkRect2D(s);
    }

    /// Note: this function is {@link unsafe} because it's up to user to provide the correct count of elements.
    @unsafe
    public @nullable VkRect2D[] pExclusiveScissors(int assumedCount) {
        MemorySegment s = pExclusiveScissorsRaw().reinterpret(assumedCount * VkRect2D.SIZE);
        VkRect2D[] arr = new VkRect2D[assumedCount];
        for (int i = 0; i < assumedCount; i++) {
            arr[i] = new VkRect2D(s.asSlice(i * VkRect2D.SIZE, VkRect2D.SIZE));
        }
        return arr;
    }

    public void pExclusiveScissors(@nullable VkRect2D value) {
        pExclusiveScissorsRaw(value == null ? MemorySegment.NULL : value.segment());
    }

    public static VkPipelineViewportExclusiveScissorStateCreateInfoNV allocate(Arena arena) {
        return new VkPipelineViewportExclusiveScissorStateCreateInfoNV(arena.allocate(LAYOUT));
    }

    public static VkPipelineViewportExclusiveScissorStateCreateInfoNV[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkPipelineViewportExclusiveScissorStateCreateInfoNV[] ret = new VkPipelineViewportExclusiveScissorStateCreateInfoNV[count];
        for (int i = 0; i < count; i++) {
            ret[i] = new VkPipelineViewportExclusiveScissorStateCreateInfoNV(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static VkPipelineViewportExclusiveScissorStateCreateInfoNV clone(Arena arena, VkPipelineViewportExclusiveScissorStateCreateInfoNV src) {
        VkPipelineViewportExclusiveScissorStateCreateInfoNV ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkPipelineViewportExclusiveScissorStateCreateInfoNV[] clone(Arena arena, VkPipelineViewportExclusiveScissorStateCreateInfoNV[] src) {
        VkPipelineViewportExclusiveScissorStateCreateInfoNV[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("exclusiveScissorCount"),
        ValueLayout.ADDRESS.withTargetLayout(VkRect2D.LAYOUT).withName("pExclusiveScissors")
    );
    public static final long SIZE = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$exclusiveScissorCount = PathElement.groupElement("exclusiveScissorCount");
    public static final PathElement PATH$pExclusiveScissors = PathElement.groupElement("pExclusiveScissors");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$exclusiveScissorCount = (OfInt) LAYOUT.select(PATH$exclusiveScissorCount);
    public static final AddressLayout LAYOUT$pExclusiveScissors = (AddressLayout) LAYOUT.select(PATH$pExclusiveScissors);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$exclusiveScissorCount = LAYOUT.byteOffset(PATH$exclusiveScissorCount);
    public static final long OFFSET$pExclusiveScissors = LAYOUT.byteOffset(PATH$pExclusiveScissors);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$exclusiveScissorCount = LAYOUT$exclusiveScissorCount.byteSize();
    public static final long SIZE$pExclusiveScissors = LAYOUT$pExclusiveScissors.byteSize();
}
