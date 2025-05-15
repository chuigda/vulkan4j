package cc.design7.vulkan.datatype;

import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;

import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.NotNull;
import cc.design7.ffm.IPointer;
import cc.design7.ffm.NativeLayout;
import cc.design7.ffm.bits.BitfieldUtil;
import cc.design7.ffm.annotation.*;
import cc.design7.ffm.ptr.*;
import cc.design7.vulkan.bitmask.*;
import cc.design7.vulkan.datatype.*;
import cc.design7.vulkan.enumtype.*;
import static cc.design7.vulkan.VkConstants.*;

/// Represents a pointer to a <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkClusterAccelerationStructureInstantiateClusterInfoNV.html"><code>VkClusterAccelerationStructureInstantiateClusterInfoNV</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct VkClusterAccelerationStructureInstantiateClusterInfoNV {
///     uint32_t clusterIdOffset;
///     uint32_t geometryIndexOffset : 24;
///     uint32_t reserved : 8;
///     VkDeviceAddress clusterTemplateAddress;
///     VkStridedDeviceAddressNV vertexBuffer;
/// } VkClusterAccelerationStructureInstantiateClusterInfoNV;
/// }
///
/// ## Contracts
///
/// The property {@link #segment()} should always be not-null
/// (({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to)
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
        VkClusterAccelerationStructureInstantiateClusterInfoNV ret = new VkClusterAccelerationStructureInstantiateClusterInfoNV(arena.allocate(LAYOUT));
        return ret;
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
        MemorySegment s = segment.asSlice(OFFSET$geometryIndexOffset_reserved, LAYOUT$geometryIndexOffset_reserved);
        return BitfieldUtil.readBits(s, 0, 24);
    }

    public void geometryIndexOffset(@unsigned int value) {
        MemorySegment s = segment.asSlice(OFFSET$geometryIndexOffset_reserved, LAYOUT$geometryIndexOffset_reserved);
        BitfieldUtil.writeBits(s, 0, 24, value);
    }

    public @unsigned long clusterTemplateAddress() {
        return segment.get(LAYOUT$clusterTemplateAddress, OFFSET$clusterTemplateAddress);
    }

    public void clusterTemplateAddress(@unsigned long value) {
        segment.set(LAYOUT$clusterTemplateAddress, OFFSET$clusterTemplateAddress, value);
    }

    public VkStridedDeviceAddressNV vertexBuffer() {
        return new VkStridedDeviceAddressNV(segment.asSlice(OFFSET$vertexBuffer, LAYOUT$vertexBuffer));
    }

    public void vertexBuffer(VkStridedDeviceAddressNV value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$vertexBuffer, SIZE$vertexBuffer);
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("clusterIdOffset"),
        ValueLayout.JAVA_INT.withName("bitfield$geometryIndexOffset_reserved"),
        ValueLayout.JAVA_LONG.withName("clusterTemplateAddress"),
        VkStridedDeviceAddressNV.LAYOUT.withName("vertexBuffer")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$clusterIdOffset = PathElement.groupElement("PATH$clusterIdOffset");
    public static final PathElement PATH$bitfield$geometryIndexOffset_reserved = PathElement.groupElement("PATH$bitfield$geometryIndexOffset_reserved");
    public static final PathElement PATH$clusterTemplateAddress = PathElement.groupElement("PATH$clusterTemplateAddress");
    public static final PathElement PATH$vertexBuffer = PathElement.groupElement("PATH$vertexBuffer");

    public static final OfInt LAYOUT$clusterIdOffset = (OfInt) LAYOUT.select(PATH$clusterIdOffset);
    public static final OfInt LAYOUT$geometryIndexOffset_reserved = (OfInt) LAYOUT.select(PATH$bitfield$geometryIndexOffset_reserved);
    public static final OfLong LAYOUT$clusterTemplateAddress = (OfLong) LAYOUT.select(PATH$clusterTemplateAddress);
    public static final StructLayout LAYOUT$vertexBuffer = (StructLayout) LAYOUT.select(PATH$vertexBuffer);

    public static final long SIZE$clusterIdOffset = LAYOUT$clusterIdOffset.byteSize();
    public static final long SIZE$clusterTemplateAddress = LAYOUT$clusterTemplateAddress.byteSize();
    public static final long SIZE$vertexBuffer = LAYOUT$vertexBuffer.byteSize();

    public static final long OFFSET$clusterIdOffset = LAYOUT.byteOffset(PATH$clusterIdOffset);
    public static final long OFFSET$geometryIndexOffset_reserved = LAYOUT.byteOffset(PATH$bitfield$geometryIndexOffset_reserved);
    public static final long OFFSET$clusterTemplateAddress = LAYOUT.byteOffset(PATH$clusterTemplateAddress);
    public static final long OFFSET$vertexBuffer = LAYOUT.byteOffset(PATH$vertexBuffer);
}
