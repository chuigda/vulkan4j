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

/// Represents a pointer to a <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkVideoDecodeH265SessionParametersCreateInfoKHR.html"><code>VkVideoDecodeH265SessionParametersCreateInfoKHR</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct VkVideoDecodeH265SessionParametersCreateInfoKHR {
///     VkStructureType sType; // @link substring="VkStructureType" target="VkStructureType" @link substring="sType" target="#sType"
///     void const* pNext; // optional // @link substring="pNext" target="#pNext"
///     uint32_t maxStdVPSCount; // @link substring="maxStdVPSCount" target="#maxStdVPSCount"
///     uint32_t maxStdSPSCount; // @link substring="maxStdSPSCount" target="#maxStdSPSCount"
///     uint32_t maxStdPPSCount; // @link substring="maxStdPPSCount" target="#maxStdPPSCount"
///     VkVideoDecodeH265SessionParametersAddInfoKHR const* pParametersAddInfo; // optional // @link substring="VkVideoDecodeH265SessionParametersAddInfoKHR" target="VkVideoDecodeH265SessionParametersAddInfoKHR" @link substring="pParametersAddInfo" target="#pParametersAddInfo"
/// } VkVideoDecodeH265SessionParametersCreateInfoKHR;
/// }
///
/// ## Auto initialization
/// This structure has the following members that can be automatically initialized:
/// - `sType = VK_STRUCTURE_TYPE_VIDEO_DECODE_H265_SESSION_PARAMETERS_CREATE_INFO_KHR`
///
/// The {@code allocate} ({@link VkVideoDecodeH265SessionParametersCreateInfoKHR#allocate(Arena)}, {@link VkVideoDecodeH265SessionParametersCreateInfoKHR#allocate(Arena, int)})
/// functions will automatically initialize these fields. Also, you may call {@link VkVideoDecodeH265SessionParametersCreateInfoKHR#autoInit}
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
/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkVideoDecodeH265SessionParametersCreateInfoKHR.html"><code>VkVideoDecodeH265SessionParametersCreateInfoKHR</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record VkVideoDecodeH265SessionParametersCreateInfoKHR(@NotNull MemorySegment segment) implements IPointer {
    public static VkVideoDecodeH265SessionParametersCreateInfoKHR allocate(Arena arena) {
        VkVideoDecodeH265SessionParametersCreateInfoKHR ret = new VkVideoDecodeH265SessionParametersCreateInfoKHR(arena.allocate(LAYOUT));
        ret.sType(VkStructureType.VIDEO_DECODE_H265_SESSION_PARAMETERS_CREATE_INFO_KHR);
        return ret;
    }

    public static VkVideoDecodeH265SessionParametersCreateInfoKHR[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkVideoDecodeH265SessionParametersCreateInfoKHR[] ret = new VkVideoDecodeH265SessionParametersCreateInfoKHR[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkVideoDecodeH265SessionParametersCreateInfoKHR(segment.asSlice(i * BYTES, BYTES));
            ret[i].sType(VkStructureType.VIDEO_DECODE_H265_SESSION_PARAMETERS_CREATE_INFO_KHR);
        }
        return ret;
    }

    public static VkVideoDecodeH265SessionParametersCreateInfoKHR clone(Arena arena, VkVideoDecodeH265SessionParametersCreateInfoKHR src) {
        VkVideoDecodeH265SessionParametersCreateInfoKHR ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkVideoDecodeH265SessionParametersCreateInfoKHR[] clone(Arena arena, VkVideoDecodeH265SessionParametersCreateInfoKHR[] src) {
        VkVideoDecodeH265SessionParametersCreateInfoKHR[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public void autoInit() {
        sType(VkStructureType.VIDEO_DECODE_H265_SESSION_PARAMETERS_CREATE_INFO_KHR);
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

    public @unsigned int maxStdVPSCount() {
        return segment.get(LAYOUT$maxStdVPSCount, OFFSET$maxStdVPSCount);
    }

    public void maxStdVPSCount(@unsigned int value) {
        segment.set(LAYOUT$maxStdVPSCount, OFFSET$maxStdVPSCount, value);
    }

    public @unsigned int maxStdSPSCount() {
        return segment.get(LAYOUT$maxStdSPSCount, OFFSET$maxStdSPSCount);
    }

    public void maxStdSPSCount(@unsigned int value) {
        segment.set(LAYOUT$maxStdSPSCount, OFFSET$maxStdSPSCount, value);
    }

    public @unsigned int maxStdPPSCount() {
        return segment.get(LAYOUT$maxStdPPSCount, OFFSET$maxStdPPSCount);
    }

    public void maxStdPPSCount(@unsigned int value) {
        segment.set(LAYOUT$maxStdPPSCount, OFFSET$maxStdPPSCount, value);
    }

    public @Nullable VkVideoDecodeH265SessionParametersAddInfoKHR pParametersAddInfo() {
        MemorySegment s = pParametersAddInfoRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }
        return new VkVideoDecodeH265SessionParametersAddInfoKHR(s);
    }

    public void pParametersAddInfo(@Nullable VkVideoDecodeH265SessionParametersAddInfoKHR value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pParametersAddInfoRaw(s);
    }

    @unsafe public @Nullable VkVideoDecodeH265SessionParametersAddInfoKHR[] pParametersAddInfo(int assumedCount) {
        MemorySegment s = pParametersAddInfoRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }

        s = s.reinterpret(assumedCount * VkVideoDecodeH265SessionParametersAddInfoKHR.BYTES);
        VkVideoDecodeH265SessionParametersAddInfoKHR[] ret = new VkVideoDecodeH265SessionParametersAddInfoKHR[assumedCount];
        for (int i = 0; i < assumedCount; i ++) {
            ret[i] = new VkVideoDecodeH265SessionParametersAddInfoKHR(s.asSlice(i * VkVideoDecodeH265SessionParametersAddInfoKHR.BYTES, VkVideoDecodeH265SessionParametersAddInfoKHR.BYTES));
        }
        return ret;
    }

    public @pointer(target=VkVideoDecodeH265SessionParametersAddInfoKHR.class) MemorySegment pParametersAddInfoRaw() {
        return segment.get(LAYOUT$pParametersAddInfo, OFFSET$pParametersAddInfo);
    }

    public void pParametersAddInfoRaw(@pointer(target=VkVideoDecodeH265SessionParametersAddInfoKHR.class) MemorySegment value) {
        segment.set(LAYOUT$pParametersAddInfo, OFFSET$pParametersAddInfo, value);
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("maxStdVPSCount"),
        ValueLayout.JAVA_INT.withName("maxStdSPSCount"),
        ValueLayout.JAVA_INT.withName("maxStdPPSCount"),
        ValueLayout.ADDRESS.withTargetLayout(VkVideoDecodeH265SessionParametersAddInfoKHR.LAYOUT).withName("pParametersAddInfo")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$maxStdVPSCount = PathElement.groupElement("maxStdVPSCount");
    public static final PathElement PATH$maxStdSPSCount = PathElement.groupElement("maxStdSPSCount");
    public static final PathElement PATH$maxStdPPSCount = PathElement.groupElement("maxStdPPSCount");
    public static final PathElement PATH$pParametersAddInfo = PathElement.groupElement("pParametersAddInfo");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$maxStdVPSCount = (OfInt) LAYOUT.select(PATH$maxStdVPSCount);
    public static final OfInt LAYOUT$maxStdSPSCount = (OfInt) LAYOUT.select(PATH$maxStdSPSCount);
    public static final OfInt LAYOUT$maxStdPPSCount = (OfInt) LAYOUT.select(PATH$maxStdPPSCount);
    public static final AddressLayout LAYOUT$pParametersAddInfo = (AddressLayout) LAYOUT.select(PATH$pParametersAddInfo);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$maxStdVPSCount = LAYOUT$maxStdVPSCount.byteSize();
    public static final long SIZE$maxStdSPSCount = LAYOUT$maxStdSPSCount.byteSize();
    public static final long SIZE$maxStdPPSCount = LAYOUT$maxStdPPSCount.byteSize();
    public static final long SIZE$pParametersAddInfo = LAYOUT$pParametersAddInfo.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$maxStdVPSCount = LAYOUT.byteOffset(PATH$maxStdVPSCount);
    public static final long OFFSET$maxStdSPSCount = LAYOUT.byteOffset(PATH$maxStdSPSCount);
    public static final long OFFSET$maxStdPPSCount = LAYOUT.byteOffset(PATH$maxStdPPSCount);
    public static final long OFFSET$pParametersAddInfo = LAYOUT.byteOffset(PATH$pParametersAddInfo);
}
