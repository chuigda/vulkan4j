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

/// Represents a pointer to a <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkAccelerationStructureCreateInfoNV.html"><code>VkAccelerationStructureCreateInfoNV</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct VkAccelerationStructureCreateInfoNV {
///     VkStructureType sType;
///     void const* pNext;
///     VkDeviceSize compactedSize;
///     VkAccelerationStructureInfoNV info;
/// } VkAccelerationStructureCreateInfoNV;
/// }
///
/// ## Auto initialization
/// This structure has the following members that can be automatically initialized:
/// - `sType = VK_STRUCTURE_TYPE_ACCELERATION_STRUCTURE_CREATE_INFO_NV`
///
/// The {@link VkAccelerationStructureCreateInfoNV#allocate} functions will automatically initialize these fields.
/// Also, you may call {@link VkAccelerationStructureCreateInfoNV#autoInit} to initialize these fields manually for
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
/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkAccelerationStructureCreateInfoNV.html"><code>VkAccelerationStructureCreateInfoNV</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record VkAccelerationStructureCreateInfoNV(@NotNull MemorySegment segment) implements IPointer {
    public static VkAccelerationStructureCreateInfoNV allocate(Arena arena) {
        VkAccelerationStructureCreateInfoNV ret = new VkAccelerationStructureCreateInfoNV(arena.allocate(LAYOUT));
        ret.sType(VkStructureType.ACCELERATION_STRUCTURE_CREATE_INFO_NV);
        return ret;
    }

    public static VkAccelerationStructureCreateInfoNV[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkAccelerationStructureCreateInfoNV[] ret = new VkAccelerationStructureCreateInfoNV[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkAccelerationStructureCreateInfoNV(segment.asSlice(i * BYTES, BYTES));
            ret[i].sType(VkStructureType.ACCELERATION_STRUCTURE_CREATE_INFO_NV);
        }
        return ret;
    }

    public static VkAccelerationStructureCreateInfoNV clone(Arena arena, VkAccelerationStructureCreateInfoNV src) {
        VkAccelerationStructureCreateInfoNV ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkAccelerationStructureCreateInfoNV[] clone(Arena arena, VkAccelerationStructureCreateInfoNV[] src) {
        VkAccelerationStructureCreateInfoNV[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public void autoInit() {
        sType(VkStructureType.ACCELERATION_STRUCTURE_CREATE_INFO_NV);
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

    public @unsigned long compactedSize() {
        return segment.get(LAYOUT$compactedSize, OFFSET$compactedSize);
    }

    public void compactedSize(@unsigned long value) {
        segment.set(LAYOUT$compactedSize, OFFSET$compactedSize, value);
    }

    public VkAccelerationStructureInfoNV info() {
        return new VkAccelerationStructureInfoNV(segment.asSlice(OFFSET$info, LAYOUT$info));
    }

    public void info(VkAccelerationStructureInfoNV value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$info, SIZE$info);
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_LONG.withName("compactedSize"),
        VkAccelerationStructureInfoNV.LAYOUT.withName("info")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("PATH$sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("PATH$pNext");
    public static final PathElement PATH$compactedSize = PathElement.groupElement("PATH$compactedSize");
    public static final PathElement PATH$info = PathElement.groupElement("PATH$info");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfLong LAYOUT$compactedSize = (OfLong) LAYOUT.select(PATH$compactedSize);
    public static final StructLayout LAYOUT$info = (StructLayout) LAYOUT.select(PATH$info);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$compactedSize = LAYOUT$compactedSize.byteSize();
    public static final long SIZE$info = LAYOUT$info.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$compactedSize = LAYOUT.byteOffset(PATH$compactedSize);
    public static final long OFFSET$info = LAYOUT.byteOffset(PATH$info);
}
