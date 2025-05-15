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

public record VkPhysicalDeviceWorkgroupMemoryExplicitLayoutFeaturesKHR(@NotNull MemorySegment segment) implements IPointer {
    public static final OfInt LAYOUT$sType = ValueLayout.JAVA_INT.withName("sType");
    public static final AddressLayout LAYOUT$pNext = ValueLayout.ADDRESS.withName("pNext");
    public static final OfInt LAYOUT$workgroupMemoryExplicitLayout = ValueLayout.JAVA_INT.withName("workgroupMemoryExplicitLayout");
    public static final OfInt LAYOUT$workgroupMemoryExplicitLayoutScalarBlockLayout = ValueLayout.JAVA_INT.withName("workgroupMemoryExplicitLayoutScalarBlockLayout");
    public static final OfInt LAYOUT$workgroupMemoryExplicitLayout8BitAccess = ValueLayout.JAVA_INT.withName("workgroupMemoryExplicitLayout8BitAccess");
    public static final OfInt LAYOUT$workgroupMemoryExplicitLayout16BitAccess = ValueLayout.JAVA_INT.withName("workgroupMemoryExplicitLayout16BitAccess");

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(LAYOUT$sType, LAYOUT$pNext, LAYOUT$workgroupMemoryExplicitLayout, LAYOUT$workgroupMemoryExplicitLayoutScalarBlockLayout, LAYOUT$workgroupMemoryExplicitLayout8BitAccess, LAYOUT$workgroupMemoryExplicitLayout16BitAccess);
    public static final long SIZE = LAYOUT.byteSize();

    public static VkPhysicalDeviceWorkgroupMemoryExplicitLayoutFeaturesKHR allocate(Arena arena) {
        return new VkPhysicalDeviceWorkgroupMemoryExplicitLayoutFeaturesKHR(arena.allocate(LAYOUT));
    }

    public static VkPhysicalDeviceWorkgroupMemoryExplicitLayoutFeaturesKHR[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkPhysicalDeviceWorkgroupMemoryExplicitLayoutFeaturesKHR[] ret = new VkPhysicalDeviceWorkgroupMemoryExplicitLayoutFeaturesKHR[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkPhysicalDeviceWorkgroupMemoryExplicitLayoutFeaturesKHR(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static VkPhysicalDeviceWorkgroupMemoryExplicitLayoutFeaturesKHR clone(Arena arena, VkPhysicalDeviceWorkgroupMemoryExplicitLayoutFeaturesKHR src) {
        VkPhysicalDeviceWorkgroupMemoryExplicitLayoutFeaturesKHR ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkPhysicalDeviceWorkgroupMemoryExplicitLayoutFeaturesKHR[] clone(Arena arena, VkPhysicalDeviceWorkgroupMemoryExplicitLayoutFeaturesKHR[] src) {
        VkPhysicalDeviceWorkgroupMemoryExplicitLayoutFeaturesKHR[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final PathElement PATH$sType = PathElement.groupElement("PATH$sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("PATH$pNext");
    public static final PathElement PATH$workgroupMemoryExplicitLayout = PathElement.groupElement("PATH$workgroupMemoryExplicitLayout");
    public static final PathElement PATH$workgroupMemoryExplicitLayoutScalarBlockLayout = PathElement.groupElement("PATH$workgroupMemoryExplicitLayoutScalarBlockLayout");
    public static final PathElement PATH$workgroupMemoryExplicitLayout8BitAccess = PathElement.groupElement("PATH$workgroupMemoryExplicitLayout8BitAccess");
    public static final PathElement PATH$workgroupMemoryExplicitLayout16BitAccess = PathElement.groupElement("PATH$workgroupMemoryExplicitLayout16BitAccess");

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$workgroupMemoryExplicitLayout = LAYOUT$workgroupMemoryExplicitLayout.byteSize();
    public static final long SIZE$workgroupMemoryExplicitLayoutScalarBlockLayout = LAYOUT$workgroupMemoryExplicitLayoutScalarBlockLayout.byteSize();
    public static final long SIZE$workgroupMemoryExplicitLayout8BitAccess = LAYOUT$workgroupMemoryExplicitLayout8BitAccess.byteSize();
    public static final long SIZE$workgroupMemoryExplicitLayout16BitAccess = LAYOUT$workgroupMemoryExplicitLayout16BitAccess.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$workgroupMemoryExplicitLayout = LAYOUT.byteOffset(PATH$workgroupMemoryExplicitLayout);
    public static final long OFFSET$workgroupMemoryExplicitLayoutScalarBlockLayout = LAYOUT.byteOffset(PATH$workgroupMemoryExplicitLayoutScalarBlockLayout);
    public static final long OFFSET$workgroupMemoryExplicitLayout8BitAccess = LAYOUT.byteOffset(PATH$workgroupMemoryExplicitLayout8BitAccess);
    public static final long OFFSET$workgroupMemoryExplicitLayout16BitAccess = LAYOUT.byteOffset(PATH$workgroupMemoryExplicitLayout16BitAccess);

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

}
/// dummy, not implemented yet
