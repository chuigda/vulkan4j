package tech.icey.vk4j.datatype;

import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;

import tech.icey.vk4j.annotations.*;
import tech.icey.vk4j.array.*;
import tech.icey.vk4j.bitmask.*;
import tech.icey.vk4j.datatype.*;
import tech.icey.vk4j.enumtype.*;
import tech.icey.vk4j.handle.*;
import tech.icey.vk4j.ptr.*;
import tech.icey.vk4j.NativeLayout;
import tech.icey.vk4j.IFactory;
import static tech.icey.vk4j.Constants.*;
import static tech.icey.vk4j.enumtype.VkStructureType.*;

public record VkRayTracingShaderGroupCreateInfoKHR(MemorySegment segment) {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("type"),
        ValueLayout.JAVA_INT.withName("generalShader"),
        ValueLayout.JAVA_INT.withName("closestHitShader"),
        ValueLayout.JAVA_INT.withName("anyHitShader"),
        ValueLayout.JAVA_INT.withName("intersectionShader"),
        ValueLayout.ADDRESS.withName("pShaderGroupCaptureReplayHandle")
    );

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$type = PathElement.groupElement("type");
    public static final PathElement PATH$generalShader = PathElement.groupElement("generalShader");
    public static final PathElement PATH$closestHitShader = PathElement.groupElement("closestHitShader");
    public static final PathElement PATH$anyHitShader = PathElement.groupElement("anyHitShader");
    public static final PathElement PATH$intersectionShader = PathElement.groupElement("intersectionShader");
    public static final PathElement PATH$pShaderGroupCaptureReplayHandle = PathElement.groupElement("pShaderGroupCaptureReplayHandle");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$type = (OfInt) LAYOUT.select(PATH$type);
    public static final OfInt LAYOUT$generalShader = (OfInt) LAYOUT.select(PATH$generalShader);
    public static final OfInt LAYOUT$closestHitShader = (OfInt) LAYOUT.select(PATH$closestHitShader);
    public static final OfInt LAYOUT$anyHitShader = (OfInt) LAYOUT.select(PATH$anyHitShader);
    public static final OfInt LAYOUT$intersectionShader = (OfInt) LAYOUT.select(PATH$intersectionShader);
    public static final AddressLayout LAYOUT$pShaderGroupCaptureReplayHandle = (AddressLayout) LAYOUT.select(PATH$pShaderGroupCaptureReplayHandle);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$type = LAYOUT.byteOffset(PATH$type);
    public static final long OFFSET$generalShader = LAYOUT.byteOffset(PATH$generalShader);
    public static final long OFFSET$closestHitShader = LAYOUT.byteOffset(PATH$closestHitShader);
    public static final long OFFSET$anyHitShader = LAYOUT.byteOffset(PATH$anyHitShader);
    public static final long OFFSET$intersectionShader = LAYOUT.byteOffset(PATH$intersectionShader);
    public static final long OFFSET$pShaderGroupCaptureReplayHandle = LAYOUT.byteOffset(PATH$pShaderGroupCaptureReplayHandle);

    public VkRayTracingShaderGroupCreateInfoKHR(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_RAY_TRACING_SHADER_GROUP_CREATE_INFO_KHR);
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

    public @enumtype(VkRayTracingShaderGroupTypeKHR.class) int type() {
        return segment.get(LAYOUT$type, OFFSET$type);
    }

    public void type(@enumtype(VkRayTracingShaderGroupTypeKHR.class) int value) {
        segment.set(LAYOUT$type, OFFSET$type, value);
    }

    public @unsigned int generalShader() {
        return segment.get(LAYOUT$generalShader, OFFSET$generalShader);
    }

    public void generalShader(@unsigned int value) {
        segment.set(LAYOUT$generalShader, OFFSET$generalShader, value);
    }

    public @unsigned int closestHitShader() {
        return segment.get(LAYOUT$closestHitShader, OFFSET$closestHitShader);
    }

    public void closestHitShader(@unsigned int value) {
        segment.set(LAYOUT$closestHitShader, OFFSET$closestHitShader, value);
    }

    public @unsigned int anyHitShader() {
        return segment.get(LAYOUT$anyHitShader, OFFSET$anyHitShader);
    }

    public void anyHitShader(@unsigned int value) {
        segment.set(LAYOUT$anyHitShader, OFFSET$anyHitShader, value);
    }

    public @unsigned int intersectionShader() {
        return segment.get(LAYOUT$intersectionShader, OFFSET$intersectionShader);
    }

    public void intersectionShader(@unsigned int value) {
        segment.set(LAYOUT$intersectionShader, OFFSET$intersectionShader, value);
    }

    public @pointer(comment="void*") MemorySegment pShaderGroupCaptureReplayHandle() {
        return segment.get(LAYOUT$pShaderGroupCaptureReplayHandle, OFFSET$pShaderGroupCaptureReplayHandle);
    }

    public void pShaderGroupCaptureReplayHandle(@pointer(comment="void*") MemorySegment value) {
        segment.set(LAYOUT$pShaderGroupCaptureReplayHandle, OFFSET$pShaderGroupCaptureReplayHandle, value);
    }


    public static final class VkRayTracingShaderGroupCreateInfoKHRFactory implements IFactory<VkRayTracingShaderGroupCreateInfoKHR> {
        @Override
        public Class<VkRayTracingShaderGroupCreateInfoKHR> clazz() {
            return VkRayTracingShaderGroupCreateInfoKHR.class;
        } 

        @Override
        public MemoryLayout layout() {
            return VkRayTracingShaderGroupCreateInfoKHR.LAYOUT;
        }

        @Override
        public VkRayTracingShaderGroupCreateInfoKHR create(MemorySegment segment) {
            return createUninit(segment);
        }

        @Override
        public VkRayTracingShaderGroupCreateInfoKHR createUninit(MemorySegment segment) {
            return new VkRayTracingShaderGroupCreateInfoKHR(segment);
        }
    }

    public static final VkRayTracingShaderGroupCreateInfoKHRFactory FACTORY = new VkRayTracingShaderGroupCreateInfoKHRFactory();
}
