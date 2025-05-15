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

/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkBlitImageCubicWeightsInfoQCOM.html">VkBlitImageCubicWeightsInfoQCOM</a>
@ValueBasedCandidate
public record VkBlitImageCubicWeightsInfoQCOM(@NotNull MemorySegment segment) implements IPointer {
    public static final OfInt LAYOUT$sType = ValueLayout.JAVA_INT.withName("sType");
    public static final AddressLayout LAYOUT$pNext = ValueLayout.ADDRESS.withName("pNext");
    public static final OfInt LAYOUT$cubicWeights = ValueLayout.JAVA_INT.withName("cubicWeights");

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(LAYOUT$sType, LAYOUT$pNext, LAYOUT$cubicWeights);
    public static final long SIZE = LAYOUT.byteSize();

    public static VkBlitImageCubicWeightsInfoQCOM allocate(Arena arena) {
        return new VkBlitImageCubicWeightsInfoQCOM(arena.allocate(LAYOUT));
    }

    public static VkBlitImageCubicWeightsInfoQCOM[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkBlitImageCubicWeightsInfoQCOM[] ret = new VkBlitImageCubicWeightsInfoQCOM[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkBlitImageCubicWeightsInfoQCOM(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static VkBlitImageCubicWeightsInfoQCOM clone(Arena arena, VkBlitImageCubicWeightsInfoQCOM src) {
        VkBlitImageCubicWeightsInfoQCOM ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkBlitImageCubicWeightsInfoQCOM[] clone(Arena arena, VkBlitImageCubicWeightsInfoQCOM[] src) {
        VkBlitImageCubicWeightsInfoQCOM[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final PathElement PATH$sType = PathElement.groupElement("PATH$sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("PATH$pNext");
    public static final PathElement PATH$cubicWeights = PathElement.groupElement("PATH$cubicWeights");

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$cubicWeights = LAYOUT$cubicWeights.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$cubicWeights = LAYOUT.byteOffset(PATH$cubicWeights);

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

    public @enumtype(VkCubicFilterWeightsQCOM.class) int cubicWeights() {
        return segment.get(LAYOUT$cubicWeights, OFFSET$cubicWeights);
    }

    public void cubicWeights(@enumtype(VkCubicFilterWeightsQCOM.class) int value) {
        segment.set(LAYOUT$cubicWeights, OFFSET$cubicWeights, value);
    }

}
