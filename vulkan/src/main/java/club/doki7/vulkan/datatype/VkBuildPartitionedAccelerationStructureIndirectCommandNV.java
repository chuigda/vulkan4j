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

/// Represents a pointer to a <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkBuildPartitionedAccelerationStructureIndirectCommandNV.html"><code>VkBuildPartitionedAccelerationStructureIndirectCommandNV</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct VkBuildPartitionedAccelerationStructureIndirectCommandNV {
///     VkPartitionedAccelerationStructureOpTypeNV opType; // @link substring="VkPartitionedAccelerationStructureOpTypeNV" target="VkPartitionedAccelerationStructureOpTypeNV" @link substring="opType" target="#opType"
///     uint32_t argCount; // @link substring="argCount" target="#argCount"
///     VkStridedDeviceAddressNV argData; // @link substring="VkStridedDeviceAddressNV" target="VkStridedDeviceAddressNV" @link substring="argData" target="#argData"
/// } VkBuildPartitionedAccelerationStructureIndirectCommandNV;
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
/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkBuildPartitionedAccelerationStructureIndirectCommandNV.html"><code>VkBuildPartitionedAccelerationStructureIndirectCommandNV</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record VkBuildPartitionedAccelerationStructureIndirectCommandNV(@NotNull MemorySegment segment) implements IVkBuildPartitionedAccelerationStructureIndirectCommandNV {
    /// Represents a pointer to / an array of <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkBuildPartitionedAccelerationStructureIndirectCommandNV.html"><code>VkBuildPartitionedAccelerationStructureIndirectCommandNV</code></a> structure(s) in native memory.
    ///
    /// Technically speaking, this type has no difference with {@link VkBuildPartitionedAccelerationStructureIndirectCommandNV}. This type
    /// is introduced mainly for user to distinguish between a pointer to a single structure
    /// and a pointer to (potentially) an array of structure(s). APIs should use interface
    /// IVkBuildPartitionedAccelerationStructureIndirectCommandNV to handle both types uniformly. See package level documentation for more
    /// details.
    ///
    /// ## Contracts
    ///
    /// The property {@link #segment()} should always be not-null
    /// (({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to
    /// {@code VkBuildPartitionedAccelerationStructureIndirectCommandNV.LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
    /// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
    ///
    /// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
    /// perform any runtime check. The constructor can be useful for automatic code generators.
    @ValueBasedCandidate
    @UnsafeConstructor
    public record Ptr(@NotNull MemorySegment segment) implements IVkBuildPartitionedAccelerationStructureIndirectCommandNV {
        public long size() {
            return segment.byteSize() / VkBuildPartitionedAccelerationStructureIndirectCommandNV.BYTES;
        }
        /// Returns (a pointer to) the structure at the given index.
        ///
        /// Note that unlike {@code read} series functions ({@link IntPtr#read()} for
        /// example), modification on returned structure will be reflected on the original
        /// structure array. So this function is called {@code at} to explicitly
        /// indicate that the returned structure is a view of the original structure.
        public @NotNull VkBuildPartitionedAccelerationStructureIndirectCommandNV at(long index) {
            return new VkBuildPartitionedAccelerationStructureIndirectCommandNV(segment.asSlice(index * VkBuildPartitionedAccelerationStructureIndirectCommandNV.BYTES, VkBuildPartitionedAccelerationStructureIndirectCommandNV.BYTES));
        }
        public void write(long index, @NotNull VkBuildPartitionedAccelerationStructureIndirectCommandNV value) {
            MemorySegment s = segment.asSlice(index * VkBuildPartitionedAccelerationStructureIndirectCommandNV.BYTES, VkBuildPartitionedAccelerationStructureIndirectCommandNV.BYTES);
            s.copyFrom(value.segment);
        }
    }
    public static VkBuildPartitionedAccelerationStructureIndirectCommandNV allocate(Arena arena) {
        return new VkBuildPartitionedAccelerationStructureIndirectCommandNV(arena.allocate(LAYOUT));
    }

    public static VkBuildPartitionedAccelerationStructureIndirectCommandNV.Ptr allocate(Arena arena, long count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkBuildPartitionedAccelerationStructureIndirectCommandNV.Ptr ret = new VkBuildPartitionedAccelerationStructureIndirectCommandNV.Ptr(segment);
        for (long i = 0; i < count; i ++) {
        }
        return ret;
    }

    public static VkBuildPartitionedAccelerationStructureIndirectCommandNV clone(Arena arena, VkBuildPartitionedAccelerationStructureIndirectCommandNV src) {
        VkBuildPartitionedAccelerationStructureIndirectCommandNV ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public @enumtype(VkPartitionedAccelerationStructureOpTypeNV.class) int opType() {
        return segment.get(LAYOUT$opType, OFFSET$opType);
    }

    public void opType(@enumtype(VkPartitionedAccelerationStructureOpTypeNV.class) int value) {
        segment.set(LAYOUT$opType, OFFSET$opType, value);
    }

    public @unsigned int argCount() {
        return segment.get(LAYOUT$argCount, OFFSET$argCount);
    }

    public void argCount(@unsigned int value) {
        segment.set(LAYOUT$argCount, OFFSET$argCount, value);
    }

    public @NotNull VkStridedDeviceAddressNV argData() {
        return new VkStridedDeviceAddressNV(segment.asSlice(OFFSET$argData, LAYOUT$argData));
    }

    public void argData(@NotNull VkStridedDeviceAddressNV value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$argData, SIZE$argData);
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("opType"),
        ValueLayout.JAVA_INT.withName("argCount"),
        VkStridedDeviceAddressNV.LAYOUT.withName("argData")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$opType = PathElement.groupElement("opType");
    public static final PathElement PATH$argCount = PathElement.groupElement("argCount");
    public static final PathElement PATH$argData = PathElement.groupElement("argData");

    public static final OfInt LAYOUT$opType = (OfInt) LAYOUT.select(PATH$opType);
    public static final OfInt LAYOUT$argCount = (OfInt) LAYOUT.select(PATH$argCount);
    public static final StructLayout LAYOUT$argData = (StructLayout) LAYOUT.select(PATH$argData);

    public static final long SIZE$opType = LAYOUT$opType.byteSize();
    public static final long SIZE$argCount = LAYOUT$argCount.byteSize();
    public static final long SIZE$argData = LAYOUT$argData.byteSize();

    public static final long OFFSET$opType = LAYOUT.byteOffset(PATH$opType);
    public static final long OFFSET$argCount = LAYOUT.byteOffset(PATH$argCount);
    public static final long OFFSET$argData = LAYOUT.byteOffset(PATH$argData);
}
