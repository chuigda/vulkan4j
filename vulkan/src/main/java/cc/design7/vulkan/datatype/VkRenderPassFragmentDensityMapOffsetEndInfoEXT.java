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

/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkRenderPassFragmentDensityMapOffsetEndInfoEXT.html">VkRenderPassFragmentDensityMapOffsetEndInfoEXT</a>
@ValueBasedCandidate
public record VkRenderPassFragmentDensityMapOffsetEndInfoEXT(@NotNull MemorySegment segment) implements IPointer {
    public static final OfInt LAYOUT$sType = ValueLayout.JAVA_INT.withName("sType");
    public static final AddressLayout LAYOUT$pNext = ValueLayout.ADDRESS.withName("pNext");
    public static final OfInt LAYOUT$fragmentDensityOffsetCount = ValueLayout.JAVA_INT.withName("fragmentDensityOffsetCount");
    public static final AddressLayout LAYOUT$pFragmentDensityOffsets = ValueLayout.ADDRESS.withTargetLayout(VkOffset2D.LAYOUT).withName("pFragmentDensityOffsets");

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(LAYOUT$sType, LAYOUT$pNext, LAYOUT$fragmentDensityOffsetCount, LAYOUT$pFragmentDensityOffsets);
    public static final long SIZE = LAYOUT.byteSize();

    public static VkRenderPassFragmentDensityMapOffsetEndInfoEXT allocate(Arena arena) {
        return new VkRenderPassFragmentDensityMapOffsetEndInfoEXT(arena.allocate(LAYOUT));
    }

    public static VkRenderPassFragmentDensityMapOffsetEndInfoEXT[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkRenderPassFragmentDensityMapOffsetEndInfoEXT[] ret = new VkRenderPassFragmentDensityMapOffsetEndInfoEXT[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkRenderPassFragmentDensityMapOffsetEndInfoEXT(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static VkRenderPassFragmentDensityMapOffsetEndInfoEXT clone(Arena arena, VkRenderPassFragmentDensityMapOffsetEndInfoEXT src) {
        VkRenderPassFragmentDensityMapOffsetEndInfoEXT ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkRenderPassFragmentDensityMapOffsetEndInfoEXT[] clone(Arena arena, VkRenderPassFragmentDensityMapOffsetEndInfoEXT[] src) {
        VkRenderPassFragmentDensityMapOffsetEndInfoEXT[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final PathElement PATH$sType = PathElement.groupElement("PATH$sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("PATH$pNext");
    public static final PathElement PATH$fragmentDensityOffsetCount = PathElement.groupElement("PATH$fragmentDensityOffsetCount");
    public static final PathElement PATH$pFragmentDensityOffsets = PathElement.groupElement("PATH$pFragmentDensityOffsets");

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$fragmentDensityOffsetCount = LAYOUT$fragmentDensityOffsetCount.byteSize();
    public static final long SIZE$pFragmentDensityOffsets = LAYOUT$pFragmentDensityOffsets.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$fragmentDensityOffsetCount = LAYOUT.byteOffset(PATH$fragmentDensityOffsetCount);
    public static final long OFFSET$pFragmentDensityOffsets = LAYOUT.byteOffset(PATH$pFragmentDensityOffsets);

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

    public @unsigned int fragmentDensityOffsetCount() {
        return segment.get(LAYOUT$fragmentDensityOffsetCount, OFFSET$fragmentDensityOffsetCount);
    }

    public void fragmentDensityOffsetCount(@unsigned int value) {
        segment.set(LAYOUT$fragmentDensityOffsetCount, OFFSET$fragmentDensityOffsetCount, value);
    }

    public @pointer(comment="VkOffset2D*") MemorySegment pFragmentDensityOffsetsRaw() {
        return segment.get(LAYOUT$pFragmentDensityOffsets, OFFSET$pFragmentDensityOffsets);
    }

    public void pFragmentDensityOffsetsRaw(@pointer(comment="VkOffset2D*") MemorySegment value) {
        segment.set(LAYOUT$pFragmentDensityOffsets, OFFSET$pFragmentDensityOffsets, value);
    }

    public @Nullable VkOffset2D pFragmentDensityOffsets() {
        MemorySegment s = pFragmentDensityOffsetsRaw();
        if (s.address() == 0) {
            return null;
        }
        return new VkOffset2D(s);
    }

    public void pFragmentDensityOffsets(@Nullable VkOffset2D value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pFragmentDensityOffsetsRaw(s);
    }

    @unsafe public @Nullable VkOffset2D[] pFragmentDensityOffsets(int assumedCount) {
        MemorySegment s = pFragmentDensityOffsetsRaw();
        if (s.address() == 0) {
            return null;
        }

        s = s.reinterpret(assumedCount * VkOffset2D.SIZE);
        VkOffset2D[] ret = new VkOffset2D[assumedCount];
        for (int i = 0; i < assumedCount; i ++) {
            ret[i] = new VkOffset2D(s.asSlice(i * VkOffset2D.SIZE, VkOffset2D.SIZE));
        }
        return ret;
    }

}
