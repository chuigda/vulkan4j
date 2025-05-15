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

/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkPushConstantsInfo.html">VkPushConstantsInfo</a>
@ValueBasedCandidate
public record VkPushConstantsInfo(@NotNull MemorySegment segment) implements IPointer {
    public static final OfInt LAYOUT$sType = ValueLayout.JAVA_INT.withName("sType");
    public static final AddressLayout LAYOUT$pNext = ValueLayout.ADDRESS.withName("pNext");
    public static final AddressLayout LAYOUT$layout = ValueLayout.ADDRESS.withName("layout");
    public static final OfInt LAYOUT$stageFlags = ValueLayout.JAVA_INT.withName("stageFlags");
    public static final OfInt LAYOUT$offset = ValueLayout.JAVA_INT.withName("offset");
    public static final OfInt LAYOUT$size = ValueLayout.JAVA_INT.withName("size");
    public static final AddressLayout LAYOUT$pValues = ValueLayout.ADDRESS.withName("pValues");

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(LAYOUT$sType, LAYOUT$pNext, LAYOUT$layout, LAYOUT$stageFlags, LAYOUT$offset, LAYOUT$size, LAYOUT$pValues);
    public static final long SIZE = LAYOUT.byteSize();

    public static VkPushConstantsInfo allocate(Arena arena) {
        return new VkPushConstantsInfo(arena.allocate(LAYOUT));
    }

    public static VkPushConstantsInfo[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkPushConstantsInfo[] ret = new VkPushConstantsInfo[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkPushConstantsInfo(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static VkPushConstantsInfo clone(Arena arena, VkPushConstantsInfo src) {
        VkPushConstantsInfo ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkPushConstantsInfo[] clone(Arena arena, VkPushConstantsInfo[] src) {
        VkPushConstantsInfo[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final PathElement PATH$sType = PathElement.groupElement("PATH$sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("PATH$pNext");
    public static final PathElement PATH$layout = PathElement.groupElement("PATH$layout");
    public static final PathElement PATH$stageFlags = PathElement.groupElement("PATH$stageFlags");
    public static final PathElement PATH$offset = PathElement.groupElement("PATH$offset");
    public static final PathElement PATH$size = PathElement.groupElement("PATH$size");
    public static final PathElement PATH$pValues = PathElement.groupElement("PATH$pValues");

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$layout = LAYOUT$layout.byteSize();
    public static final long SIZE$stageFlags = LAYOUT$stageFlags.byteSize();
    public static final long SIZE$offset = LAYOUT$offset.byteSize();
    public static final long SIZE$size = LAYOUT$size.byteSize();
    public static final long SIZE$pValues = LAYOUT$pValues.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$layout = LAYOUT.byteOffset(PATH$layout);
    public static final long OFFSET$stageFlags = LAYOUT.byteOffset(PATH$stageFlags);
    public static final long OFFSET$offset = LAYOUT.byteOffset(PATH$offset);
    public static final long OFFSET$size = LAYOUT.byteOffset(PATH$size);
    public static final long OFFSET$pValues = LAYOUT.byteOffset(PATH$pValues);

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

    public @Nullable VkPipelineLayout layout() {
        MemorySegment s = segment.asSlice(OFFSET$layout, SIZE$layout);
        if (s.address() == 0) {
            return null;
        }
        return new VkPipelineLayout(s);
    }

    public void layout(@Nullable VkPipelineLayout value) {
        segment.set(LAYOUT$layout, OFFSET$layout, value != null ? value.segment() : MemorySegment.NULL);
    }

    public @enumtype(VkShaderStageFlags.class) int stageFlags() {
        return segment.get(LAYOUT$stageFlags, OFFSET$stageFlags);
    }

    public void stageFlags(@enumtype(VkShaderStageFlags.class) int value) {
        segment.set(LAYOUT$stageFlags, OFFSET$stageFlags, value);
    }

    public @unsigned int offset() {
        return segment.get(LAYOUT$offset, OFFSET$offset);
    }

    public void offset(@unsigned int value) {
        segment.set(LAYOUT$offset, OFFSET$offset, value);
    }

    public @unsigned int size() {
        return segment.get(LAYOUT$size, OFFSET$size);
    }

    public void size(@unsigned int value) {
        segment.set(LAYOUT$size, OFFSET$size, value);
    }

    public @pointer(comment="void*") MemorySegment pValues() {
        return segment.get(LAYOUT$pValues, OFFSET$pValues);
    }

    public void pValues(@pointer(comment="void*") MemorySegment value) {
        segment.set(LAYOUT$pValues, OFFSET$pValues, value);
    }

    public void pValues(IPointer pointer) {
        pValues(pointer.segment());
    }

}
