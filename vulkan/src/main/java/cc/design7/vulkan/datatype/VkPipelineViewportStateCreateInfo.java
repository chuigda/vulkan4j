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

/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkPipelineViewportStateCreateInfo.html">VkPipelineViewportStateCreateInfo</a>
@ValueBasedCandidate
public record VkPipelineViewportStateCreateInfo(@NotNull MemorySegment segment) implements IPointer {
    public static final OfInt LAYOUT$sType = ValueLayout.JAVA_INT.withName("sType");
    public static final AddressLayout LAYOUT$pNext = ValueLayout.ADDRESS.withName("pNext");
    public static final OfInt LAYOUT$flags = ValueLayout.JAVA_INT.withName("flags");
    public static final OfInt LAYOUT$viewportCount = ValueLayout.JAVA_INT.withName("viewportCount");
    public static final AddressLayout LAYOUT$pViewports = ValueLayout.ADDRESS.withTargetLayout(VkViewport.LAYOUT).withName("pViewports");
    public static final OfInt LAYOUT$scissorCount = ValueLayout.JAVA_INT.withName("scissorCount");
    public static final AddressLayout LAYOUT$pScissors = ValueLayout.ADDRESS.withTargetLayout(VkRect2D.LAYOUT).withName("pScissors");

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(LAYOUT$sType, LAYOUT$pNext, LAYOUT$flags, LAYOUT$viewportCount, LAYOUT$pViewports, LAYOUT$scissorCount, LAYOUT$pScissors);
    public static final long SIZE = LAYOUT.byteSize();

    public static VkPipelineViewportStateCreateInfo allocate(Arena arena) {
        return new VkPipelineViewportStateCreateInfo(arena.allocate(LAYOUT));
    }

    public static VkPipelineViewportStateCreateInfo[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkPipelineViewportStateCreateInfo[] ret = new VkPipelineViewportStateCreateInfo[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkPipelineViewportStateCreateInfo(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static VkPipelineViewportStateCreateInfo clone(Arena arena, VkPipelineViewportStateCreateInfo src) {
        VkPipelineViewportStateCreateInfo ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkPipelineViewportStateCreateInfo[] clone(Arena arena, VkPipelineViewportStateCreateInfo[] src) {
        VkPipelineViewportStateCreateInfo[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final PathElement PATH$sType = PathElement.groupElement("PATH$sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("PATH$pNext");
    public static final PathElement PATH$flags = PathElement.groupElement("PATH$flags");
    public static final PathElement PATH$viewportCount = PathElement.groupElement("PATH$viewportCount");
    public static final PathElement PATH$pViewports = PathElement.groupElement("PATH$pViewports");
    public static final PathElement PATH$scissorCount = PathElement.groupElement("PATH$scissorCount");
    public static final PathElement PATH$pScissors = PathElement.groupElement("PATH$pScissors");

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$flags = LAYOUT$flags.byteSize();
    public static final long SIZE$viewportCount = LAYOUT$viewportCount.byteSize();
    public static final long SIZE$pViewports = LAYOUT$pViewports.byteSize();
    public static final long SIZE$scissorCount = LAYOUT$scissorCount.byteSize();
    public static final long SIZE$pScissors = LAYOUT$pScissors.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$flags = LAYOUT.byteOffset(PATH$flags);
    public static final long OFFSET$viewportCount = LAYOUT.byteOffset(PATH$viewportCount);
    public static final long OFFSET$pViewports = LAYOUT.byteOffset(PATH$pViewports);
    public static final long OFFSET$scissorCount = LAYOUT.byteOffset(PATH$scissorCount);
    public static final long OFFSET$pScissors = LAYOUT.byteOffset(PATH$pScissors);

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

    public @enumtype(VkPipelineViewportStateCreateFlags.class) int flags() {
        return segment.get(LAYOUT$flags, OFFSET$flags);
    }

    public void flags(@enumtype(VkPipelineViewportStateCreateFlags.class) int value) {
        segment.set(LAYOUT$flags, OFFSET$flags, value);
    }

    public @unsigned int viewportCount() {
        return segment.get(LAYOUT$viewportCount, OFFSET$viewportCount);
    }

    public void viewportCount(@unsigned int value) {
        segment.set(LAYOUT$viewportCount, OFFSET$viewportCount, value);
    }

    public @pointer(comment="VkViewport*") MemorySegment pViewportsRaw() {
        return segment.get(LAYOUT$pViewports, OFFSET$pViewports);
    }

    public void pViewportsRaw(@pointer(comment="VkViewport*") MemorySegment value) {
        segment.set(LAYOUT$pViewports, OFFSET$pViewports, value);
    }

    public @Nullable VkViewport pViewports() {
        MemorySegment s = pViewportsRaw();
        if (s.address() == 0) {
            return null;
        }
        return new VkViewport(s);
    }

    public void pViewports(@Nullable VkViewport value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pViewportsRaw(s);
    }

    @unsafe public @Nullable VkViewport[] pViewports(int assumedCount) {
        MemorySegment s = pViewportsRaw();
        if (s.address() == 0) {
            return null;
        }

        s = s.reinterpret(assumedCount * VkViewport.SIZE);
        VkViewport[] ret = new VkViewport[assumedCount];
        for (int i = 0; i < assumedCount; i ++) {
            ret[i] = new VkViewport(s.asSlice(i * VkViewport.SIZE, VkViewport.SIZE));
        }
        return ret;
    }

    public @unsigned int scissorCount() {
        return segment.get(LAYOUT$scissorCount, OFFSET$scissorCount);
    }

    public void scissorCount(@unsigned int value) {
        segment.set(LAYOUT$scissorCount, OFFSET$scissorCount, value);
    }

    public @pointer(comment="VkRect2D*") MemorySegment pScissorsRaw() {
        return segment.get(LAYOUT$pScissors, OFFSET$pScissors);
    }

    public void pScissorsRaw(@pointer(comment="VkRect2D*") MemorySegment value) {
        segment.set(LAYOUT$pScissors, OFFSET$pScissors, value);
    }

    public @Nullable VkRect2D pScissors() {
        MemorySegment s = pScissorsRaw();
        if (s.address() == 0) {
            return null;
        }
        return new VkRect2D(s);
    }

    public void pScissors(@Nullable VkRect2D value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pScissorsRaw(s);
    }

    @unsafe public @Nullable VkRect2D[] pScissors(int assumedCount) {
        MemorySegment s = pScissorsRaw();
        if (s.address() == 0) {
            return null;
        }

        s = s.reinterpret(assumedCount * VkRect2D.SIZE);
        VkRect2D[] ret = new VkRect2D[assumedCount];
        for (int i = 0; i < assumedCount; i ++) {
            ret[i] = new VkRect2D(s.asSlice(i * VkRect2D.SIZE, VkRect2D.SIZE));
        }
        return ret;
    }

}
