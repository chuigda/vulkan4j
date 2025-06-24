package club.doki7.vulkan.datatype;

import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
import java.util.List;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.function.Consumer;

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

/// Represents a pointer to a <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkVideoEncodeAV1DpbSlotInfoKHR.html"><code>VkVideoEncodeAV1DpbSlotInfoKHR</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct VkVideoEncodeAV1DpbSlotInfoKHR {
///     VkStructureType sType; // @link substring="VkStructureType" target="VkStructureType" @link substring="sType" target="#sType"
///     void const* pNext; // optional // @link substring="pNext" target="#pNext"
///     StdVideoEncodeAV1ReferenceInfo const* pStdReferenceInfo; // @link substring="StdVideoEncodeAV1ReferenceInfo" target="StdVideoEncodeAV1ReferenceInfo" @link substring="pStdReferenceInfo" target="#pStdReferenceInfo"
/// } VkVideoEncodeAV1DpbSlotInfoKHR;
/// }
///
/// ## Auto initialization
///
/// This structure has the following members that can be automatically initialized:
/// - `sType = VK_STRUCTURE_TYPE_VIDEO_ENCODE_AV1_DPB_SLOT_INFO_KHR`
///
/// The {@code allocate} ({@link VkVideoEncodeAV1DpbSlotInfoKHR#allocate(Arena)}, {@link VkVideoEncodeAV1DpbSlotInfoKHR#allocate(Arena, long)})
/// functions will automatically initialize these fields. Also, you may call {@link VkVideoEncodeAV1DpbSlotInfoKHR#autoInit}
/// to initialize these fields manually for non-allocated instances.
///
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
/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkVideoEncodeAV1DpbSlotInfoKHR.html"><code>VkVideoEncodeAV1DpbSlotInfoKHR</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record VkVideoEncodeAV1DpbSlotInfoKHR(@NotNull MemorySegment segment) implements IVkVideoEncodeAV1DpbSlotInfoKHR {
    /// Represents a pointer to / an array of <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkVideoEncodeAV1DpbSlotInfoKHR.html"><code>VkVideoEncodeAV1DpbSlotInfoKHR</code></a> structure(s) in native memory.
    ///
    /// Technically speaking, this type has no difference with {@link VkVideoEncodeAV1DpbSlotInfoKHR}. This type
    /// is introduced mainly for user to distinguish between a pointer to a single structure
    /// and a pointer to (potentially) an array of structure(s). APIs should use interface
    /// IVkVideoEncodeAV1DpbSlotInfoKHR to handle both types uniformly. See package level documentation for more
    /// details.
    ///
    /// ## Contracts
    ///
    /// The property {@link #segment()} should always be not-null
    /// ({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to
    /// {@code VkVideoEncodeAV1DpbSlotInfoKHR.LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
    /// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
    ///
    /// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
    /// perform any runtime check. The constructor can be useful for automatic code generators.
    @ValueBasedCandidate
    @UnsafeConstructor
    public record Ptr(@NotNull MemorySegment segment) implements IVkVideoEncodeAV1DpbSlotInfoKHR, Iterable<VkVideoEncodeAV1DpbSlotInfoKHR> {
        public long size() {
            return segment.byteSize() / VkVideoEncodeAV1DpbSlotInfoKHR.BYTES;
        }

        /// Returns (a pointer to) the structure at the given index.
        ///
        /// Note that unlike {@code read} series functions ({@link IntPtr#read()} for
        /// example), modification on returned structure will be reflected on the original
        /// structure array. So this function is called {@code at} to explicitly
        /// indicate that the returned structure is a view of the original structure.
        public @NotNull VkVideoEncodeAV1DpbSlotInfoKHR at(long index) {
            return new VkVideoEncodeAV1DpbSlotInfoKHR(segment.asSlice(index * VkVideoEncodeAV1DpbSlotInfoKHR.BYTES, VkVideoEncodeAV1DpbSlotInfoKHR.BYTES));
        }

        public void write(long index, @NotNull VkVideoEncodeAV1DpbSlotInfoKHR value) {
            MemorySegment s = segment.asSlice(index * VkVideoEncodeAV1DpbSlotInfoKHR.BYTES, VkVideoEncodeAV1DpbSlotInfoKHR.BYTES);
            s.copyFrom(value.segment);
        }

        /// Assume the {@link Ptr} is capable of holding at least {@code newSize} structures,
        /// create a new view {@link Ptr} that uses the same backing storage as this
        /// {@link Ptr}, but with the new size. Since there is actually no way to really check
        /// whether the new size is valid, while buffer overflow is undefined behavior, this method is
        /// marked as {@link Unsafe}.
        ///
        /// This method could be useful when handling data returned from some C API, where the size of
        /// the data is not known in advance.
        ///
        /// If the size of the underlying segment is actually known in advance and correctly set, and
        /// you want to create a shrunk view, you may use {@link #slice(long)} (with validation)
        /// instead.
        @Unsafe
        public @NotNull Ptr reinterpret(long newSize) {
            return new Ptr(segment.reinterpret(newSize * VkVideoEncodeAV1DpbSlotInfoKHR.BYTES));
        }

        public @NotNull Ptr offset(long offset) {
            return new Ptr(segment.asSlice(offset * VkVideoEncodeAV1DpbSlotInfoKHR.BYTES));
        }

        /// Note that this function uses the {@link List#subList(int, int)} semantics (left inclusive,
        /// right exclusive interval), not {@link MemorySegment#asSlice(long, long)} semantics
        /// (offset + newSize). Be careful with the difference
        public @NotNull Ptr slice(long start, long end) {
            return new Ptr(segment.asSlice(
                start * VkVideoEncodeAV1DpbSlotInfoKHR.BYTES,
                (end - start) * VkVideoEncodeAV1DpbSlotInfoKHR.BYTES
            ));
        }

        public Ptr slice(long end) {
            return new Ptr(segment.asSlice(0, end * VkVideoEncodeAV1DpbSlotInfoKHR.BYTES));
        }

        public VkVideoEncodeAV1DpbSlotInfoKHR[] toArray() {
            VkVideoEncodeAV1DpbSlotInfoKHR[] ret = new VkVideoEncodeAV1DpbSlotInfoKHR[(int) size()];
            for (long i = 0; i < size(); i++) {
                ret[(int) i] = at(i);
            }
            return ret;
        }

        @Override
        public @NotNull Iterator<VkVideoEncodeAV1DpbSlotInfoKHR> iterator() {
            return new Iter(this.segment());
        }

        /// An iterator over the structures.
        private static final class Iter implements Iterator<VkVideoEncodeAV1DpbSlotInfoKHR> {
            Iter(@NotNull MemorySegment segment) {
                this.segment = segment;
            }

            @Override
            public boolean hasNext() {
                return segment.byteSize() >= VkVideoEncodeAV1DpbSlotInfoKHR.BYTES;
            }

            @Override
            public VkVideoEncodeAV1DpbSlotInfoKHR next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                VkVideoEncodeAV1DpbSlotInfoKHR ret = new VkVideoEncodeAV1DpbSlotInfoKHR(segment.asSlice(0, VkVideoEncodeAV1DpbSlotInfoKHR.BYTES));
                segment = segment.asSlice(VkVideoEncodeAV1DpbSlotInfoKHR.BYTES);
                return ret;
            }

            private @NotNull MemorySegment segment;
        }
    }

    public static VkVideoEncodeAV1DpbSlotInfoKHR allocate(Arena arena) {
        VkVideoEncodeAV1DpbSlotInfoKHR ret = new VkVideoEncodeAV1DpbSlotInfoKHR(arena.allocate(LAYOUT));
        ret.sType(VkStructureType.VIDEO_ENCODE_AV1_DPB_SLOT_INFO_KHR);
        return ret;
    }

    public static VkVideoEncodeAV1DpbSlotInfoKHR.Ptr allocate(Arena arena, long count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkVideoEncodeAV1DpbSlotInfoKHR.Ptr ret = new VkVideoEncodeAV1DpbSlotInfoKHR.Ptr(segment);
        for (long i = 0; i < count; i++) {
            ret.at(i).sType(VkStructureType.VIDEO_ENCODE_AV1_DPB_SLOT_INFO_KHR);
        }
        return ret;
    }

    public static VkVideoEncodeAV1DpbSlotInfoKHR clone(Arena arena, VkVideoEncodeAV1DpbSlotInfoKHR src) {
        VkVideoEncodeAV1DpbSlotInfoKHR ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public void autoInit() {
        sType(VkStructureType.VIDEO_ENCODE_AV1_DPB_SLOT_INFO_KHR);
    }

    public @EnumType(VkStructureType.class) int sType() {
        return segment.get(LAYOUT$sType, OFFSET$sType);
    }

    public VkVideoEncodeAV1DpbSlotInfoKHR sType(@EnumType(VkStructureType.class) int value) {
        segment.set(LAYOUT$sType, OFFSET$sType, value);
        return this;
    }

    public @Pointer(comment="void*") @NotNull MemorySegment pNext() {
        return segment.get(LAYOUT$pNext, OFFSET$pNext);
    }

    public VkVideoEncodeAV1DpbSlotInfoKHR pNext(@Pointer(comment="void*") @NotNull MemorySegment value) {
        segment.set(LAYOUT$pNext, OFFSET$pNext, value);
        return this;
    }

    public VkVideoEncodeAV1DpbSlotInfoKHR pNext(@Nullable IPointer pointer) {
        pNext(pointer != null ? pointer.segment() : MemorySegment.NULL);
        return this;
    }

    public VkVideoEncodeAV1DpbSlotInfoKHR pStdReferenceInfo(@Nullable IStdVideoEncodeAV1ReferenceInfo value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pStdReferenceInfoRaw(s);
        return this;
    }

    @Unsafe public @Nullable StdVideoEncodeAV1ReferenceInfo.Ptr pStdReferenceInfo(int assumedCount) {
        MemorySegment s = pStdReferenceInfoRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }

        s = s.reinterpret(assumedCount * StdVideoEncodeAV1ReferenceInfo.BYTES);
        return new StdVideoEncodeAV1ReferenceInfo.Ptr(s);
    }

    public @Nullable StdVideoEncodeAV1ReferenceInfo pStdReferenceInfo() {
        MemorySegment s = pStdReferenceInfoRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }
        return new StdVideoEncodeAV1ReferenceInfo(s);
    }

    public @Pointer(target=StdVideoEncodeAV1ReferenceInfo.class) @NotNull MemorySegment pStdReferenceInfoRaw() {
        return segment.get(LAYOUT$pStdReferenceInfo, OFFSET$pStdReferenceInfo);
    }

    public void pStdReferenceInfoRaw(@Pointer(target=StdVideoEncodeAV1ReferenceInfo.class) @NotNull MemorySegment value) {
        segment.set(LAYOUT$pStdReferenceInfo, OFFSET$pStdReferenceInfo, value);
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.ADDRESS.withTargetLayout(StdVideoEncodeAV1ReferenceInfo.LAYOUT).withName("pStdReferenceInfo")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$pStdReferenceInfo = PathElement.groupElement("pStdReferenceInfo");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final AddressLayout LAYOUT$pStdReferenceInfo = (AddressLayout) LAYOUT.select(PATH$pStdReferenceInfo);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$pStdReferenceInfo = LAYOUT$pStdReferenceInfo.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$pStdReferenceInfo = LAYOUT.byteOffset(PATH$pStdReferenceInfo);
}
