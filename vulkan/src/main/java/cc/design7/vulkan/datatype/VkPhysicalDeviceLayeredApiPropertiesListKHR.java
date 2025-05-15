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

public record VkPhysicalDeviceLayeredApiPropertiesListKHR(@NotNull MemorySegment segment) implements IPointer {
    public static final OfInt LAYOUT$sType = ValueLayout.JAVA_INT.withName("sType");
    public static final AddressLayout LAYOUT$pNext = ValueLayout.ADDRESS.withName("pNext");
    public static final OfInt LAYOUT$layeredApiCount = ValueLayout.JAVA_INT.withName("layeredApiCount");
    public static final AddressLayout LAYOUT$pLayeredApis = ValueLayout.ADDRESS.withTargetLayout(VkPhysicalDeviceLayeredApiPropertiesKHR.LAYOUT).withName("pLayeredApis");

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(LAYOUT$sType, LAYOUT$pNext, LAYOUT$layeredApiCount, LAYOUT$pLayeredApis);
    public static final long SIZE = LAYOUT.byteSize();

    public static VkPhysicalDeviceLayeredApiPropertiesListKHR allocate(Arena arena) {
        return new VkPhysicalDeviceLayeredApiPropertiesListKHR(arena.allocate(LAYOUT));
    }

    public static VkPhysicalDeviceLayeredApiPropertiesListKHR[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkPhysicalDeviceLayeredApiPropertiesListKHR[] ret = new VkPhysicalDeviceLayeredApiPropertiesListKHR[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkPhysicalDeviceLayeredApiPropertiesListKHR(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static VkPhysicalDeviceLayeredApiPropertiesListKHR clone(Arena arena, VkPhysicalDeviceLayeredApiPropertiesListKHR src) {
        VkPhysicalDeviceLayeredApiPropertiesListKHR ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkPhysicalDeviceLayeredApiPropertiesListKHR[] clone(Arena arena, VkPhysicalDeviceLayeredApiPropertiesListKHR[] src) {
        VkPhysicalDeviceLayeredApiPropertiesListKHR[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final PathElement PATH$sType = PathElement.groupElement("PATH$sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("PATH$pNext");
    public static final PathElement PATH$layeredApiCount = PathElement.groupElement("PATH$layeredApiCount");
    public static final PathElement PATH$pLayeredApis = PathElement.groupElement("PATH$pLayeredApis");

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$layeredApiCount = LAYOUT$layeredApiCount.byteSize();
    public static final long SIZE$pLayeredApis = LAYOUT$pLayeredApis.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$layeredApiCount = LAYOUT.byteOffset(PATH$layeredApiCount);
    public static final long OFFSET$pLayeredApis = LAYOUT.byteOffset(PATH$pLayeredApis);

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

    public @unsigned int layeredApiCount() {
        return segment.get(LAYOUT$layeredApiCount, OFFSET$layeredApiCount);
    }

    public void layeredApiCount(@unsigned int value) {
        segment.set(LAYOUT$layeredApiCount, OFFSET$layeredApiCount, value);
    }

    public @pointer(comment="VkPhysicalDeviceLayeredApiPropertiesKHR*") MemorySegment pLayeredApisRaw() {
        return segment.get(LAYOUT$pLayeredApis, OFFSET$pLayeredApis);
    }

    public void pLayeredApisRaw(@pointer(comment="VkPhysicalDeviceLayeredApiPropertiesKHR*") MemorySegment value) {
        segment.set(LAYOUT$pLayeredApis, OFFSET$pLayeredApis, value);
    }

    public @Nullable VkPhysicalDeviceLayeredApiPropertiesKHR pLayeredApis() {
        MemorySegment s = pLayeredApisRaw();
        if (s.address() == 0) {
            return null;
        }
        return new VkPhysicalDeviceLayeredApiPropertiesKHR(s);
    }

    public void pLayeredApis(@Nullable VkPhysicalDeviceLayeredApiPropertiesKHR value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pLayeredApisRaw(s);
    }

    @unsafe public @Nullable VkPhysicalDeviceLayeredApiPropertiesKHR[] pLayeredApis(int assumedCount) {
        MemorySegment s = pLayeredApisRaw();
        if (s.address() == 0) {
            return null;
        }

        s = s.reinterpret(assumedCount * VkPhysicalDeviceLayeredApiPropertiesKHR.SIZE);
        VkPhysicalDeviceLayeredApiPropertiesKHR[] ret = new VkPhysicalDeviceLayeredApiPropertiesKHR[assumedCount];
        for (int i = 0; i < assumedCount; i ++) {
            ret[i] = new VkPhysicalDeviceLayeredApiPropertiesKHR(s.asSlice(i * VkPhysicalDeviceLayeredApiPropertiesKHR.SIZE, VkPhysicalDeviceLayeredApiPropertiesKHR.SIZE));
        }
        return ret;
    }

}
/// dummy, not implemented yet
