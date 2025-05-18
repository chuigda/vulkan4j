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

/// Represents a pointer to a <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkVideoEncodeAV1GopRemainingFrameInfoKHR.html"><code>VkVideoEncodeAV1GopRemainingFrameInfoKHR</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct VkVideoEncodeAV1GopRemainingFrameInfoKHR {
///     VkStructureType sType; // @link substring="VkStructureType" target="VkStructureType" @link substring="sType" target="#sType"
///     void const* pNext; // optional // @link substring="pNext" target="#pNext"
///     VkBool32 useGopRemainingFrames; // @link substring="useGopRemainingFrames" target="#useGopRemainingFrames"
///     uint32_t gopRemainingIntra; // @link substring="gopRemainingIntra" target="#gopRemainingIntra"
///     uint32_t gopRemainingPredictive; // @link substring="gopRemainingPredictive" target="#gopRemainingPredictive"
///     uint32_t gopRemainingBipredictive; // @link substring="gopRemainingBipredictive" target="#gopRemainingBipredictive"
/// } VkVideoEncodeAV1GopRemainingFrameInfoKHR;
/// }
///
/// ## Auto initialization
/// This structure has the following members that can be automatically initialized:
/// - `sType = VK_STRUCTURE_TYPE_VIDEO_ENCODE_AV1_GOP_REMAINING_FRAME_INFO_KHR`
///
/// The {@code allocate} ({@link VkVideoEncodeAV1GopRemainingFrameInfoKHR#allocate(Arena)}, {@link VkVideoEncodeAV1GopRemainingFrameInfoKHR#allocate(Arena, int)})
/// functions will automatically initialize these fields. Also, you may call {@link VkVideoEncodeAV1GopRemainingFrameInfoKHR#autoInit}
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
/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkVideoEncodeAV1GopRemainingFrameInfoKHR.html"><code>VkVideoEncodeAV1GopRemainingFrameInfoKHR</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record VkVideoEncodeAV1GopRemainingFrameInfoKHR(@NotNull MemorySegment segment) implements IPointer {
    public static VkVideoEncodeAV1GopRemainingFrameInfoKHR allocate(Arena arena) {
        VkVideoEncodeAV1GopRemainingFrameInfoKHR ret = new VkVideoEncodeAV1GopRemainingFrameInfoKHR(arena.allocate(LAYOUT));
        ret.sType(VkStructureType.VIDEO_ENCODE_AV1_GOP_REMAINING_FRAME_INFO_KHR);
        return ret;
    }

    public static VkVideoEncodeAV1GopRemainingFrameInfoKHR[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkVideoEncodeAV1GopRemainingFrameInfoKHR[] ret = new VkVideoEncodeAV1GopRemainingFrameInfoKHR[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkVideoEncodeAV1GopRemainingFrameInfoKHR(segment.asSlice(i * BYTES, BYTES));
            ret[i].sType(VkStructureType.VIDEO_ENCODE_AV1_GOP_REMAINING_FRAME_INFO_KHR);
        }
        return ret;
    }

    public static VkVideoEncodeAV1GopRemainingFrameInfoKHR clone(Arena arena, VkVideoEncodeAV1GopRemainingFrameInfoKHR src) {
        VkVideoEncodeAV1GopRemainingFrameInfoKHR ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkVideoEncodeAV1GopRemainingFrameInfoKHR[] clone(Arena arena, VkVideoEncodeAV1GopRemainingFrameInfoKHR[] src) {
        VkVideoEncodeAV1GopRemainingFrameInfoKHR[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public void autoInit() {
        sType(VkStructureType.VIDEO_ENCODE_AV1_GOP_REMAINING_FRAME_INFO_KHR);
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

    public @unsigned int useGopRemainingFrames() {
        return segment.get(LAYOUT$useGopRemainingFrames, OFFSET$useGopRemainingFrames);
    }

    public void useGopRemainingFrames(@unsigned int value) {
        segment.set(LAYOUT$useGopRemainingFrames, OFFSET$useGopRemainingFrames, value);
    }

    public @unsigned int gopRemainingIntra() {
        return segment.get(LAYOUT$gopRemainingIntra, OFFSET$gopRemainingIntra);
    }

    public void gopRemainingIntra(@unsigned int value) {
        segment.set(LAYOUT$gopRemainingIntra, OFFSET$gopRemainingIntra, value);
    }

    public @unsigned int gopRemainingPredictive() {
        return segment.get(LAYOUT$gopRemainingPredictive, OFFSET$gopRemainingPredictive);
    }

    public void gopRemainingPredictive(@unsigned int value) {
        segment.set(LAYOUT$gopRemainingPredictive, OFFSET$gopRemainingPredictive, value);
    }

    public @unsigned int gopRemainingBipredictive() {
        return segment.get(LAYOUT$gopRemainingBipredictive, OFFSET$gopRemainingBipredictive);
    }

    public void gopRemainingBipredictive(@unsigned int value) {
        segment.set(LAYOUT$gopRemainingBipredictive, OFFSET$gopRemainingBipredictive, value);
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("useGopRemainingFrames"),
        ValueLayout.JAVA_INT.withName("gopRemainingIntra"),
        ValueLayout.JAVA_INT.withName("gopRemainingPredictive"),
        ValueLayout.JAVA_INT.withName("gopRemainingBipredictive")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("PATH$sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("PATH$pNext");
    public static final PathElement PATH$useGopRemainingFrames = PathElement.groupElement("PATH$useGopRemainingFrames");
    public static final PathElement PATH$gopRemainingIntra = PathElement.groupElement("PATH$gopRemainingIntra");
    public static final PathElement PATH$gopRemainingPredictive = PathElement.groupElement("PATH$gopRemainingPredictive");
    public static final PathElement PATH$gopRemainingBipredictive = PathElement.groupElement("PATH$gopRemainingBipredictive");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$useGopRemainingFrames = (OfInt) LAYOUT.select(PATH$useGopRemainingFrames);
    public static final OfInt LAYOUT$gopRemainingIntra = (OfInt) LAYOUT.select(PATH$gopRemainingIntra);
    public static final OfInt LAYOUT$gopRemainingPredictive = (OfInt) LAYOUT.select(PATH$gopRemainingPredictive);
    public static final OfInt LAYOUT$gopRemainingBipredictive = (OfInt) LAYOUT.select(PATH$gopRemainingBipredictive);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$useGopRemainingFrames = LAYOUT$useGopRemainingFrames.byteSize();
    public static final long SIZE$gopRemainingIntra = LAYOUT$gopRemainingIntra.byteSize();
    public static final long SIZE$gopRemainingPredictive = LAYOUT$gopRemainingPredictive.byteSize();
    public static final long SIZE$gopRemainingBipredictive = LAYOUT$gopRemainingBipredictive.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$useGopRemainingFrames = LAYOUT.byteOffset(PATH$useGopRemainingFrames);
    public static final long OFFSET$gopRemainingIntra = LAYOUT.byteOffset(PATH$gopRemainingIntra);
    public static final long OFFSET$gopRemainingPredictive = LAYOUT.byteOffset(PATH$gopRemainingPredictive);
    public static final long OFFSET$gopRemainingBipredictive = LAYOUT.byteOffset(PATH$gopRemainingBipredictive);
}
