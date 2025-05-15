package cc.design7.vulkan.datatype;

import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;

import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.NotNull;
import cc.design7.ffm.IPointer;
import cc.design7.ffm.NativeLayout;
import cc.design7.ffm.annotation.*;
import cc.design7.ffm.ptr.*;
import cc.design7.vulkan.bitmask.*;
import cc.design7.vulkan.datatype.*;
import cc.design7.vulkan.enumtype.*;
import static cc.design7.vulkan.VkConstants.*;

/// Represents a pointer to a <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkDescriptorSetLayoutHostMappingInfoVALVE.html"><code>VkDescriptorSetLayoutHostMappingInfoVALVE</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct VkDescriptorSetLayoutHostMappingInfoVALVE {
///     VkStructureType sType;
///     void* pNext;
///     size_t descriptorOffset;
///     uint32_t descriptorSize;
/// } VkDescriptorSetLayoutHostMappingInfoVALVE;
/// }
///
/// ## Auto initialization
/// This structure has the following members that can be automatically initialized:
/// - `sType = VK_STRUCTURE_TYPE_DESCRIPTOR_SET_LAYOUT_HOST_MAPPING_INFO_VALVE`
///
/// The {@link VkDescriptorSetLayoutHostMappingInfoVALVE#allocate} functions will automatically initialize these fields.
/// Also, you may call {@link VkDescriptorSetLayoutHostMappingInfoVALVE#autoInit} to initialize these fields manually for
/// non-allocated instances.
///
/// ## Contracts
/// The property {@link #segment()} should always be not-null
/// (({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to)
/// {@code LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
/// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
///
/// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
/// perform any runtime check. The constructor can be useful for automatic code generators.
///
/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkDescriptorSetLayoutHostMappingInfoVALVE.html"><code>VkDescriptorSetLayoutHostMappingInfoVALVE</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record VkDescriptorSetLayoutHostMappingInfoVALVE(@NotNull MemorySegment segment) implements IPointer {
    public static VkDescriptorSetLayoutHostMappingInfoVALVE allocate(Arena arena) {
        VkDescriptorSetLayoutHostMappingInfoVALVE ret = new VkDescriptorSetLayoutHostMappingInfoVALVE(arena.allocate(LAYOUT));
        ret.sType(VkStructureType.DESCRIPTOR_SET_LAYOUT_HOST_MAPPING_INFO_VALVE);
        return ret;
    }

    public static VkDescriptorSetLayoutHostMappingInfoVALVE[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkDescriptorSetLayoutHostMappingInfoVALVE[] ret = new VkDescriptorSetLayoutHostMappingInfoVALVE[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkDescriptorSetLayoutHostMappingInfoVALVE(segment.asSlice(i * BYTES, BYTES));
            ret[i].sType(VkStructureType.DESCRIPTOR_SET_LAYOUT_HOST_MAPPING_INFO_VALVE);
        }
        return ret;
    }

    public static VkDescriptorSetLayoutHostMappingInfoVALVE clone(Arena arena, VkDescriptorSetLayoutHostMappingInfoVALVE src) {
        VkDescriptorSetLayoutHostMappingInfoVALVE ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkDescriptorSetLayoutHostMappingInfoVALVE[] clone(Arena arena, VkDescriptorSetLayoutHostMappingInfoVALVE[] src) {
        VkDescriptorSetLayoutHostMappingInfoVALVE[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public void autoInit() {
        sType(VkStructureType.DESCRIPTOR_SET_LAYOUT_HOST_MAPPING_INFO_VALVE);
    }

    public @enumtype(VkStructureType.class) int sType() {
        return segment.get(LAYOUT$sType, OFFSET$sType);
    }

    public void sType(@enumtype(VkStructureType.class) int value) {
        segment.set(LAYOUT$sType, OFFSET$sType, value);
    }

    public @pointer(comment="void*") MemorySegment pNext() {
        return segment.get(LAYOUT$pNext, OFFSET$pNext);
    }

    public void pNext(@pointer(comment="void*") MemorySegment value) {
        segment.set(LAYOUT$pNext, OFFSET$pNext, value);
    }

    public void pNext(IPointer pointer) {
        pNext(pointer.segment());
    }

    public @unsigned long descriptorOffset() {
        return NativeLayout.readCSizeT(segment, OFFSET$descriptorOffset);
    }

    public void descriptorOffset(@unsigned long value) {
        NativeLayout.writeCSizeT(segment, OFFSET$descriptorOffset, value);
    }

    public @unsigned int descriptorSize() {
        return segment.get(LAYOUT$descriptorSize, OFFSET$descriptorSize);
    }

    public void descriptorSize(@unsigned int value) {
        segment.set(LAYOUT$descriptorSize, OFFSET$descriptorSize, value);
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        NativeLayout.C_SIZE_T.withName("descriptorOffset"),
        ValueLayout.JAVA_INT.withName("descriptorSize")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("PATH$sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("PATH$pNext");
    public static final PathElement PATH$descriptorOffset = PathElement.groupElement("PATH$descriptorOffset");
    public static final PathElement PATH$descriptorSize = PathElement.groupElement("PATH$descriptorSize");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$descriptorSize = (OfInt) LAYOUT.select(PATH$descriptorSize);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$descriptorOffset = NativeLayout.C_SIZE_T.byteSize();
    public static final long SIZE$descriptorSize = LAYOUT$descriptorSize.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$descriptorOffset = LAYOUT.byteOffset(PATH$descriptorOffset);
    public static final long OFFSET$descriptorSize = LAYOUT.byteOffset(PATH$descriptorSize);
}
