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

/// Represents a pointer to a {@code VkVideoEncodeH265RateControlInfoKHR} structure in native memory.
///
/// The property {@link #segment()} should always be not-null
/// (({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to)
/// {@code LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
/// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
///
/// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
/// perform any runtime check. The constructor can be useful for automatic code generators.
///
/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkVideoEncodeH265RateControlInfoKHR.html">VkVideoEncodeH265RateControlInfoKHR</a>
@ValueBasedCandidate
@UnsafeConstructor
public record VkVideoEncodeH265RateControlInfoKHR(@NotNull MemorySegment segment) implements IPointer {
    public VkVideoEncodeH265RateControlInfoKHR {
        sType(VkStructureType.VIDEO_ENCODE_H265_RATE_CONTROL_INFO_KHR);
    }

    public static VkVideoEncodeH265RateControlInfoKHR allocate(Arena arena) {
        return new VkVideoEncodeH265RateControlInfoKHR(arena.allocate(LAYOUT));
    }

    public static VkVideoEncodeH265RateControlInfoKHR[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkVideoEncodeH265RateControlInfoKHR[] ret = new VkVideoEncodeH265RateControlInfoKHR[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkVideoEncodeH265RateControlInfoKHR(segment.asSlice(i * BYTES, BYTES));
        }
        return ret;
    }

    public static VkVideoEncodeH265RateControlInfoKHR clone(Arena arena, VkVideoEncodeH265RateControlInfoKHR src) {
        VkVideoEncodeH265RateControlInfoKHR ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkVideoEncodeH265RateControlInfoKHR[] clone(Arena arena, VkVideoEncodeH265RateControlInfoKHR[] src) {
        VkVideoEncodeH265RateControlInfoKHR[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("flags"),
        ValueLayout.JAVA_INT.withName("gopFrameCount"),
        ValueLayout.JAVA_INT.withName("idrPeriod"),
        ValueLayout.JAVA_INT.withName("consecutiveBFrameCount"),
        ValueLayout.JAVA_INT.withName("subLayerCount")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("PATH$sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("PATH$pNext");
    public static final PathElement PATH$flags = PathElement.groupElement("PATH$flags");
    public static final PathElement PATH$gopFrameCount = PathElement.groupElement("PATH$gopFrameCount");
    public static final PathElement PATH$idrPeriod = PathElement.groupElement("PATH$idrPeriod");
    public static final PathElement PATH$consecutiveBFrameCount = PathElement.groupElement("PATH$consecutiveBFrameCount");
    public static final PathElement PATH$subLayerCount = PathElement.groupElement("PATH$subLayerCount");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$flags = (OfInt) LAYOUT.select(PATH$flags);
    public static final OfInt LAYOUT$gopFrameCount = (OfInt) LAYOUT.select(PATH$gopFrameCount);
    public static final OfInt LAYOUT$idrPeriod = (OfInt) LAYOUT.select(PATH$idrPeriod);
    public static final OfInt LAYOUT$consecutiveBFrameCount = (OfInt) LAYOUT.select(PATH$consecutiveBFrameCount);
    public static final OfInt LAYOUT$subLayerCount = (OfInt) LAYOUT.select(PATH$subLayerCount);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$flags = LAYOUT$flags.byteSize();
    public static final long SIZE$gopFrameCount = LAYOUT$gopFrameCount.byteSize();
    public static final long SIZE$idrPeriod = LAYOUT$idrPeriod.byteSize();
    public static final long SIZE$consecutiveBFrameCount = LAYOUT$consecutiveBFrameCount.byteSize();
    public static final long SIZE$subLayerCount = LAYOUT$subLayerCount.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$flags = LAYOUT.byteOffset(PATH$flags);
    public static final long OFFSET$gopFrameCount = LAYOUT.byteOffset(PATH$gopFrameCount);
    public static final long OFFSET$idrPeriod = LAYOUT.byteOffset(PATH$idrPeriod);
    public static final long OFFSET$consecutiveBFrameCount = LAYOUT.byteOffset(PATH$consecutiveBFrameCount);
    public static final long OFFSET$subLayerCount = LAYOUT.byteOffset(PATH$subLayerCount);

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

    public @enumtype(VkVideoEncodeH265RateControlFlagsKHR.class) int flags() {
        return segment.get(LAYOUT$flags, OFFSET$flags);
    }

    public void flags(@enumtype(VkVideoEncodeH265RateControlFlagsKHR.class) int value) {
        segment.set(LAYOUT$flags, OFFSET$flags, value);
    }

    public @unsigned int gopFrameCount() {
        return segment.get(LAYOUT$gopFrameCount, OFFSET$gopFrameCount);
    }

    public void gopFrameCount(@unsigned int value) {
        segment.set(LAYOUT$gopFrameCount, OFFSET$gopFrameCount, value);
    }

    public @unsigned int idrPeriod() {
        return segment.get(LAYOUT$idrPeriod, OFFSET$idrPeriod);
    }

    public void idrPeriod(@unsigned int value) {
        segment.set(LAYOUT$idrPeriod, OFFSET$idrPeriod, value);
    }

    public @unsigned int consecutiveBFrameCount() {
        return segment.get(LAYOUT$consecutiveBFrameCount, OFFSET$consecutiveBFrameCount);
    }

    public void consecutiveBFrameCount(@unsigned int value) {
        segment.set(LAYOUT$consecutiveBFrameCount, OFFSET$consecutiveBFrameCount, value);
    }

    public @unsigned int subLayerCount() {
        return segment.get(LAYOUT$subLayerCount, OFFSET$subLayerCount);
    }

    public void subLayerCount(@unsigned int value) {
        segment.set(LAYOUT$subLayerCount, OFFSET$subLayerCount, value);
    }

}
