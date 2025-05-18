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

/// Represents a pointer to a <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkDeviceFaultVendorInfoEXT.html"><code>VkDeviceFaultVendorInfoEXT</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct VkDeviceFaultVendorInfoEXT {
///     char description; // @link substring="description" target="#description"
///     uint64_t vendorFaultCode; // @link substring="vendorFaultCode" target="#vendorFaultCode"
///     uint64_t vendorFaultData; // @link substring="vendorFaultData" target="#vendorFaultData"
/// } VkDeviceFaultVendorInfoEXT;
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
/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkDeviceFaultVendorInfoEXT.html"><code>VkDeviceFaultVendorInfoEXT</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record VkDeviceFaultVendorInfoEXT(@NotNull MemorySegment segment) implements IPointer {
    public static VkDeviceFaultVendorInfoEXT allocate(Arena arena) {
        VkDeviceFaultVendorInfoEXT ret = new VkDeviceFaultVendorInfoEXT(arena.allocate(LAYOUT));
        return ret;
    }

    public static VkDeviceFaultVendorInfoEXT[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkDeviceFaultVendorInfoEXT[] ret = new VkDeviceFaultVendorInfoEXT[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkDeviceFaultVendorInfoEXT(segment.asSlice(i * BYTES, BYTES));
        }
        return ret;
    }

    public static VkDeviceFaultVendorInfoEXT clone(Arena arena, VkDeviceFaultVendorInfoEXT src) {
        VkDeviceFaultVendorInfoEXT ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkDeviceFaultVendorInfoEXT[] clone(Arena arena, VkDeviceFaultVendorInfoEXT[] src) {
        VkDeviceFaultVendorInfoEXT[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public byte description() {
        return segment.get(LAYOUT$description, OFFSET$description);
    }

    public void description(byte value) {
        segment.set(LAYOUT$description, OFFSET$description, value);
    }

    public @unsigned long vendorFaultCode() {
        return segment.get(LAYOUT$vendorFaultCode, OFFSET$vendorFaultCode);
    }

    public void vendorFaultCode(@unsigned long value) {
        segment.set(LAYOUT$vendorFaultCode, OFFSET$vendorFaultCode, value);
    }

    public @unsigned long vendorFaultData() {
        return segment.get(LAYOUT$vendorFaultData, OFFSET$vendorFaultData);
    }

    public void vendorFaultData(@unsigned long value) {
        segment.set(LAYOUT$vendorFaultData, OFFSET$vendorFaultData, value);
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_BYTE.withName("description"),
        ValueLayout.JAVA_LONG.withName("vendorFaultCode"),
        ValueLayout.JAVA_LONG.withName("vendorFaultData")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$description = PathElement.groupElement("PATH$description");
    public static final PathElement PATH$vendorFaultCode = PathElement.groupElement("PATH$vendorFaultCode");
    public static final PathElement PATH$vendorFaultData = PathElement.groupElement("PATH$vendorFaultData");

    public static final OfByte LAYOUT$description = (OfByte) LAYOUT.select(PATH$description);
    public static final OfLong LAYOUT$vendorFaultCode = (OfLong) LAYOUT.select(PATH$vendorFaultCode);
    public static final OfLong LAYOUT$vendorFaultData = (OfLong) LAYOUT.select(PATH$vendorFaultData);

    public static final long SIZE$description = LAYOUT$description.byteSize();
    public static final long SIZE$vendorFaultCode = LAYOUT$vendorFaultCode.byteSize();
    public static final long SIZE$vendorFaultData = LAYOUT$vendorFaultData.byteSize();

    public static final long OFFSET$description = LAYOUT.byteOffset(PATH$description);
    public static final long OFFSET$vendorFaultCode = LAYOUT.byteOffset(PATH$vendorFaultCode);
    public static final long OFFSET$vendorFaultData = LAYOUT.byteOffset(PATH$vendorFaultData);
}
