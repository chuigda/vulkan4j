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

/// Represents a pointer to a <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkVideoEncodeH265SessionParametersAddInfoKHR.html"><code>VkVideoEncodeH265SessionParametersAddInfoKHR</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct VkVideoEncodeH265SessionParametersAddInfoKHR {
///     VkStructureType sType; // @link substring="VkStructureType" target="VkStructureType" @link substring="sType" target="#sType"
///     void const* pNext; // optional // @link substring="pNext" target="#pNext"
///     uint32_t stdVPSCount; // optional // @link substring="stdVPSCount" target="#stdVPSCount"
///     StdVideoH265VideoParameterSet const* pStdVPSs; // optional // @link substring="StdVideoH265VideoParameterSet" target="StdVideoH265VideoParameterSet" @link substring="pStdVPSs" target="#pStdVPSs"
///     uint32_t stdSPSCount; // optional // @link substring="stdSPSCount" target="#stdSPSCount"
///     StdVideoH265SequenceParameterSet const* pStdSPSs; // optional // @link substring="StdVideoH265SequenceParameterSet" target="StdVideoH265SequenceParameterSet" @link substring="pStdSPSs" target="#pStdSPSs"
///     uint32_t stdPPSCount; // optional // @link substring="stdPPSCount" target="#stdPPSCount"
///     StdVideoH265PictureParameterSet const* pStdPPSs; // optional // @link substring="StdVideoH265PictureParameterSet" target="StdVideoH265PictureParameterSet" @link substring="pStdPPSs" target="#pStdPPSs"
/// } VkVideoEncodeH265SessionParametersAddInfoKHR;
/// }
///
/// ## Auto initialization
/// This structure has the following members that can be automatically initialized:
/// - `sType = VK_STRUCTURE_TYPE_VIDEO_ENCODE_H265_SESSION_PARAMETERS_ADD_INFO_KHR`
///
/// The {@code allocate} ({@link VkVideoEncodeH265SessionParametersAddInfoKHR#allocate(Arena)}, {@link VkVideoEncodeH265SessionParametersAddInfoKHR#allocate(Arena, int)})
/// functions will automatically initialize these fields. Also, you may call {@link VkVideoEncodeH265SessionParametersAddInfoKHR#autoInit}
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
/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkVideoEncodeH265SessionParametersAddInfoKHR.html"><code>VkVideoEncodeH265SessionParametersAddInfoKHR</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record VkVideoEncodeH265SessionParametersAddInfoKHR(@NotNull MemorySegment segment) implements IPointer {
    public static VkVideoEncodeH265SessionParametersAddInfoKHR allocate(Arena arena) {
        VkVideoEncodeH265SessionParametersAddInfoKHR ret = new VkVideoEncodeH265SessionParametersAddInfoKHR(arena.allocate(LAYOUT));
        ret.sType(VkStructureType.VIDEO_ENCODE_H265_SESSION_PARAMETERS_ADD_INFO_KHR);
        return ret;
    }

    public static VkVideoEncodeH265SessionParametersAddInfoKHR[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkVideoEncodeH265SessionParametersAddInfoKHR[] ret = new VkVideoEncodeH265SessionParametersAddInfoKHR[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkVideoEncodeH265SessionParametersAddInfoKHR(segment.asSlice(i * BYTES, BYTES));
            ret[i].sType(VkStructureType.VIDEO_ENCODE_H265_SESSION_PARAMETERS_ADD_INFO_KHR);
        }
        return ret;
    }

    public static VkVideoEncodeH265SessionParametersAddInfoKHR clone(Arena arena, VkVideoEncodeH265SessionParametersAddInfoKHR src) {
        VkVideoEncodeH265SessionParametersAddInfoKHR ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkVideoEncodeH265SessionParametersAddInfoKHR[] clone(Arena arena, VkVideoEncodeH265SessionParametersAddInfoKHR[] src) {
        VkVideoEncodeH265SessionParametersAddInfoKHR[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public void autoInit() {
        sType(VkStructureType.VIDEO_ENCODE_H265_SESSION_PARAMETERS_ADD_INFO_KHR);
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

    public @unsigned int stdVPSCount() {
        return segment.get(LAYOUT$stdVPSCount, OFFSET$stdVPSCount);
    }

    public void stdVPSCount(@unsigned int value) {
        segment.set(LAYOUT$stdVPSCount, OFFSET$stdVPSCount, value);
    }

    public @Nullable StdVideoH265VideoParameterSet pStdVPSs() {
        MemorySegment s = pStdVPSsRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }
        return new StdVideoH265VideoParameterSet(s);
    }

    public void pStdVPSs(@Nullable StdVideoH265VideoParameterSet value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pStdVPSsRaw(s);
    }

    @unsafe public @Nullable StdVideoH265VideoParameterSet[] pStdVPSs(int assumedCount) {
        MemorySegment s = pStdVPSsRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }

        s = s.reinterpret(assumedCount * StdVideoH265VideoParameterSet.BYTES);
        StdVideoH265VideoParameterSet[] ret = new StdVideoH265VideoParameterSet[assumedCount];
        for (int i = 0; i < assumedCount; i ++) {
            ret[i] = new StdVideoH265VideoParameterSet(s.asSlice(i * StdVideoH265VideoParameterSet.BYTES, StdVideoH265VideoParameterSet.BYTES));
        }
        return ret;
    }

    public @pointer(target=StdVideoH265VideoParameterSet.class) MemorySegment pStdVPSsRaw() {
        return segment.get(LAYOUT$pStdVPSs, OFFSET$pStdVPSs);
    }

    public void pStdVPSsRaw(@pointer(target=StdVideoH265VideoParameterSet.class) MemorySegment value) {
        segment.set(LAYOUT$pStdVPSs, OFFSET$pStdVPSs, value);
    }

    public @unsigned int stdSPSCount() {
        return segment.get(LAYOUT$stdSPSCount, OFFSET$stdSPSCount);
    }

    public void stdSPSCount(@unsigned int value) {
        segment.set(LAYOUT$stdSPSCount, OFFSET$stdSPSCount, value);
    }

    public @Nullable StdVideoH265SequenceParameterSet pStdSPSs() {
        MemorySegment s = pStdSPSsRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }
        return new StdVideoH265SequenceParameterSet(s);
    }

    public void pStdSPSs(@Nullable StdVideoH265SequenceParameterSet value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pStdSPSsRaw(s);
    }

    @unsafe public @Nullable StdVideoH265SequenceParameterSet[] pStdSPSs(int assumedCount) {
        MemorySegment s = pStdSPSsRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }

        s = s.reinterpret(assumedCount * StdVideoH265SequenceParameterSet.BYTES);
        StdVideoH265SequenceParameterSet[] ret = new StdVideoH265SequenceParameterSet[assumedCount];
        for (int i = 0; i < assumedCount; i ++) {
            ret[i] = new StdVideoH265SequenceParameterSet(s.asSlice(i * StdVideoH265SequenceParameterSet.BYTES, StdVideoH265SequenceParameterSet.BYTES));
        }
        return ret;
    }

    public @pointer(target=StdVideoH265SequenceParameterSet.class) MemorySegment pStdSPSsRaw() {
        return segment.get(LAYOUT$pStdSPSs, OFFSET$pStdSPSs);
    }

    public void pStdSPSsRaw(@pointer(target=StdVideoH265SequenceParameterSet.class) MemorySegment value) {
        segment.set(LAYOUT$pStdSPSs, OFFSET$pStdSPSs, value);
    }

    public @unsigned int stdPPSCount() {
        return segment.get(LAYOUT$stdPPSCount, OFFSET$stdPPSCount);
    }

    public void stdPPSCount(@unsigned int value) {
        segment.set(LAYOUT$stdPPSCount, OFFSET$stdPPSCount, value);
    }

    public @Nullable StdVideoH265PictureParameterSet pStdPPSs() {
        MemorySegment s = pStdPPSsRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }
        return new StdVideoH265PictureParameterSet(s);
    }

    public void pStdPPSs(@Nullable StdVideoH265PictureParameterSet value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pStdPPSsRaw(s);
    }

    @unsafe public @Nullable StdVideoH265PictureParameterSet[] pStdPPSs(int assumedCount) {
        MemorySegment s = pStdPPSsRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }

        s = s.reinterpret(assumedCount * StdVideoH265PictureParameterSet.BYTES);
        StdVideoH265PictureParameterSet[] ret = new StdVideoH265PictureParameterSet[assumedCount];
        for (int i = 0; i < assumedCount; i ++) {
            ret[i] = new StdVideoH265PictureParameterSet(s.asSlice(i * StdVideoH265PictureParameterSet.BYTES, StdVideoH265PictureParameterSet.BYTES));
        }
        return ret;
    }

    public @pointer(target=StdVideoH265PictureParameterSet.class) MemorySegment pStdPPSsRaw() {
        return segment.get(LAYOUT$pStdPPSs, OFFSET$pStdPPSs);
    }

    public void pStdPPSsRaw(@pointer(target=StdVideoH265PictureParameterSet.class) MemorySegment value) {
        segment.set(LAYOUT$pStdPPSs, OFFSET$pStdPPSs, value);
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("stdVPSCount"),
        ValueLayout.ADDRESS.withTargetLayout(StdVideoH265VideoParameterSet.LAYOUT).withName("pStdVPSs"),
        ValueLayout.JAVA_INT.withName("stdSPSCount"),
        ValueLayout.ADDRESS.withTargetLayout(StdVideoH265SequenceParameterSet.LAYOUT).withName("pStdSPSs"),
        ValueLayout.JAVA_INT.withName("stdPPSCount"),
        ValueLayout.ADDRESS.withTargetLayout(StdVideoH265PictureParameterSet.LAYOUT).withName("pStdPPSs")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("PATH$sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("PATH$pNext");
    public static final PathElement PATH$stdVPSCount = PathElement.groupElement("PATH$stdVPSCount");
    public static final PathElement PATH$pStdVPSs = PathElement.groupElement("PATH$pStdVPSs");
    public static final PathElement PATH$stdSPSCount = PathElement.groupElement("PATH$stdSPSCount");
    public static final PathElement PATH$pStdSPSs = PathElement.groupElement("PATH$pStdSPSs");
    public static final PathElement PATH$stdPPSCount = PathElement.groupElement("PATH$stdPPSCount");
    public static final PathElement PATH$pStdPPSs = PathElement.groupElement("PATH$pStdPPSs");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$stdVPSCount = (OfInt) LAYOUT.select(PATH$stdVPSCount);
    public static final AddressLayout LAYOUT$pStdVPSs = (AddressLayout) LAYOUT.select(PATH$pStdVPSs);
    public static final OfInt LAYOUT$stdSPSCount = (OfInt) LAYOUT.select(PATH$stdSPSCount);
    public static final AddressLayout LAYOUT$pStdSPSs = (AddressLayout) LAYOUT.select(PATH$pStdSPSs);
    public static final OfInt LAYOUT$stdPPSCount = (OfInt) LAYOUT.select(PATH$stdPPSCount);
    public static final AddressLayout LAYOUT$pStdPPSs = (AddressLayout) LAYOUT.select(PATH$pStdPPSs);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$stdVPSCount = LAYOUT$stdVPSCount.byteSize();
    public static final long SIZE$pStdVPSs = LAYOUT$pStdVPSs.byteSize();
    public static final long SIZE$stdSPSCount = LAYOUT$stdSPSCount.byteSize();
    public static final long SIZE$pStdSPSs = LAYOUT$pStdSPSs.byteSize();
    public static final long SIZE$stdPPSCount = LAYOUT$stdPPSCount.byteSize();
    public static final long SIZE$pStdPPSs = LAYOUT$pStdPPSs.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$stdVPSCount = LAYOUT.byteOffset(PATH$stdVPSCount);
    public static final long OFFSET$pStdVPSs = LAYOUT.byteOffset(PATH$pStdVPSs);
    public static final long OFFSET$stdSPSCount = LAYOUT.byteOffset(PATH$stdSPSCount);
    public static final long OFFSET$pStdSPSs = LAYOUT.byteOffset(PATH$pStdSPSs);
    public static final long OFFSET$stdPPSCount = LAYOUT.byteOffset(PATH$stdPPSCount);
    public static final long OFFSET$pStdPPSs = LAYOUT.byteOffset(PATH$pStdPPSs);
}
