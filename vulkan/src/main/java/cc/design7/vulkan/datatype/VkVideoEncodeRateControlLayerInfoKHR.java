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

/// Represents a pointer to a {@code VkVideoEncodeRateControlLayerInfoKHR} structure in native memory.
///
/// The property {@link #segment()} should always be not-null
/// (({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to)
/// {@code LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
/// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
///
/// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
/// perform any runtime check. The constructor can be useful for automatic code generators.
///
/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkVideoEncodeRateControlLayerInfoKHR.html">VkVideoEncodeRateControlLayerInfoKHR</a>
@ValueBasedCandidate
@UnsafeConstructor
public record VkVideoEncodeRateControlLayerInfoKHR(@NotNull MemorySegment segment) implements IPointer {
    public VkVideoEncodeRateControlLayerInfoKHR {
        sType(VkStructureType.VIDEO_ENCODE_RATE_CONTROL_LAYER_INFO_KHR);
    }

    public static VkVideoEncodeRateControlLayerInfoKHR allocate(Arena arena) {
        return new VkVideoEncodeRateControlLayerInfoKHR(arena.allocate(LAYOUT));
    }

    public static VkVideoEncodeRateControlLayerInfoKHR[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkVideoEncodeRateControlLayerInfoKHR[] ret = new VkVideoEncodeRateControlLayerInfoKHR[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkVideoEncodeRateControlLayerInfoKHR(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static VkVideoEncodeRateControlLayerInfoKHR clone(Arena arena, VkVideoEncodeRateControlLayerInfoKHR src) {
        VkVideoEncodeRateControlLayerInfoKHR ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkVideoEncodeRateControlLayerInfoKHR[] clone(Arena arena, VkVideoEncodeRateControlLayerInfoKHR[] src) {
        VkVideoEncodeRateControlLayerInfoKHR[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_LONG.withName("averageBitrate"),
        ValueLayout.JAVA_LONG.withName("maxBitrate"),
        ValueLayout.JAVA_INT.withName("frameRateNumerator"),
        ValueLayout.JAVA_INT.withName("frameRateDenominator")
    );
    public static final long SIZE = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("PATH$sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("PATH$pNext");
    public static final PathElement PATH$averageBitrate = PathElement.groupElement("PATH$averageBitrate");
    public static final PathElement PATH$maxBitrate = PathElement.groupElement("PATH$maxBitrate");
    public static final PathElement PATH$frameRateNumerator = PathElement.groupElement("PATH$frameRateNumerator");
    public static final PathElement PATH$frameRateDenominator = PathElement.groupElement("PATH$frameRateDenominator");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfLong LAYOUT$averageBitrate = (OfLong) LAYOUT.select(PATH$averageBitrate);
    public static final OfLong LAYOUT$maxBitrate = (OfLong) LAYOUT.select(PATH$maxBitrate);
    public static final OfInt LAYOUT$frameRateNumerator = (OfInt) LAYOUT.select(PATH$frameRateNumerator);
    public static final OfInt LAYOUT$frameRateDenominator = (OfInt) LAYOUT.select(PATH$frameRateDenominator);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$averageBitrate = LAYOUT$averageBitrate.byteSize();
    public static final long SIZE$maxBitrate = LAYOUT$maxBitrate.byteSize();
    public static final long SIZE$frameRateNumerator = LAYOUT$frameRateNumerator.byteSize();
    public static final long SIZE$frameRateDenominator = LAYOUT$frameRateDenominator.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$averageBitrate = LAYOUT.byteOffset(PATH$averageBitrate);
    public static final long OFFSET$maxBitrate = LAYOUT.byteOffset(PATH$maxBitrate);
    public static final long OFFSET$frameRateNumerator = LAYOUT.byteOffset(PATH$frameRateNumerator);
    public static final long OFFSET$frameRateDenominator = LAYOUT.byteOffset(PATH$frameRateDenominator);

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

    public @unsigned long averageBitrate() {
        return segment.get(LAYOUT$averageBitrate, OFFSET$averageBitrate);
    }

    public void averageBitrate(@unsigned long value) {
        segment.set(LAYOUT$averageBitrate, OFFSET$averageBitrate, value);
    }

    public @unsigned long maxBitrate() {
        return segment.get(LAYOUT$maxBitrate, OFFSET$maxBitrate);
    }

    public void maxBitrate(@unsigned long value) {
        segment.set(LAYOUT$maxBitrate, OFFSET$maxBitrate, value);
    }

    public @unsigned int frameRateNumerator() {
        return segment.get(LAYOUT$frameRateNumerator, OFFSET$frameRateNumerator);
    }

    public void frameRateNumerator(@unsigned int value) {
        segment.set(LAYOUT$frameRateNumerator, OFFSET$frameRateNumerator, value);
    }

    public @unsigned int frameRateDenominator() {
        return segment.get(LAYOUT$frameRateDenominator, OFFSET$frameRateDenominator);
    }

    public void frameRateDenominator(@unsigned int value) {
        segment.set(LAYOUT$frameRateDenominator, OFFSET$frameRateDenominator, value);
    }

}
