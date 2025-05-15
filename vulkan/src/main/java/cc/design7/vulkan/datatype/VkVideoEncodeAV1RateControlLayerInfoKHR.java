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

/// Represents a pointer to a <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkVideoEncodeAV1RateControlLayerInfoKHR.html"><code>VkVideoEncodeAV1RateControlLayerInfoKHR</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct VkVideoEncodeAV1RateControlLayerInfoKHR {
///     VkStructureType sType;
///     void const* pNext;
///     VkBool32 useMinQIndex;
///     VkVideoEncodeAV1QIndexKHR minQIndex;
///     VkBool32 useMaxQIndex;
///     VkVideoEncodeAV1QIndexKHR maxQIndex;
///     VkBool32 useMaxFrameSize;
///     VkVideoEncodeAV1FrameSizeKHR maxFrameSize;
/// } VkVideoEncodeAV1RateControlLayerInfoKHR;
/// }
///
/// ## Auto initialization
/// This structure has the following members that can be automatically initialized:
/// - `sType = VK_STRUCTURE_TYPE_VIDEO_ENCODE_AV1_RATE_CONTROL_LAYER_INFO_KHR`
///
/// The {@link VkVideoEncodeAV1RateControlLayerInfoKHR#allocate} functions will automatically initialize these fields.
/// Also, you may call {@link VkVideoEncodeAV1RateControlLayerInfoKHR#autoInit} to initialize these fields manually for
/// non-allocated instances.
///
/// ## Contracts
/// The property {@link #segment()} should always be not-null
/// (({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to)
/// {@code LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
/// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
///
/// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
/// perform any runtime check. The constructor can be useful for automatic code generators.
///
/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkVideoEncodeAV1RateControlLayerInfoKHR.html"><code>VkVideoEncodeAV1RateControlLayerInfoKHR</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record VkVideoEncodeAV1RateControlLayerInfoKHR(@NotNull MemorySegment segment) implements IPointer {
    public static VkVideoEncodeAV1RateControlLayerInfoKHR allocate(Arena arena) {
        VkVideoEncodeAV1RateControlLayerInfoKHR ret = new VkVideoEncodeAV1RateControlLayerInfoKHR(arena.allocate(LAYOUT));
        ret.sType(VkStructureType.VIDEO_ENCODE_AV1_RATE_CONTROL_LAYER_INFO_KHR);
        return ret;
    }

    public static VkVideoEncodeAV1RateControlLayerInfoKHR[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkVideoEncodeAV1RateControlLayerInfoKHR[] ret = new VkVideoEncodeAV1RateControlLayerInfoKHR[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkVideoEncodeAV1RateControlLayerInfoKHR(segment.asSlice(i * BYTES, BYTES));
            ret[i].sType(VkStructureType.VIDEO_ENCODE_AV1_RATE_CONTROL_LAYER_INFO_KHR);
        }
        return ret;
    }

    public static VkVideoEncodeAV1RateControlLayerInfoKHR clone(Arena arena, VkVideoEncodeAV1RateControlLayerInfoKHR src) {
        VkVideoEncodeAV1RateControlLayerInfoKHR ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkVideoEncodeAV1RateControlLayerInfoKHR[] clone(Arena arena, VkVideoEncodeAV1RateControlLayerInfoKHR[] src) {
        VkVideoEncodeAV1RateControlLayerInfoKHR[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public void autoInit() {
        sType(VkStructureType.VIDEO_ENCODE_AV1_RATE_CONTROL_LAYER_INFO_KHR);
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

    public void pNext(IPointer pointer) {
        pNext(pointer.segment());
    }

    public @unsigned int useMinQIndex() {
        return segment.get(LAYOUT$useMinQIndex, OFFSET$useMinQIndex);
    }

    public void useMinQIndex(@unsigned int value) {
        segment.set(LAYOUT$useMinQIndex, OFFSET$useMinQIndex, value);
    }

    public VkVideoEncodeAV1QIndexKHR minQIndex() {
        return new VkVideoEncodeAV1QIndexKHR(segment.asSlice(OFFSET$minQIndex, LAYOUT$minQIndex));
    }

    public void minQIndex(VkVideoEncodeAV1QIndexKHR value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$minQIndex, SIZE$minQIndex);
    }

    public @unsigned int useMaxQIndex() {
        return segment.get(LAYOUT$useMaxQIndex, OFFSET$useMaxQIndex);
    }

    public void useMaxQIndex(@unsigned int value) {
        segment.set(LAYOUT$useMaxQIndex, OFFSET$useMaxQIndex, value);
    }

    public VkVideoEncodeAV1QIndexKHR maxQIndex() {
        return new VkVideoEncodeAV1QIndexKHR(segment.asSlice(OFFSET$maxQIndex, LAYOUT$maxQIndex));
    }

    public void maxQIndex(VkVideoEncodeAV1QIndexKHR value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$maxQIndex, SIZE$maxQIndex);
    }

    public @unsigned int useMaxFrameSize() {
        return segment.get(LAYOUT$useMaxFrameSize, OFFSET$useMaxFrameSize);
    }

    public void useMaxFrameSize(@unsigned int value) {
        segment.set(LAYOUT$useMaxFrameSize, OFFSET$useMaxFrameSize, value);
    }

    public VkVideoEncodeAV1FrameSizeKHR maxFrameSize() {
        return new VkVideoEncodeAV1FrameSizeKHR(segment.asSlice(OFFSET$maxFrameSize, LAYOUT$maxFrameSize));
    }

    public void maxFrameSize(VkVideoEncodeAV1FrameSizeKHR value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$maxFrameSize, SIZE$maxFrameSize);
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("useMinQIndex"),
        VkVideoEncodeAV1QIndexKHR.LAYOUT.withName("minQIndex"),
        ValueLayout.JAVA_INT.withName("useMaxQIndex"),
        VkVideoEncodeAV1QIndexKHR.LAYOUT.withName("maxQIndex"),
        ValueLayout.JAVA_INT.withName("useMaxFrameSize"),
        VkVideoEncodeAV1FrameSizeKHR.LAYOUT.withName("maxFrameSize")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("PATH$sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("PATH$pNext");
    public static final PathElement PATH$useMinQIndex = PathElement.groupElement("PATH$useMinQIndex");
    public static final PathElement PATH$minQIndex = PathElement.groupElement("PATH$minQIndex");
    public static final PathElement PATH$useMaxQIndex = PathElement.groupElement("PATH$useMaxQIndex");
    public static final PathElement PATH$maxQIndex = PathElement.groupElement("PATH$maxQIndex");
    public static final PathElement PATH$useMaxFrameSize = PathElement.groupElement("PATH$useMaxFrameSize");
    public static final PathElement PATH$maxFrameSize = PathElement.groupElement("PATH$maxFrameSize");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$useMinQIndex = (OfInt) LAYOUT.select(PATH$useMinQIndex);
    public static final StructLayout LAYOUT$minQIndex = (StructLayout) LAYOUT.select(PATH$minQIndex);
    public static final OfInt LAYOUT$useMaxQIndex = (OfInt) LAYOUT.select(PATH$useMaxQIndex);
    public static final StructLayout LAYOUT$maxQIndex = (StructLayout) LAYOUT.select(PATH$maxQIndex);
    public static final OfInt LAYOUT$useMaxFrameSize = (OfInt) LAYOUT.select(PATH$useMaxFrameSize);
    public static final StructLayout LAYOUT$maxFrameSize = (StructLayout) LAYOUT.select(PATH$maxFrameSize);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$useMinQIndex = LAYOUT$useMinQIndex.byteSize();
    public static final long SIZE$minQIndex = LAYOUT$minQIndex.byteSize();
    public static final long SIZE$useMaxQIndex = LAYOUT$useMaxQIndex.byteSize();
    public static final long SIZE$maxQIndex = LAYOUT$maxQIndex.byteSize();
    public static final long SIZE$useMaxFrameSize = LAYOUT$useMaxFrameSize.byteSize();
    public static final long SIZE$maxFrameSize = LAYOUT$maxFrameSize.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$useMinQIndex = LAYOUT.byteOffset(PATH$useMinQIndex);
    public static final long OFFSET$minQIndex = LAYOUT.byteOffset(PATH$minQIndex);
    public static final long OFFSET$useMaxQIndex = LAYOUT.byteOffset(PATH$useMaxQIndex);
    public static final long OFFSET$maxQIndex = LAYOUT.byteOffset(PATH$maxQIndex);
    public static final long OFFSET$useMaxFrameSize = LAYOUT.byteOffset(PATH$useMaxFrameSize);
    public static final long OFFSET$maxFrameSize = LAYOUT.byteOffset(PATH$maxFrameSize);
}
