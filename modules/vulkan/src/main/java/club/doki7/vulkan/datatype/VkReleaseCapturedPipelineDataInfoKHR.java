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

/// Represents a pointer to a <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkReleaseCapturedPipelineDataInfoKHR.html"><code>VkReleaseCapturedPipelineDataInfoKHR</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct VkReleaseCapturedPipelineDataInfoKHR {
///     VkStructureType sType; // @link substring="VkStructureType" target="VkStructureType" @link substring="sType" target="#sType"
///     void* pNext; // optional // @link substring="pNext" target="#pNext"
///     VkPipeline pipeline; // @link substring="VkPipeline" target="VkPipeline" @link substring="pipeline" target="#pipeline"
/// } VkReleaseCapturedPipelineDataInfoKHR;
/// }
///
/// ## Auto initialization
///
/// This structure has the following members that can be automatically initialized:
/// - `sType = VK_STRUCTURE_TYPE_RELEASE_CAPTURED_PIPELINE_DATA_INFO_KHR`
///
/// The {@code allocate} ({@link VkReleaseCapturedPipelineDataInfoKHR#allocate(Arena)}, {@link VkReleaseCapturedPipelineDataInfoKHR#allocate(Arena, long)})
/// functions will automatically initialize these fields. Also, you may call {@link VkReleaseCapturedPipelineDataInfoKHR#autoInit}
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
/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkReleaseCapturedPipelineDataInfoKHR.html"><code>VkReleaseCapturedPipelineDataInfoKHR</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record VkReleaseCapturedPipelineDataInfoKHR(@NotNull MemorySegment segment) implements IVkReleaseCapturedPipelineDataInfoKHR {
    /// Represents a pointer to / an array of <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkReleaseCapturedPipelineDataInfoKHR.html"><code>VkReleaseCapturedPipelineDataInfoKHR</code></a> structure(s) in native memory.
    ///
    /// Technically speaking, this type has no difference with {@link VkReleaseCapturedPipelineDataInfoKHR}. This type
    /// is introduced mainly for user to distinguish between a pointer to a single structure
    /// and a pointer to (potentially) an array of structure(s). APIs should use interface
    /// IVkReleaseCapturedPipelineDataInfoKHR to handle both types uniformly. See package level documentation for more
    /// details.
    ///
    /// ## Contracts
    ///
    /// The property {@link #segment()} should always be not-null
    /// ({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to
    /// {@code VkReleaseCapturedPipelineDataInfoKHR.LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
    /// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
    ///
    /// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
    /// perform any runtime check. The constructor can be useful for automatic code generators.
    @ValueBasedCandidate
    @UnsafeConstructor
    public record Ptr(@NotNull MemorySegment segment) implements IVkReleaseCapturedPipelineDataInfoKHR, Iterable<VkReleaseCapturedPipelineDataInfoKHR> {
        public long size() {
            return segment.byteSize() / VkReleaseCapturedPipelineDataInfoKHR.BYTES;
        }

        /// Returns (a pointer to) the structure at the given index.
        ///
        /// Note that unlike {@code read} series functions ({@link IntPtr#read()} for
        /// example), modification on returned structure will be reflected on the original
        /// structure array. So this function is called {@code at} to explicitly
        /// indicate that the returned structure is a view of the original structure.
        public @NotNull VkReleaseCapturedPipelineDataInfoKHR at(long index) {
            return new VkReleaseCapturedPipelineDataInfoKHR(segment.asSlice(index * VkReleaseCapturedPipelineDataInfoKHR.BYTES, VkReleaseCapturedPipelineDataInfoKHR.BYTES));
        }

        public void at(long index, @NotNull Consumer<@NotNull VkReleaseCapturedPipelineDataInfoKHR> consumer) {
            consumer.accept(at(index));
        }

        public void write(long index, @NotNull VkReleaseCapturedPipelineDataInfoKHR value) {
            MemorySegment s = segment.asSlice(index * VkReleaseCapturedPipelineDataInfoKHR.BYTES, VkReleaseCapturedPipelineDataInfoKHR.BYTES);
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
            return new Ptr(segment.reinterpret(newSize * VkReleaseCapturedPipelineDataInfoKHR.BYTES));
        }

        public @NotNull Ptr offset(long offset) {
            return new Ptr(segment.asSlice(offset * VkReleaseCapturedPipelineDataInfoKHR.BYTES));
        }

        /// Note that this function uses the {@link List#subList(int, int)} semantics (left inclusive,
        /// right exclusive interval), not {@link MemorySegment#asSlice(long, long)} semantics
        /// (offset + newSize). Be careful with the difference
        public @NotNull Ptr slice(long start, long end) {
            return new Ptr(segment.asSlice(
                start * VkReleaseCapturedPipelineDataInfoKHR.BYTES,
                (end - start) * VkReleaseCapturedPipelineDataInfoKHR.BYTES
            ));
        }

        public Ptr slice(long end) {
            return new Ptr(segment.asSlice(0, end * VkReleaseCapturedPipelineDataInfoKHR.BYTES));
        }

        public VkReleaseCapturedPipelineDataInfoKHR[] toArray() {
            VkReleaseCapturedPipelineDataInfoKHR[] ret = new VkReleaseCapturedPipelineDataInfoKHR[(int) size()];
            for (long i = 0; i < size(); i++) {
                ret[(int) i] = at(i);
            }
            return ret;
        }

        @Override
        public @NotNull Iterator<VkReleaseCapturedPipelineDataInfoKHR> iterator() {
            return new Iter(this.segment());
        }

        /// An iterator over the structures.
        private static final class Iter implements Iterator<VkReleaseCapturedPipelineDataInfoKHR> {
            Iter(@NotNull MemorySegment segment) {
                this.segment = segment;
            }

            @Override
            public boolean hasNext() {
                return segment.byteSize() >= VkReleaseCapturedPipelineDataInfoKHR.BYTES;
            }

            @Override
            public VkReleaseCapturedPipelineDataInfoKHR next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                VkReleaseCapturedPipelineDataInfoKHR ret = new VkReleaseCapturedPipelineDataInfoKHR(segment.asSlice(0, VkReleaseCapturedPipelineDataInfoKHR.BYTES));
                segment = segment.asSlice(VkReleaseCapturedPipelineDataInfoKHR.BYTES);
                return ret;
            }

            private @NotNull MemorySegment segment;
        }
    }

    public static VkReleaseCapturedPipelineDataInfoKHR allocate(Arena arena) {
        VkReleaseCapturedPipelineDataInfoKHR ret = new VkReleaseCapturedPipelineDataInfoKHR(arena.allocate(LAYOUT));
        ret.sType(VkStructureType.RELEASE_CAPTURED_PIPELINE_DATA_INFO_KHR);
        return ret;
    }

    public static VkReleaseCapturedPipelineDataInfoKHR.Ptr allocate(Arena arena, long count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkReleaseCapturedPipelineDataInfoKHR.Ptr ret = new VkReleaseCapturedPipelineDataInfoKHR.Ptr(segment);
        for (long i = 0; i < count; i++) {
            ret.at(i).sType(VkStructureType.RELEASE_CAPTURED_PIPELINE_DATA_INFO_KHR);
        }
        return ret;
    }

    public static VkReleaseCapturedPipelineDataInfoKHR clone(Arena arena, VkReleaseCapturedPipelineDataInfoKHR src) {
        VkReleaseCapturedPipelineDataInfoKHR ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public void autoInit() {
        sType(VkStructureType.RELEASE_CAPTURED_PIPELINE_DATA_INFO_KHR);
    }

    public @EnumType(VkStructureType.class) int sType() {
        return segment.get(LAYOUT$sType, OFFSET$sType);
    }

    public VkReleaseCapturedPipelineDataInfoKHR sType(@EnumType(VkStructureType.class) int value) {
        segment.set(LAYOUT$sType, OFFSET$sType, value);
        return this;
    }

    public @Pointer(comment="void*") @NotNull MemorySegment pNext() {
        return segment.get(LAYOUT$pNext, OFFSET$pNext);
    }

    public VkReleaseCapturedPipelineDataInfoKHR pNext(@Pointer(comment="void*") @NotNull MemorySegment value) {
        segment.set(LAYOUT$pNext, OFFSET$pNext, value);
        return this;
    }

    public VkReleaseCapturedPipelineDataInfoKHR pNext(@Nullable IPointer pointer) {
        pNext(pointer != null ? pointer.segment() : MemorySegment.NULL);
        return this;
    }

    public @Nullable VkPipeline pipeline() {
        MemorySegment s = segment.asSlice(OFFSET$pipeline, SIZE$pipeline);
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }
        return new VkPipeline(s);
    }

    public VkReleaseCapturedPipelineDataInfoKHR pipeline(@Nullable VkPipeline value) {
        segment.set(LAYOUT$pipeline, OFFSET$pipeline, value != null ? value.segment() : MemorySegment.NULL);
        return this;
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.ADDRESS.withName("pipeline")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$pipeline = PathElement.groupElement("pipeline");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final AddressLayout LAYOUT$pipeline = (AddressLayout) LAYOUT.select(PATH$pipeline);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$pipeline = LAYOUT$pipeline.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$pipeline = LAYOUT.byteOffset(PATH$pipeline);
}
