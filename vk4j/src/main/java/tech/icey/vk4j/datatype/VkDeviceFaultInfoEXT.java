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
/// typedef struct VkDeviceFaultInfoEXT {
///     VkStructureType sType;
///     void* pNext;
///     char description[VK_MAX_DESCRIPTION_SIZE];
///     VkDeviceFaultAddressInfoEXT* pAddressInfos;
///     VkDeviceFaultVendorInfoEXT* pVendorInfos;
///     void* pVendorBinaryData;
/// } VkDeviceFaultInfoEXT;}
///
/// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/VkDeviceFaultInfoEXT.html">VkDeviceFaultInfoEXT</a>
public record VkDeviceFaultInfoEXT(MemorySegment segment) implements IPointer {
    public VkDeviceFaultInfoEXT(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_DEVICE_FAULT_INFO_EXT);
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

    public MemorySegment descriptionRaw() {
        return segment.asSlice(OFFSET$description, SIZE$description);
    }

    public ByteBuffer description() {
        return new ByteBuffer(descriptionRaw());
    }

    public void description(ByteBuffer value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$description, SIZE$description);
    }

    public @pointer(comment="VkDeviceFaultAddressInfoEXT*") MemorySegment pAddressInfosRaw() {
        return segment.get(LAYOUT$pAddressInfos, OFFSET$pAddressInfos);
    }

    public void pAddressInfosRaw(@pointer(comment="VkDeviceFaultAddressInfoEXT*") MemorySegment value) {
        segment.set(LAYOUT$pAddressInfos, OFFSET$pAddressInfos, value);
    }
    
    public @nullable VkDeviceFaultAddressInfoEXT pAddressInfos() {
        MemorySegment s = pAddressInfosRaw();
        if (s.address() == 0) {
            return null;
        }
        return new VkDeviceFaultAddressInfoEXT(s);
    }

    /// Note: this function is {@link unsafe} because it's up to user to provide the correct count of elements.
    @unsafe
    public @nullable VkDeviceFaultAddressInfoEXT[] pAddressInfos(int assumedCount) {
        MemorySegment s = pAddressInfosRaw().reinterpret(assumedCount * VkDeviceFaultAddressInfoEXT.SIZE);
        VkDeviceFaultAddressInfoEXT[] arr = new VkDeviceFaultAddressInfoEXT[assumedCount];
        for (int i = 0; i < assumedCount; i++) {
            arr[i] = new VkDeviceFaultAddressInfoEXT(s.asSlice(i * VkDeviceFaultAddressInfoEXT.SIZE, VkDeviceFaultAddressInfoEXT.SIZE));
        }
        return arr;
    }

    public void pAddressInfos(@nullable VkDeviceFaultAddressInfoEXT value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pAddressInfosRaw(s);
    }

    public @pointer(comment="VkDeviceFaultVendorInfoEXT*") MemorySegment pVendorInfosRaw() {
        return segment.get(LAYOUT$pVendorInfos, OFFSET$pVendorInfos);
    }

    public void pVendorInfosRaw(@pointer(comment="VkDeviceFaultVendorInfoEXT*") MemorySegment value) {
        segment.set(LAYOUT$pVendorInfos, OFFSET$pVendorInfos, value);
    }
    
    public @nullable VkDeviceFaultVendorInfoEXT pVendorInfos() {
        MemorySegment s = pVendorInfosRaw();
        if (s.address() == 0) {
            return null;
        }
        return new VkDeviceFaultVendorInfoEXT(s);
    }

    /// Note: this function is {@link unsafe} because it's up to user to provide the correct count of elements.
    @unsafe
    public @nullable VkDeviceFaultVendorInfoEXT[] pVendorInfos(int assumedCount) {
        MemorySegment s = pVendorInfosRaw().reinterpret(assumedCount * VkDeviceFaultVendorInfoEXT.SIZE);
        VkDeviceFaultVendorInfoEXT[] arr = new VkDeviceFaultVendorInfoEXT[assumedCount];
        for (int i = 0; i < assumedCount; i++) {
            arr[i] = new VkDeviceFaultVendorInfoEXT(s.asSlice(i * VkDeviceFaultVendorInfoEXT.SIZE, VkDeviceFaultVendorInfoEXT.SIZE));
        }
        return arr;
    }

    public void pVendorInfos(@nullable VkDeviceFaultVendorInfoEXT value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pVendorInfosRaw(s);
    }

    public @pointer(comment="void*") MemorySegment pVendorBinaryData() {
        return segment.get(LAYOUT$pVendorBinaryData, OFFSET$pVendorBinaryData);
    }

    public void pVendorBinaryData(@pointer(comment="void*") MemorySegment value) {
        segment.set(LAYOUT$pVendorBinaryData, OFFSET$pVendorBinaryData, value);
    }

    public void pVendorBinaryData(IPointer pointer) {
        pVendorBinaryData(pointer.segment());
    }

    public static VkDeviceFaultInfoEXT allocate(Arena arena) {
        return new VkDeviceFaultInfoEXT(arena.allocate(LAYOUT));
    }
    
    public static VkDeviceFaultInfoEXT[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkDeviceFaultInfoEXT[] ret = new VkDeviceFaultInfoEXT[count];
        for (int i = 0; i < count; i++) {
            ret[i] = new VkDeviceFaultInfoEXT(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }
    
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        MemoryLayout.sequenceLayout(VK_MAX_DESCRIPTION_SIZE, ValueLayout.JAVA_BYTE).withName("description"),
        ValueLayout.ADDRESS.withTargetLayout(VkDeviceFaultAddressInfoEXT.LAYOUT).withName("pAddressInfos"),
        ValueLayout.ADDRESS.withTargetLayout(VkDeviceFaultVendorInfoEXT.LAYOUT).withName("pVendorInfos"),
        ValueLayout.ADDRESS.withName("pVendorBinaryData")
    );
    public static final long SIZE = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$description = PathElement.groupElement("description");
    public static final PathElement PATH$pAddressInfos = PathElement.groupElement("pAddressInfos");
    public static final PathElement PATH$pVendorInfos = PathElement.groupElement("pVendorInfos");
    public static final PathElement PATH$pVendorBinaryData = PathElement.groupElement("pVendorBinaryData");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final SequenceLayout LAYOUT$description = (SequenceLayout) LAYOUT.select(PATH$description);
    public static final AddressLayout LAYOUT$pAddressInfos = (AddressLayout) LAYOUT.select(PATH$pAddressInfos);
    public static final AddressLayout LAYOUT$pVendorInfos = (AddressLayout) LAYOUT.select(PATH$pVendorInfos);
    public static final AddressLayout LAYOUT$pVendorBinaryData = (AddressLayout) LAYOUT.select(PATH$pVendorBinaryData);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$description = LAYOUT.byteOffset(PATH$description);
    public static final long OFFSET$pAddressInfos = LAYOUT.byteOffset(PATH$pAddressInfos);
    public static final long OFFSET$pVendorInfos = LAYOUT.byteOffset(PATH$pVendorInfos);
    public static final long OFFSET$pVendorBinaryData = LAYOUT.byteOffset(PATH$pVendorBinaryData);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$description = LAYOUT$description.byteSize();
    public static final long SIZE$pAddressInfos = LAYOUT$pAddressInfos.byteSize();
    public static final long SIZE$pVendorInfos = LAYOUT$pVendorInfos.byteSize();
    public static final long SIZE$pVendorBinaryData = LAYOUT$pVendorBinaryData.byteSize();

}
