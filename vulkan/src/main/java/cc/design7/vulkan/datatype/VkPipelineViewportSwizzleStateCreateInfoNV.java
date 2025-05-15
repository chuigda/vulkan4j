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

/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkPipelineViewportSwizzleStateCreateInfoNV.html">VkPipelineViewportSwizzleStateCreateInfoNV</a>
@ValueBasedCandidate
public record VkPipelineViewportSwizzleStateCreateInfoNV(@NotNull MemorySegment segment) implements IPointer {
    public static final OfInt LAYOUT$sType = ValueLayout.JAVA_INT.withName("sType");
    public static final AddressLayout LAYOUT$pNext = ValueLayout.ADDRESS.withName("pNext");
    public static final OfInt LAYOUT$flags = ValueLayout.JAVA_INT.withName("flags");
    public static final OfInt LAYOUT$viewportCount = ValueLayout.JAVA_INT.withName("viewportCount");
    public static final AddressLayout LAYOUT$pViewportSwizzles = ValueLayout.ADDRESS.withTargetLayout(VkViewportSwizzleNV.LAYOUT).withName("pViewportSwizzles");

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(LAYOUT$sType, LAYOUT$pNext, LAYOUT$flags, LAYOUT$viewportCount, LAYOUT$pViewportSwizzles);
    public static final long SIZE = LAYOUT.byteSize();

    public static VkPipelineViewportSwizzleStateCreateInfoNV allocate(Arena arena) {
        return new VkPipelineViewportSwizzleStateCreateInfoNV(arena.allocate(LAYOUT));
    }

    public static VkPipelineViewportSwizzleStateCreateInfoNV[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkPipelineViewportSwizzleStateCreateInfoNV[] ret = new VkPipelineViewportSwizzleStateCreateInfoNV[count];
        for (int i = 0; i < count; i ++) {
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
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final PathElement PATH$sType = PathElement.groupElement("PATH$sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("PATH$pNext");
    public static final PathElement PATH$flags = PathElement.groupElement("PATH$flags");
    public static final PathElement PATH$viewportCount = PathElement.groupElement("PATH$viewportCount");
    public static final PathElement PATH$pViewportSwizzles = PathElement.groupElement("PATH$pViewportSwizzles");

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$flags = LAYOUT$flags.byteSize();
    public static final long SIZE$viewportCount = LAYOUT$viewportCount.byteSize();
    public static final long SIZE$pViewportSwizzles = LAYOUT$pViewportSwizzles.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$flags = LAYOUT.byteOffset(PATH$flags);
    public static final long OFFSET$viewportCount = LAYOUT.byteOffset(PATH$viewportCount);
    public static final long OFFSET$pViewportSwizzles = LAYOUT.byteOffset(PATH$pViewportSwizzles);

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

    public void pViewportSwizzles(@Nullable VkViewportSwizzleNV value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pViewportSwizzlesRaw(s);
    }

    @unsafe public @Nullable VkViewportSwizzleNV[] pViewportSwizzles(int assumedCount) {
        MemorySegment s = pViewportSwizzlesRaw();
        if (s.address() == 0) {
            return null;
        }

        s = s.reinterpret(assumedCount * VkViewportSwizzleNV.SIZE);
        VkViewportSwizzleNV[] ret = new VkViewportSwizzleNV[assumedCount];
        for (int i = 0; i < assumedCount; i ++) {
            ret[i] = new VkViewportSwizzleNV(s.asSlice(i * VkViewportSwizzleNV.SIZE, VkViewportSwizzleNV.SIZE));
        }
        return ret;
    }

}
