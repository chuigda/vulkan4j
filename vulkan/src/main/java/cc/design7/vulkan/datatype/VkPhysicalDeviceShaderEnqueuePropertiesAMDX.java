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

public record VkPhysicalDeviceShaderEnqueuePropertiesAMDX(@NotNull MemorySegment segment) implements IPointer {
    public static final OfInt LAYOUT$sType = ValueLayout.JAVA_INT.withName("sType");
    public static final AddressLayout LAYOUT$pNext = ValueLayout.ADDRESS.withName("pNext");
    public static final OfInt LAYOUT$maxExecutionGraphDepth = ValueLayout.JAVA_INT.withName("maxExecutionGraphDepth");
    public static final OfInt LAYOUT$maxExecutionGraphShaderOutputNodes = ValueLayout.JAVA_INT.withName("maxExecutionGraphShaderOutputNodes");
    public static final OfInt LAYOUT$maxExecutionGraphShaderPayloadSize = ValueLayout.JAVA_INT.withName("maxExecutionGraphShaderPayloadSize");
    public static final OfInt LAYOUT$maxExecutionGraphShaderPayloadCount = ValueLayout.JAVA_INT.withName("maxExecutionGraphShaderPayloadCount");
    public static final OfInt LAYOUT$executionGraphDispatchAddressAlignment = ValueLayout.JAVA_INT.withName("executionGraphDispatchAddressAlignment");
    public static final OfInt LAYOUT$maxExecutionGraphWorkgroupCount = ValueLayout.JAVA_INT.withName("maxExecutionGraphWorkgroupCount");
    public static final OfInt LAYOUT$maxExecutionGraphWorkgroups = ValueLayout.JAVA_INT.withName("maxExecutionGraphWorkgroups");

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(LAYOUT$sType, LAYOUT$pNext, LAYOUT$maxExecutionGraphDepth, LAYOUT$maxExecutionGraphShaderOutputNodes, LAYOUT$maxExecutionGraphShaderPayloadSize, LAYOUT$maxExecutionGraphShaderPayloadCount, LAYOUT$executionGraphDispatchAddressAlignment, LAYOUT$maxExecutionGraphWorkgroupCount, LAYOUT$maxExecutionGraphWorkgroups);
    public static final long SIZE = LAYOUT.byteSize();

    public static VkPhysicalDeviceShaderEnqueuePropertiesAMDX allocate(Arena arena) {
        return new VkPhysicalDeviceShaderEnqueuePropertiesAMDX(arena.allocate(LAYOUT));
    }

    public static VkPhysicalDeviceShaderEnqueuePropertiesAMDX[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkPhysicalDeviceShaderEnqueuePropertiesAMDX[] ret = new VkPhysicalDeviceShaderEnqueuePropertiesAMDX[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkPhysicalDeviceShaderEnqueuePropertiesAMDX(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static VkPhysicalDeviceShaderEnqueuePropertiesAMDX clone(Arena arena, VkPhysicalDeviceShaderEnqueuePropertiesAMDX src) {
        VkPhysicalDeviceShaderEnqueuePropertiesAMDX ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkPhysicalDeviceShaderEnqueuePropertiesAMDX[] clone(Arena arena, VkPhysicalDeviceShaderEnqueuePropertiesAMDX[] src) {
        VkPhysicalDeviceShaderEnqueuePropertiesAMDX[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final PathElement PATH$sType = PathElement.groupElement("PATH$sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("PATH$pNext");
    public static final PathElement PATH$maxExecutionGraphDepth = PathElement.groupElement("PATH$maxExecutionGraphDepth");
    public static final PathElement PATH$maxExecutionGraphShaderOutputNodes = PathElement.groupElement("PATH$maxExecutionGraphShaderOutputNodes");
    public static final PathElement PATH$maxExecutionGraphShaderPayloadSize = PathElement.groupElement("PATH$maxExecutionGraphShaderPayloadSize");
    public static final PathElement PATH$maxExecutionGraphShaderPayloadCount = PathElement.groupElement("PATH$maxExecutionGraphShaderPayloadCount");
    public static final PathElement PATH$executionGraphDispatchAddressAlignment = PathElement.groupElement("PATH$executionGraphDispatchAddressAlignment");
    public static final PathElement PATH$maxExecutionGraphWorkgroupCount = PathElement.groupElement("PATH$maxExecutionGraphWorkgroupCount");
    public static final PathElement PATH$maxExecutionGraphWorkgroups = PathElement.groupElement("PATH$maxExecutionGraphWorkgroups");

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$maxExecutionGraphDepth = LAYOUT$maxExecutionGraphDepth.byteSize();
    public static final long SIZE$maxExecutionGraphShaderOutputNodes = LAYOUT$maxExecutionGraphShaderOutputNodes.byteSize();
    public static final long SIZE$maxExecutionGraphShaderPayloadSize = LAYOUT$maxExecutionGraphShaderPayloadSize.byteSize();
    public static final long SIZE$maxExecutionGraphShaderPayloadCount = LAYOUT$maxExecutionGraphShaderPayloadCount.byteSize();
    public static final long SIZE$executionGraphDispatchAddressAlignment = LAYOUT$executionGraphDispatchAddressAlignment.byteSize();
    public static final long SIZE$maxExecutionGraphWorkgroupCount = LAYOUT$maxExecutionGraphWorkgroupCount.byteSize();
    public static final long SIZE$maxExecutionGraphWorkgroups = LAYOUT$maxExecutionGraphWorkgroups.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$maxExecutionGraphDepth = LAYOUT.byteOffset(PATH$maxExecutionGraphDepth);
    public static final long OFFSET$maxExecutionGraphShaderOutputNodes = LAYOUT.byteOffset(PATH$maxExecutionGraphShaderOutputNodes);
    public static final long OFFSET$maxExecutionGraphShaderPayloadSize = LAYOUT.byteOffset(PATH$maxExecutionGraphShaderPayloadSize);
    public static final long OFFSET$maxExecutionGraphShaderPayloadCount = LAYOUT.byteOffset(PATH$maxExecutionGraphShaderPayloadCount);
    public static final long OFFSET$executionGraphDispatchAddressAlignment = LAYOUT.byteOffset(PATH$executionGraphDispatchAddressAlignment);
    public static final long OFFSET$maxExecutionGraphWorkgroupCount = LAYOUT.byteOffset(PATH$maxExecutionGraphWorkgroupCount);
    public static final long OFFSET$maxExecutionGraphWorkgroups = LAYOUT.byteOffset(PATH$maxExecutionGraphWorkgroups);

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

    public @unsigned int maxExecutionGraphDepth() {
        return segment.get(LAYOUT$maxExecutionGraphDepth, OFFSET$maxExecutionGraphDepth);
    }

    public void maxExecutionGraphDepth(@unsigned int value) {
        segment.set(LAYOUT$maxExecutionGraphDepth, OFFSET$maxExecutionGraphDepth, value);
    }

    public @unsigned int maxExecutionGraphShaderOutputNodes() {
        return segment.get(LAYOUT$maxExecutionGraphShaderOutputNodes, OFFSET$maxExecutionGraphShaderOutputNodes);
    }

    public void maxExecutionGraphShaderOutputNodes(@unsigned int value) {
        segment.set(LAYOUT$maxExecutionGraphShaderOutputNodes, OFFSET$maxExecutionGraphShaderOutputNodes, value);
    }

    public @unsigned int maxExecutionGraphShaderPayloadSize() {
        return segment.get(LAYOUT$maxExecutionGraphShaderPayloadSize, OFFSET$maxExecutionGraphShaderPayloadSize);
    }

    public void maxExecutionGraphShaderPayloadSize(@unsigned int value) {
        segment.set(LAYOUT$maxExecutionGraphShaderPayloadSize, OFFSET$maxExecutionGraphShaderPayloadSize, value);
    }

    public @unsigned int maxExecutionGraphShaderPayloadCount() {
        return segment.get(LAYOUT$maxExecutionGraphShaderPayloadCount, OFFSET$maxExecutionGraphShaderPayloadCount);
    }

    public void maxExecutionGraphShaderPayloadCount(@unsigned int value) {
        segment.set(LAYOUT$maxExecutionGraphShaderPayloadCount, OFFSET$maxExecutionGraphShaderPayloadCount, value);
    }

    public @unsigned int executionGraphDispatchAddressAlignment() {
        return segment.get(LAYOUT$executionGraphDispatchAddressAlignment, OFFSET$executionGraphDispatchAddressAlignment);
    }

    public void executionGraphDispatchAddressAlignment(@unsigned int value) {
        segment.set(LAYOUT$executionGraphDispatchAddressAlignment, OFFSET$executionGraphDispatchAddressAlignment, value);
    }

    public @unsigned int maxExecutionGraphWorkgroupCount() {
        return segment.get(LAYOUT$maxExecutionGraphWorkgroupCount, OFFSET$maxExecutionGraphWorkgroupCount);
    }

    public void maxExecutionGraphWorkgroupCount(@unsigned int value) {
        segment.set(LAYOUT$maxExecutionGraphWorkgroupCount, OFFSET$maxExecutionGraphWorkgroupCount, value);
    }

    public @unsigned int maxExecutionGraphWorkgroups() {
        return segment.get(LAYOUT$maxExecutionGraphWorkgroups, OFFSET$maxExecutionGraphWorkgroups);
    }

    public void maxExecutionGraphWorkgroups(@unsigned int value) {
        segment.set(LAYOUT$maxExecutionGraphWorkgroups, OFFSET$maxExecutionGraphWorkgroups, value);
    }

}
/// dummy, not implemented yet
