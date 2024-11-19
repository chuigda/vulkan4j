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
/// typedef struct VkPipelineViewportSwizzleStateCreateInfoNV {
///     VkStructureType sType;
///     const void* pNext;
///     VkPipelineViewportSwizzleStateCreateFlagsNV flags;
///     uint32_t viewportCount;
///     const VkViewportSwizzleNV* pViewportSwizzles;
/// } VkPipelineViewportSwizzleStateCreateInfoNV;}
///
/// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/VkPipelineViewportSwizzleStateCreateInfoNV.html">VkPipelineViewportSwizzleStateCreateInfoNV</a>
public record VkPipelineViewportSwizzleStateCreateInfoNV(MemorySegment segment) implements IPointer {
    public VkPipelineViewportSwizzleStateCreateInfoNV(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_PIPELINE_VIEWPORT_SWIZZLE_STATE_CREATE_INFO_NV);
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

    public @enumtype(VkPipelineViewportSwizzleStateCreateFlagsNV.class) int flags() {
        return segment.get(LAYOUT$flags, OFFSET$flags);
    }

    public void flags(@enumtype(VkPipelineViewportSwizzleStateCreateFlagsNV.class) int value) {
        segment.set(LAYOUT$flags, OFFSET$flags, value);
    }

    public @unsigned int viewportCount() {
        return segment.get(LAYOUT$viewportCount, OFFSET$viewportCount);
    }

    public void viewportCount(@unsigned int value) {
        segment.set(LAYOUT$viewportCount, OFFSET$viewportCount, value);
    }

    public @pointer(comment="VkViewportSwizzleNV*") MemorySegment pViewportSwizzlesRaw() {
        return segment.get(LAYOUT$pViewportSwizzles, OFFSET$pViewportSwizzles);
    }

    public void pViewportSwizzlesRaw(@pointer(comment="VkViewportSwizzleNV*") MemorySegment value) {
        segment.set(LAYOUT$pViewportSwizzles, OFFSET$pViewportSwizzles, value);
    }

    public @Nullable VkViewportSwizzleNV pViewportSwizzles() {
        MemorySegment s = pViewportSwizzlesRaw();
        if (s.address() == 0) {
            return null;
        }
        return new VkViewportSwizzleNV(s);
    }

    /// Note: this function is {@link unsafe} because it's up to user to provide the correct count of elements.
    @unsafe
    public @Nullable VkViewportSwizzleNV[] pViewportSwizzles(int assumedCount) {
        MemorySegment s = pViewportSwizzlesRaw().reinterpret(assumedCount * VkViewportSwizzleNV.SIZE);
        VkViewportSwizzleNV[] arr = new VkViewportSwizzleNV[assumedCount];
        for (int i = 0; i < assumedCount; i++) {
            arr[i] = new VkViewportSwizzleNV(s.asSlice(i * VkViewportSwizzleNV.SIZE, VkViewportSwizzleNV.SIZE));
        }
        return arr;
    }

    public void pViewportSwizzles(@Nullable VkViewportSwizzleNV value) {
        pViewportSwizzlesRaw(value == null ? MemorySegment.NULL : value.segment());
    }

    public static VkPipelineViewportSwizzleStateCreateInfoNV allocate(Arena arena) {
        return new VkPipelineViewportSwizzleStateCreateInfoNV(arena.allocate(LAYOUT));
    }

    public static VkPipelineViewportSwizzleStateCreateInfoNV[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkPipelineViewportSwizzleStateCreateInfoNV[] ret = new VkPipelineViewportSwizzleStateCreateInfoNV[count];
        for (int i = 0; i < count; i++) {
            ret[i] = new VkPipelineViewportSwizzleStateCreateInfoNV(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static VkPipelineViewportSwizzleStateCreateInfoNV clone(Arena arena, VkPipelineViewportSwizzleStateCreateInfoNV src) {
        VkPipelineViewportSwizzleStateCreateInfoNV ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkPipelineViewportSwizzleStateCreateInfoNV[] clone(Arena arena, VkPipelineViewportSwizzleStateCreateInfoNV[] src) {
        VkPipelineViewportSwizzleStateCreateInfoNV[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("flags"),
        ValueLayout.JAVA_INT.withName("viewportCount"),
        ValueLayout.ADDRESS.withTargetLayout(VkViewportSwizzleNV.LAYOUT).withName("pViewportSwizzles")
    );
    public static final long SIZE = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$flags = PathElement.groupElement("flags");
    public static final PathElement PATH$viewportCount = PathElement.groupElement("viewportCount");
    public static final PathElement PATH$pViewportSwizzles = PathElement.groupElement("pViewportSwizzles");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$flags = (OfInt) LAYOUT.select(PATH$flags);
    public static final OfInt LAYOUT$viewportCount = (OfInt) LAYOUT.select(PATH$viewportCount);
    public static final AddressLayout LAYOUT$pViewportSwizzles = (AddressLayout) LAYOUT.select(PATH$pViewportSwizzles);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$flags = LAYOUT.byteOffset(PATH$flags);
    public static final long OFFSET$viewportCount = LAYOUT.byteOffset(PATH$viewportCount);
    public static final long OFFSET$pViewportSwizzles = LAYOUT.byteOffset(PATH$pViewportSwizzles);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$flags = LAYOUT$flags.byteSize();
    public static final long SIZE$viewportCount = LAYOUT$viewportCount.byteSize();
    public static final long SIZE$pViewportSwizzles = LAYOUT$pViewportSwizzles.byteSize();
}
