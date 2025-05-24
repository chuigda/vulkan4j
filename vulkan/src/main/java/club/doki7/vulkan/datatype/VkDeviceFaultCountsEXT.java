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

/// Represents a pointer to a <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkDeviceFaultCountsEXT.html"><code>VkDeviceFaultCountsEXT</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct VkDeviceFaultCountsEXT {
///     VkStructureType sType; // @link substring="VkStructureType" target="VkStructureType" @link substring="sType" target="#sType"
///     void* pNext; // optional // @link substring="pNext" target="#pNext"
///     uint32_t addressInfoCount; // optional // @link substring="addressInfoCount" target="#addressInfoCount"
///     uint32_t vendorInfoCount; // optional // @link substring="vendorInfoCount" target="#vendorInfoCount"
///     VkDeviceSize vendorBinarySize; // optional // @link substring="vendorBinarySize" target="#vendorBinarySize"
/// } VkDeviceFaultCountsEXT;
/// }
///
/// ## Auto initialization
///
/// This structure has the following members that can be automatically initialized:
/// - `sType = VK_STRUCTURE_TYPE_DEVICE_FAULT_COUNTS_EXT`
///
/// The {@code allocate} ({@link VkDeviceFaultCountsEXT#allocate(Arena)}, {@link VkDeviceFaultCountsEXT#allocate(Arena, long)})
/// functions will automatically initialize these fields. Also, you may call {@link VkDeviceFaultCountsEXT#autoInit}
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
/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkDeviceFaultCountsEXT.html"><code>VkDeviceFaultCountsEXT</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record VkDeviceFaultCountsEXT(@NotNull MemorySegment segment) implements IVkDeviceFaultCountsEXT {
    /// Represents a pointer to / an array of <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkDeviceFaultCountsEXT.html"><code>VkDeviceFaultCountsEXT</code></a> structure(s) in native memory.
    ///
    /// Technically speaking, this type has no difference with {@link VkDeviceFaultCountsEXT}. This type
    /// is introduced mainly for user to distinguish between a pointer to a single structure
    /// and a pointer to (potentially) an array of structure(s). APIs should use interface
    /// IVkDeviceFaultCountsEXT to handle both types uniformly. See package level documentation for more
    /// details.
    ///
    /// ## Contracts
    ///
    /// The property {@link #segment()} should always be not-null
    /// ({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to
    /// {@code VkDeviceFaultCountsEXT.LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
    /// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
    ///
    /// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
    /// perform any runtime check. The constructor can be useful for automatic code generators.
    @ValueBasedCandidate
    @UnsafeConstructor
    public record Ptr(@NotNull MemorySegment segment) implements IVkDeviceFaultCountsEXT {
        public long size() {
            return segment.byteSize() / VkDeviceFaultCountsEXT.BYTES;
        }

        /// Returns (a pointer to) the structure at the given index.
        ///
        /// Note that unlike {@code read} series functions ({@link IntPtr#read()} for
        /// example), modification on returned structure will be reflected on the original
        /// structure array. So this function is called {@code at} to explicitly
        /// indicate that the returned structure is a view of the original structure.
        public @NotNull VkDeviceFaultCountsEXT at(long index) {
            return new VkDeviceFaultCountsEXT(segment.asSlice(index * VkDeviceFaultCountsEXT.BYTES, VkDeviceFaultCountsEXT.BYTES));
        }

        public void write(long index, @NotNull VkDeviceFaultCountsEXT value) {
            MemorySegment s = segment.asSlice(index * VkDeviceFaultCountsEXT.BYTES, VkDeviceFaultCountsEXT.BYTES);
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
        public @NotNull Ptr reinterpret(long index) {
            return new Ptr(segment.asSlice(index * VkDeviceFaultCountsEXT.BYTES, VkDeviceFaultCountsEXT.BYTES));
        }

        public @NotNull Ptr offset(long offset) {
            return new Ptr(segment.asSlice(offset * VkDeviceFaultCountsEXT.BYTES));
        }

        /// Note that this function uses the {@link List#subList(int, int)} semantics (left inclusive,
        /// right exclusive interval), not {@link MemorySegment#asSlice(long, long)} semantics
        /// (offset + newSize). Be careful with the difference
        public @NotNull Ptr slice(long start, long end) {
            return new Ptr(segment.asSlice(
                start * VkDeviceFaultCountsEXT.BYTES,
                (end - start) * VkDeviceFaultCountsEXT.BYTES
            ));
        }

        public Ptr slice(long end) {
            return new Ptr(segment.asSlice(0, end * VkDeviceFaultCountsEXT.BYTES));
        }

        public VkDeviceFaultCountsEXT[] toArray() {
            VkDeviceFaultCountsEXT[] ret = new VkDeviceFaultCountsEXT[(int) size()];
            for (long i = 0; i < size(); i++) {
                ret[(int) i] = at(i);
            }
            return ret;
        }
    }

    public static VkDeviceFaultCountsEXT allocate(Arena arena) {
        VkDeviceFaultCountsEXT ret = new VkDeviceFaultCountsEXT(arena.allocate(LAYOUT));
        ret.sType(VkStructureType.DEVICE_FAULT_COUNTS_EXT);
        return ret;
    }

    public static VkDeviceFaultCountsEXT.Ptr allocate(Arena arena, long count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkDeviceFaultCountsEXT.Ptr ret = new VkDeviceFaultCountsEXT.Ptr(segment);
        for (long i = 0; i < count; i++) {
            ret.at(i).sType(VkStructureType.DEVICE_FAULT_COUNTS_EXT);
        }
        return ret;
    }

    public static VkDeviceFaultCountsEXT clone(Arena arena, VkDeviceFaultCountsEXT src) {
        VkDeviceFaultCountsEXT ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public void autoInit() {
        sType(VkStructureType.DEVICE_FAULT_COUNTS_EXT);
    }

    public @EnumType(VkStructureType.class) int sType() {
        return segment.get(LAYOUT$sType, OFFSET$sType);
    }

    public void sType(@EnumType(VkStructureType.class) int value) {
        segment.set(LAYOUT$sType, OFFSET$sType, value);
    }

    public @Pointer(comment="void*") MemorySegment pNext() {
        return segment.get(LAYOUT$pNext, OFFSET$pNext);
    }

    public void pNext(@Pointer(comment="void*") MemorySegment value) {
        segment.set(LAYOUT$pNext, OFFSET$pNext, value);
    }

    public void pNext(@Nullable IPointer pointer) {
        pNext(pointer != null ? pointer.segment() : MemorySegment.NULL);
    }

    public @Unsigned int addressInfoCount() {
        return segment.get(LAYOUT$addressInfoCount, OFFSET$addressInfoCount);
    }

    public void addressInfoCount(@Unsigned int value) {
        segment.set(LAYOUT$addressInfoCount, OFFSET$addressInfoCount, value);
    }

    public @Unsigned int vendorInfoCount() {
        return segment.get(LAYOUT$vendorInfoCount, OFFSET$vendorInfoCount);
    }

    public void vendorInfoCount(@Unsigned int value) {
        segment.set(LAYOUT$vendorInfoCount, OFFSET$vendorInfoCount, value);
    }

    public @Unsigned @NativeType("VkDeviceSize") long vendorBinarySize() {
        return segment.get(LAYOUT$vendorBinarySize, OFFSET$vendorBinarySize);
    }

    public void vendorBinarySize(@Unsigned @NativeType("VkDeviceSize") long value) {
        segment.set(LAYOUT$vendorBinarySize, OFFSET$vendorBinarySize, value);
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("addressInfoCount"),
        ValueLayout.JAVA_INT.withName("vendorInfoCount"),
        ValueLayout.JAVA_LONG.withName("vendorBinarySize")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$addressInfoCount = PathElement.groupElement("addressInfoCount");
    public static final PathElement PATH$vendorInfoCount = PathElement.groupElement("vendorInfoCount");
    public static final PathElement PATH$vendorBinarySize = PathElement.groupElement("vendorBinarySize");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$addressInfoCount = (OfInt) LAYOUT.select(PATH$addressInfoCount);
    public static final OfInt LAYOUT$vendorInfoCount = (OfInt) LAYOUT.select(PATH$vendorInfoCount);
    public static final OfLong LAYOUT$vendorBinarySize = (OfLong) LAYOUT.select(PATH$vendorBinarySize);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$addressInfoCount = LAYOUT$addressInfoCount.byteSize();
    public static final long SIZE$vendorInfoCount = LAYOUT$vendorInfoCount.byteSize();
    public static final long SIZE$vendorBinarySize = LAYOUT$vendorBinarySize.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$addressInfoCount = LAYOUT.byteOffset(PATH$addressInfoCount);
    public static final long OFFSET$vendorInfoCount = LAYOUT.byteOffset(PATH$vendorInfoCount);
    public static final long OFFSET$vendorBinarySize = LAYOUT.byteOffset(PATH$vendorBinarySize);
}
