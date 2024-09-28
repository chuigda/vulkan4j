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

public record VkRefreshObjectListKHR(MemorySegment segment) implements IPointer {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("objectCount"),
        ValueLayout.ADDRESS.withTargetLayout(VkRefreshObjectKHR.LAYOUT).withName("pObjects")
    );
    public static final long SIZE = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$objectCount = PathElement.groupElement("objectCount");
    public static final PathElement PATH$pObjects = PathElement.groupElement("pObjects");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$objectCount = (OfInt) LAYOUT.select(PATH$objectCount);
    public static final AddressLayout LAYOUT$pObjects = (AddressLayout) LAYOUT.select(PATH$pObjects);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$objectCount = LAYOUT.byteOffset(PATH$objectCount);
    public static final long OFFSET$pObjects = LAYOUT.byteOffset(PATH$pObjects);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$objectCount = LAYOUT$objectCount.byteSize();
    public static final long SIZE$pObjects = LAYOUT$pObjects.byteSize();

    public VkRefreshObjectListKHR(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_REFRESH_OBJECT_LIST_KHR);
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

    public @unsigned int objectCount() {
        return segment.get(LAYOUT$objectCount, OFFSET$objectCount);
    }

    public void objectCount(@unsigned int value) {
        segment.set(LAYOUT$objectCount, OFFSET$objectCount, value);
    }

    public @pointer(comment="VkRefreshObjectKHR*") MemorySegment pObjectsRaw() {
        return segment.get(LAYOUT$pObjects, OFFSET$pObjects);
    }

    public void pObjectsRaw(@pointer(comment="VkRefreshObjectKHR*") MemorySegment value) {
        segment.set(LAYOUT$pObjects, OFFSET$pObjects, value);
    }
    
    public @nullable VkRefreshObjectKHR pObjects() {
        MemorySegment s = pObjectsRaw();
        if (s.address() == 0) {
            return null;
        }
        return new VkRefreshObjectKHR(s);
    }

    @unsafe
    public @nullable VkRefreshObjectKHR[] pObjects(int assumedCount) {
        MemorySegment s = pObjectsRaw().reinterpret(assumedCount * VkRefreshObjectKHR.SIZE);
        VkRefreshObjectKHR[] arr = new VkRefreshObjectKHR[assumedCount];
        for (int i = 0; i < assumedCount; i++) {
            arr[i] = new VkRefreshObjectKHR(s.asSlice(i * VkRefreshObjectKHR.SIZE, VkRefreshObjectKHR.SIZE));
        }
        return arr;
    }

    public void pObjects(@nullable VkRefreshObjectKHR value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pObjectsRaw(s);
    }

    public static VkRefreshObjectListKHR allocate(Arena arena) {
        return new VkRefreshObjectListKHR(arena.allocate(LAYOUT));
    }
    
    public static VkRefreshObjectListKHR[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkRefreshObjectListKHR[] ret = new VkRefreshObjectListKHR[count];
        for (int i = 0; i < count; i++) {
            ret[i] = new VkRefreshObjectListKHR(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }
}
