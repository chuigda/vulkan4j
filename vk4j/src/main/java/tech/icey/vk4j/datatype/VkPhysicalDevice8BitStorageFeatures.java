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

public record VkPhysicalDevice8BitStorageFeatures(MemorySegment segment) implements IPointer {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("storageBuffer8BitAccess"),
        ValueLayout.JAVA_INT.withName("uniformAndStorageBuffer8BitAccess"),
        ValueLayout.JAVA_INT.withName("storagePushConstant8")
    );
    public static final long SIZE = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$storageBuffer8BitAccess = PathElement.groupElement("storageBuffer8BitAccess");
    public static final PathElement PATH$uniformAndStorageBuffer8BitAccess = PathElement.groupElement("uniformAndStorageBuffer8BitAccess");
    public static final PathElement PATH$storagePushConstant8 = PathElement.groupElement("storagePushConstant8");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$storageBuffer8BitAccess = (OfInt) LAYOUT.select(PATH$storageBuffer8BitAccess);
    public static final OfInt LAYOUT$uniformAndStorageBuffer8BitAccess = (OfInt) LAYOUT.select(PATH$uniformAndStorageBuffer8BitAccess);
    public static final OfInt LAYOUT$storagePushConstant8 = (OfInt) LAYOUT.select(PATH$storagePushConstant8);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$storageBuffer8BitAccess = LAYOUT.byteOffset(PATH$storageBuffer8BitAccess);
    public static final long OFFSET$uniformAndStorageBuffer8BitAccess = LAYOUT.byteOffset(PATH$uniformAndStorageBuffer8BitAccess);
    public static final long OFFSET$storagePushConstant8 = LAYOUT.byteOffset(PATH$storagePushConstant8);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$storageBuffer8BitAccess = LAYOUT$storageBuffer8BitAccess.byteSize();
    public static final long SIZE$uniformAndStorageBuffer8BitAccess = LAYOUT$uniformAndStorageBuffer8BitAccess.byteSize();
    public static final long SIZE$storagePushConstant8 = LAYOUT$storagePushConstant8.byteSize();

    public VkPhysicalDevice8BitStorageFeatures(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_8BIT_STORAGE_FEATURES);
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

    public @unsigned int storageBuffer8BitAccess() {
        return segment.get(LAYOUT$storageBuffer8BitAccess, OFFSET$storageBuffer8BitAccess);
    }

    public void storageBuffer8BitAccess(@unsigned int value) {
        segment.set(LAYOUT$storageBuffer8BitAccess, OFFSET$storageBuffer8BitAccess, value);
    }

    public @unsigned int uniformAndStorageBuffer8BitAccess() {
        return segment.get(LAYOUT$uniformAndStorageBuffer8BitAccess, OFFSET$uniformAndStorageBuffer8BitAccess);
    }

    public void uniformAndStorageBuffer8BitAccess(@unsigned int value) {
        segment.set(LAYOUT$uniformAndStorageBuffer8BitAccess, OFFSET$uniformAndStorageBuffer8BitAccess, value);
    }

    public @unsigned int storagePushConstant8() {
        return segment.get(LAYOUT$storagePushConstant8, OFFSET$storagePushConstant8);
    }

    public void storagePushConstant8(@unsigned int value) {
        segment.set(LAYOUT$storagePushConstant8, OFFSET$storagePushConstant8, value);
    }

    public static VkPhysicalDevice8BitStorageFeatures allocate(Arena arena) {
        return new VkPhysicalDevice8BitStorageFeatures(arena.allocate(LAYOUT));
    }
    
    public static VkPhysicalDevice8BitStorageFeatures[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkPhysicalDevice8BitStorageFeatures[] ret = new VkPhysicalDevice8BitStorageFeatures[count];
        for (int i = 0; i < count; i++) {
            ret[i] = new VkPhysicalDevice8BitStorageFeatures(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }
}
