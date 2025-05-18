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

/// Represents a pointer to a <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkDeviceFaultCountsEXT.html"><code>VkDeviceFaultCountsEXT</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct VkDeviceFaultCountsEXT {
///     VkStructureType sType; // @link substring="VkStructureType" target="VkStructureType" @link substring="sType" target="#sType"
///     void* pNext; // optional // @link substring="pNext" target="#pNext"
///     uint32_t addressInfoCount; // optional // @link substring="addressInfoCount" target="#addressInfoCount"
///     uint32_t vendorInfoCount; // optional // @link substring="vendorInfoCount" target="#vendorInfoCount"
///     VkDeviceSize vendorBinarySize; // optional // @link substring="vendorBinarySize" target="#vendorBinarySize"
/// } VkDeviceFaultCountsEXT;
/// }
///
/// ## Auto initialization
/// This structure has the following members that can be automatically initialized:
/// - `sType = VK_STRUCTURE_TYPE_DEVICE_FAULT_COUNTS_EXT`
///
/// The {@code allocate} ({@link VkDeviceFaultCountsEXT#allocate(Arena)}, {@link VkDeviceFaultCountsEXT#allocate(Arena, int)})
/// functions will automatically initialize these fields. Also, you may call {@link VkDeviceFaultCountsEXT#autoInit}
/// to initialize these fields manually for non-allocated instances.
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
/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkDeviceFaultCountsEXT.html"><code>VkDeviceFaultCountsEXT</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record VkDeviceFaultCountsEXT(@NotNull MemorySegment segment) implements IPointer {
    public static VkDeviceFaultCountsEXT allocate(Arena arena) {
        VkDeviceFaultCountsEXT ret = new VkDeviceFaultCountsEXT(arena.allocate(LAYOUT));
        ret.sType(VkStructureType.DEVICE_FAULT_COUNTS_EXT);
        return ret;
    }

    public static VkDeviceFaultCountsEXT[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkDeviceFaultCountsEXT[] ret = new VkDeviceFaultCountsEXT[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkDeviceFaultCountsEXT(segment.asSlice(i * BYTES, BYTES));
            ret[i].sType(VkStructureType.DEVICE_FAULT_COUNTS_EXT);
        }
        return ret;
    }

    public static VkDeviceFaultCountsEXT clone(Arena arena, VkDeviceFaultCountsEXT src) {
        VkDeviceFaultCountsEXT ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkDeviceFaultCountsEXT[] clone(Arena arena, VkDeviceFaultCountsEXT[] src) {
        VkDeviceFaultCountsEXT[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public void autoInit() {
        sType(VkStructureType.DEVICE_FAULT_COUNTS_EXT);
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

    public @unsigned int addressInfoCount() {
        return segment.get(LAYOUT$addressInfoCount, OFFSET$addressInfoCount);
    }

    public void addressInfoCount(@unsigned int value) {
        segment.set(LAYOUT$addressInfoCount, OFFSET$addressInfoCount, value);
    }

    public @unsigned int vendorInfoCount() {
        return segment.get(LAYOUT$vendorInfoCount, OFFSET$vendorInfoCount);
    }

    public void vendorInfoCount(@unsigned int value) {
        segment.set(LAYOUT$vendorInfoCount, OFFSET$vendorInfoCount, value);
    }

    public @unsigned long vendorBinarySize() {
        return segment.get(LAYOUT$vendorBinarySize, OFFSET$vendorBinarySize);
    }

    public void vendorBinarySize(@unsigned long value) {
        segment.set(LAYOUT$vendorBinarySize, OFFSET$vendorBinarySize, value);
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("addressInfoCount"),
        ValueLayout.JAVA_INT.withName("vendorInfoCount"),
        ValueLayout.JAVA_LONG.withName("vendorBinarySize")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("PATH$sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("PATH$pNext");
    public static final PathElement PATH$addressInfoCount = PathElement.groupElement("PATH$addressInfoCount");
    public static final PathElement PATH$vendorInfoCount = PathElement.groupElement("PATH$vendorInfoCount");
    public static final PathElement PATH$vendorBinarySize = PathElement.groupElement("PATH$vendorBinarySize");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$addressInfoCount = (OfInt) LAYOUT.select(PATH$addressInfoCount);
    public static final OfInt LAYOUT$vendorInfoCount = (OfInt) LAYOUT.select(PATH$vendorInfoCount);
    public static final OfLong LAYOUT$vendorBinarySize = (OfLong) LAYOUT.select(PATH$vendorBinarySize);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$addressInfoCount = LAYOUT$addressInfoCount.byteSize();
    public static final long SIZE$vendorInfoCount = LAYOUT$vendorInfoCount.byteSize();
    public static final long SIZE$vendorBinarySize = LAYOUT$vendorBinarySize.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$addressInfoCount = LAYOUT.byteOffset(PATH$addressInfoCount);
    public static final long OFFSET$vendorInfoCount = LAYOUT.byteOffset(PATH$vendorInfoCount);
    public static final long OFFSET$vendorBinarySize = LAYOUT.byteOffset(PATH$vendorBinarySize);
}
