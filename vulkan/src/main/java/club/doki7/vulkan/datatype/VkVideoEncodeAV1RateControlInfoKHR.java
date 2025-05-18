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

/// Represents a pointer to a <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkVideoEncodeAV1RateControlInfoKHR.html"><code>VkVideoEncodeAV1RateControlInfoKHR</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct VkVideoEncodeAV1RateControlInfoKHR {
///     VkStructureType sType; // @link substring="VkStructureType" target="VkStructureType" @link substring="sType" target="#sType"
///     void const* pNext; // optional // @link substring="pNext" target="#pNext"
///     VkVideoEncodeAV1RateControlFlagsKHR flags; // optional // @link substring="VkVideoEncodeAV1RateControlFlagsKHR" target="VkVideoEncodeAV1RateControlFlagsKHR" @link substring="flags" target="#flags"
///     uint32_t gopFrameCount; // @link substring="gopFrameCount" target="#gopFrameCount"
///     uint32_t keyFramePeriod; // @link substring="keyFramePeriod" target="#keyFramePeriod"
///     uint32_t consecutiveBipredictiveFrameCount; // @link substring="consecutiveBipredictiveFrameCount" target="#consecutiveBipredictiveFrameCount"
///     uint32_t temporalLayerCount; // @link substring="temporalLayerCount" target="#temporalLayerCount"
/// } VkVideoEncodeAV1RateControlInfoKHR;
/// }
///
/// ## Auto initialization
/// This structure has the following members that can be automatically initialized:
/// - `sType = VK_STRUCTURE_TYPE_VIDEO_ENCODE_AV1_RATE_CONTROL_INFO_KHR`
///
/// The {@code allocate} ({@link VkVideoEncodeAV1RateControlInfoKHR#allocate(Arena)}, {@link VkVideoEncodeAV1RateControlInfoKHR#allocate(Arena, int)})
/// functions will automatically initialize these fields. Also, you may call {@link VkVideoEncodeAV1RateControlInfoKHR#autoInit}
/// to initialize these fields manually for non-allocated instances.
/// ## Contracts
///
/// The property {@link #segment()} should always be not-null
/// (({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to
/// {@code LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
/// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
///
/// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
/// perform any runtime check. The constructor can be useful for automatic code generators.
///
/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkVideoEncodeAV1RateControlInfoKHR.html"><code>VkVideoEncodeAV1RateControlInfoKHR</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record VkVideoEncodeAV1RateControlInfoKHR(@NotNull MemorySegment segment) implements IPointer {
    public static VkVideoEncodeAV1RateControlInfoKHR allocate(Arena arena) {
        VkVideoEncodeAV1RateControlInfoKHR ret = new VkVideoEncodeAV1RateControlInfoKHR(arena.allocate(LAYOUT));
        ret.sType(VkStructureType.VIDEO_ENCODE_AV1_RATE_CONTROL_INFO_KHR);
        return ret;
    }

    public static VkVideoEncodeAV1RateControlInfoKHR[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkVideoEncodeAV1RateControlInfoKHR[] ret = new VkVideoEncodeAV1RateControlInfoKHR[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkVideoEncodeAV1RateControlInfoKHR(segment.asSlice(i * BYTES, BYTES));
            ret[i].sType(VkStructureType.VIDEO_ENCODE_AV1_RATE_CONTROL_INFO_KHR);
        }
        return ret;
    }

    public static VkVideoEncodeAV1RateControlInfoKHR clone(Arena arena, VkVideoEncodeAV1RateControlInfoKHR src) {
        VkVideoEncodeAV1RateControlInfoKHR ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkVideoEncodeAV1RateControlInfoKHR[] clone(Arena arena, VkVideoEncodeAV1RateControlInfoKHR[] src) {
        VkVideoEncodeAV1RateControlInfoKHR[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public void autoInit() {
        sType(VkStructureType.VIDEO_ENCODE_AV1_RATE_CONTROL_INFO_KHR);
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

    public @enumtype(VkVideoEncodeAV1RateControlFlagsKHR.class) int flags() {
        return segment.get(LAYOUT$flags, OFFSET$flags);
    }

    public void flags(@enumtype(VkVideoEncodeAV1RateControlFlagsKHR.class) int value) {
        segment.set(LAYOUT$flags, OFFSET$flags, value);
    }

    public @unsigned int gopFrameCount() {
        return segment.get(LAYOUT$gopFrameCount, OFFSET$gopFrameCount);
    }

    public void gopFrameCount(@unsigned int value) {
        segment.set(LAYOUT$gopFrameCount, OFFSET$gopFrameCount, value);
    }

    public @unsigned int keyFramePeriod() {
        return segment.get(LAYOUT$keyFramePeriod, OFFSET$keyFramePeriod);
    }

    public void keyFramePeriod(@unsigned int value) {
        segment.set(LAYOUT$keyFramePeriod, OFFSET$keyFramePeriod, value);
    }

    public @unsigned int consecutiveBipredictiveFrameCount() {
        return segment.get(LAYOUT$consecutiveBipredictiveFrameCount, OFFSET$consecutiveBipredictiveFrameCount);
    }

    public void consecutiveBipredictiveFrameCount(@unsigned int value) {
        segment.set(LAYOUT$consecutiveBipredictiveFrameCount, OFFSET$consecutiveBipredictiveFrameCount, value);
    }

    public @unsigned int temporalLayerCount() {
        return segment.get(LAYOUT$temporalLayerCount, OFFSET$temporalLayerCount);
    }

    public void temporalLayerCount(@unsigned int value) {
        segment.set(LAYOUT$temporalLayerCount, OFFSET$temporalLayerCount, value);
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("flags"),
        ValueLayout.JAVA_INT.withName("gopFrameCount"),
        ValueLayout.JAVA_INT.withName("keyFramePeriod"),
        ValueLayout.JAVA_INT.withName("consecutiveBipredictiveFrameCount"),
        ValueLayout.JAVA_INT.withName("temporalLayerCount")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("PATH$sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("PATH$pNext");
    public static final PathElement PATH$flags = PathElement.groupElement("PATH$flags");
    public static final PathElement PATH$gopFrameCount = PathElement.groupElement("PATH$gopFrameCount");
    public static final PathElement PATH$keyFramePeriod = PathElement.groupElement("PATH$keyFramePeriod");
    public static final PathElement PATH$consecutiveBipredictiveFrameCount = PathElement.groupElement("PATH$consecutiveBipredictiveFrameCount");
    public static final PathElement PATH$temporalLayerCount = PathElement.groupElement("PATH$temporalLayerCount");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$flags = (OfInt) LAYOUT.select(PATH$flags);
    public static final OfInt LAYOUT$gopFrameCount = (OfInt) LAYOUT.select(PATH$gopFrameCount);
    public static final OfInt LAYOUT$keyFramePeriod = (OfInt) LAYOUT.select(PATH$keyFramePeriod);
    public static final OfInt LAYOUT$consecutiveBipredictiveFrameCount = (OfInt) LAYOUT.select(PATH$consecutiveBipredictiveFrameCount);
    public static final OfInt LAYOUT$temporalLayerCount = (OfInt) LAYOUT.select(PATH$temporalLayerCount);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$flags = LAYOUT$flags.byteSize();
    public static final long SIZE$gopFrameCount = LAYOUT$gopFrameCount.byteSize();
    public static final long SIZE$keyFramePeriod = LAYOUT$keyFramePeriod.byteSize();
    public static final long SIZE$consecutiveBipredictiveFrameCount = LAYOUT$consecutiveBipredictiveFrameCount.byteSize();
    public static final long SIZE$temporalLayerCount = LAYOUT$temporalLayerCount.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$flags = LAYOUT.byteOffset(PATH$flags);
    public static final long OFFSET$gopFrameCount = LAYOUT.byteOffset(PATH$gopFrameCount);
    public static final long OFFSET$keyFramePeriod = LAYOUT.byteOffset(PATH$keyFramePeriod);
    public static final long OFFSET$consecutiveBipredictiveFrameCount = LAYOUT.byteOffset(PATH$consecutiveBipredictiveFrameCount);
    public static final long OFFSET$temporalLayerCount = LAYOUT.byteOffset(PATH$temporalLayerCount);
}
