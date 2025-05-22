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

/// Represents a pointer to a <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkStridedDeviceAddressNV.html"><code>VkStridedDeviceAddressNV</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct VkStridedDeviceAddressNV {
///     VkDeviceAddress startAddress; // @link substring="startAddress" target="#startAddress"
///     VkDeviceSize strideInBytes; // @link substring="strideInBytes" target="#strideInBytes"
/// } VkStridedDeviceAddressNV;
/// }
///
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
/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkStridedDeviceAddressNV.html"><code>VkStridedDeviceAddressNV</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record VkStridedDeviceAddressNV(@NotNull MemorySegment segment) implements IVkStridedDeviceAddressNV {
    /// Represents a pointer to / an array of <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkStridedDeviceAddressNV.html"><code>VkStridedDeviceAddressNV</code></a> structure(s) in native memory.
    ///
    /// Technically speaking, this type has no difference with {@link VkStridedDeviceAddressNV}. This type
    /// is introduced mainly for user to distinguish between a pointer to a single structure
    /// and a pointer to (potentially) an array of structure(s). APIs should use interface
    /// IVkStridedDeviceAddressNV to handle both types uniformly. See package level documentation for more
    /// details.
    ///
    /// ## Contracts
    ///
    /// The property {@link #segment()} should always be not-null
    /// (({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to
    /// {@code VkStridedDeviceAddressNV.LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
    /// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
    ///
    /// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
    /// perform any runtime check. The constructor can be useful for automatic code generators.
    @ValueBasedCandidate
    @UnsafeConstructor
    public record Ptr(@NotNull MemorySegment segment) implements IVkStridedDeviceAddressNV {
        public long size() {
            return segment.byteSize() / VkStridedDeviceAddressNV.BYTES;
        }
        /// Returns (a pointer to) the structure at the given index.
        ///
        /// Note that unlike {@code read} series functions ({@link IntPtr#read()} for
        /// example), modification on returned structure will be reflected on the original
        /// structure array. So this function is called {@code at} to explicitly
        /// indicate that the returned structure is a view of the original structure.
        public @NotNull VkStridedDeviceAddressNV at(long index) {
            return new VkStridedDeviceAddressNV(segment.asSlice(index * VkStridedDeviceAddressNV.BYTES, VkStridedDeviceAddressNV.BYTES));
        }
        public void write(long index, @NotNull VkStridedDeviceAddressNV value) {
            MemorySegment s = segment.asSlice(index * VkStridedDeviceAddressNV.BYTES, VkStridedDeviceAddressNV.BYTES);
            s.copyFrom(value.segment);
        }
    }
    public static VkStridedDeviceAddressNV allocate(Arena arena) {
        return new VkStridedDeviceAddressNV(arena.allocate(LAYOUT));
    }

    public static VkStridedDeviceAddressNV.Ptr allocate(Arena arena, long count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkStridedDeviceAddressNV.Ptr ret = new VkStridedDeviceAddressNV.Ptr(segment);
        for (long i = 0; i < count; i ++) {
        }
        return ret;
    }

    public static VkStridedDeviceAddressNV clone(Arena arena, VkStridedDeviceAddressNV src) {
        VkStridedDeviceAddressNV ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public @unsigned long startAddress() {
        return segment.get(LAYOUT$startAddress, OFFSET$startAddress);
    }

    public void startAddress(@unsigned long value) {
        segment.set(LAYOUT$startAddress, OFFSET$startAddress, value);
    }

    public @unsigned long strideInBytes() {
        return segment.get(LAYOUT$strideInBytes, OFFSET$strideInBytes);
    }

    public void strideInBytes(@unsigned long value) {
        segment.set(LAYOUT$strideInBytes, OFFSET$strideInBytes, value);
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_LONG.withName("startAddress"),
        ValueLayout.JAVA_LONG.withName("strideInBytes")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$startAddress = PathElement.groupElement("startAddress");
    public static final PathElement PATH$strideInBytes = PathElement.groupElement("strideInBytes");

    public static final OfLong LAYOUT$startAddress = (OfLong) LAYOUT.select(PATH$startAddress);
    public static final OfLong LAYOUT$strideInBytes = (OfLong) LAYOUT.select(PATH$strideInBytes);

    public static final long SIZE$startAddress = LAYOUT$startAddress.byteSize();
    public static final long SIZE$strideInBytes = LAYOUT$strideInBytes.byteSize();

    public static final long OFFSET$startAddress = LAYOUT.byteOffset(PATH$startAddress);
    public static final long OFFSET$strideInBytes = LAYOUT.byteOffset(PATH$strideInBytes);
}
