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

/// Represents a pointer to a <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkVideoEncodeH264SessionParametersCreateInfoKHR.html"><code>VkVideoEncodeH264SessionParametersCreateInfoKHR</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct VkVideoEncodeH264SessionParametersCreateInfoKHR {
///     VkStructureType sType; // @link substring="VkStructureType" target="VkStructureType" @link substring="sType" target="#sType"
///     void const* pNext; // optional // @link substring="pNext" target="#pNext"
///     uint32_t maxStdSPSCount; // @link substring="maxStdSPSCount" target="#maxStdSPSCount"
///     uint32_t maxStdPPSCount; // @link substring="maxStdPPSCount" target="#maxStdPPSCount"
///     VkVideoEncodeH264SessionParametersAddInfoKHR const* pParametersAddInfo; // optional // @link substring="VkVideoEncodeH264SessionParametersAddInfoKHR" target="VkVideoEncodeH264SessionParametersAddInfoKHR" @link substring="pParametersAddInfo" target="#pParametersAddInfo"
/// } VkVideoEncodeH264SessionParametersCreateInfoKHR;
/// }
///
/// ## Auto initialization
/// This structure has the following members that can be automatically initialized:
/// - `sType = VK_STRUCTURE_TYPE_VIDEO_ENCODE_H264_SESSION_PARAMETERS_CREATE_INFO_KHR`
///
/// The {@code allocate} ({@link VkVideoEncodeH264SessionParametersCreateInfoKHR#allocate(Arena)}, {@link VkVideoEncodeH264SessionParametersCreateInfoKHR#allocate(Arena, long)})
/// functions will automatically initialize these fields. Also, you may call {@link VkVideoEncodeH264SessionParametersCreateInfoKHR#autoInit}
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
/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkVideoEncodeH264SessionParametersCreateInfoKHR.html"><code>VkVideoEncodeH264SessionParametersCreateInfoKHR</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record VkVideoEncodeH264SessionParametersCreateInfoKHR(@NotNull MemorySegment segment) implements IVkVideoEncodeH264SessionParametersCreateInfoKHR {
    /// Represents a pointer to / an array of <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkVideoEncodeH264SessionParametersCreateInfoKHR.html"><code>VkVideoEncodeH264SessionParametersCreateInfoKHR</code></a> structure(s) in native memory.
    ///
    /// Technically speaking, this type has no difference with {@link VkVideoEncodeH264SessionParametersCreateInfoKHR}. This type
    /// is introduced mainly for user to distinguish between a pointer to a single structure
    /// and a pointer to (potentially) an array of structure(s). APIs should use interface
    /// IVkVideoEncodeH264SessionParametersCreateInfoKHR to handle both types uniformly. See package level documentation for more
    /// details.
    ///
    /// ## Contracts
    ///
    /// The property {@link #segment()} should always be not-null
    /// (({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to
    /// {@code VkVideoEncodeH264SessionParametersCreateInfoKHR.LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
    /// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
    ///
    /// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
    /// perform any runtime check. The constructor can be useful for automatic code generators.
    @ValueBasedCandidate
    @UnsafeConstructor
    public record Ptr(@NotNull MemorySegment segment) implements IVkVideoEncodeH264SessionParametersCreateInfoKHR {
        public long size() {
            return segment.byteSize() / VkVideoEncodeH264SessionParametersCreateInfoKHR.BYTES;
        }
        /// Returns (a pointer to) the structure at the given index.
        ///
        /// Note that unlike {@code read} series functions ({@link IntPtr#read()} for
        /// example), modification on returned structure will be reflected on the original
        /// structure array. So this function is called {@code at} to explicitly
        /// indicate that the returned structure is a view of the original structure.
        public @NotNull VkVideoEncodeH264SessionParametersCreateInfoKHR at(long index) {
            return new VkVideoEncodeH264SessionParametersCreateInfoKHR(segment.asSlice(index * VkVideoEncodeH264SessionParametersCreateInfoKHR.BYTES, VkVideoEncodeH264SessionParametersCreateInfoKHR.BYTES));
        }
        public void write(long index, @NotNull VkVideoEncodeH264SessionParametersCreateInfoKHR value) {
            MemorySegment s = segment.asSlice(index * VkVideoEncodeH264SessionParametersCreateInfoKHR.BYTES, VkVideoEncodeH264SessionParametersCreateInfoKHR.BYTES);
            s.copyFrom(value.segment);
        }
    }
    public static VkVideoEncodeH264SessionParametersCreateInfoKHR allocate(Arena arena) {
        VkVideoEncodeH264SessionParametersCreateInfoKHR ret = new VkVideoEncodeH264SessionParametersCreateInfoKHR(arena.allocate(LAYOUT));
        ret.sType(VkStructureType.VIDEO_ENCODE_H264_SESSION_PARAMETERS_CREATE_INFO_KHR);
        return ret;
    }

    public static VkVideoEncodeH264SessionParametersCreateInfoKHR.Ptr allocate(Arena arena, long count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkVideoEncodeH264SessionParametersCreateInfoKHR.Ptr ret = new VkVideoEncodeH264SessionParametersCreateInfoKHR.Ptr(segment);
        for (long i = 0; i < count; i ++) {
            ret.at(i).sType(VkStructureType.VIDEO_ENCODE_H264_SESSION_PARAMETERS_CREATE_INFO_KHR);
        }
        return ret;
    }

    public static VkVideoEncodeH264SessionParametersCreateInfoKHR clone(Arena arena, VkVideoEncodeH264SessionParametersCreateInfoKHR src) {
        VkVideoEncodeH264SessionParametersCreateInfoKHR ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public void autoInit() {
        sType(VkStructureType.VIDEO_ENCODE_H264_SESSION_PARAMETERS_CREATE_INFO_KHR);
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

    public @Nullable VkVideoEncodeH264SessionParametersAddInfoKHR pParametersAddInfo() {
        MemorySegment s = pParametersAddInfoRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }
        return new VkVideoEncodeH264SessionParametersAddInfoKHR(s);
    }

    public void pParametersAddInfo(@Nullable VkVideoEncodeH264SessionParametersAddInfoKHR value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pParametersAddInfoRaw(s);
    }

    @unsafe public @Nullable VkVideoEncodeH264SessionParametersAddInfoKHR[] pParametersAddInfo(int assumedCount) {
        MemorySegment s = pParametersAddInfoRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }

        s = s.reinterpret(assumedCount * VkVideoEncodeH264SessionParametersAddInfoKHR.BYTES);
        VkVideoEncodeH264SessionParametersAddInfoKHR[] ret = new VkVideoEncodeH264SessionParametersAddInfoKHR[assumedCount];
        for (int i = 0; i < assumedCount; i ++) {
            ret[i] = new VkVideoEncodeH264SessionParametersAddInfoKHR(s.asSlice(i * VkVideoEncodeH264SessionParametersAddInfoKHR.BYTES, VkVideoEncodeH264SessionParametersAddInfoKHR.BYTES));
        }
        return ret;
    }

    public @pointer(target=VkVideoEncodeH264SessionParametersAddInfoKHR.class) MemorySegment pParametersAddInfoRaw() {
        return segment.get(LAYOUT$pParametersAddInfo, OFFSET$pParametersAddInfo);
    }

    public void pParametersAddInfoRaw(@pointer(target=VkVideoEncodeH264SessionParametersAddInfoKHR.class) MemorySegment value) {
        segment.set(LAYOUT$pParametersAddInfo, OFFSET$pParametersAddInfo, value);
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("maxStdSPSCount"),
        ValueLayout.JAVA_INT.withName("maxStdPPSCount"),
        ValueLayout.ADDRESS.withTargetLayout(VkVideoEncodeH264SessionParametersAddInfoKHR.LAYOUT).withName("pParametersAddInfo")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$maxStdSPSCount = PathElement.groupElement("maxStdSPSCount");
    public static final PathElement PATH$maxStdPPSCount = PathElement.groupElement("maxStdPPSCount");
    public static final PathElement PATH$pParametersAddInfo = PathElement.groupElement("pParametersAddInfo");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$maxStdSPSCount = (OfInt) LAYOUT.select(PATH$maxStdSPSCount);
    public static final OfInt LAYOUT$maxStdPPSCount = (OfInt) LAYOUT.select(PATH$maxStdPPSCount);
    public static final AddressLayout LAYOUT$pParametersAddInfo = (AddressLayout) LAYOUT.select(PATH$pParametersAddInfo);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$maxStdSPSCount = LAYOUT$maxStdSPSCount.byteSize();
    public static final long SIZE$maxStdPPSCount = LAYOUT$maxStdPPSCount.byteSize();
    public static final long SIZE$pParametersAddInfo = LAYOUT$pParametersAddInfo.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$maxStdSPSCount = LAYOUT.byteOffset(PATH$maxStdSPSCount);
    public static final long OFFSET$maxStdPPSCount = LAYOUT.byteOffset(PATH$maxStdPPSCount);
    public static final long OFFSET$pParametersAddInfo = LAYOUT.byteOffset(PATH$pParametersAddInfo);
}
