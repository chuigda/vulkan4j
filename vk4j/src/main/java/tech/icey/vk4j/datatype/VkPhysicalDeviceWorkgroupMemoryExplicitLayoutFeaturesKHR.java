package tech.icey.vk4j.datatype;

import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;

import tech.icey.vk4j.annotation.*;
import tech.icey.vk4j.bitmask.*;
import tech.icey.vk4j.buffer.*;
import tech.icey.vk4j.datatype.*;
import tech.icey.vk4j.enumtype.*;
import tech.icey.vk4j.handle.*;
import tech.icey.vk4j.NativeLayout;
import static tech.icey.vk4j.Constants.*;
import static tech.icey.vk4j.enumtype.VkStructureType.*;

public record VkPhysicalDeviceWorkgroupMemoryExplicitLayoutFeaturesKHR(MemorySegment segment) {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("workgroupMemoryExplicitLayout"),
        ValueLayout.JAVA_INT.withName("workgroupMemoryExplicitLayoutScalarBlockLayout"),
        ValueLayout.JAVA_INT.withName("workgroupMemoryExplicitLayout8BitAccess"),
        ValueLayout.JAVA_INT.withName("workgroupMemoryExplicitLayout16BitAccess")
    );

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$workgroupMemoryExplicitLayout = PathElement.groupElement("workgroupMemoryExplicitLayout");
    public static final PathElement PATH$workgroupMemoryExplicitLayoutScalarBlockLayout = PathElement.groupElement("workgroupMemoryExplicitLayoutScalarBlockLayout");
    public static final PathElement PATH$workgroupMemoryExplicitLayout8BitAccess = PathElement.groupElement("workgroupMemoryExplicitLayout8BitAccess");
    public static final PathElement PATH$workgroupMemoryExplicitLayout16BitAccess = PathElement.groupElement("workgroupMemoryExplicitLayout16BitAccess");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$workgroupMemoryExplicitLayout = (OfInt) LAYOUT.select(PATH$workgroupMemoryExplicitLayout);
    public static final OfInt LAYOUT$workgroupMemoryExplicitLayoutScalarBlockLayout = (OfInt) LAYOUT.select(PATH$workgroupMemoryExplicitLayoutScalarBlockLayout);
    public static final OfInt LAYOUT$workgroupMemoryExplicitLayout8BitAccess = (OfInt) LAYOUT.select(PATH$workgroupMemoryExplicitLayout8BitAccess);
    public static final OfInt LAYOUT$workgroupMemoryExplicitLayout16BitAccess = (OfInt) LAYOUT.select(PATH$workgroupMemoryExplicitLayout16BitAccess);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$workgroupMemoryExplicitLayout = LAYOUT.byteOffset(PATH$workgroupMemoryExplicitLayout);
    public static final long OFFSET$workgroupMemoryExplicitLayoutScalarBlockLayout = LAYOUT.byteOffset(PATH$workgroupMemoryExplicitLayoutScalarBlockLayout);
    public static final long OFFSET$workgroupMemoryExplicitLayout8BitAccess = LAYOUT.byteOffset(PATH$workgroupMemoryExplicitLayout8BitAccess);
    public static final long OFFSET$workgroupMemoryExplicitLayout16BitAccess = LAYOUT.byteOffset(PATH$workgroupMemoryExplicitLayout16BitAccess);

    public VkPhysicalDeviceWorkgroupMemoryExplicitLayoutFeaturesKHR(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_WORKGROUP_MEMORY_EXPLICIT_LAYOUT_FEATURES_KHR);
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

    public @unsigned int workgroupMemoryExplicitLayout() {
        return segment.get(LAYOUT$workgroupMemoryExplicitLayout, OFFSET$workgroupMemoryExplicitLayout);
    }

    public void workgroupMemoryExplicitLayout(@unsigned int value) {
        segment.set(LAYOUT$workgroupMemoryExplicitLayout, OFFSET$workgroupMemoryExplicitLayout, value);
    }

    public @unsigned int workgroupMemoryExplicitLayoutScalarBlockLayout() {
        return segment.get(LAYOUT$workgroupMemoryExplicitLayoutScalarBlockLayout, OFFSET$workgroupMemoryExplicitLayoutScalarBlockLayout);
    }

    public void workgroupMemoryExplicitLayoutScalarBlockLayout(@unsigned int value) {
        segment.set(LAYOUT$workgroupMemoryExplicitLayoutScalarBlockLayout, OFFSET$workgroupMemoryExplicitLayoutScalarBlockLayout, value);
    }

    public @unsigned int workgroupMemoryExplicitLayout8BitAccess() {
        return segment.get(LAYOUT$workgroupMemoryExplicitLayout8BitAccess, OFFSET$workgroupMemoryExplicitLayout8BitAccess);
    }

    public void workgroupMemoryExplicitLayout8BitAccess(@unsigned int value) {
        segment.set(LAYOUT$workgroupMemoryExplicitLayout8BitAccess, OFFSET$workgroupMemoryExplicitLayout8BitAccess, value);
    }

    public @unsigned int workgroupMemoryExplicitLayout16BitAccess() {
        return segment.get(LAYOUT$workgroupMemoryExplicitLayout16BitAccess, OFFSET$workgroupMemoryExplicitLayout16BitAccess);
    }

    public void workgroupMemoryExplicitLayout16BitAccess(@unsigned int value) {
        segment.set(LAYOUT$workgroupMemoryExplicitLayout16BitAccess, OFFSET$workgroupMemoryExplicitLayout16BitAccess, value);
    }

    public static VkPhysicalDeviceWorkgroupMemoryExplicitLayoutFeaturesKHR allocate(Arena arena) {
        return new VkPhysicalDeviceWorkgroupMemoryExplicitLayoutFeaturesKHR(arena.allocate(LAYOUT));
    }
    
    public static VkPhysicalDeviceWorkgroupMemoryExplicitLayoutFeaturesKHR[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkPhysicalDeviceWorkgroupMemoryExplicitLayoutFeaturesKHR[] ret = new VkPhysicalDeviceWorkgroupMemoryExplicitLayoutFeaturesKHR[count];
        for (int i = 0; i < count; i++) {
            ret[i] = new VkPhysicalDeviceWorkgroupMemoryExplicitLayoutFeaturesKHR(segment.asSlice(i * LAYOUT.byteSize(), LAYOUT.byteSize()));
        }
        return ret;
    }
}
