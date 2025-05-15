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

public record VkPhysicalDeviceShaderTileImagePropertiesEXT(@NotNull MemorySegment segment) implements IPointer {
    public static final OfInt LAYOUT$sType = ValueLayout.JAVA_INT.withName("sType");
    public static final AddressLayout LAYOUT$pNext = ValueLayout.ADDRESS.withName("pNext");
    public static final OfInt LAYOUT$shaderTileImageCoherentReadAccelerated = ValueLayout.JAVA_INT.withName("shaderTileImageCoherentReadAccelerated");
    public static final OfInt LAYOUT$shaderTileImageReadSampleFromPixelRateInvocation = ValueLayout.JAVA_INT.withName("shaderTileImageReadSampleFromPixelRateInvocation");
    public static final OfInt LAYOUT$shaderTileImageReadFromHelperInvocation = ValueLayout.JAVA_INT.withName("shaderTileImageReadFromHelperInvocation");

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(LAYOUT$sType, LAYOUT$pNext, LAYOUT$shaderTileImageCoherentReadAccelerated, LAYOUT$shaderTileImageReadSampleFromPixelRateInvocation, LAYOUT$shaderTileImageReadFromHelperInvocation);
    public static final long SIZE = LAYOUT.byteSize();

    public static VkPhysicalDeviceShaderTileImagePropertiesEXT allocate(Arena arena) {
        return new VkPhysicalDeviceShaderTileImagePropertiesEXT(arena.allocate(LAYOUT));
    }

    public static VkPhysicalDeviceShaderTileImagePropertiesEXT[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkPhysicalDeviceShaderTileImagePropertiesEXT[] ret = new VkPhysicalDeviceShaderTileImagePropertiesEXT[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkPhysicalDeviceShaderTileImagePropertiesEXT(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static VkPhysicalDeviceShaderTileImagePropertiesEXT clone(Arena arena, VkPhysicalDeviceShaderTileImagePropertiesEXT src) {
        VkPhysicalDeviceShaderTileImagePropertiesEXT ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkPhysicalDeviceShaderTileImagePropertiesEXT[] clone(Arena arena, VkPhysicalDeviceShaderTileImagePropertiesEXT[] src) {
        VkPhysicalDeviceShaderTileImagePropertiesEXT[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final PathElement PATH$sType = PathElement.groupElement("PATH$sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("PATH$pNext");
    public static final PathElement PATH$shaderTileImageCoherentReadAccelerated = PathElement.groupElement("PATH$shaderTileImageCoherentReadAccelerated");
    public static final PathElement PATH$shaderTileImageReadSampleFromPixelRateInvocation = PathElement.groupElement("PATH$shaderTileImageReadSampleFromPixelRateInvocation");
    public static final PathElement PATH$shaderTileImageReadFromHelperInvocation = PathElement.groupElement("PATH$shaderTileImageReadFromHelperInvocation");

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$shaderTileImageCoherentReadAccelerated = LAYOUT$shaderTileImageCoherentReadAccelerated.byteSize();
    public static final long SIZE$shaderTileImageReadSampleFromPixelRateInvocation = LAYOUT$shaderTileImageReadSampleFromPixelRateInvocation.byteSize();
    public static final long SIZE$shaderTileImageReadFromHelperInvocation = LAYOUT$shaderTileImageReadFromHelperInvocation.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$shaderTileImageCoherentReadAccelerated = LAYOUT.byteOffset(PATH$shaderTileImageCoherentReadAccelerated);
    public static final long OFFSET$shaderTileImageReadSampleFromPixelRateInvocation = LAYOUT.byteOffset(PATH$shaderTileImageReadSampleFromPixelRateInvocation);
    public static final long OFFSET$shaderTileImageReadFromHelperInvocation = LAYOUT.byteOffset(PATH$shaderTileImageReadFromHelperInvocation);

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

    public @unsigned int shaderTileImageCoherentReadAccelerated() {
        return segment.get(LAYOUT$shaderTileImageCoherentReadAccelerated, OFFSET$shaderTileImageCoherentReadAccelerated);
    }

    public void shaderTileImageCoherentReadAccelerated(@unsigned int value) {
        segment.set(LAYOUT$shaderTileImageCoherentReadAccelerated, OFFSET$shaderTileImageCoherentReadAccelerated, value);
    }

    public @unsigned int shaderTileImageReadSampleFromPixelRateInvocation() {
        return segment.get(LAYOUT$shaderTileImageReadSampleFromPixelRateInvocation, OFFSET$shaderTileImageReadSampleFromPixelRateInvocation);
    }

    public void shaderTileImageReadSampleFromPixelRateInvocation(@unsigned int value) {
        segment.set(LAYOUT$shaderTileImageReadSampleFromPixelRateInvocation, OFFSET$shaderTileImageReadSampleFromPixelRateInvocation, value);
    }

    public @unsigned int shaderTileImageReadFromHelperInvocation() {
        return segment.get(LAYOUT$shaderTileImageReadFromHelperInvocation, OFFSET$shaderTileImageReadFromHelperInvocation);
    }

    public void shaderTileImageReadFromHelperInvocation(@unsigned int value) {
        segment.set(LAYOUT$shaderTileImageReadFromHelperInvocation, OFFSET$shaderTileImageReadFromHelperInvocation, value);
    }

}
/// dummy, not implemented yet
