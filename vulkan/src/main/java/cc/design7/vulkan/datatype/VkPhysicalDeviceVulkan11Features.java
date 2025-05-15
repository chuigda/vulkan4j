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

public record VkPhysicalDeviceVulkan11Features(@NotNull MemorySegment segment) implements IPointer {
    public static final OfInt LAYOUT$sType = ValueLayout.JAVA_INT.withName("sType");
    public static final AddressLayout LAYOUT$pNext = ValueLayout.ADDRESS.withName("pNext");
    public static final OfInt LAYOUT$storageBuffer16BitAccess = ValueLayout.JAVA_INT.withName("storageBuffer16BitAccess");
    public static final OfInt LAYOUT$uniformAndStorageBuffer16BitAccess = ValueLayout.JAVA_INT.withName("uniformAndStorageBuffer16BitAccess");
    public static final OfInt LAYOUT$storagePushConstant16 = ValueLayout.JAVA_INT.withName("storagePushConstant16");
    public static final OfInt LAYOUT$storageInputOutput16 = ValueLayout.JAVA_INT.withName("storageInputOutput16");
    public static final OfInt LAYOUT$multiview = ValueLayout.JAVA_INT.withName("multiview");
    public static final OfInt LAYOUT$multiviewGeometryShader = ValueLayout.JAVA_INT.withName("multiviewGeometryShader");
    public static final OfInt LAYOUT$multiviewTessellationShader = ValueLayout.JAVA_INT.withName("multiviewTessellationShader");
    public static final OfInt LAYOUT$variablePointersStorageBuffer = ValueLayout.JAVA_INT.withName("variablePointersStorageBuffer");
    public static final OfInt LAYOUT$variablePointers = ValueLayout.JAVA_INT.withName("variablePointers");
    public static final OfInt LAYOUT$protectedMemory = ValueLayout.JAVA_INT.withName("protectedMemory");
    public static final OfInt LAYOUT$samplerYcbcrConversion = ValueLayout.JAVA_INT.withName("samplerYcbcrConversion");
    public static final OfInt LAYOUT$shaderDrawParameters = ValueLayout.JAVA_INT.withName("shaderDrawParameters");

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(LAYOUT$sType, LAYOUT$pNext, LAYOUT$storageBuffer16BitAccess, LAYOUT$uniformAndStorageBuffer16BitAccess, LAYOUT$storagePushConstant16, LAYOUT$storageInputOutput16, LAYOUT$multiview, LAYOUT$multiviewGeometryShader, LAYOUT$multiviewTessellationShader, LAYOUT$variablePointersStorageBuffer, LAYOUT$variablePointers, LAYOUT$protectedMemory, LAYOUT$samplerYcbcrConversion, LAYOUT$shaderDrawParameters);
    public static final long SIZE = LAYOUT.byteSize();

    public static VkPhysicalDeviceVulkan11Features allocate(Arena arena) {
        return new VkPhysicalDeviceVulkan11Features(arena.allocate(LAYOUT));
    }

    public static VkPhysicalDeviceVulkan11Features[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkPhysicalDeviceVulkan11Features[] ret = new VkPhysicalDeviceVulkan11Features[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkPhysicalDeviceVulkan11Features(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static VkPhysicalDeviceVulkan11Features clone(Arena arena, VkPhysicalDeviceVulkan11Features src) {
        VkPhysicalDeviceVulkan11Features ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkPhysicalDeviceVulkan11Features[] clone(Arena arena, VkPhysicalDeviceVulkan11Features[] src) {
        VkPhysicalDeviceVulkan11Features[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final PathElement PATH$sType = PathElement.groupElement("PATH$sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("PATH$pNext");
    public static final PathElement PATH$storageBuffer16BitAccess = PathElement.groupElement("PATH$storageBuffer16BitAccess");
    public static final PathElement PATH$uniformAndStorageBuffer16BitAccess = PathElement.groupElement("PATH$uniformAndStorageBuffer16BitAccess");
    public static final PathElement PATH$storagePushConstant16 = PathElement.groupElement("PATH$storagePushConstant16");
    public static final PathElement PATH$storageInputOutput16 = PathElement.groupElement("PATH$storageInputOutput16");
    public static final PathElement PATH$multiview = PathElement.groupElement("PATH$multiview");
    public static final PathElement PATH$multiviewGeometryShader = PathElement.groupElement("PATH$multiviewGeometryShader");
    public static final PathElement PATH$multiviewTessellationShader = PathElement.groupElement("PATH$multiviewTessellationShader");
    public static final PathElement PATH$variablePointersStorageBuffer = PathElement.groupElement("PATH$variablePointersStorageBuffer");
    public static final PathElement PATH$variablePointers = PathElement.groupElement("PATH$variablePointers");
    public static final PathElement PATH$protectedMemory = PathElement.groupElement("PATH$protectedMemory");
    public static final PathElement PATH$samplerYcbcrConversion = PathElement.groupElement("PATH$samplerYcbcrConversion");
    public static final PathElement PATH$shaderDrawParameters = PathElement.groupElement("PATH$shaderDrawParameters");

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$storageBuffer16BitAccess = LAYOUT$storageBuffer16BitAccess.byteSize();
    public static final long SIZE$uniformAndStorageBuffer16BitAccess = LAYOUT$uniformAndStorageBuffer16BitAccess.byteSize();
    public static final long SIZE$storagePushConstant16 = LAYOUT$storagePushConstant16.byteSize();
    public static final long SIZE$storageInputOutput16 = LAYOUT$storageInputOutput16.byteSize();
    public static final long SIZE$multiview = LAYOUT$multiview.byteSize();
    public static final long SIZE$multiviewGeometryShader = LAYOUT$multiviewGeometryShader.byteSize();
    public static final long SIZE$multiviewTessellationShader = LAYOUT$multiviewTessellationShader.byteSize();
    public static final long SIZE$variablePointersStorageBuffer = LAYOUT$variablePointersStorageBuffer.byteSize();
    public static final long SIZE$variablePointers = LAYOUT$variablePointers.byteSize();
    public static final long SIZE$protectedMemory = LAYOUT$protectedMemory.byteSize();
    public static final long SIZE$samplerYcbcrConversion = LAYOUT$samplerYcbcrConversion.byteSize();
    public static final long SIZE$shaderDrawParameters = LAYOUT$shaderDrawParameters.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$storageBuffer16BitAccess = LAYOUT.byteOffset(PATH$storageBuffer16BitAccess);
    public static final long OFFSET$uniformAndStorageBuffer16BitAccess = LAYOUT.byteOffset(PATH$uniformAndStorageBuffer16BitAccess);
    public static final long OFFSET$storagePushConstant16 = LAYOUT.byteOffset(PATH$storagePushConstant16);
    public static final long OFFSET$storageInputOutput16 = LAYOUT.byteOffset(PATH$storageInputOutput16);
    public static final long OFFSET$multiview = LAYOUT.byteOffset(PATH$multiview);
    public static final long OFFSET$multiviewGeometryShader = LAYOUT.byteOffset(PATH$multiviewGeometryShader);
    public static final long OFFSET$multiviewTessellationShader = LAYOUT.byteOffset(PATH$multiviewTessellationShader);
    public static final long OFFSET$variablePointersStorageBuffer = LAYOUT.byteOffset(PATH$variablePointersStorageBuffer);
    public static final long OFFSET$variablePointers = LAYOUT.byteOffset(PATH$variablePointers);
    public static final long OFFSET$protectedMemory = LAYOUT.byteOffset(PATH$protectedMemory);
    public static final long OFFSET$samplerYcbcrConversion = LAYOUT.byteOffset(PATH$samplerYcbcrConversion);
    public static final long OFFSET$shaderDrawParameters = LAYOUT.byteOffset(PATH$shaderDrawParameters);

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

    public @unsigned int storageBuffer16BitAccess() {
        return segment.get(LAYOUT$storageBuffer16BitAccess, OFFSET$storageBuffer16BitAccess);
    }

    public void storageBuffer16BitAccess(@unsigned int value) {
        segment.set(LAYOUT$storageBuffer16BitAccess, OFFSET$storageBuffer16BitAccess, value);
    }

    public @unsigned int uniformAndStorageBuffer16BitAccess() {
        return segment.get(LAYOUT$uniformAndStorageBuffer16BitAccess, OFFSET$uniformAndStorageBuffer16BitAccess);
    }

    public void uniformAndStorageBuffer16BitAccess(@unsigned int value) {
        segment.set(LAYOUT$uniformAndStorageBuffer16BitAccess, OFFSET$uniformAndStorageBuffer16BitAccess, value);
    }

    public @unsigned int storagePushConstant16() {
        return segment.get(LAYOUT$storagePushConstant16, OFFSET$storagePushConstant16);
    }

    public void storagePushConstant16(@unsigned int value) {
        segment.set(LAYOUT$storagePushConstant16, OFFSET$storagePushConstant16, value);
    }

    public @unsigned int storageInputOutput16() {
        return segment.get(LAYOUT$storageInputOutput16, OFFSET$storageInputOutput16);
    }

    public void storageInputOutput16(@unsigned int value) {
        segment.set(LAYOUT$storageInputOutput16, OFFSET$storageInputOutput16, value);
    }

    public @unsigned int multiview() {
        return segment.get(LAYOUT$multiview, OFFSET$multiview);
    }

    public void multiview(@unsigned int value) {
        segment.set(LAYOUT$multiview, OFFSET$multiview, value);
    }

    public @unsigned int multiviewGeometryShader() {
        return segment.get(LAYOUT$multiviewGeometryShader, OFFSET$multiviewGeometryShader);
    }

    public void multiviewGeometryShader(@unsigned int value) {
        segment.set(LAYOUT$multiviewGeometryShader, OFFSET$multiviewGeometryShader, value);
    }

    public @unsigned int multiviewTessellationShader() {
        return segment.get(LAYOUT$multiviewTessellationShader, OFFSET$multiviewTessellationShader);
    }

    public void multiviewTessellationShader(@unsigned int value) {
        segment.set(LAYOUT$multiviewTessellationShader, OFFSET$multiviewTessellationShader, value);
    }

    public @unsigned int variablePointersStorageBuffer() {
        return segment.get(LAYOUT$variablePointersStorageBuffer, OFFSET$variablePointersStorageBuffer);
    }

    public void variablePointersStorageBuffer(@unsigned int value) {
        segment.set(LAYOUT$variablePointersStorageBuffer, OFFSET$variablePointersStorageBuffer, value);
    }

    public @unsigned int variablePointers() {
        return segment.get(LAYOUT$variablePointers, OFFSET$variablePointers);
    }

    public void variablePointers(@unsigned int value) {
        segment.set(LAYOUT$variablePointers, OFFSET$variablePointers, value);
    }

    public @unsigned int protectedMemory() {
        return segment.get(LAYOUT$protectedMemory, OFFSET$protectedMemory);
    }

    public void protectedMemory(@unsigned int value) {
        segment.set(LAYOUT$protectedMemory, OFFSET$protectedMemory, value);
    }

    public @unsigned int samplerYcbcrConversion() {
        return segment.get(LAYOUT$samplerYcbcrConversion, OFFSET$samplerYcbcrConversion);
    }

    public void samplerYcbcrConversion(@unsigned int value) {
        segment.set(LAYOUT$samplerYcbcrConversion, OFFSET$samplerYcbcrConversion, value);
    }

    public @unsigned int shaderDrawParameters() {
        return segment.get(LAYOUT$shaderDrawParameters, OFFSET$shaderDrawParameters);
    }

    public void shaderDrawParameters(@unsigned int value) {
        segment.set(LAYOUT$shaderDrawParameters, OFFSET$shaderDrawParameters, value);
    }

}
/// dummy, not implemented yet
