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

/// Represents a pointer to a <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkDeviceFaultAddressInfoEXT.html"><code>VkDeviceFaultAddressInfoEXT</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct VkDeviceFaultAddressInfoEXT {
///     VkDeviceFaultAddressTypeEXT addressType; // @link substring="VkDeviceFaultAddressTypeEXT" target="VkDeviceFaultAddressTypeEXT" @link substring="addressType" target="#addressType"
///     VkDeviceAddress reportedAddress; // @link substring="reportedAddress" target="#reportedAddress"
///     VkDeviceSize addressPrecision; // @link substring="addressPrecision" target="#addressPrecision"
/// } VkDeviceFaultAddressInfoEXT;
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
/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkDeviceFaultAddressInfoEXT.html"><code>VkDeviceFaultAddressInfoEXT</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record VkDeviceFaultAddressInfoEXT(@NotNull MemorySegment segment) implements IVkDeviceFaultAddressInfoEXT {
    /// Represents a pointer to / an array of <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkDeviceFaultAddressInfoEXT.html"><code>VkDeviceFaultAddressInfoEXT</code></a> structure(s) in native memory.
    ///
    /// Technically speaking, this type has no difference with {@link VkDeviceFaultAddressInfoEXT}. This type
    /// is introduced mainly for user to distinguish between a pointer to a single structure
    /// and a pointer to (potentially) an array of structure(s). APIs should use interface
    /// IVkDeviceFaultAddressInfoEXT to handle both types uniformly. See package level documentation for more
    /// details.
    ///
    /// ## Contracts
    ///
    /// The property {@link #segment()} should always be not-null
    /// ({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to
    /// {@code VkDeviceFaultAddressInfoEXT.LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
    /// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
    ///
    /// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
    /// perform any runtime check. The constructor can be useful for automatic code generators.
    @ValueBasedCandidate
    @UnsafeConstructor
    public record Ptr(@NotNull MemorySegment segment) implements IVkDeviceFaultAddressInfoEXT, Iterable<VkDeviceFaultAddressInfoEXT> {
        public long size() {
            return segment.byteSize() / VkDeviceFaultAddressInfoEXT.BYTES;
        }

        /// Returns (a pointer to) the structure at the given index.
        ///
        /// Note that unlike {@code read} series functions ({@link IntPtr#read()} for
        /// example), modification on returned structure will be reflected on the original
        /// structure array. So this function is called {@code at} to explicitly
        /// indicate that the returned structure is a view of the original structure.
        public @NotNull VkDeviceFaultAddressInfoEXT at(long index) {
            return new VkDeviceFaultAddressInfoEXT(segment.asSlice(index * VkDeviceFaultAddressInfoEXT.BYTES, VkDeviceFaultAddressInfoEXT.BYTES));
        }

        public VkDeviceFaultAddressInfoEXT.Ptr at(long index, @NotNull Consumer<@NotNull VkDeviceFaultAddressInfoEXT> consumer) {
            consumer.accept(at(index));
            return this;
        }

        public void write(long index, @NotNull VkDeviceFaultAddressInfoEXT value) {
            MemorySegment s = segment.asSlice(index * VkDeviceFaultAddressInfoEXT.BYTES, VkDeviceFaultAddressInfoEXT.BYTES);
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
            return new Ptr(segment.reinterpret(newSize * VkDeviceFaultAddressInfoEXT.BYTES));
        }

        public @NotNull Ptr offset(long offset) {
            return new Ptr(segment.asSlice(offset * VkDeviceFaultAddressInfoEXT.BYTES));
        }

        /// Note that this function uses the {@link List#subList(int, int)} semantics (left inclusive,
        /// right exclusive interval), not {@link MemorySegment#asSlice(long, long)} semantics
        /// (offset + newSize). Be careful with the difference
        public @NotNull Ptr slice(long start, long end) {
            return new Ptr(segment.asSlice(
                start * VkDeviceFaultAddressInfoEXT.BYTES,
                (end - start) * VkDeviceFaultAddressInfoEXT.BYTES
            ));
        }

        public Ptr slice(long end) {
            return new Ptr(segment.asSlice(0, end * VkDeviceFaultAddressInfoEXT.BYTES));
        }

        public VkDeviceFaultAddressInfoEXT[] toArray() {
            VkDeviceFaultAddressInfoEXT[] ret = new VkDeviceFaultAddressInfoEXT[(int) size()];
            for (long i = 0; i < size(); i++) {
                ret[(int) i] = at(i);
            }
            return ret;
        }

        @Override
        public @NotNull Iterator<VkDeviceFaultAddressInfoEXT> iterator() {
            return new Iter(this.segment());
        }

        /// An iterator over the structures.
        private static final class Iter implements Iterator<VkDeviceFaultAddressInfoEXT> {
            Iter(@NotNull MemorySegment segment) {
                this.segment = segment;
            }

            @Override
            public boolean hasNext() {
                return segment.byteSize() >= VkDeviceFaultAddressInfoEXT.BYTES;
            }

            @Override
            public VkDeviceFaultAddressInfoEXT next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                VkDeviceFaultAddressInfoEXT ret = new VkDeviceFaultAddressInfoEXT(segment.asSlice(0, VkDeviceFaultAddressInfoEXT.BYTES));
                segment = segment.asSlice(VkDeviceFaultAddressInfoEXT.BYTES);
                return ret;
            }

            private @NotNull MemorySegment segment;
        }
    }

    public static VkDeviceFaultAddressInfoEXT allocate(Arena arena) {
        return new VkDeviceFaultAddressInfoEXT(arena.allocate(LAYOUT));
    }

    public static VkDeviceFaultAddressInfoEXT.Ptr allocate(Arena arena, long count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        return new VkDeviceFaultAddressInfoEXT.Ptr(segment);
    }

    public static VkDeviceFaultAddressInfoEXT clone(Arena arena, VkDeviceFaultAddressInfoEXT src) {
        VkDeviceFaultAddressInfoEXT ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public @EnumType(VkDeviceFaultAddressTypeEXT.class) int addressType() {
        return segment.get(LAYOUT$addressType, OFFSET$addressType);
    }

    public VkDeviceFaultAddressInfoEXT addressType(@EnumType(VkDeviceFaultAddressTypeEXT.class) int value) {
        segment.set(LAYOUT$addressType, OFFSET$addressType, value);
        return this;
    }

    public @NativeType("VkDeviceAddress") @Unsigned long reportedAddress() {
        return segment.get(LAYOUT$reportedAddress, OFFSET$reportedAddress);
    }

    public VkDeviceFaultAddressInfoEXT reportedAddress(@NativeType("VkDeviceAddress") @Unsigned long value) {
        segment.set(LAYOUT$reportedAddress, OFFSET$reportedAddress, value);
        return this;
    }

    public @NativeType("VkDeviceSize") @Unsigned long addressPrecision() {
        return segment.get(LAYOUT$addressPrecision, OFFSET$addressPrecision);
    }

    public VkDeviceFaultAddressInfoEXT addressPrecision(@NativeType("VkDeviceSize") @Unsigned long value) {
        segment.set(LAYOUT$addressPrecision, OFFSET$addressPrecision, value);
        return this;
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("addressType"),
        ValueLayout.JAVA_LONG.withName("reportedAddress"),
        ValueLayout.JAVA_LONG.withName("addressPrecision")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$addressType = PathElement.groupElement("addressType");
    public static final PathElement PATH$reportedAddress = PathElement.groupElement("reportedAddress");
    public static final PathElement PATH$addressPrecision = PathElement.groupElement("addressPrecision");

    public static final OfInt LAYOUT$addressType = (OfInt) LAYOUT.select(PATH$addressType);
    public static final OfLong LAYOUT$reportedAddress = (OfLong) LAYOUT.select(PATH$reportedAddress);
    public static final OfLong LAYOUT$addressPrecision = (OfLong) LAYOUT.select(PATH$addressPrecision);

    public static final long SIZE$addressType = LAYOUT$addressType.byteSize();
    public static final long SIZE$reportedAddress = LAYOUT$reportedAddress.byteSize();
    public static final long SIZE$addressPrecision = LAYOUT$addressPrecision.byteSize();

    public static final long OFFSET$addressType = LAYOUT.byteOffset(PATH$addressType);
    public static final long OFFSET$reportedAddress = LAYOUT.byteOffset(PATH$reportedAddress);
    public static final long OFFSET$addressPrecision = LAYOUT.byteOffset(PATH$addressPrecision);
}
