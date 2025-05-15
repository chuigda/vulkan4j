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

/// Represents a pointer to a <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkHdrVividDynamicMetadataHUAWEI.html"><code>VkHdrVividDynamicMetadataHUAWEI</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct VkHdrVividDynamicMetadataHUAWEI {
///     VkStructureType sType;
///     void const* pNext;
///     size_t dynamicMetadataSize;
///     void const* pDynamicMetadata;
/// } VkHdrVividDynamicMetadataHUAWEI;
/// }
///
/// ## Auto initialization
/// This structure has the following members that can be automatically initialized:
/// - `sType = VK_STRUCTURE_TYPE_HDR_VIVID_DYNAMIC_METADATA_HUAWEI`
///
/// The {@link VkHdrVividDynamicMetadataHUAWEI#allocate} functions will automatically initialize these fields.
/// Also, you may call {@link VkHdrVividDynamicMetadataHUAWEI#autoInit} to initialize these fields manually for
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
/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkHdrVividDynamicMetadataHUAWEI.html"><code>VkHdrVividDynamicMetadataHUAWEI</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record VkHdrVividDynamicMetadataHUAWEI(@NotNull MemorySegment segment) implements IPointer {
    public static VkHdrVividDynamicMetadataHUAWEI allocate(Arena arena) {
        VkHdrVividDynamicMetadataHUAWEI ret = new VkHdrVividDynamicMetadataHUAWEI(arena.allocate(LAYOUT));
        ret.sType(VkStructureType.HDR_VIVID_DYNAMIC_METADATA_HUAWEI);
        return ret;
    }

    public static VkHdrVividDynamicMetadataHUAWEI[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkHdrVividDynamicMetadataHUAWEI[] ret = new VkHdrVividDynamicMetadataHUAWEI[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkHdrVividDynamicMetadataHUAWEI(segment.asSlice(i * BYTES, BYTES));
            ret[i].sType(VkStructureType.HDR_VIVID_DYNAMIC_METADATA_HUAWEI);
        }
        return ret;
    }

    public static VkHdrVividDynamicMetadataHUAWEI clone(Arena arena, VkHdrVividDynamicMetadataHUAWEI src) {
        VkHdrVividDynamicMetadataHUAWEI ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkHdrVividDynamicMetadataHUAWEI[] clone(Arena arena, VkHdrVividDynamicMetadataHUAWEI[] src) {
        VkHdrVividDynamicMetadataHUAWEI[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public void autoInit() {
        sType(VkStructureType.HDR_VIVID_DYNAMIC_METADATA_HUAWEI);
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

    public @unsigned long dynamicMetadataSize() {
        return NativeLayout.readCSizeT(segment, OFFSET$dynamicMetadataSize);
    }

    public void dynamicMetadataSize(@unsigned long value) {
        NativeLayout.writeCSizeT(segment, OFFSET$dynamicMetadataSize, value);
    }

    public @pointer(comment="void*") MemorySegment pDynamicMetadata() {
        return segment.get(LAYOUT$pDynamicMetadata, OFFSET$pDynamicMetadata);
    }

    public void pDynamicMetadata(@pointer(comment="void*") MemorySegment value) {
        segment.set(LAYOUT$pDynamicMetadata, OFFSET$pDynamicMetadata, value);
    }

    public void pDynamicMetadata(IPointer pointer) {
        pDynamicMetadata(pointer.segment());
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        NativeLayout.C_SIZE_T.withName("dynamicMetadataSize"),
        ValueLayout.ADDRESS.withName("pDynamicMetadata")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("PATH$sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("PATH$pNext");
    public static final PathElement PATH$dynamicMetadataSize = PathElement.groupElement("PATH$dynamicMetadataSize");
    public static final PathElement PATH$pDynamicMetadata = PathElement.groupElement("PATH$pDynamicMetadata");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final AddressLayout LAYOUT$pDynamicMetadata = (AddressLayout) LAYOUT.select(PATH$pDynamicMetadata);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$dynamicMetadataSize = NativeLayout.C_SIZE_T.byteSize();
    public static final long SIZE$pDynamicMetadata = LAYOUT$pDynamicMetadata.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$dynamicMetadataSize = LAYOUT.byteOffset(PATH$dynamicMetadataSize);
    public static final long OFFSET$pDynamicMetadata = LAYOUT.byteOffset(PATH$pDynamicMetadata);
}
