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

/// Represents a pointer to a <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkDeviceFaultVendorBinaryHeaderVersionOneEXT.html"><code>VkDeviceFaultVendorBinaryHeaderVersionOneEXT</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct VkDeviceFaultVendorBinaryHeaderVersionOneEXT {
///     uint32_t headerSize; // @link substring="headerSize" target="#headerSize"
///     VkDeviceFaultVendorBinaryHeaderVersionEXT headerVersion; // @link substring="VkDeviceFaultVendorBinaryHeaderVersionEXT" target="VkDeviceFaultVendorBinaryHeaderVersionEXT" @link substring="headerVersion" target="#headerVersion"
///     uint32_t vendorID; // @link substring="vendorID" target="#vendorID"
///     uint32_t deviceID; // @link substring="deviceID" target="#deviceID"
///     uint32_t driverVersion; // @link substring="driverVersion" target="#driverVersion"
///     uint8_t pipelineCacheUUID; // @link substring="pipelineCacheUUID" target="#pipelineCacheUUID"
///     uint32_t applicationNameOffset; // @link substring="applicationNameOffset" target="#applicationNameOffset"
///     uint32_t applicationVersion; // @link substring="applicationVersion" target="#applicationVersion"
///     uint32_t engineNameOffset; // @link substring="engineNameOffset" target="#engineNameOffset"
///     uint32_t engineVersion; // @link substring="engineVersion" target="#engineVersion"
///     uint32_t apiVersion; // @link substring="apiVersion" target="#apiVersion"
/// } VkDeviceFaultVendorBinaryHeaderVersionOneEXT;
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
/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkDeviceFaultVendorBinaryHeaderVersionOneEXT.html"><code>VkDeviceFaultVendorBinaryHeaderVersionOneEXT</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record VkDeviceFaultVendorBinaryHeaderVersionOneEXT(@NotNull MemorySegment segment) implements IVkDeviceFaultVendorBinaryHeaderVersionOneEXT {
    /// Represents a pointer to / an array of <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkDeviceFaultVendorBinaryHeaderVersionOneEXT.html"><code>VkDeviceFaultVendorBinaryHeaderVersionOneEXT</code></a> structure(s) in native memory.
    ///
    /// Technically speaking, this type has no difference with {@link VkDeviceFaultVendorBinaryHeaderVersionOneEXT}. This type
    /// is introduced mainly for user to distinguish between a pointer to a single structure
    /// and a pointer to (potentially) an array of structure(s). APIs should use interface
    /// IVkDeviceFaultVendorBinaryHeaderVersionOneEXT to handle both types uniformly. See package level documentation for more
    /// details.
    ///
    /// ## Contracts
    ///
    /// The property {@link #segment()} should always be not-null
    /// ({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to
    /// {@code VkDeviceFaultVendorBinaryHeaderVersionOneEXT.LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
    /// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
    ///
    /// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
    /// perform any runtime check. The constructor can be useful for automatic code generators.
    @ValueBasedCandidate
    @UnsafeConstructor
    public record Ptr(@NotNull MemorySegment segment) implements IVkDeviceFaultVendorBinaryHeaderVersionOneEXT {
        public long size() {
            return segment.byteSize() / VkDeviceFaultVendorBinaryHeaderVersionOneEXT.BYTES;
        }

        /// Returns (a pointer to) the structure at the given index.
        ///
        /// Note that unlike {@code read} series functions ({@link IntPtr#read()} for
        /// example), modification on returned structure will be reflected on the original
        /// structure array. So this function is called {@code at} to explicitly
        /// indicate that the returned structure is a view of the original structure.
        public @NotNull VkDeviceFaultVendorBinaryHeaderVersionOneEXT at(long index) {
            return new VkDeviceFaultVendorBinaryHeaderVersionOneEXT(segment.asSlice(index * VkDeviceFaultVendorBinaryHeaderVersionOneEXT.BYTES, VkDeviceFaultVendorBinaryHeaderVersionOneEXT.BYTES));
        }

        public void write(long index, @NotNull VkDeviceFaultVendorBinaryHeaderVersionOneEXT value) {
            MemorySegment s = segment.asSlice(index * VkDeviceFaultVendorBinaryHeaderVersionOneEXT.BYTES, VkDeviceFaultVendorBinaryHeaderVersionOneEXT.BYTES);
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
            return new Ptr(segment.asSlice(index * VkDeviceFaultVendorBinaryHeaderVersionOneEXT.BYTES, VkDeviceFaultVendorBinaryHeaderVersionOneEXT.BYTES));
        }

        public @NotNull Ptr offset(long offset) {
            return new Ptr(segment.asSlice(offset * VkDeviceFaultVendorBinaryHeaderVersionOneEXT.BYTES));
        }

        /// Note that this function uses the {@link List#subList(int, int)} semantics (left inclusive,
        /// right exclusive interval), not {@link MemorySegment#asSlice(long, long)} semantics
        /// (offset + newSize). Be careful with the difference
        public @NotNull Ptr slice(long start, long end) {
            return new Ptr(segment.asSlice(
                start * VkDeviceFaultVendorBinaryHeaderVersionOneEXT.BYTES,
                (end - start) * VkDeviceFaultVendorBinaryHeaderVersionOneEXT.BYTES
            ));
        }

        public Ptr slice(long end) {
            return new Ptr(segment.asSlice(0, end * VkDeviceFaultVendorBinaryHeaderVersionOneEXT.BYTES));
        }

        public VkDeviceFaultVendorBinaryHeaderVersionOneEXT[] toArray() {
            VkDeviceFaultVendorBinaryHeaderVersionOneEXT[] ret = new VkDeviceFaultVendorBinaryHeaderVersionOneEXT[(int) size()];
            for (long i = 0; i < size(); i++) {
                ret[(int) i] = at(i);
            }
            return ret;
        }
    }

    public static VkDeviceFaultVendorBinaryHeaderVersionOneEXT allocate(Arena arena) {
        return new VkDeviceFaultVendorBinaryHeaderVersionOneEXT(arena.allocate(LAYOUT));
    }

    public static VkDeviceFaultVendorBinaryHeaderVersionOneEXT.Ptr allocate(Arena arena, long count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        return new VkDeviceFaultVendorBinaryHeaderVersionOneEXT.Ptr(segment);
    }

    public static VkDeviceFaultVendorBinaryHeaderVersionOneEXT clone(Arena arena, VkDeviceFaultVendorBinaryHeaderVersionOneEXT src) {
        VkDeviceFaultVendorBinaryHeaderVersionOneEXT ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public @Unsigned int headerSize() {
        return segment.get(LAYOUT$headerSize, OFFSET$headerSize);
    }

    public void headerSize(@Unsigned int value) {
        segment.set(LAYOUT$headerSize, OFFSET$headerSize, value);
    }

    public @EnumType(VkDeviceFaultVendorBinaryHeaderVersionEXT.class) int headerVersion() {
        return segment.get(LAYOUT$headerVersion, OFFSET$headerVersion);
    }

    public void headerVersion(@EnumType(VkDeviceFaultVendorBinaryHeaderVersionEXT.class) int value) {
        segment.set(LAYOUT$headerVersion, OFFSET$headerVersion, value);
    }

    public @Unsigned int vendorID() {
        return segment.get(LAYOUT$vendorID, OFFSET$vendorID);
    }

    public void vendorID(@Unsigned int value) {
        segment.set(LAYOUT$vendorID, OFFSET$vendorID, value);
    }

    public @Unsigned int deviceID() {
        return segment.get(LAYOUT$deviceID, OFFSET$deviceID);
    }

    public void deviceID(@Unsigned int value) {
        segment.set(LAYOUT$deviceID, OFFSET$deviceID, value);
    }

    public @Unsigned int driverVersion() {
        return segment.get(LAYOUT$driverVersion, OFFSET$driverVersion);
    }

    public void driverVersion(@Unsigned int value) {
        segment.set(LAYOUT$driverVersion, OFFSET$driverVersion, value);
    }

    public @Unsigned byte pipelineCacheUUID() {
        return segment.get(LAYOUT$pipelineCacheUUID, OFFSET$pipelineCacheUUID);
    }

    public void pipelineCacheUUID(@Unsigned byte value) {
        segment.set(LAYOUT$pipelineCacheUUID, OFFSET$pipelineCacheUUID, value);
    }

    public @Unsigned int applicationNameOffset() {
        return segment.get(LAYOUT$applicationNameOffset, OFFSET$applicationNameOffset);
    }

    public void applicationNameOffset(@Unsigned int value) {
        segment.set(LAYOUT$applicationNameOffset, OFFSET$applicationNameOffset, value);
    }

    public @Unsigned int applicationVersion() {
        return segment.get(LAYOUT$applicationVersion, OFFSET$applicationVersion);
    }

    public void applicationVersion(@Unsigned int value) {
        segment.set(LAYOUT$applicationVersion, OFFSET$applicationVersion, value);
    }

    public @Unsigned int engineNameOffset() {
        return segment.get(LAYOUT$engineNameOffset, OFFSET$engineNameOffset);
    }

    public void engineNameOffset(@Unsigned int value) {
        segment.set(LAYOUT$engineNameOffset, OFFSET$engineNameOffset, value);
    }

    public @Unsigned int engineVersion() {
        return segment.get(LAYOUT$engineVersion, OFFSET$engineVersion);
    }

    public void engineVersion(@Unsigned int value) {
        segment.set(LAYOUT$engineVersion, OFFSET$engineVersion, value);
    }

    public @Unsigned int apiVersion() {
        return segment.get(LAYOUT$apiVersion, OFFSET$apiVersion);
    }

    public void apiVersion(@Unsigned int value) {
        segment.set(LAYOUT$apiVersion, OFFSET$apiVersion, value);
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("headerSize"),
        ValueLayout.JAVA_INT.withName("headerVersion"),
        ValueLayout.JAVA_INT.withName("vendorID"),
        ValueLayout.JAVA_INT.withName("deviceID"),
        ValueLayout.JAVA_INT.withName("driverVersion"),
        ValueLayout.JAVA_BYTE.withName("pipelineCacheUUID"),
        ValueLayout.JAVA_INT.withName("applicationNameOffset"),
        ValueLayout.JAVA_INT.withName("applicationVersion"),
        ValueLayout.JAVA_INT.withName("engineNameOffset"),
        ValueLayout.JAVA_INT.withName("engineVersion"),
        ValueLayout.JAVA_INT.withName("apiVersion")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$headerSize = PathElement.groupElement("headerSize");
    public static final PathElement PATH$headerVersion = PathElement.groupElement("headerVersion");
    public static final PathElement PATH$vendorID = PathElement.groupElement("vendorID");
    public static final PathElement PATH$deviceID = PathElement.groupElement("deviceID");
    public static final PathElement PATH$driverVersion = PathElement.groupElement("driverVersion");
    public static final PathElement PATH$pipelineCacheUUID = PathElement.groupElement("pipelineCacheUUID");
    public static final PathElement PATH$applicationNameOffset = PathElement.groupElement("applicationNameOffset");
    public static final PathElement PATH$applicationVersion = PathElement.groupElement("applicationVersion");
    public static final PathElement PATH$engineNameOffset = PathElement.groupElement("engineNameOffset");
    public static final PathElement PATH$engineVersion = PathElement.groupElement("engineVersion");
    public static final PathElement PATH$apiVersion = PathElement.groupElement("apiVersion");

    public static final OfInt LAYOUT$headerSize = (OfInt) LAYOUT.select(PATH$headerSize);
    public static final OfInt LAYOUT$headerVersion = (OfInt) LAYOUT.select(PATH$headerVersion);
    public static final OfInt LAYOUT$vendorID = (OfInt) LAYOUT.select(PATH$vendorID);
    public static final OfInt LAYOUT$deviceID = (OfInt) LAYOUT.select(PATH$deviceID);
    public static final OfInt LAYOUT$driverVersion = (OfInt) LAYOUT.select(PATH$driverVersion);
    public static final OfByte LAYOUT$pipelineCacheUUID = (OfByte) LAYOUT.select(PATH$pipelineCacheUUID);
    public static final OfInt LAYOUT$applicationNameOffset = (OfInt) LAYOUT.select(PATH$applicationNameOffset);
    public static final OfInt LAYOUT$applicationVersion = (OfInt) LAYOUT.select(PATH$applicationVersion);
    public static final OfInt LAYOUT$engineNameOffset = (OfInt) LAYOUT.select(PATH$engineNameOffset);
    public static final OfInt LAYOUT$engineVersion = (OfInt) LAYOUT.select(PATH$engineVersion);
    public static final OfInt LAYOUT$apiVersion = (OfInt) LAYOUT.select(PATH$apiVersion);

    public static final long SIZE$headerSize = LAYOUT$headerSize.byteSize();
    public static final long SIZE$headerVersion = LAYOUT$headerVersion.byteSize();
    public static final long SIZE$vendorID = LAYOUT$vendorID.byteSize();
    public static final long SIZE$deviceID = LAYOUT$deviceID.byteSize();
    public static final long SIZE$driverVersion = LAYOUT$driverVersion.byteSize();
    public static final long SIZE$pipelineCacheUUID = LAYOUT$pipelineCacheUUID.byteSize();
    public static final long SIZE$applicationNameOffset = LAYOUT$applicationNameOffset.byteSize();
    public static final long SIZE$applicationVersion = LAYOUT$applicationVersion.byteSize();
    public static final long SIZE$engineNameOffset = LAYOUT$engineNameOffset.byteSize();
    public static final long SIZE$engineVersion = LAYOUT$engineVersion.byteSize();
    public static final long SIZE$apiVersion = LAYOUT$apiVersion.byteSize();

    public static final long OFFSET$headerSize = LAYOUT.byteOffset(PATH$headerSize);
    public static final long OFFSET$headerVersion = LAYOUT.byteOffset(PATH$headerVersion);
    public static final long OFFSET$vendorID = LAYOUT.byteOffset(PATH$vendorID);
    public static final long OFFSET$deviceID = LAYOUT.byteOffset(PATH$deviceID);
    public static final long OFFSET$driverVersion = LAYOUT.byteOffset(PATH$driverVersion);
    public static final long OFFSET$pipelineCacheUUID = LAYOUT.byteOffset(PATH$pipelineCacheUUID);
    public static final long OFFSET$applicationNameOffset = LAYOUT.byteOffset(PATH$applicationNameOffset);
    public static final long OFFSET$applicationVersion = LAYOUT.byteOffset(PATH$applicationVersion);
    public static final long OFFSET$engineNameOffset = LAYOUT.byteOffset(PATH$engineNameOffset);
    public static final long OFFSET$engineVersion = LAYOUT.byteOffset(PATH$engineVersion);
    public static final long OFFSET$apiVersion = LAYOUT.byteOffset(PATH$apiVersion);
}
