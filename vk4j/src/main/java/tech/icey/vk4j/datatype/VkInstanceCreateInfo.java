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

public record VkInstanceCreateInfo(MemorySegment segment) implements IPointer {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("flags"),
        ValueLayout.ADDRESS.withTargetLayout(VkApplicationInfo.LAYOUT).withName("pApplicationInfo"),
        ValueLayout.JAVA_INT.withName("enabledLayerCount"),
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_BYTE)).withName("ppEnabledLayerNames"),
        ValueLayout.JAVA_INT.withName("enabledExtensionCount"),
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_BYTE)).withName("ppEnabledExtensionNames")
    );
    public static final long SIZE = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$flags = PathElement.groupElement("flags");
    public static final PathElement PATH$pApplicationInfo = PathElement.groupElement("pApplicationInfo");
    public static final PathElement PATH$enabledLayerCount = PathElement.groupElement("enabledLayerCount");
    public static final PathElement PATH$ppEnabledLayerNames = PathElement.groupElement("ppEnabledLayerNames");
    public static final PathElement PATH$enabledExtensionCount = PathElement.groupElement("enabledExtensionCount");
    public static final PathElement PATH$ppEnabledExtensionNames = PathElement.groupElement("ppEnabledExtensionNames");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$flags = (OfInt) LAYOUT.select(PATH$flags);
    public static final AddressLayout LAYOUT$pApplicationInfo = (AddressLayout) LAYOUT.select(PATH$pApplicationInfo);
    public static final OfInt LAYOUT$enabledLayerCount = (OfInt) LAYOUT.select(PATH$enabledLayerCount);
    public static final AddressLayout LAYOUT$ppEnabledLayerNames = (AddressLayout) LAYOUT.select(PATH$ppEnabledLayerNames);
    public static final OfInt LAYOUT$enabledExtensionCount = (OfInt) LAYOUT.select(PATH$enabledExtensionCount);
    public static final AddressLayout LAYOUT$ppEnabledExtensionNames = (AddressLayout) LAYOUT.select(PATH$ppEnabledExtensionNames);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$flags = LAYOUT.byteOffset(PATH$flags);
    public static final long OFFSET$pApplicationInfo = LAYOUT.byteOffset(PATH$pApplicationInfo);
    public static final long OFFSET$enabledLayerCount = LAYOUT.byteOffset(PATH$enabledLayerCount);
    public static final long OFFSET$ppEnabledLayerNames = LAYOUT.byteOffset(PATH$ppEnabledLayerNames);
    public static final long OFFSET$enabledExtensionCount = LAYOUT.byteOffset(PATH$enabledExtensionCount);
    public static final long OFFSET$ppEnabledExtensionNames = LAYOUT.byteOffset(PATH$ppEnabledExtensionNames);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$flags = LAYOUT$flags.byteSize();
    public static final long SIZE$pApplicationInfo = LAYOUT$pApplicationInfo.byteSize();
    public static final long SIZE$enabledLayerCount = LAYOUT$enabledLayerCount.byteSize();
    public static final long SIZE$ppEnabledLayerNames = LAYOUT$ppEnabledLayerNames.byteSize();
    public static final long SIZE$enabledExtensionCount = LAYOUT$enabledExtensionCount.byteSize();
    public static final long SIZE$ppEnabledExtensionNames = LAYOUT$ppEnabledExtensionNames.byteSize();

    public VkInstanceCreateInfo(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_INSTANCE_CREATE_INFO);
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

    public @enumtype(VkInstanceCreateFlags.class) int flags() {
        return segment.get(LAYOUT$flags, OFFSET$flags);
    }

    public void flags(@enumtype(VkInstanceCreateFlags.class) int value) {
        segment.set(LAYOUT$flags, OFFSET$flags, value);
    }

    public @pointer(comment="VkApplicationInfo*") MemorySegment pApplicationInfoRaw() {
        return segment.get(LAYOUT$pApplicationInfo, OFFSET$pApplicationInfo);
    }

    public void pApplicationInfoRaw(@pointer(comment="VkApplicationInfo*") MemorySegment value) {
        segment.set(LAYOUT$pApplicationInfo, OFFSET$pApplicationInfo, value);
    }
    
    public @nullable VkApplicationInfo pApplicationInfo() {
        MemorySegment s = pApplicationInfoRaw();
        if (s.address() == 0) {
            return null;
        }
        return new VkApplicationInfo(s);
    }

    @unsafe
    public @nullable VkApplicationInfo[] pApplicationInfo(int assumedCount) {
        MemorySegment s = pApplicationInfoRaw().reinterpret(assumedCount * VkApplicationInfo.SIZE);
        VkApplicationInfo[] arr = new VkApplicationInfo[assumedCount];
        for (int i = 0; i < assumedCount; i++) {
            arr[i] = new VkApplicationInfo(s.asSlice(i * VkApplicationInfo.SIZE, VkApplicationInfo.SIZE));
        }
        return arr;
    }

    public void pApplicationInfo(@nullable VkApplicationInfo value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pApplicationInfoRaw(s);
    }

    public @unsigned int enabledLayerCount() {
        return segment.get(LAYOUT$enabledLayerCount, OFFSET$enabledLayerCount);
    }

    public void enabledLayerCount(@unsigned int value) {
        segment.set(LAYOUT$enabledLayerCount, OFFSET$enabledLayerCount, value);
    }

    public @pointer(comment="void**") MemorySegment ppEnabledLayerNames() {
        return segment.get(LAYOUT$ppEnabledLayerNames, OFFSET$ppEnabledLayerNames);
    }

    public void ppEnabledLayerNames(@pointer(comment="void**") MemorySegment value) {
        segment.set(LAYOUT$ppEnabledLayerNames, OFFSET$ppEnabledLayerNames, value);
    }

    public @unsigned int enabledExtensionCount() {
        return segment.get(LAYOUT$enabledExtensionCount, OFFSET$enabledExtensionCount);
    }

    public void enabledExtensionCount(@unsigned int value) {
        segment.set(LAYOUT$enabledExtensionCount, OFFSET$enabledExtensionCount, value);
    }

    public @pointer(comment="void**") MemorySegment ppEnabledExtensionNames() {
        return segment.get(LAYOUT$ppEnabledExtensionNames, OFFSET$ppEnabledExtensionNames);
    }

    public void ppEnabledExtensionNames(@pointer(comment="void**") MemorySegment value) {
        segment.set(LAYOUT$ppEnabledExtensionNames, OFFSET$ppEnabledExtensionNames, value);
    }

    public static VkInstanceCreateInfo allocate(Arena arena) {
        return new VkInstanceCreateInfo(arena.allocate(LAYOUT));
    }
    
    public static VkInstanceCreateInfo[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkInstanceCreateInfo[] ret = new VkInstanceCreateInfo[count];
        for (int i = 0; i < count; i++) {
            ret[i] = new VkInstanceCreateInfo(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }
}
