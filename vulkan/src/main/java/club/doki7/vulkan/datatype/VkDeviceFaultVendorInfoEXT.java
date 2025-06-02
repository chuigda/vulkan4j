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

/// Represents a pointer to a <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkDeviceFaultVendorInfoEXT.html"><code>VkDeviceFaultVendorInfoEXT</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct VkDeviceFaultVendorInfoEXT {
///     char[VK_MAX_DESCRIPTION_SIZE] description; // @link substring="description" target="#description"
///     uint64_t vendorFaultCode; // @link substring="vendorFaultCode" target="#vendorFaultCode"
///     uint64_t vendorFaultData; // @link substring="vendorFaultData" target="#vendorFaultData"
/// } VkDeviceFaultVendorInfoEXT;
/// }
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
/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkDeviceFaultVendorInfoEXT.html"><code>VkDeviceFaultVendorInfoEXT</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record VkDeviceFaultVendorInfoEXT(@NotNull MemorySegment segment) implements IVkDeviceFaultVendorInfoEXT {
    /// Represents a pointer to / an array of <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkDeviceFaultVendorInfoEXT.html"><code>VkDeviceFaultVendorInfoEXT</code></a> structure(s) in native memory.
    ///
    /// Technically speaking, this type has no difference with {@link VkDeviceFaultVendorInfoEXT}. This type
    /// is introduced mainly for user to distinguish between a pointer to a single structure
    /// and a pointer to (potentially) an array of structure(s). APIs should use interface
    /// IVkDeviceFaultVendorInfoEXT to handle both types uniformly. See package level documentation for more
    /// details.
    ///
    /// ## Contracts
    ///
    /// The property {@link #segment()} should always be not-null
    /// ({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to
    /// {@code VkDeviceFaultVendorInfoEXT.LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
    /// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
    ///
    /// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
    /// perform any runtime check. The constructor can be useful for automatic code generators.
    @ValueBasedCandidate
    @UnsafeConstructor
    public record Ptr(@NotNull MemorySegment segment) implements IVkDeviceFaultVendorInfoEXT, Iterable<VkDeviceFaultVendorInfoEXT> {
        public long size() {
            return segment.byteSize() / VkDeviceFaultVendorInfoEXT.BYTES;
        }

        /// Returns (a pointer to) the structure at the given index.
        ///
        /// Note that unlike {@code read} series functions ({@link IntPtr#read()} for
        /// example), modification on returned structure will be reflected on the original
        /// structure array. So this function is called {@code at} to explicitly
        /// indicate that the returned structure is a view of the original structure.
        public @NotNull VkDeviceFaultVendorInfoEXT at(long index) {
            return new VkDeviceFaultVendorInfoEXT(segment.asSlice(index * VkDeviceFaultVendorInfoEXT.BYTES, VkDeviceFaultVendorInfoEXT.BYTES));
        }

        public void write(long index, @NotNull VkDeviceFaultVendorInfoEXT value) {
            MemorySegment s = segment.asSlice(index * VkDeviceFaultVendorInfoEXT.BYTES, VkDeviceFaultVendorInfoEXT.BYTES);
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
            return new Ptr(segment.reinterpret(newSize * VkDeviceFaultVendorInfoEXT.BYTES));
        }

        public @NotNull Ptr offset(long offset) {
            return new Ptr(segment.asSlice(offset * VkDeviceFaultVendorInfoEXT.BYTES));
        }

        /// Note that this function uses the {@link List#subList(int, int)} semantics (left inclusive,
        /// right exclusive interval), not {@link MemorySegment#asSlice(long, long)} semantics
        /// (offset + newSize). Be careful with the difference
        public @NotNull Ptr slice(long start, long end) {
            return new Ptr(segment.asSlice(
                start * VkDeviceFaultVendorInfoEXT.BYTES,
                (end - start) * VkDeviceFaultVendorInfoEXT.BYTES
            ));
        }

        public Ptr slice(long end) {
            return new Ptr(segment.asSlice(0, end * VkDeviceFaultVendorInfoEXT.BYTES));
        }

        public VkDeviceFaultVendorInfoEXT[] toArray() {
            VkDeviceFaultVendorInfoEXT[] ret = new VkDeviceFaultVendorInfoEXT[(int) size()];
            for (long i = 0; i < size(); i++) {
                ret[(int) i] = at(i);
            }
            return ret;
        }

        @Override
        public @NotNull Iterator<VkDeviceFaultVendorInfoEXT> iterator() {
            return new Iter(this.segment());
        }

        /// An iterator over the structures.
        private static final class Iter implements Iterator<VkDeviceFaultVendorInfoEXT> {
            Iter(@NotNull MemorySegment segment) {
                this.segment = segment;
            }

            @Override
            public boolean hasNext() {
                return segment.byteSize() >= VkDeviceFaultVendorInfoEXT.BYTES;
            }

            @Override
            public VkDeviceFaultVendorInfoEXT next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                VkDeviceFaultVendorInfoEXT ret = new VkDeviceFaultVendorInfoEXT(segment.asSlice(0, VkDeviceFaultVendorInfoEXT.BYTES));
                segment = segment.asSlice(VkDeviceFaultVendorInfoEXT.BYTES);
                return ret;
            }

            private @NotNull MemorySegment segment;
        }
    }

    public static VkDeviceFaultVendorInfoEXT allocate(Arena arena) {
        return new VkDeviceFaultVendorInfoEXT(arena.allocate(LAYOUT));
    }

    public static VkDeviceFaultVendorInfoEXT.Ptr allocate(Arena arena, long count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        return new VkDeviceFaultVendorInfoEXT.Ptr(segment);
    }

    public static VkDeviceFaultVendorInfoEXT clone(Arena arena, VkDeviceFaultVendorInfoEXT src) {
        VkDeviceFaultVendorInfoEXT ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public BytePtr description() {
        return new BytePtr(descriptionRaw());
    }

    public VkDeviceFaultVendorInfoEXT description(BytePtr value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$description, SIZE$description);
        return this;
    }

    public MemorySegment descriptionRaw() {
        return segment.asSlice(OFFSET$description, SIZE$description);
    }

    public @Unsigned long vendorFaultCode() {
        return segment.get(LAYOUT$vendorFaultCode, OFFSET$vendorFaultCode);
    }

    public VkDeviceFaultVendorInfoEXT vendorFaultCode(@Unsigned long value) {
        segment.set(LAYOUT$vendorFaultCode, OFFSET$vendorFaultCode, value);
        return this;
    }

    public @Unsigned long vendorFaultData() {
        return segment.get(LAYOUT$vendorFaultData, OFFSET$vendorFaultData);
    }

    public VkDeviceFaultVendorInfoEXT vendorFaultData(@Unsigned long value) {
        segment.set(LAYOUT$vendorFaultData, OFFSET$vendorFaultData, value);
        return this;
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        MemoryLayout.sequenceLayout(MAX_DESCRIPTION_SIZE, ValueLayout.JAVA_BYTE).withName("description"),
        ValueLayout.JAVA_LONG.withName("vendorFaultCode"),
        ValueLayout.JAVA_LONG.withName("vendorFaultData")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$description = PathElement.groupElement("description");
    public static final PathElement PATH$vendorFaultCode = PathElement.groupElement("vendorFaultCode");
    public static final PathElement PATH$vendorFaultData = PathElement.groupElement("vendorFaultData");

    public static final SequenceLayout LAYOUT$description = (SequenceLayout) LAYOUT.select(PATH$description);
    public static final OfLong LAYOUT$vendorFaultCode = (OfLong) LAYOUT.select(PATH$vendorFaultCode);
    public static final OfLong LAYOUT$vendorFaultData = (OfLong) LAYOUT.select(PATH$vendorFaultData);

    public static final long SIZE$description = LAYOUT$description.byteSize();
    public static final long SIZE$vendorFaultCode = LAYOUT$vendorFaultCode.byteSize();
    public static final long SIZE$vendorFaultData = LAYOUT$vendorFaultData.byteSize();

    public static final long OFFSET$description = LAYOUT.byteOffset(PATH$description);
    public static final long OFFSET$vendorFaultCode = LAYOUT.byteOffset(PATH$vendorFaultCode);
    public static final long OFFSET$vendorFaultData = LAYOUT.byteOffset(PATH$vendorFaultData);
}
