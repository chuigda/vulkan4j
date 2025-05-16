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
import cc.design7.vulkan.handle.*;
import cc.design7.vulkan.enumtype.*;
import static cc.design7.vulkan.VkConstants.*;

/// Represents a pointer to a <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkDeviceGroupBindSparseInfo.html"><code>VkDeviceGroupBindSparseInfo</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct VkDeviceGroupBindSparseInfo {
///     VkStructureType sType;
///     void const* pNext; // optional
///     uint32_t resourceDeviceIndex;
///     uint32_t memoryDeviceIndex;
/// } VkDeviceGroupBindSparseInfo;
/// }
///
/// ## Auto initialization
/// This structure has the following members that can be automatically initialized:
/// - `sType = VK_STRUCTURE_TYPE_DEVICE_GROUP_BIND_SPARSE_INFO`
///
/// The {@link VkDeviceGroupBindSparseInfo#allocate} functions will automatically initialize these fields.
/// Also, you may call {@link VkDeviceGroupBindSparseInfo#autoInit} to initialize these fields manually for
/// non-allocated instances.
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
/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkDeviceGroupBindSparseInfo.html"><code>VkDeviceGroupBindSparseInfo</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record VkDeviceGroupBindSparseInfo(@NotNull MemorySegment segment) implements IPointer {
    public static VkDeviceGroupBindSparseInfo allocate(Arena arena) {
        VkDeviceGroupBindSparseInfo ret = new VkDeviceGroupBindSparseInfo(arena.allocate(LAYOUT));
        ret.sType(VkStructureType.DEVICE_GROUP_BIND_SPARSE_INFO);
        return ret;
    }

    public static VkDeviceGroupBindSparseInfo[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkDeviceGroupBindSparseInfo[] ret = new VkDeviceGroupBindSparseInfo[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkDeviceGroupBindSparseInfo(segment.asSlice(i * BYTES, BYTES));
            ret[i].sType(VkStructureType.DEVICE_GROUP_BIND_SPARSE_INFO);
        }
        return ret;
    }

    public static VkDeviceGroupBindSparseInfo clone(Arena arena, VkDeviceGroupBindSparseInfo src) {
        VkDeviceGroupBindSparseInfo ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkDeviceGroupBindSparseInfo[] clone(Arena arena, VkDeviceGroupBindSparseInfo[] src) {
        VkDeviceGroupBindSparseInfo[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public void autoInit() {
        sType(VkStructureType.DEVICE_GROUP_BIND_SPARSE_INFO);
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

    public void pNext(@Nullable IPointer pointer) {
        pNext(pointer != null ? pointer.segment() : MemorySegment.NULL);
    }

    public @unsigned int resourceDeviceIndex() {
        return segment.get(LAYOUT$resourceDeviceIndex, OFFSET$resourceDeviceIndex);
    }

    public void resourceDeviceIndex(@unsigned int value) {
        segment.set(LAYOUT$resourceDeviceIndex, OFFSET$resourceDeviceIndex, value);
    }

    public @unsigned int memoryDeviceIndex() {
        return segment.get(LAYOUT$memoryDeviceIndex, OFFSET$memoryDeviceIndex);
    }

    public void memoryDeviceIndex(@unsigned int value) {
        segment.set(LAYOUT$memoryDeviceIndex, OFFSET$memoryDeviceIndex, value);
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("resourceDeviceIndex"),
        ValueLayout.JAVA_INT.withName("memoryDeviceIndex")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("PATH$sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("PATH$pNext");
    public static final PathElement PATH$resourceDeviceIndex = PathElement.groupElement("PATH$resourceDeviceIndex");
    public static final PathElement PATH$memoryDeviceIndex = PathElement.groupElement("PATH$memoryDeviceIndex");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$resourceDeviceIndex = (OfInt) LAYOUT.select(PATH$resourceDeviceIndex);
    public static final OfInt LAYOUT$memoryDeviceIndex = (OfInt) LAYOUT.select(PATH$memoryDeviceIndex);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$resourceDeviceIndex = LAYOUT$resourceDeviceIndex.byteSize();
    public static final long SIZE$memoryDeviceIndex = LAYOUT$memoryDeviceIndex.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$resourceDeviceIndex = LAYOUT.byteOffset(PATH$resourceDeviceIndex);
    public static final long OFFSET$memoryDeviceIndex = LAYOUT.byteOffset(PATH$memoryDeviceIndex);
}
