package tech.icey.vk4j.datatype;

import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;

import tech.icey.vk4j.IPointer;
import tech.icey.vk4j.annotation.*;
import tech.icey.vk4j.bitmask.*;
import tech.icey.vk4j.buffer.*;
import tech.icey.vk4j.datatype.*;
import tech.icey.vk4j.enumtype.*;
import tech.icey.vk4j.handle.*;
import tech.icey.vk4j.NativeLayout;
import static tech.icey.vk4j.Constants.*;
import static tech.icey.vk4j.enumtype.VkStructureType.*;

/// {@snippet lang=c :
/// typedef struct VkDeviceFaultVendorInfoEXT {
///     char description[VK_MAX_DESCRIPTION_SIZE];
///     uint64_t vendorFaultCode;
///     uint64_t vendorFaultData;
/// } VkDeviceFaultVendorInfoEXT;}
///
/// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/VkDeviceFaultVendorInfoEXT.html">VkDeviceFaultVendorInfoEXT</a>
public record VkDeviceFaultVendorInfoEXT(MemorySegment segment) implements IPointer {
    public VkDeviceFaultVendorInfoEXT(MemorySegment segment) {
        this.segment = segment;
    }

    public MemorySegment descriptionRaw() {
        return segment.asSlice(OFFSET$description, SIZE$description);
    }

    public ByteBuffer description() {
        return new ByteBuffer(descriptionRaw());
    }

    public void description(ByteBuffer value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$description, SIZE$description);
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

    public static VkDeviceFaultVendorInfoEXT allocate(Arena arena) {
        return new VkDeviceFaultVendorInfoEXT(arena.allocate(LAYOUT));
    }
    
    public static VkDeviceFaultVendorInfoEXT[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkDeviceFaultVendorInfoEXT[] ret = new VkDeviceFaultVendorInfoEXT[count];
        for (int i = 0; i < count; i++) {
            ret[i] = new VkDeviceFaultVendorInfoEXT(segment.asSlice(i * SIZE, SIZE));
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
        for (int i = 0; i < src.length; i++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        MemoryLayout.sequenceLayout(VK_MAX_DESCRIPTION_SIZE, ValueLayout.JAVA_BYTE).withName("description"),
        ValueLayout.JAVA_LONG.withName("vendorFaultCode"),
        ValueLayout.JAVA_LONG.withName("vendorFaultData")
    );
    public static final long SIZE = LAYOUT.byteSize();

    public static final PathElement PATH$description = PathElement.groupElement("description");
    public static final PathElement PATH$vendorFaultCode = PathElement.groupElement("vendorFaultCode");
    public static final PathElement PATH$vendorFaultData = PathElement.groupElement("vendorFaultData");

    public static final SequenceLayout LAYOUT$description = (SequenceLayout) LAYOUT.select(PATH$description);
    public static final OfLong LAYOUT$vendorFaultCode = (OfLong) LAYOUT.select(PATH$vendorFaultCode);
    public static final OfLong LAYOUT$vendorFaultData = (OfLong) LAYOUT.select(PATH$vendorFaultData);

    public static final long OFFSET$description = LAYOUT.byteOffset(PATH$description);
    public static final long OFFSET$vendorFaultCode = LAYOUT.byteOffset(PATH$vendorFaultCode);
    public static final long OFFSET$vendorFaultData = LAYOUT.byteOffset(PATH$vendorFaultData);

    public static final long SIZE$description = LAYOUT$description.byteSize();
    public static final long SIZE$vendorFaultCode = LAYOUT$vendorFaultCode.byteSize();
    public static final long SIZE$vendorFaultData = LAYOUT$vendorFaultData.byteSize();
}
