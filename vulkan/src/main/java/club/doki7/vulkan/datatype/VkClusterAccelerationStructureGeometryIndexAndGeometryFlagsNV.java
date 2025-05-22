package club.doki7.vulkan.datatype;

import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;

import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.NotNull;
import club.doki7.ffm.IPointer;
import club.doki7.ffm.NativeLayout;
import club.doki7.ffm.bits.BitfieldUtil;
import club.doki7.ffm.annotation.*;
import club.doki7.ffm.ptr.*;
import club.doki7.vulkan.bitmask.*;
import club.doki7.vulkan.handle.*;
import club.doki7.vulkan.enumtype.*;
import static club.doki7.vulkan.VkConstants.*;

/// Represents a pointer to a <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkClusterAccelerationStructureGeometryIndexAndGeometryFlagsNV.html"><code>VkClusterAccelerationStructureGeometryIndexAndGeometryFlagsNV</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct VkClusterAccelerationStructureGeometryIndexAndGeometryFlagsNV {
///     uint32_t geometryIndex : 24; // @link substring="geometryIndex" target="#geometryIndex"
///     uint32_t reserved : 5;
///     uint32_t geometryFlags : 3; // @link substring="geometryFlags" target="#geometryFlags"
/// } VkClusterAccelerationStructureGeometryIndexAndGeometryFlagsNV;
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
/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkClusterAccelerationStructureGeometryIndexAndGeometryFlagsNV.html"><code>VkClusterAccelerationStructureGeometryIndexAndGeometryFlagsNV</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record VkClusterAccelerationStructureGeometryIndexAndGeometryFlagsNV(@NotNull MemorySegment segment) implements IVkClusterAccelerationStructureGeometryIndexAndGeometryFlagsNV {
    /// Represents a pointer to / an array of <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkClusterAccelerationStructureGeometryIndexAndGeometryFlagsNV.html"><code>VkClusterAccelerationStructureGeometryIndexAndGeometryFlagsNV</code></a> structure(s) in native memory.
    ///
    /// Technically speaking, this type has no difference with {@link VkClusterAccelerationStructureGeometryIndexAndGeometryFlagsNV}. This type
    /// is introduced mainly for user to distinguish between a pointer to a single structure
    /// and a pointer to (potentially) an array of structure(s). APIs should use interface
    /// IVkClusterAccelerationStructureGeometryIndexAndGeometryFlagsNV to handle both types uniformly. See package level documentation for more
    /// details.
    ///
    /// ## Contracts
    ///
    /// The property {@link #segment()} should always be not-null
    /// (({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to
    /// {@code VkClusterAccelerationStructureGeometryIndexAndGeometryFlagsNV.LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
    /// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
    ///
    /// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
    /// perform any runtime check. The constructor can be useful for automatic code generators.
    @ValueBasedCandidate
    @UnsafeConstructor
    public record Ptr(@NotNull MemorySegment segment) implements IVkClusterAccelerationStructureGeometryIndexAndGeometryFlagsNV {
        public long size() {
            return segment.byteSize() / VkClusterAccelerationStructureGeometryIndexAndGeometryFlagsNV.BYTES;
        }
        /// Returns (a pointer to) the structure at the given index.
        ///
        /// Note that unlike {@code read} series functions ({@link IntPtr#read()} for
        /// example), modification on returned structure will be reflected on the original
        /// structure array. So this function is called {@code at} to explicitly
        /// indicate that the returned structure is a view of the original structure.
        public @NotNull VkClusterAccelerationStructureGeometryIndexAndGeometryFlagsNV at(long index) {
            return new VkClusterAccelerationStructureGeometryIndexAndGeometryFlagsNV(segment.asSlice(index * VkClusterAccelerationStructureGeometryIndexAndGeometryFlagsNV.BYTES, VkClusterAccelerationStructureGeometryIndexAndGeometryFlagsNV.BYTES));
        }
        public void write(long index, @NotNull VkClusterAccelerationStructureGeometryIndexAndGeometryFlagsNV value) {
            MemorySegment s = segment.asSlice(index * VkClusterAccelerationStructureGeometryIndexAndGeometryFlagsNV.BYTES, VkClusterAccelerationStructureGeometryIndexAndGeometryFlagsNV.BYTES);
            s.copyFrom(value.segment);
        }
    }
    public static VkClusterAccelerationStructureGeometryIndexAndGeometryFlagsNV allocate(Arena arena) {
        return new VkClusterAccelerationStructureGeometryIndexAndGeometryFlagsNV(arena.allocate(LAYOUT));
    }

    public static VkClusterAccelerationStructureGeometryIndexAndGeometryFlagsNV.Ptr allocate(Arena arena, long count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkClusterAccelerationStructureGeometryIndexAndGeometryFlagsNV.Ptr ret = new VkClusterAccelerationStructureGeometryIndexAndGeometryFlagsNV.Ptr(segment);
        for (long i = 0; i < count; i ++) {
        }
        return ret;
    }

    public static VkClusterAccelerationStructureGeometryIndexAndGeometryFlagsNV clone(Arena arena, VkClusterAccelerationStructureGeometryIndexAndGeometryFlagsNV src) {
        VkClusterAccelerationStructureGeometryIndexAndGeometryFlagsNV ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public @unsigned int geometryIndex() {
        MemorySegment s = segment.asSlice(OFFSET$bitfield$geometryIndex$geometryFlags, LAYOUT$bitfield$geometryIndex$geometryFlags);
        return BitfieldUtil.readBits(s, 0, 24);
    }

    public void geometryIndex(@unsigned int value) {
        MemorySegment s = segment.asSlice(OFFSET$bitfield$geometryIndex$geometryFlags, LAYOUT$bitfield$geometryIndex$geometryFlags);
        BitfieldUtil.writeBits(s, 0, 24, value);
    }
    public @unsigned int geometryFlags() {
        MemorySegment s = segment.asSlice(OFFSET$bitfield$geometryIndex$geometryFlags, LAYOUT$bitfield$geometryIndex$geometryFlags);
        return BitfieldUtil.readBits(s, 29, 32);
    }

    public void geometryFlags(@unsigned int value) {
        MemorySegment s = segment.asSlice(OFFSET$bitfield$geometryIndex$geometryFlags, LAYOUT$bitfield$geometryIndex$geometryFlags);
        BitfieldUtil.writeBits(s, 29, 32, value);
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("bitfield$geometryIndex$geometryFlags")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$bitfield$geometryIndex$geometryFlags = PathElement.groupElement("geometryIndex$geometryFlags");

    public static final OfInt LAYOUT$bitfield$geometryIndex$geometryFlags = (OfInt) LAYOUT.select(PATH$bitfield$geometryIndex$geometryFlags);


    public static final long OFFSET$bitfield$geometryIndex$geometryFlags = LAYOUT.byteOffset(PATH$bitfield$geometryIndex$geometryFlags);
}
