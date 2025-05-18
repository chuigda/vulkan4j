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

/// Represents a pointer to a <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkVideoProfileInfoKHR.html"><code>VkVideoProfileInfoKHR</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct VkVideoProfileInfoKHR {
///     VkStructureType sType; // @link substring="VkStructureType" target="VkStructureType" @link substring="sType" target="#sType"
///     void const* pNext; // optional // @link substring="pNext" target="#pNext"
///     VkVideoCodecOperationFlagsKHR videoCodecOperation; // @link substring="VkVideoCodecOperationFlagsKHR" target="VkVideoCodecOperationFlagsKHR" @link substring="videoCodecOperation" target="#videoCodecOperation"
///     VkVideoChromaSubsamplingFlagsKHR chromaSubsampling; // @link substring="VkVideoChromaSubsamplingFlagsKHR" target="VkVideoChromaSubsamplingFlagsKHR" @link substring="chromaSubsampling" target="#chromaSubsampling"
///     VkVideoComponentBitDepthFlagsKHR lumaBitDepth; // @link substring="VkVideoComponentBitDepthFlagsKHR" target="VkVideoComponentBitDepthFlagsKHR" @link substring="lumaBitDepth" target="#lumaBitDepth"
///     VkVideoComponentBitDepthFlagsKHR chromaBitDepth; // optional // @link substring="VkVideoComponentBitDepthFlagsKHR" target="VkVideoComponentBitDepthFlagsKHR" @link substring="chromaBitDepth" target="#chromaBitDepth"
/// } VkVideoProfileInfoKHR;
/// }
///
/// ## Auto initialization
/// This structure has the following members that can be automatically initialized:
/// - `sType = VK_STRUCTURE_TYPE_VIDEO_PROFILE_INFO_KHR`
///
/// The {@code allocate} ({@link VkVideoProfileInfoKHR#allocate(Arena)}, {@link VkVideoProfileInfoKHR#allocate(Arena, int)})
/// functions will automatically initialize these fields. Also, you may call {@link VkVideoProfileInfoKHR#autoInit}
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
/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkVideoProfileInfoKHR.html"><code>VkVideoProfileInfoKHR</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record VkVideoProfileInfoKHR(@NotNull MemorySegment segment) implements IPointer {
    public static VkVideoProfileInfoKHR allocate(Arena arena) {
        VkVideoProfileInfoKHR ret = new VkVideoProfileInfoKHR(arena.allocate(LAYOUT));
        ret.sType(VkStructureType.VIDEO_PROFILE_INFO_KHR);
        return ret;
    }

    public static VkVideoProfileInfoKHR[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkVideoProfileInfoKHR[] ret = new VkVideoProfileInfoKHR[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkVideoProfileInfoKHR(segment.asSlice(i * BYTES, BYTES));
            ret[i].sType(VkStructureType.VIDEO_PROFILE_INFO_KHR);
        }
        return ret;
    }

    public static VkVideoProfileInfoKHR clone(Arena arena, VkVideoProfileInfoKHR src) {
        VkVideoProfileInfoKHR ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkVideoProfileInfoKHR[] clone(Arena arena, VkVideoProfileInfoKHR[] src) {
        VkVideoProfileInfoKHR[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public void autoInit() {
        sType(VkStructureType.VIDEO_PROFILE_INFO_KHR);
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

    public @enumtype(VkVideoCodecOperationFlagsKHR.class) int videoCodecOperation() {
        return segment.get(LAYOUT$videoCodecOperation, OFFSET$videoCodecOperation);
    }

    public void videoCodecOperation(@enumtype(VkVideoCodecOperationFlagsKHR.class) int value) {
        segment.set(LAYOUT$videoCodecOperation, OFFSET$videoCodecOperation, value);
    }

    public @enumtype(VkVideoChromaSubsamplingFlagsKHR.class) int chromaSubsampling() {
        return segment.get(LAYOUT$chromaSubsampling, OFFSET$chromaSubsampling);
    }

    public void chromaSubsampling(@enumtype(VkVideoChromaSubsamplingFlagsKHR.class) int value) {
        segment.set(LAYOUT$chromaSubsampling, OFFSET$chromaSubsampling, value);
    }

    public @enumtype(VkVideoComponentBitDepthFlagsKHR.class) int lumaBitDepth() {
        return segment.get(LAYOUT$lumaBitDepth, OFFSET$lumaBitDepth);
    }

    public void lumaBitDepth(@enumtype(VkVideoComponentBitDepthFlagsKHR.class) int value) {
        segment.set(LAYOUT$lumaBitDepth, OFFSET$lumaBitDepth, value);
    }

    public @enumtype(VkVideoComponentBitDepthFlagsKHR.class) int chromaBitDepth() {
        return segment.get(LAYOUT$chromaBitDepth, OFFSET$chromaBitDepth);
    }

    public void chromaBitDepth(@enumtype(VkVideoComponentBitDepthFlagsKHR.class) int value) {
        segment.set(LAYOUT$chromaBitDepth, OFFSET$chromaBitDepth, value);
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("videoCodecOperation"),
        ValueLayout.JAVA_INT.withName("chromaSubsampling"),
        ValueLayout.JAVA_INT.withName("lumaBitDepth"),
        ValueLayout.JAVA_INT.withName("chromaBitDepth")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("PATH$sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("PATH$pNext");
    public static final PathElement PATH$videoCodecOperation = PathElement.groupElement("PATH$videoCodecOperation");
    public static final PathElement PATH$chromaSubsampling = PathElement.groupElement("PATH$chromaSubsampling");
    public static final PathElement PATH$lumaBitDepth = PathElement.groupElement("PATH$lumaBitDepth");
    public static final PathElement PATH$chromaBitDepth = PathElement.groupElement("PATH$chromaBitDepth");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$videoCodecOperation = (OfInt) LAYOUT.select(PATH$videoCodecOperation);
    public static final OfInt LAYOUT$chromaSubsampling = (OfInt) LAYOUT.select(PATH$chromaSubsampling);
    public static final OfInt LAYOUT$lumaBitDepth = (OfInt) LAYOUT.select(PATH$lumaBitDepth);
    public static final OfInt LAYOUT$chromaBitDepth = (OfInt) LAYOUT.select(PATH$chromaBitDepth);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$videoCodecOperation = LAYOUT$videoCodecOperation.byteSize();
    public static final long SIZE$chromaSubsampling = LAYOUT$chromaSubsampling.byteSize();
    public static final long SIZE$lumaBitDepth = LAYOUT$lumaBitDepth.byteSize();
    public static final long SIZE$chromaBitDepth = LAYOUT$chromaBitDepth.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$videoCodecOperation = LAYOUT.byteOffset(PATH$videoCodecOperation);
    public static final long OFFSET$chromaSubsampling = LAYOUT.byteOffset(PATH$chromaSubsampling);
    public static final long OFFSET$lumaBitDepth = LAYOUT.byteOffset(PATH$lumaBitDepth);
    public static final long OFFSET$chromaBitDepth = LAYOUT.byteOffset(PATH$chromaBitDepth);
}
