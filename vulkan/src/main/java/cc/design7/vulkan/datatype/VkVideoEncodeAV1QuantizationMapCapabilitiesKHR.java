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

/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkVideoEncodeAV1QuantizationMapCapabilitiesKHR.html">VkVideoEncodeAV1QuantizationMapCapabilitiesKHR</a>
@ValueBasedCandidate
public record VkVideoEncodeAV1QuantizationMapCapabilitiesKHR(@NotNull MemorySegment segment) implements IPointer {
    public static final OfInt LAYOUT$sType = ValueLayout.JAVA_INT.withName("sType");
    public static final AddressLayout LAYOUT$pNext = ValueLayout.ADDRESS.withName("pNext");
    public static final OfInt LAYOUT$minQIndexDelta = ValueLayout.JAVA_INT.withName("minQIndexDelta");
    public static final OfInt LAYOUT$maxQIndexDelta = ValueLayout.JAVA_INT.withName("maxQIndexDelta");

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(LAYOUT$sType, LAYOUT$pNext, LAYOUT$minQIndexDelta, LAYOUT$maxQIndexDelta);
    public static final long SIZE = LAYOUT.byteSize();

    public static VkVideoEncodeAV1QuantizationMapCapabilitiesKHR allocate(Arena arena) {
        return new VkVideoEncodeAV1QuantizationMapCapabilitiesKHR(arena.allocate(LAYOUT));
    }

    public static VkVideoEncodeAV1QuantizationMapCapabilitiesKHR[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkVideoEncodeAV1QuantizationMapCapabilitiesKHR[] ret = new VkVideoEncodeAV1QuantizationMapCapabilitiesKHR[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkVideoEncodeAV1QuantizationMapCapabilitiesKHR(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static VkVideoEncodeAV1QuantizationMapCapabilitiesKHR clone(Arena arena, VkVideoEncodeAV1QuantizationMapCapabilitiesKHR src) {
        VkVideoEncodeAV1QuantizationMapCapabilitiesKHR ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkVideoEncodeAV1QuantizationMapCapabilitiesKHR[] clone(Arena arena, VkVideoEncodeAV1QuantizationMapCapabilitiesKHR[] src) {
        VkVideoEncodeAV1QuantizationMapCapabilitiesKHR[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final PathElement PATH$sType = PathElement.groupElement("PATH$sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("PATH$pNext");
    public static final PathElement PATH$minQIndexDelta = PathElement.groupElement("PATH$minQIndexDelta");
    public static final PathElement PATH$maxQIndexDelta = PathElement.groupElement("PATH$maxQIndexDelta");

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$minQIndexDelta = LAYOUT$minQIndexDelta.byteSize();
    public static final long SIZE$maxQIndexDelta = LAYOUT$maxQIndexDelta.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$minQIndexDelta = LAYOUT.byteOffset(PATH$minQIndexDelta);
    public static final long OFFSET$maxQIndexDelta = LAYOUT.byteOffset(PATH$maxQIndexDelta);

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

    public int minQIndexDelta() {
        return segment.get(LAYOUT$minQIndexDelta, OFFSET$minQIndexDelta);
    }

    public void minQIndexDelta(int value) {
        segment.set(LAYOUT$minQIndexDelta, OFFSET$minQIndexDelta, value);
    }

    public int maxQIndexDelta() {
        return segment.get(LAYOUT$maxQIndexDelta, OFFSET$maxQIndexDelta);
    }

    public void maxQIndexDelta(int value) {
        segment.set(LAYOUT$maxQIndexDelta, OFFSET$maxQIndexDelta, value);
    }

}
