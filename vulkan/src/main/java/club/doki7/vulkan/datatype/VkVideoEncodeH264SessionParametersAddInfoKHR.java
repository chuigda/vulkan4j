package club.doki7.vulkan.datatype;

import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
import java.util.List;

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

/// Represents a pointer to a <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkVideoEncodeH264SessionParametersAddInfoKHR.html"><code>VkVideoEncodeH264SessionParametersAddInfoKHR</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct VkVideoEncodeH264SessionParametersAddInfoKHR {
///     VkStructureType sType; // @link substring="VkStructureType" target="VkStructureType" @link substring="sType" target="#sType"
///     void const* pNext; // optional // @link substring="pNext" target="#pNext"
///     uint32_t stdSPSCount; // optional // @link substring="stdSPSCount" target="#stdSPSCount"
///     StdVideoH264SequenceParameterSet const* pStdSPSs; // optional // @link substring="StdVideoH264SequenceParameterSet" target="StdVideoH264SequenceParameterSet" @link substring="pStdSPSs" target="#pStdSPSs"
///     uint32_t stdPPSCount; // optional // @link substring="stdPPSCount" target="#stdPPSCount"
///     StdVideoH264PictureParameterSet const* pStdPPSs; // optional // @link substring="StdVideoH264PictureParameterSet" target="StdVideoH264PictureParameterSet" @link substring="pStdPPSs" target="#pStdPPSs"
/// } VkVideoEncodeH264SessionParametersAddInfoKHR;
/// }
///
/// ## Auto initialization
/// This structure has the following members that can be automatically initialized:
/// - `sType = VK_STRUCTURE_TYPE_VIDEO_ENCODE_H264_SESSION_PARAMETERS_ADD_INFO_KHR`
///
/// The {@code allocate} ({@link VkVideoEncodeH264SessionParametersAddInfoKHR#allocate(Arena)}, {@link VkVideoEncodeH264SessionParametersAddInfoKHR#allocate(Arena, long)})
/// functions will automatically initialize these fields. Also, you may call {@link VkVideoEncodeH264SessionParametersAddInfoKHR#autoInit}
/// to initialize these fields manually for non-allocated instances.
/// ## Contracts
///
/// The property {@link #segment()} should always be not-null
/// ({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to
/// {@code LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
/// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
///
/// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
/// perform any runtime check. The constructor can be useful for automatic code generators.
///
/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkVideoEncodeH264SessionParametersAddInfoKHR.html"><code>VkVideoEncodeH264SessionParametersAddInfoKHR</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record VkVideoEncodeH264SessionParametersAddInfoKHR(@NotNull MemorySegment segment) implements IVkVideoEncodeH264SessionParametersAddInfoKHR {
    /// Represents a pointer to / an array of <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkVideoEncodeH264SessionParametersAddInfoKHR.html"><code>VkVideoEncodeH264SessionParametersAddInfoKHR</code></a> structure(s) in native memory.
    ///
    /// Technically speaking, this type has no difference with {@link VkVideoEncodeH264SessionParametersAddInfoKHR}. This type
    /// is introduced mainly for user to distinguish between a pointer to a single structure
    /// and a pointer to (potentially) an array of structure(s). APIs should use interface
    /// IVkVideoEncodeH264SessionParametersAddInfoKHR to handle both types uniformly. See package level documentation for more
    /// details.
    ///
    /// ## Contracts
    ///
    /// The property {@link #segment()} should always be not-null
    /// ({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to
    /// {@code VkVideoEncodeH264SessionParametersAddInfoKHR.LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
    /// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
    ///
    /// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
    /// perform any runtime check. The constructor can be useful for automatic code generators.
    @ValueBasedCandidate
    @UnsafeConstructor
    public record Ptr(@NotNull MemorySegment segment) implements IVkVideoEncodeH264SessionParametersAddInfoKHR {
        public long size() {
            return segment.byteSize() / VkVideoEncodeH264SessionParametersAddInfoKHR.BYTES;
        }

        /// Returns (a pointer to) the structure at the given index.
        ///
        /// Note that unlike {@code read} series functions ({@link IntPtr#read()} for
        /// example), modification on returned structure will be reflected on the original
        /// structure array. So this function is called {@code at} to explicitly
        /// indicate that the returned structure is a view of the original structure.
        public @NotNull VkVideoEncodeH264SessionParametersAddInfoKHR at(long index) {
            return new VkVideoEncodeH264SessionParametersAddInfoKHR(segment.asSlice(index * VkVideoEncodeH264SessionParametersAddInfoKHR.BYTES, VkVideoEncodeH264SessionParametersAddInfoKHR.BYTES));
        }

        public void write(long index, @NotNull VkVideoEncodeH264SessionParametersAddInfoKHR value) {
            MemorySegment s = segment.asSlice(index * VkVideoEncodeH264SessionParametersAddInfoKHR.BYTES, VkVideoEncodeH264SessionParametersAddInfoKHR.BYTES);
            s.copyFrom(value.segment);
        }

        /// Assume the {@link Ptr} is capable of holding at least {@code newSize} structures,
        /// create a new view {@link Ptr} that uses the same backing storage as this
        /// {@link Ptr}, but with the new size. Since there is actually no way to really check
        /// whether the new size is valid, while buffer overflow is undefined behavior, this method is
        /// marked as {@link unsafe}.
        ///
        /// This method could be useful when handling data returned from some C API, where the size of
        /// the data is not known in advance.
        ///
        /// If the size of the underlying segment is actually known in advance and correctly set, and
        /// you want to create a shrunk view, you may use {@link #slice(long)} (with validation)
        /// instead.
        @unsafe
        public @NotNull Ptr reinterpret(long index) {
            return new Ptr(segment.asSlice(index * VkVideoEncodeH264SessionParametersAddInfoKHR.BYTES, VkVideoEncodeH264SessionParametersAddInfoKHR.BYTES));
        }

        public @NotNull Ptr offset(long offset) {
            return new Ptr(segment.asSlice(offset * VkVideoEncodeH264SessionParametersAddInfoKHR.BYTES));
        }

        /// Note that this function uses the {@link List#subList(int, int)} semantics (left inclusive,
        /// right exclusive interval), not {@link MemorySegment#asSlice(long, long)} semantics
        /// (offset + newSize). Be careful with the difference
        public @NotNull Ptr slice(long start, long end) {
            return new Ptr(segment.asSlice(
                start * VkVideoEncodeH264SessionParametersAddInfoKHR.BYTES,
                (end - start) * VkVideoEncodeH264SessionParametersAddInfoKHR.BYTES
            ));
        }

        public Ptr slice(long end) {
            return new Ptr(segment.asSlice(0, end * VkVideoEncodeH264SessionParametersAddInfoKHR.BYTES));
        }

        public VkVideoEncodeH264SessionParametersAddInfoKHR[] toArray() {
            VkVideoEncodeH264SessionParametersAddInfoKHR[] ret = new VkVideoEncodeH264SessionParametersAddInfoKHR[(int) size()];
            for (long i = 0; i < size(); i++) {
                ret[(int) i] = at(i);
            }
            return ret;
        }
    }

    public static VkVideoEncodeH264SessionParametersAddInfoKHR allocate(Arena arena) {
        VkVideoEncodeH264SessionParametersAddInfoKHR ret = new VkVideoEncodeH264SessionParametersAddInfoKHR(arena.allocate(LAYOUT));
        ret.sType(VkStructureType.VIDEO_ENCODE_H264_SESSION_PARAMETERS_ADD_INFO_KHR);
        return ret;
    }

    public static VkVideoEncodeH264SessionParametersAddInfoKHR.Ptr allocate(Arena arena, long count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkVideoEncodeH264SessionParametersAddInfoKHR.Ptr ret = new VkVideoEncodeH264SessionParametersAddInfoKHR.Ptr(segment);
        for (long i = 0; i < count; i++) {
            ret.at(i).sType(VkStructureType.VIDEO_ENCODE_H264_SESSION_PARAMETERS_ADD_INFO_KHR);
        }
        return ret;
    }

    public static VkVideoEncodeH264SessionParametersAddInfoKHR clone(Arena arena, VkVideoEncodeH264SessionParametersAddInfoKHR src) {
        VkVideoEncodeH264SessionParametersAddInfoKHR ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public void autoInit() {
        sType(VkStructureType.VIDEO_ENCODE_H264_SESSION_PARAMETERS_ADD_INFO_KHR);
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

    public @unsigned int stdSPSCount() {
        return segment.get(LAYOUT$stdSPSCount, OFFSET$stdSPSCount);
    }

    public void stdSPSCount(@unsigned int value) {
        segment.set(LAYOUT$stdSPSCount, OFFSET$stdSPSCount, value);
    }

    public @Nullable StdVideoH264SequenceParameterSet pStdSPSs() {
        MemorySegment s = pStdSPSsRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }
        return new StdVideoH264SequenceParameterSet(s);
    }

    public void pStdSPSs(@Nullable IStdVideoH264SequenceParameterSet value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pStdSPSsRaw(s);
    }

    @unsafe public @Nullable StdVideoH264SequenceParameterSet.Ptr pStdSPSs(int assumedCount) {
        MemorySegment s = pStdSPSsRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }

        s = s.reinterpret(assumedCount * StdVideoH264SequenceParameterSet.BYTES);
        return new StdVideoH264SequenceParameterSet.Ptr(s);
    }

    public @pointer(target=StdVideoH264SequenceParameterSet.class) MemorySegment pStdSPSsRaw() {
        return segment.get(LAYOUT$pStdSPSs, OFFSET$pStdSPSs);
    }

    public void pStdSPSsRaw(@pointer(target=StdVideoH264SequenceParameterSet.class) MemorySegment value) {
        segment.set(LAYOUT$pStdSPSs, OFFSET$pStdSPSs, value);
    }

    public @unsigned int stdPPSCount() {
        return segment.get(LAYOUT$stdPPSCount, OFFSET$stdPPSCount);
    }

    public void stdPPSCount(@unsigned int value) {
        segment.set(LAYOUT$stdPPSCount, OFFSET$stdPPSCount, value);
    }

    public @Nullable StdVideoH264PictureParameterSet pStdPPSs() {
        MemorySegment s = pStdPPSsRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }
        return new StdVideoH264PictureParameterSet(s);
    }

    public void pStdPPSs(@Nullable IStdVideoH264PictureParameterSet value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pStdPPSsRaw(s);
    }

    @unsafe public @Nullable StdVideoH264PictureParameterSet.Ptr pStdPPSs(int assumedCount) {
        MemorySegment s = pStdPPSsRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }

        s = s.reinterpret(assumedCount * StdVideoH264PictureParameterSet.BYTES);
        return new StdVideoH264PictureParameterSet.Ptr(s);
    }

    public @pointer(target=StdVideoH264PictureParameterSet.class) MemorySegment pStdPPSsRaw() {
        return segment.get(LAYOUT$pStdPPSs, OFFSET$pStdPPSs);
    }

    public void pStdPPSsRaw(@pointer(target=StdVideoH264PictureParameterSet.class) MemorySegment value) {
        segment.set(LAYOUT$pStdPPSs, OFFSET$pStdPPSs, value);
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("stdSPSCount"),
        ValueLayout.ADDRESS.withTargetLayout(StdVideoH264SequenceParameterSet.LAYOUT).withName("pStdSPSs"),
        ValueLayout.JAVA_INT.withName("stdPPSCount"),
        ValueLayout.ADDRESS.withTargetLayout(StdVideoH264PictureParameterSet.LAYOUT).withName("pStdPPSs")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$stdSPSCount = PathElement.groupElement("stdSPSCount");
    public static final PathElement PATH$pStdSPSs = PathElement.groupElement("pStdSPSs");
    public static final PathElement PATH$stdPPSCount = PathElement.groupElement("stdPPSCount");
    public static final PathElement PATH$pStdPPSs = PathElement.groupElement("pStdPPSs");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$stdSPSCount = (OfInt) LAYOUT.select(PATH$stdSPSCount);
    public static final AddressLayout LAYOUT$pStdSPSs = (AddressLayout) LAYOUT.select(PATH$pStdSPSs);
    public static final OfInt LAYOUT$stdPPSCount = (OfInt) LAYOUT.select(PATH$stdPPSCount);
    public static final AddressLayout LAYOUT$pStdPPSs = (AddressLayout) LAYOUT.select(PATH$pStdPPSs);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$stdSPSCount = LAYOUT$stdSPSCount.byteSize();
    public static final long SIZE$pStdSPSs = LAYOUT$pStdSPSs.byteSize();
    public static final long SIZE$stdPPSCount = LAYOUT$stdPPSCount.byteSize();
    public static final long SIZE$pStdPPSs = LAYOUT$pStdPPSs.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$stdSPSCount = LAYOUT.byteOffset(PATH$stdSPSCount);
    public static final long OFFSET$pStdSPSs = LAYOUT.byteOffset(PATH$pStdSPSs);
    public static final long OFFSET$stdPPSCount = LAYOUT.byteOffset(PATH$stdPPSCount);
    public static final long OFFSET$pStdPPSs = LAYOUT.byteOffset(PATH$pStdPPSs);
}
