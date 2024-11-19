package tech.icey.vk4j.datatype;

import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;

import org.jetbrains.annotations.Nullable;
import tech.icey.panama.IPointer;
import tech.icey.panama.NativeLayout;
import tech.icey.panama.annotation.*;
import tech.icey.panama.buffer.*;
import tech.icey.vk4j.bitmask.*;
import tech.icey.vk4j.datatype.*;
import tech.icey.vk4j.enumtype.*;
import tech.icey.vk4j.handle.*;
import static tech.icey.vk4j.Constants.*;
import static tech.icey.vk4j.enumtype.VkStructureType.*;

/// {@snippet lang=c :
/// typedef struct VkPhysicalDeviceIDProperties {
///     VkStructureType sType;
///     void* pNext;
///     uint8_t deviceUUID[VK_UUID_SIZE];
///     uint8_t driverUUID[VK_UUID_SIZE];
///     uint8_t deviceLUID[VK_LUID_SIZE];
///     uint32_t deviceNodeMask;
///     VkBool32 deviceLUIDValid;
/// } VkPhysicalDeviceIDProperties;}
///
/// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/VkPhysicalDeviceIDProperties.html">VkPhysicalDeviceIDProperties</a>
public record VkPhysicalDeviceIDProperties(MemorySegment segment) implements IPointer {
    public VkPhysicalDeviceIDProperties(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_ID_PROPERTIES);
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
        pNext(pointer == null ? MemorySegment.NULL : pointer.segment());
    }

    public MemorySegment deviceUUIDRaw() {
        return segment.asSlice(OFFSET$deviceUUID, SIZE$deviceUUID);
    }

    public @unsigned ByteBuffer deviceUUID() {
        return new ByteBuffer(deviceUUIDRaw());
    }

    public void deviceUUID(@unsigned ByteBuffer value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$deviceUUID, SIZE$deviceUUID);
    }

    public MemorySegment driverUUIDRaw() {
        return segment.asSlice(OFFSET$driverUUID, SIZE$driverUUID);
    }

    public @unsigned ByteBuffer driverUUID() {
        return new ByteBuffer(driverUUIDRaw());
    }

    public void driverUUID(@unsigned ByteBuffer value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$driverUUID, SIZE$driverUUID);
    }

    public MemorySegment deviceLUIDRaw() {
        return segment.asSlice(OFFSET$deviceLUID, SIZE$deviceLUID);
    }

    public @unsigned ByteBuffer deviceLUID() {
        return new ByteBuffer(deviceLUIDRaw());
    }

    public void deviceLUID(@unsigned ByteBuffer value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$deviceLUID, SIZE$deviceLUID);
    }

    public @unsigned int deviceNodeMask() {
        return segment.get(LAYOUT$deviceNodeMask, OFFSET$deviceNodeMask);
    }

    public void deviceNodeMask(@unsigned int value) {
        segment.set(LAYOUT$deviceNodeMask, OFFSET$deviceNodeMask, value);
    }

    public @unsigned int deviceLUIDValid() {
        return segment.get(LAYOUT$deviceLUIDValid, OFFSET$deviceLUIDValid);
    }

    public void deviceLUIDValid(@unsigned int value) {
        segment.set(LAYOUT$deviceLUIDValid, OFFSET$deviceLUIDValid, value);
    }

    public static VkPhysicalDeviceIDProperties allocate(Arena arena) {
        return new VkPhysicalDeviceIDProperties(arena.allocate(LAYOUT));
    }

    public static VkPhysicalDeviceIDProperties[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkPhysicalDeviceIDProperties[] ret = new VkPhysicalDeviceIDProperties[count];
        for (int i = 0; i < count; i++) {
            ret[i] = new VkPhysicalDeviceIDProperties(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static VkPhysicalDeviceIDProperties clone(Arena arena, VkPhysicalDeviceIDProperties src) {
        VkPhysicalDeviceIDProperties ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkPhysicalDeviceIDProperties[] clone(Arena arena, VkPhysicalDeviceIDProperties[] src) {
        VkPhysicalDeviceIDProperties[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        MemoryLayout.sequenceLayout(VK_UUID_SIZE, ValueLayout.JAVA_BYTE).withName("deviceUUID"),
        MemoryLayout.sequenceLayout(VK_UUID_SIZE, ValueLayout.JAVA_BYTE).withName("driverUUID"),
        MemoryLayout.sequenceLayout(VK_LUID_SIZE, ValueLayout.JAVA_BYTE).withName("deviceLUID"),
        ValueLayout.JAVA_INT.withName("deviceNodeMask"),
        ValueLayout.JAVA_INT.withName("deviceLUIDValid")
    );
    public static final long SIZE = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$deviceUUID = PathElement.groupElement("deviceUUID");
    public static final PathElement PATH$driverUUID = PathElement.groupElement("driverUUID");
    public static final PathElement PATH$deviceLUID = PathElement.groupElement("deviceLUID");
    public static final PathElement PATH$deviceNodeMask = PathElement.groupElement("deviceNodeMask");
    public static final PathElement PATH$deviceLUIDValid = PathElement.groupElement("deviceLUIDValid");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final SequenceLayout LAYOUT$deviceUUID = (SequenceLayout) LAYOUT.select(PATH$deviceUUID);
    public static final SequenceLayout LAYOUT$driverUUID = (SequenceLayout) LAYOUT.select(PATH$driverUUID);
    public static final SequenceLayout LAYOUT$deviceLUID = (SequenceLayout) LAYOUT.select(PATH$deviceLUID);
    public static final OfInt LAYOUT$deviceNodeMask = (OfInt) LAYOUT.select(PATH$deviceNodeMask);
    public static final OfInt LAYOUT$deviceLUIDValid = (OfInt) LAYOUT.select(PATH$deviceLUIDValid);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$deviceUUID = LAYOUT.byteOffset(PATH$deviceUUID);
    public static final long OFFSET$driverUUID = LAYOUT.byteOffset(PATH$driverUUID);
    public static final long OFFSET$deviceLUID = LAYOUT.byteOffset(PATH$deviceLUID);
    public static final long OFFSET$deviceNodeMask = LAYOUT.byteOffset(PATH$deviceNodeMask);
    public static final long OFFSET$deviceLUIDValid = LAYOUT.byteOffset(PATH$deviceLUIDValid);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$deviceUUID = LAYOUT$deviceUUID.byteSize();
    public static final long SIZE$driverUUID = LAYOUT$driverUUID.byteSize();
    public static final long SIZE$deviceLUID = LAYOUT$deviceLUID.byteSize();
    public static final long SIZE$deviceNodeMask = LAYOUT$deviceNodeMask.byteSize();
    public static final long SIZE$deviceLUIDValid = LAYOUT$deviceLUIDValid.byteSize();
}
