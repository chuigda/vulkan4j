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

/// Represents a pointer to a <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkVideoEncodeAV1RateControlLayerInfoKHR.html"><code>VkVideoEncodeAV1RateControlLayerInfoKHR</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct VkVideoEncodeAV1RateControlLayerInfoKHR {
///     VkStructureType sType; // @link substring="VkStructureType" target="VkStructureType" @link substring="sType" target="#sType"
///     void const* pNext; // optional // @link substring="pNext" target="#pNext"
///     VkBool32 useMinQIndex; // @link substring="useMinQIndex" target="#useMinQIndex"
///     VkVideoEncodeAV1QIndexKHR minQIndex; // @link substring="VkVideoEncodeAV1QIndexKHR" target="VkVideoEncodeAV1QIndexKHR" @link substring="minQIndex" target="#minQIndex"
///     VkBool32 useMaxQIndex; // @link substring="useMaxQIndex" target="#useMaxQIndex"
///     VkVideoEncodeAV1QIndexKHR maxQIndex; // @link substring="VkVideoEncodeAV1QIndexKHR" target="VkVideoEncodeAV1QIndexKHR" @link substring="maxQIndex" target="#maxQIndex"
///     VkBool32 useMaxFrameSize; // @link substring="useMaxFrameSize" target="#useMaxFrameSize"
///     VkVideoEncodeAV1FrameSizeKHR maxFrameSize; // @link substring="VkVideoEncodeAV1FrameSizeKHR" target="VkVideoEncodeAV1FrameSizeKHR" @link substring="maxFrameSize" target="#maxFrameSize"
/// } VkVideoEncodeAV1RateControlLayerInfoKHR;
/// }
///
/// ## Auto initialization
///
/// This structure has the following members that can be automatically initialized:
/// - `sType = VK_STRUCTURE_TYPE_VIDEO_ENCODE_AV1_RATE_CONTROL_LAYER_INFO_KHR`
///
/// The {@code allocate} ({@link VkVideoEncodeAV1RateControlLayerInfoKHR#allocate(Arena)}, {@link VkVideoEncodeAV1RateControlLayerInfoKHR#allocate(Arena, long)})
/// functions will automatically initialize these fields. Also, you may call {@link VkVideoEncodeAV1RateControlLayerInfoKHR#autoInit}
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
/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkVideoEncodeAV1RateControlLayerInfoKHR.html"><code>VkVideoEncodeAV1RateControlLayerInfoKHR</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record VkVideoEncodeAV1RateControlLayerInfoKHR(@NotNull MemorySegment segment) implements IVkVideoEncodeAV1RateControlLayerInfoKHR {
    /// Represents a pointer to / an array of <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkVideoEncodeAV1RateControlLayerInfoKHR.html"><code>VkVideoEncodeAV1RateControlLayerInfoKHR</code></a> structure(s) in native memory.
    ///
    /// Technically speaking, this type has no difference with {@link VkVideoEncodeAV1RateControlLayerInfoKHR}. This type
    /// is introduced mainly for user to distinguish between a pointer to a single structure
    /// and a pointer to (potentially) an array of structure(s). APIs should use interface
    /// IVkVideoEncodeAV1RateControlLayerInfoKHR to handle both types uniformly. See package level documentation for more
    /// details.
    ///
    /// ## Contracts
    ///
    /// The property {@link #segment()} should always be not-null
    /// ({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to
    /// {@code VkVideoEncodeAV1RateControlLayerInfoKHR.LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
    /// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
    ///
    /// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
    /// perform any runtime check. The constructor can be useful for automatic code generators.
    @ValueBasedCandidate
    @UnsafeConstructor
    public record Ptr(@NotNull MemorySegment segment) implements IVkVideoEncodeAV1RateControlLayerInfoKHR {
        public long size() {
            return segment.byteSize() / VkVideoEncodeAV1RateControlLayerInfoKHR.BYTES;
        }

        /// Returns (a pointer to) the structure at the given index.
        ///
        /// Note that unlike {@code read} series functions ({@link IntPtr#read()} for
        /// example), modification on returned structure will be reflected on the original
        /// structure array. So this function is called {@code at} to explicitly
        /// indicate that the returned structure is a view of the original structure.
        public @NotNull VkVideoEncodeAV1RateControlLayerInfoKHR at(long index) {
            return new VkVideoEncodeAV1RateControlLayerInfoKHR(segment.asSlice(index * VkVideoEncodeAV1RateControlLayerInfoKHR.BYTES, VkVideoEncodeAV1RateControlLayerInfoKHR.BYTES));
        }

        public void write(long index, @NotNull VkVideoEncodeAV1RateControlLayerInfoKHR value) {
            MemorySegment s = segment.asSlice(index * VkVideoEncodeAV1RateControlLayerInfoKHR.BYTES, VkVideoEncodeAV1RateControlLayerInfoKHR.BYTES);
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
            return new Ptr(segment.asSlice(index * VkVideoEncodeAV1RateControlLayerInfoKHR.BYTES, VkVideoEncodeAV1RateControlLayerInfoKHR.BYTES));
        }

        public @NotNull Ptr offset(long offset) {
            return new Ptr(segment.asSlice(offset * VkVideoEncodeAV1RateControlLayerInfoKHR.BYTES));
        }

        /// Note that this function uses the {@link List#subList(int, int)} semantics (left inclusive,
        /// right exclusive interval), not {@link MemorySegment#asSlice(long, long)} semantics
        /// (offset + newSize). Be careful with the difference
        public @NotNull Ptr slice(long start, long end) {
            return new Ptr(segment.asSlice(
                start * VkVideoEncodeAV1RateControlLayerInfoKHR.BYTES,
                (end - start) * VkVideoEncodeAV1RateControlLayerInfoKHR.BYTES
            ));
        }

        public Ptr slice(long end) {
            return new Ptr(segment.asSlice(0, end * VkVideoEncodeAV1RateControlLayerInfoKHR.BYTES));
        }

        public VkVideoEncodeAV1RateControlLayerInfoKHR[] toArray() {
            VkVideoEncodeAV1RateControlLayerInfoKHR[] ret = new VkVideoEncodeAV1RateControlLayerInfoKHR[(int) size()];
            for (long i = 0; i < size(); i++) {
                ret[(int) i] = at(i);
            }
            return ret;
        }
    }

    public static VkVideoEncodeAV1RateControlLayerInfoKHR allocate(Arena arena) {
        VkVideoEncodeAV1RateControlLayerInfoKHR ret = new VkVideoEncodeAV1RateControlLayerInfoKHR(arena.allocate(LAYOUT));
        ret.sType(VkStructureType.VIDEO_ENCODE_AV1_RATE_CONTROL_LAYER_INFO_KHR);
        return ret;
    }

    public static VkVideoEncodeAV1RateControlLayerInfoKHR.Ptr allocate(Arena arena, long count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkVideoEncodeAV1RateControlLayerInfoKHR.Ptr ret = new VkVideoEncodeAV1RateControlLayerInfoKHR.Ptr(segment);
        for (long i = 0; i < count; i++) {
            ret.at(i).sType(VkStructureType.VIDEO_ENCODE_AV1_RATE_CONTROL_LAYER_INFO_KHR);
        }
        return ret;
    }

    public static VkVideoEncodeAV1RateControlLayerInfoKHR clone(Arena arena, VkVideoEncodeAV1RateControlLayerInfoKHR src) {
        VkVideoEncodeAV1RateControlLayerInfoKHR ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
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

    public void pNext(@Nullable IPointer pointer) {
        pNext(pointer != null ? pointer.segment() : MemorySegment.NULL);
    }

    public @unsigned int useMinQIndex() {
        return segment.get(LAYOUT$useMinQIndex, OFFSET$useMinQIndex);
    }

    public void useMinQIndex(@unsigned int value) {
        segment.set(LAYOUT$useMinQIndex, OFFSET$useMinQIndex, value);
    }

    public @NotNull VkVideoEncodeAV1QIndexKHR minQIndex() {
        return new VkVideoEncodeAV1QIndexKHR(segment.asSlice(OFFSET$minQIndex, LAYOUT$minQIndex));
    }

    public void minQIndex(@NotNull VkVideoEncodeAV1QIndexKHR value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$minQIndex, SIZE$minQIndex);
    }

    public @unsigned int useMaxQIndex() {
        return segment.get(LAYOUT$useMaxQIndex, OFFSET$useMaxQIndex);
    }

    public void useMaxQIndex(@unsigned int value) {
        segment.set(LAYOUT$useMaxQIndex, OFFSET$useMaxQIndex, value);
    }

    public @NotNull VkVideoEncodeAV1QIndexKHR maxQIndex() {
        return new VkVideoEncodeAV1QIndexKHR(segment.asSlice(OFFSET$maxQIndex, LAYOUT$maxQIndex));
    }

    public void maxQIndex(@NotNull VkVideoEncodeAV1QIndexKHR value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$maxQIndex, SIZE$maxQIndex);
    }

    public @unsigned int useMaxFrameSize() {
        return segment.get(LAYOUT$useMaxFrameSize, OFFSET$useMaxFrameSize);
    }

    public void useMaxFrameSize(@unsigned int value) {
        segment.set(LAYOUT$useMaxFrameSize, OFFSET$useMaxFrameSize, value);
    }

    public @NotNull VkVideoEncodeAV1FrameSizeKHR maxFrameSize() {
        return new VkVideoEncodeAV1FrameSizeKHR(segment.asSlice(OFFSET$maxFrameSize, LAYOUT$maxFrameSize));
    }

    public void maxFrameSize(@NotNull VkVideoEncodeAV1FrameSizeKHR value) {
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

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$useMinQIndex = PathElement.groupElement("useMinQIndex");
    public static final PathElement PATH$minQIndex = PathElement.groupElement("minQIndex");
    public static final PathElement PATH$useMaxQIndex = PathElement.groupElement("useMaxQIndex");
    public static final PathElement PATH$maxQIndex = PathElement.groupElement("maxQIndex");
    public static final PathElement PATH$useMaxFrameSize = PathElement.groupElement("useMaxFrameSize");
    public static final PathElement PATH$maxFrameSize = PathElement.groupElement("maxFrameSize");

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
