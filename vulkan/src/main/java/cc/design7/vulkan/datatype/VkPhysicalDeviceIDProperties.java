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

public record VkPhysicalDeviceIDProperties(@NotNull MemorySegment segment) implements IPointer {
    public static final OfInt LAYOUT$sType = ValueLayout.JAVA_INT.withName("sType");
    public static final AddressLayout LAYOUT$pNext = ValueLayout.ADDRESS.withName("pNext");
    public static final OfByte LAYOUT$deviceUUID = ValueLayout.JAVA_BYTE.withName("deviceUUID");
    public static final OfByte LAYOUT$driverUUID = ValueLayout.JAVA_BYTE.withName("driverUUID");
    public static final OfByte LAYOUT$deviceLUID = ValueLayout.JAVA_BYTE.withName("deviceLUID");
    public static final OfInt LAYOUT$deviceNodeMask = ValueLayout.JAVA_INT.withName("deviceNodeMask");
    public static final OfInt LAYOUT$deviceLUIDValid = ValueLayout.JAVA_INT.withName("deviceLUIDValid");

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(LAYOUT$sType, LAYOUT$pNext, LAYOUT$deviceUUID, LAYOUT$driverUUID, LAYOUT$deviceLUID, LAYOUT$deviceNodeMask, LAYOUT$deviceLUIDValid);
    public static final long SIZE = LAYOUT.byteSize();

    public static VkPhysicalDeviceIDProperties allocate(Arena arena) {
        return new VkPhysicalDeviceIDProperties(arena.allocate(LAYOUT));
    }

    public static VkPhysicalDeviceIDProperties[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkPhysicalDeviceIDProperties[] ret = new VkPhysicalDeviceIDProperties[count];
        for (int i = 0; i < count; i ++) {
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
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final PathElement PATH$sType = PathElement.groupElement("PATH$sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("PATH$pNext");
    public static final PathElement PATH$deviceUUID = PathElement.groupElement("PATH$deviceUUID");
    public static final PathElement PATH$driverUUID = PathElement.groupElement("PATH$driverUUID");
    public static final PathElement PATH$deviceLUID = PathElement.groupElement("PATH$deviceLUID");
    public static final PathElement PATH$deviceNodeMask = PathElement.groupElement("PATH$deviceNodeMask");
    public static final PathElement PATH$deviceLUIDValid = PathElement.groupElement("PATH$deviceLUIDValid");

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$deviceUUID = LAYOUT$deviceUUID.byteSize();
    public static final long SIZE$driverUUID = LAYOUT$driverUUID.byteSize();
    public static final long SIZE$deviceLUID = LAYOUT$deviceLUID.byteSize();
    public static final long SIZE$deviceNodeMask = LAYOUT$deviceNodeMask.byteSize();
    public static final long SIZE$deviceLUIDValid = LAYOUT$deviceLUIDValid.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$deviceUUID = LAYOUT.byteOffset(PATH$deviceUUID);
    public static final long OFFSET$driverUUID = LAYOUT.byteOffset(PATH$driverUUID);
    public static final long OFFSET$deviceLUID = LAYOUT.byteOffset(PATH$deviceLUID);
    public static final long OFFSET$deviceNodeMask = LAYOUT.byteOffset(PATH$deviceNodeMask);
    public static final long OFFSET$deviceLUIDValid = LAYOUT.byteOffset(PATH$deviceLUIDValid);

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

    public @unsigned byte deviceUUID() {
        return segment.get(LAYOUT$deviceUUID, OFFSET$deviceUUID);
    }

    public void deviceUUID(@unsigned byte value) {
        segment.set(LAYOUT$deviceUUID, OFFSET$deviceUUID, value);
    }

    public @unsigned byte driverUUID() {
        return segment.get(LAYOUT$driverUUID, OFFSET$driverUUID);
    }

    public void driverUUID(@unsigned byte value) {
        segment.set(LAYOUT$driverUUID, OFFSET$driverUUID, value);
    }

    public @unsigned byte deviceLUID() {
        return segment.get(LAYOUT$deviceLUID, OFFSET$deviceLUID);
    }

    public void deviceLUID(@unsigned byte value) {
        segment.set(LAYOUT$deviceLUID, OFFSET$deviceLUID, value);
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

}
/// dummy, not implemented yet
