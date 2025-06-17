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

/// Represents a pointer to a <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkImageCompressionControlEXT.html"><code>VkImageCompressionControlEXT</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct VkImageCompressionControlEXT {
///     VkStructureType sType; // @link substring="VkStructureType" target="VkStructureType" @link substring="sType" target="#sType"
///     void const* pNext; // optional // @link substring="pNext" target="#pNext"
///     VkImageCompressionFlagsEXT flags; // @link substring="VkImageCompressionFlagsEXT" target="VkImageCompressionFlagsEXT" @link substring="flags" target="#flags"
///     uint32_t compressionControlPlaneCount; // optional // @link substring="compressionControlPlaneCount" target="#compressionControlPlaneCount"
///     VkImageCompressionFixedRateFlagsEXT* pFixedRateFlags; // @link substring="VkImageCompressionFixedRateFlagsEXT" target="VkImageCompressionFixedRateFlagsEXT" @link substring="pFixedRateFlags" target="#pFixedRateFlags"
/// } VkImageCompressionControlEXT;
/// }
///
/// ## Auto initialization
///
/// This structure has the following members that can be automatically initialized:
/// - `sType = VK_STRUCTURE_TYPE_IMAGE_COMPRESSION_CONTROL_EXT`
///
/// The {@code allocate} ({@link VkImageCompressionControlEXT#allocate(Arena)}, {@link VkImageCompressionControlEXT#allocate(Arena, long)})
/// functions will automatically initialize these fields. Also, you may call {@link VkImageCompressionControlEXT#autoInit}
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
/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkImageCompressionControlEXT.html"><code>VkImageCompressionControlEXT</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record VkImageCompressionControlEXT(@NotNull MemorySegment segment) implements IVkImageCompressionControlEXT {
    /// Represents a pointer to / an array of <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkImageCompressionControlEXT.html"><code>VkImageCompressionControlEXT</code></a> structure(s) in native memory.
    ///
    /// Technically speaking, this type has no difference with {@link VkImageCompressionControlEXT}. This type
    /// is introduced mainly for user to distinguish between a pointer to a single structure
    /// and a pointer to (potentially) an array of structure(s). APIs should use interface
    /// IVkImageCompressionControlEXT to handle both types uniformly. See package level documentation for more
    /// details.
    ///
    /// ## Contracts
    ///
    /// The property {@link #segment()} should always be not-null
    /// ({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to
    /// {@code VkImageCompressionControlEXT.LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
    /// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
    ///
    /// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
    /// perform any runtime check. The constructor can be useful for automatic code generators.
    @ValueBasedCandidate
    @UnsafeConstructor
    public record Ptr(@NotNull MemorySegment segment) implements IVkImageCompressionControlEXT, Iterable<VkImageCompressionControlEXT> {
        public long size() {
            return segment.byteSize() / VkImageCompressionControlEXT.BYTES;
        }

        /// Returns (a pointer to) the structure at the given index.
        ///
        /// Note that unlike {@code read} series functions ({@link IntPtr#read()} for
        /// example), modification on returned structure will be reflected on the original
        /// structure array. So this function is called {@code at} to explicitly
        /// indicate that the returned structure is a view of the original structure.
        public @NotNull VkImageCompressionControlEXT at(long index) {
            return new VkImageCompressionControlEXT(segment.asSlice(index * VkImageCompressionControlEXT.BYTES, VkImageCompressionControlEXT.BYTES));
        }

        public void write(long index, @NotNull VkImageCompressionControlEXT value) {
            MemorySegment s = segment.asSlice(index * VkImageCompressionControlEXT.BYTES, VkImageCompressionControlEXT.BYTES);
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
            return new Ptr(segment.reinterpret(newSize * VkImageCompressionControlEXT.BYTES));
        }

        public @NotNull Ptr offset(long offset) {
            return new Ptr(segment.asSlice(offset * VkImageCompressionControlEXT.BYTES));
        }

        /// Note that this function uses the {@link List#subList(int, int)} semantics (left inclusive,
        /// right exclusive interval), not {@link MemorySegment#asSlice(long, long)} semantics
        /// (offset + newSize). Be careful with the difference
        public @NotNull Ptr slice(long start, long end) {
            return new Ptr(segment.asSlice(
                start * VkImageCompressionControlEXT.BYTES,
                (end - start) * VkImageCompressionControlEXT.BYTES
            ));
        }

        public Ptr slice(long end) {
            return new Ptr(segment.asSlice(0, end * VkImageCompressionControlEXT.BYTES));
        }

        public VkImageCompressionControlEXT[] toArray() {
            VkImageCompressionControlEXT[] ret = new VkImageCompressionControlEXT[(int) size()];
            for (long i = 0; i < size(); i++) {
                ret[(int) i] = at(i);
            }
            return ret;
        }

        @Override
        public @NotNull Iterator<VkImageCompressionControlEXT> iterator() {
            return new Iter(this.segment());
        }

        /// An iterator over the structures.
        private static final class Iter implements Iterator<VkImageCompressionControlEXT> {
            Iter(@NotNull MemorySegment segment) {
                this.segment = segment;
            }

            @Override
            public boolean hasNext() {
                return segment.byteSize() >= VkImageCompressionControlEXT.BYTES;
            }

            @Override
            public VkImageCompressionControlEXT next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                VkImageCompressionControlEXT ret = new VkImageCompressionControlEXT(segment.asSlice(0, VkImageCompressionControlEXT.BYTES));
                segment = segment.asSlice(VkImageCompressionControlEXT.BYTES);
                return ret;
            }

            private @NotNull MemorySegment segment;
        }
    }

    public static VkImageCompressionControlEXT allocate(Arena arena) {
        VkImageCompressionControlEXT ret = new VkImageCompressionControlEXT(arena.allocate(LAYOUT));
        ret.sType(VkStructureType.IMAGE_COMPRESSION_CONTROL_EXT);
        return ret;
    }

    public static VkImageCompressionControlEXT.Ptr allocate(Arena arena, long count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkImageCompressionControlEXT.Ptr ret = new VkImageCompressionControlEXT.Ptr(segment);
        for (long i = 0; i < count; i++) {
            ret.at(i).sType(VkStructureType.IMAGE_COMPRESSION_CONTROL_EXT);
        }
        return ret;
    }

    public static VkImageCompressionControlEXT clone(Arena arena, VkImageCompressionControlEXT src) {
        VkImageCompressionControlEXT ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public void autoInit() {
        sType(VkStructureType.IMAGE_COMPRESSION_CONTROL_EXT);
    }

    public @MagicConstant(valuesFromClass = VkStructureType.class) int sType() {
        return segment.get(LAYOUT$sType, OFFSET$sType);
    }

    public VkImageCompressionControlEXT sType(@MagicConstant(valuesFromClass = VkStructureType.class) int value) {
        segment.set(LAYOUT$sType, OFFSET$sType, value);
        return this;
    }

    public @Pointer(comment="void*") MemorySegment pNext() {
        return segment.get(LAYOUT$pNext, OFFSET$pNext);
    }

    public void pNext(@Pointer(comment="void*") MemorySegment value) {
        segment.set(LAYOUT$pNext, OFFSET$pNext, value);
    }

    public VkImageCompressionControlEXT pNext(@Nullable IPointer pointer) {
        pNext(pointer != null ? pointer.segment() : MemorySegment.NULL);
        return this;
    }

    public @MagicConstant(valuesFromClass = VkImageCompressionFlagsEXT.class) int flags() {
        return segment.get(LAYOUT$flags, OFFSET$flags);
    }

    public VkImageCompressionControlEXT flags(@MagicConstant(valuesFromClass = VkImageCompressionFlagsEXT.class) int value) {
        segment.set(LAYOUT$flags, OFFSET$flags, value);
        return this;
    }

    public @Unsigned int compressionControlPlaneCount() {
        return segment.get(LAYOUT$compressionControlPlaneCount, OFFSET$compressionControlPlaneCount);
    }

    public VkImageCompressionControlEXT compressionControlPlaneCount(@Unsigned int value) {
        segment.set(LAYOUT$compressionControlPlaneCount, OFFSET$compressionControlPlaneCount, value);
        return this;
    }


    /// Note: the returned {@link IntPtr} does not have correct
    /// {@link IntPtr#size} property. It's up to user to track the size of the buffer,
    /// and use {@link IntPtr#reinterpret} to set the size before actually reading fro
    /// or writing to the buffer.
    public @Nullable @EnumType(VkImageCompressionFixedRateFlagsEXT.class) IntPtr pFixedRateFlags() {
        MemorySegment s = pFixedRateFlagsRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }
        return new IntPtr(s);
    }

    public VkImageCompressionControlEXT pFixedRateFlags(@Nullable @EnumType(VkImageCompressionFixedRateFlagsEXT.class) IntPtr value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pFixedRateFlagsRaw(s);
        return this;
    }

    public @Pointer(target=VkImageCompressionFixedRateFlagsEXT.class) MemorySegment pFixedRateFlagsRaw() {
        return segment.get(LAYOUT$pFixedRateFlags, OFFSET$pFixedRateFlags);
    }

    public void pFixedRateFlagsRaw(@Pointer(target=VkImageCompressionFixedRateFlagsEXT.class) MemorySegment value) {
        segment.set(LAYOUT$pFixedRateFlags, OFFSET$pFixedRateFlags, value);
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("flags"),
        ValueLayout.JAVA_INT.withName("compressionControlPlaneCount"),
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT).withName("pFixedRateFlags")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$flags = PathElement.groupElement("flags");
    public static final PathElement PATH$compressionControlPlaneCount = PathElement.groupElement("compressionControlPlaneCount");
    public static final PathElement PATH$pFixedRateFlags = PathElement.groupElement("pFixedRateFlags");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$flags = (OfInt) LAYOUT.select(PATH$flags);
    public static final OfInt LAYOUT$compressionControlPlaneCount = (OfInt) LAYOUT.select(PATH$compressionControlPlaneCount);
    public static final AddressLayout LAYOUT$pFixedRateFlags = (AddressLayout) LAYOUT.select(PATH$pFixedRateFlags);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$flags = LAYOUT$flags.byteSize();
    public static final long SIZE$compressionControlPlaneCount = LAYOUT$compressionControlPlaneCount.byteSize();
    public static final long SIZE$pFixedRateFlags = LAYOUT$pFixedRateFlags.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$flags = LAYOUT.byteOffset(PATH$flags);
    public static final long OFFSET$compressionControlPlaneCount = LAYOUT.byteOffset(PATH$compressionControlPlaneCount);
    public static final long OFFSET$pFixedRateFlags = LAYOUT.byteOffset(PATH$pFixedRateFlags);
}
