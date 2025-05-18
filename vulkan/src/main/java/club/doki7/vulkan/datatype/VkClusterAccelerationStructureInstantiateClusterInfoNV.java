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

/// Represents a pointer to a <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkClusterAccelerationStructureInstantiateClusterInfoNV.html"><code>VkClusterAccelerationStructureInstantiateClusterInfoNV</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct VkClusterAccelerationStructureInstantiateClusterInfoNV {
///     uint32_t clusterIdOffset; // @link substring="clusterIdOffset" target="#clusterIdOffset"
///     uint32_t geometryIndexOffset : 24; // @link substring="geometryIndexOffset" target="#geometryIndexOffset"
///     uint32_t reserved : 8;
///     VkDeviceAddress clusterTemplateAddress; // @link substring="clusterTemplateAddress" target="#clusterTemplateAddress"
///     VkStridedDeviceAddressNV vertexBuffer; // @link substring="VkStridedDeviceAddressNV" target="VkStridedDeviceAddressNV" @link substring="vertexBuffer" target="#vertexBuffer"
/// } VkClusterAccelerationStructureInstantiateClusterInfoNV;
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
/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkClusterAccelerationStructureInstantiateClusterInfoNV.html"><code>VkClusterAccelerationStructureInstantiateClusterInfoNV</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record VkClusterAccelerationStructureInstantiateClusterInfoNV(@NotNull MemorySegment segment) implements IPointer {
    public static VkClusterAccelerationStructureInstantiateClusterInfoNV allocate(Arena arena) {
        return new VkClusterAccelerationStructureInstantiateClusterInfoNV(arena.allocate(LAYOUT));
    }

    public static VkClusterAccelerationStructureInstantiateClusterInfoNV[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkClusterAccelerationStructureInstantiateClusterInfoNV[] ret = new VkClusterAccelerationStructureInstantiateClusterInfoNV[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkClusterAccelerationStructureInstantiateClusterInfoNV(segment.asSlice(i * BYTES, BYTES));
        }
        return ret;
    }

    public static VkClusterAccelerationStructureInstantiateClusterInfoNV clone(Arena arena, VkClusterAccelerationStructureInstantiateClusterInfoNV src) {
        VkClusterAccelerationStructureInstantiateClusterInfoNV ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkClusterAccelerationStructureInstantiateClusterInfoNV[] clone(Arena arena, VkClusterAccelerationStructureInstantiateClusterInfoNV[] src) {
        VkClusterAccelerationStructureInstantiateClusterInfoNV[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public @unsigned int clusterIdOffset() {
        return segment.get(LAYOUT$clusterIdOffset, OFFSET$clusterIdOffset);
    }

    public void clusterIdOffset(@unsigned int value) {
        segment.set(LAYOUT$clusterIdOffset, OFFSET$clusterIdOffset, value);
    }

    public @unsigned int geometryIndexOffset() {
        MemorySegment s = segment.asSlice(OFFSET$bitfield$geometryIndexOffset$reserved, LAYOUT$bitfield$geometryIndexOffset$reserved);
        return BitfieldUtil.readBits(s, 0, 24);
    }

    public void geometryIndexOffset(@unsigned int value) {
        MemorySegment s = segment.asSlice(OFFSET$bitfield$geometryIndexOffset$reserved, LAYOUT$bitfield$geometryIndexOffset$reserved);
        BitfieldUtil.writeBits(s, 0, 24, value);
    }

    public @unsigned long clusterTemplateAddress() {
        return segment.get(LAYOUT$clusterTemplateAddress, OFFSET$clusterTemplateAddress);
    }

    public void clusterTemplateAddress(@unsigned long value) {
        segment.set(LAYOUT$clusterTemplateAddress, OFFSET$clusterTemplateAddress, value);
    }

    public @NotNull VkStridedDeviceAddressNV vertexBuffer() {
        return new VkStridedDeviceAddressNV(segment.asSlice(OFFSET$vertexBuffer, LAYOUT$vertexBuffer));
    }

    public void vertexBuffer(@NotNull VkStridedDeviceAddressNV value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$vertexBuffer, SIZE$vertexBuffer);
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("clusterIdOffset"),
        ValueLayout.JAVA_INT.withName("bitfield$geometryIndexOffset$reserved"),
        ValueLayout.JAVA_LONG.withName("clusterTemplateAddress"),
        VkStridedDeviceAddressNV.LAYOUT.withName("vertexBuffer")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$clusterIdOffset = PathElement.groupElement("PATH$clusterIdOffset");
    public static final PathElement PATH$bitfield$geometryIndexOffset$reserved = PathElement.groupElement("PATH$bitfield$geometryIndexOffset$reserved");
    public static final PathElement PATH$clusterTemplateAddress = PathElement.groupElement("PATH$clusterTemplateAddress");
    public static final PathElement PATH$vertexBuffer = PathElement.groupElement("PATH$vertexBuffer");

    public static final OfInt LAYOUT$clusterIdOffset = (OfInt) LAYOUT.select(PATH$clusterIdOffset);
    public static final OfInt LAYOUT$bitfield$geometryIndexOffset$reserved = (OfInt) LAYOUT.select(PATH$bitfield$geometryIndexOffset$reserved);
    public static final OfLong LAYOUT$clusterTemplateAddress = (OfLong) LAYOUT.select(PATH$clusterTemplateAddress);
    public static final StructLayout LAYOUT$vertexBuffer = (StructLayout) LAYOUT.select(PATH$vertexBuffer);

    public static final long SIZE$clusterIdOffset = LAYOUT$clusterIdOffset.byteSize();
    public static final long SIZE$clusterTemplateAddress = LAYOUT$clusterTemplateAddress.byteSize();
    public static final long SIZE$vertexBuffer = LAYOUT$vertexBuffer.byteSize();

    public static final long OFFSET$clusterIdOffset = LAYOUT.byteOffset(PATH$clusterIdOffset);
    public static final long OFFSET$bitfield$geometryIndexOffset$reserved = LAYOUT.byteOffset(PATH$bitfield$geometryIndexOffset$reserved);
    public static final long OFFSET$clusterTemplateAddress = LAYOUT.byteOffset(PATH$clusterTemplateAddress);
    public static final long OFFSET$vertexBuffer = LAYOUT.byteOffset(PATH$vertexBuffer);
}
