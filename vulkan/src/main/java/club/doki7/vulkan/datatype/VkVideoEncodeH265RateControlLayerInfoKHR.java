package club.doki7.vulkan.datatype;

import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;

import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.NotNull;
import club.doki7.ffm.IPointer;
import club.doki7.ffm.NativeLayout;
import club.doki7.ffm.annotation.*;
import club.doki7.ffm.ptr.*;
import club.doki7.vulkan.bitmask.*;
import club.doki7.vulkan.handle.*;
import club.doki7.vulkan.enumtype.*;
import static club.doki7.vulkan.VkConstants.*;

/// Represents a pointer to a <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkVideoEncodeH265RateControlLayerInfoKHR.html"><code>VkVideoEncodeH265RateControlLayerInfoKHR</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct VkVideoEncodeH265RateControlLayerInfoKHR {
///     VkStructureType sType; // @link substring="VkStructureType" target="VkStructureType" @link substring="sType" target="#sType"
///     void const* pNext; // optional // @link substring="pNext" target="#pNext"
///     VkBool32 useMinQp; // @link substring="useMinQp" target="#useMinQp"
///     VkVideoEncodeH265QpKHR minQp; // @link substring="VkVideoEncodeH265QpKHR" target="VkVideoEncodeH265QpKHR" @link substring="minQp" target="#minQp"
///     VkBool32 useMaxQp; // @link substring="useMaxQp" target="#useMaxQp"
///     VkVideoEncodeH265QpKHR maxQp; // @link substring="VkVideoEncodeH265QpKHR" target="VkVideoEncodeH265QpKHR" @link substring="maxQp" target="#maxQp"
///     VkBool32 useMaxFrameSize; // @link substring="useMaxFrameSize" target="#useMaxFrameSize"
///     VkVideoEncodeH265FrameSizeKHR maxFrameSize; // @link substring="VkVideoEncodeH265FrameSizeKHR" target="VkVideoEncodeH265FrameSizeKHR" @link substring="maxFrameSize" target="#maxFrameSize"
/// } VkVideoEncodeH265RateControlLayerInfoKHR;
/// }
///
/// ## Auto initialization
/// This structure has the following members that can be automatically initialized:
/// - `sType = VK_STRUCTURE_TYPE_VIDEO_ENCODE_H265_RATE_CONTROL_LAYER_INFO_KHR`
///
/// The {@code allocate} ({@link VkVideoEncodeH265RateControlLayerInfoKHR#allocate(Arena)}, {@link VkVideoEncodeH265RateControlLayerInfoKHR#allocate(Arena, int)})
/// functions will automatically initialize these fields. Also, you may call {@link VkVideoEncodeH265RateControlLayerInfoKHR#autoInit}
/// to initialize these fields manually for non-allocated instances.
/// ## Contracts
///
/// The property {@link #segment()} should always be not-null
/// (({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to)
/// {@code LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
/// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
///
/// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
/// perform any runtime check. The constructor can be useful for automatic code generators.
///
/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkVideoEncodeH265RateControlLayerInfoKHR.html"><code>VkVideoEncodeH265RateControlLayerInfoKHR</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record VkVideoEncodeH265RateControlLayerInfoKHR(@NotNull MemorySegment segment) implements IPointer {
    public static VkVideoEncodeH265RateControlLayerInfoKHR allocate(Arena arena) {
        VkVideoEncodeH265RateControlLayerInfoKHR ret = new VkVideoEncodeH265RateControlLayerInfoKHR(arena.allocate(LAYOUT));
        ret.sType(VkStructureType.VIDEO_ENCODE_H265_RATE_CONTROL_LAYER_INFO_KHR);
        return ret;
    }

    public static VkVideoEncodeH265RateControlLayerInfoKHR[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkVideoEncodeH265RateControlLayerInfoKHR[] ret = new VkVideoEncodeH265RateControlLayerInfoKHR[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkVideoEncodeH265RateControlLayerInfoKHR(segment.asSlice(i * BYTES, BYTES));
            ret[i].sType(VkStructureType.VIDEO_ENCODE_H265_RATE_CONTROL_LAYER_INFO_KHR);
        }
        return ret;
    }

    public static VkVideoEncodeH265RateControlLayerInfoKHR clone(Arena arena, VkVideoEncodeH265RateControlLayerInfoKHR src) {
        VkVideoEncodeH265RateControlLayerInfoKHR ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkVideoEncodeH265RateControlLayerInfoKHR[] clone(Arena arena, VkVideoEncodeH265RateControlLayerInfoKHR[] src) {
        VkVideoEncodeH265RateControlLayerInfoKHR[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public void autoInit() {
        sType(VkStructureType.VIDEO_ENCODE_H265_RATE_CONTROL_LAYER_INFO_KHR);
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
        pNext(pointer != null ? pointer.segment() : MemorySegment.NULL);
    }

    public @unsigned int useMinQp() {
        return segment.get(LAYOUT$useMinQp, OFFSET$useMinQp);
    }

    public void useMinQp(@unsigned int value) {
        segment.set(LAYOUT$useMinQp, OFFSET$useMinQp, value);
    }

    public @NotNull VkVideoEncodeH265QpKHR minQp() {
        return new VkVideoEncodeH265QpKHR(segment.asSlice(OFFSET$minQp, LAYOUT$minQp));
    }

    public void minQp(@NotNull VkVideoEncodeH265QpKHR value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$minQp, SIZE$minQp);
    }

    public @unsigned int useMaxQp() {
        return segment.get(LAYOUT$useMaxQp, OFFSET$useMaxQp);
    }

    public void useMaxQp(@unsigned int value) {
        segment.set(LAYOUT$useMaxQp, OFFSET$useMaxQp, value);
    }

    public @NotNull VkVideoEncodeH265QpKHR maxQp() {
        return new VkVideoEncodeH265QpKHR(segment.asSlice(OFFSET$maxQp, LAYOUT$maxQp));
    }

    public void maxQp(@NotNull VkVideoEncodeH265QpKHR value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$maxQp, SIZE$maxQp);
    }

    public @unsigned int useMaxFrameSize() {
        return segment.get(LAYOUT$useMaxFrameSize, OFFSET$useMaxFrameSize);
    }

    public void useMaxFrameSize(@unsigned int value) {
        segment.set(LAYOUT$useMaxFrameSize, OFFSET$useMaxFrameSize, value);
    }

    public @NotNull VkVideoEncodeH265FrameSizeKHR maxFrameSize() {
        return new VkVideoEncodeH265FrameSizeKHR(segment.asSlice(OFFSET$maxFrameSize, LAYOUT$maxFrameSize));
    }

    public void maxFrameSize(@NotNull VkVideoEncodeH265FrameSizeKHR value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$maxFrameSize, SIZE$maxFrameSize);
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("useMinQp"),
        VkVideoEncodeH265QpKHR.LAYOUT.withName("minQp"),
        ValueLayout.JAVA_INT.withName("useMaxQp"),
        VkVideoEncodeH265QpKHR.LAYOUT.withName("maxQp"),
        ValueLayout.JAVA_INT.withName("useMaxFrameSize"),
        VkVideoEncodeH265FrameSizeKHR.LAYOUT.withName("maxFrameSize")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("PATH$sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("PATH$pNext");
    public static final PathElement PATH$useMinQp = PathElement.groupElement("PATH$useMinQp");
    public static final PathElement PATH$minQp = PathElement.groupElement("PATH$minQp");
    public static final PathElement PATH$useMaxQp = PathElement.groupElement("PATH$useMaxQp");
    public static final PathElement PATH$maxQp = PathElement.groupElement("PATH$maxQp");
    public static final PathElement PATH$useMaxFrameSize = PathElement.groupElement("PATH$useMaxFrameSize");
    public static final PathElement PATH$maxFrameSize = PathElement.groupElement("PATH$maxFrameSize");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$useMinQp = (OfInt) LAYOUT.select(PATH$useMinQp);
    public static final StructLayout LAYOUT$minQp = (StructLayout) LAYOUT.select(PATH$minQp);
    public static final OfInt LAYOUT$useMaxQp = (OfInt) LAYOUT.select(PATH$useMaxQp);
    public static final StructLayout LAYOUT$maxQp = (StructLayout) LAYOUT.select(PATH$maxQp);
    public static final OfInt LAYOUT$useMaxFrameSize = (OfInt) LAYOUT.select(PATH$useMaxFrameSize);
    public static final StructLayout LAYOUT$maxFrameSize = (StructLayout) LAYOUT.select(PATH$maxFrameSize);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$useMinQp = LAYOUT$useMinQp.byteSize();
    public static final long SIZE$minQp = LAYOUT$minQp.byteSize();
    public static final long SIZE$useMaxQp = LAYOUT$useMaxQp.byteSize();
    public static final long SIZE$maxQp = LAYOUT$maxQp.byteSize();
    public static final long SIZE$useMaxFrameSize = LAYOUT$useMaxFrameSize.byteSize();
    public static final long SIZE$maxFrameSize = LAYOUT$maxFrameSize.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$useMinQp = LAYOUT.byteOffset(PATH$useMinQp);
    public static final long OFFSET$minQp = LAYOUT.byteOffset(PATH$minQp);
    public static final long OFFSET$useMaxQp = LAYOUT.byteOffset(PATH$useMaxQp);
    public static final long OFFSET$maxQp = LAYOUT.byteOffset(PATH$maxQp);
    public static final long OFFSET$useMaxFrameSize = LAYOUT.byteOffset(PATH$useMaxFrameSize);
    public static final long OFFSET$maxFrameSize = LAYOUT.byteOffset(PATH$maxFrameSize);
}
