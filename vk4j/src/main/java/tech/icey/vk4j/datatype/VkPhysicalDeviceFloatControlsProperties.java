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

public record VkPhysicalDeviceFloatControlsProperties(MemorySegment segment) {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("denormBehaviorIndependence"),
        ValueLayout.JAVA_INT.withName("roundingModeIndependence"),
        ValueLayout.JAVA_INT.withName("shaderSignedZeroInfNanPreserveFloat16"),
        ValueLayout.JAVA_INT.withName("shaderSignedZeroInfNanPreserveFloat32"),
        ValueLayout.JAVA_INT.withName("shaderSignedZeroInfNanPreserveFloat64"),
        ValueLayout.JAVA_INT.withName("shaderDenormPreserveFloat16"),
        ValueLayout.JAVA_INT.withName("shaderDenormPreserveFloat32"),
        ValueLayout.JAVA_INT.withName("shaderDenormPreserveFloat64"),
        ValueLayout.JAVA_INT.withName("shaderDenormFlushToZeroFloat16"),
        ValueLayout.JAVA_INT.withName("shaderDenormFlushToZeroFloat32"),
        ValueLayout.JAVA_INT.withName("shaderDenormFlushToZeroFloat64"),
        ValueLayout.JAVA_INT.withName("shaderRoundingModeRTEFloat16"),
        ValueLayout.JAVA_INT.withName("shaderRoundingModeRTEFloat32"),
        ValueLayout.JAVA_INT.withName("shaderRoundingModeRTEFloat64"),
        ValueLayout.JAVA_INT.withName("shaderRoundingModeRTZFloat16"),
        ValueLayout.JAVA_INT.withName("shaderRoundingModeRTZFloat32"),
        ValueLayout.JAVA_INT.withName("shaderRoundingModeRTZFloat64")
    );

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$denormBehaviorIndependence = PathElement.groupElement("denormBehaviorIndependence");
    public static final PathElement PATH$roundingModeIndependence = PathElement.groupElement("roundingModeIndependence");
    public static final PathElement PATH$shaderSignedZeroInfNanPreserveFloat16 = PathElement.groupElement("shaderSignedZeroInfNanPreserveFloat16");
    public static final PathElement PATH$shaderSignedZeroInfNanPreserveFloat32 = PathElement.groupElement("shaderSignedZeroInfNanPreserveFloat32");
    public static final PathElement PATH$shaderSignedZeroInfNanPreserveFloat64 = PathElement.groupElement("shaderSignedZeroInfNanPreserveFloat64");
    public static final PathElement PATH$shaderDenormPreserveFloat16 = PathElement.groupElement("shaderDenormPreserveFloat16");
    public static final PathElement PATH$shaderDenormPreserveFloat32 = PathElement.groupElement("shaderDenormPreserveFloat32");
    public static final PathElement PATH$shaderDenormPreserveFloat64 = PathElement.groupElement("shaderDenormPreserveFloat64");
    public static final PathElement PATH$shaderDenormFlushToZeroFloat16 = PathElement.groupElement("shaderDenormFlushToZeroFloat16");
    public static final PathElement PATH$shaderDenormFlushToZeroFloat32 = PathElement.groupElement("shaderDenormFlushToZeroFloat32");
    public static final PathElement PATH$shaderDenormFlushToZeroFloat64 = PathElement.groupElement("shaderDenormFlushToZeroFloat64");
    public static final PathElement PATH$shaderRoundingModeRTEFloat16 = PathElement.groupElement("shaderRoundingModeRTEFloat16");
    public static final PathElement PATH$shaderRoundingModeRTEFloat32 = PathElement.groupElement("shaderRoundingModeRTEFloat32");
    public static final PathElement PATH$shaderRoundingModeRTEFloat64 = PathElement.groupElement("shaderRoundingModeRTEFloat64");
    public static final PathElement PATH$shaderRoundingModeRTZFloat16 = PathElement.groupElement("shaderRoundingModeRTZFloat16");
    public static final PathElement PATH$shaderRoundingModeRTZFloat32 = PathElement.groupElement("shaderRoundingModeRTZFloat32");
    public static final PathElement PATH$shaderRoundingModeRTZFloat64 = PathElement.groupElement("shaderRoundingModeRTZFloat64");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$denormBehaviorIndependence = (OfInt) LAYOUT.select(PATH$denormBehaviorIndependence);
    public static final OfInt LAYOUT$roundingModeIndependence = (OfInt) LAYOUT.select(PATH$roundingModeIndependence);
    public static final OfInt LAYOUT$shaderSignedZeroInfNanPreserveFloat16 = (OfInt) LAYOUT.select(PATH$shaderSignedZeroInfNanPreserveFloat16);
    public static final OfInt LAYOUT$shaderSignedZeroInfNanPreserveFloat32 = (OfInt) LAYOUT.select(PATH$shaderSignedZeroInfNanPreserveFloat32);
    public static final OfInt LAYOUT$shaderSignedZeroInfNanPreserveFloat64 = (OfInt) LAYOUT.select(PATH$shaderSignedZeroInfNanPreserveFloat64);
    public static final OfInt LAYOUT$shaderDenormPreserveFloat16 = (OfInt) LAYOUT.select(PATH$shaderDenormPreserveFloat16);
    public static final OfInt LAYOUT$shaderDenormPreserveFloat32 = (OfInt) LAYOUT.select(PATH$shaderDenormPreserveFloat32);
    public static final OfInt LAYOUT$shaderDenormPreserveFloat64 = (OfInt) LAYOUT.select(PATH$shaderDenormPreserveFloat64);
    public static final OfInt LAYOUT$shaderDenormFlushToZeroFloat16 = (OfInt) LAYOUT.select(PATH$shaderDenormFlushToZeroFloat16);
    public static final OfInt LAYOUT$shaderDenormFlushToZeroFloat32 = (OfInt) LAYOUT.select(PATH$shaderDenormFlushToZeroFloat32);
    public static final OfInt LAYOUT$shaderDenormFlushToZeroFloat64 = (OfInt) LAYOUT.select(PATH$shaderDenormFlushToZeroFloat64);
    public static final OfInt LAYOUT$shaderRoundingModeRTEFloat16 = (OfInt) LAYOUT.select(PATH$shaderRoundingModeRTEFloat16);
    public static final OfInt LAYOUT$shaderRoundingModeRTEFloat32 = (OfInt) LAYOUT.select(PATH$shaderRoundingModeRTEFloat32);
    public static final OfInt LAYOUT$shaderRoundingModeRTEFloat64 = (OfInt) LAYOUT.select(PATH$shaderRoundingModeRTEFloat64);
    public static final OfInt LAYOUT$shaderRoundingModeRTZFloat16 = (OfInt) LAYOUT.select(PATH$shaderRoundingModeRTZFloat16);
    public static final OfInt LAYOUT$shaderRoundingModeRTZFloat32 = (OfInt) LAYOUT.select(PATH$shaderRoundingModeRTZFloat32);
    public static final OfInt LAYOUT$shaderRoundingModeRTZFloat64 = (OfInt) LAYOUT.select(PATH$shaderRoundingModeRTZFloat64);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$denormBehaviorIndependence = LAYOUT.byteOffset(PATH$denormBehaviorIndependence);
    public static final long OFFSET$roundingModeIndependence = LAYOUT.byteOffset(PATH$roundingModeIndependence);
    public static final long OFFSET$shaderSignedZeroInfNanPreserveFloat16 = LAYOUT.byteOffset(PATH$shaderSignedZeroInfNanPreserveFloat16);
    public static final long OFFSET$shaderSignedZeroInfNanPreserveFloat32 = LAYOUT.byteOffset(PATH$shaderSignedZeroInfNanPreserveFloat32);
    public static final long OFFSET$shaderSignedZeroInfNanPreserveFloat64 = LAYOUT.byteOffset(PATH$shaderSignedZeroInfNanPreserveFloat64);
    public static final long OFFSET$shaderDenormPreserveFloat16 = LAYOUT.byteOffset(PATH$shaderDenormPreserveFloat16);
    public static final long OFFSET$shaderDenormPreserveFloat32 = LAYOUT.byteOffset(PATH$shaderDenormPreserveFloat32);
    public static final long OFFSET$shaderDenormPreserveFloat64 = LAYOUT.byteOffset(PATH$shaderDenormPreserveFloat64);
    public static final long OFFSET$shaderDenormFlushToZeroFloat16 = LAYOUT.byteOffset(PATH$shaderDenormFlushToZeroFloat16);
    public static final long OFFSET$shaderDenormFlushToZeroFloat32 = LAYOUT.byteOffset(PATH$shaderDenormFlushToZeroFloat32);
    public static final long OFFSET$shaderDenormFlushToZeroFloat64 = LAYOUT.byteOffset(PATH$shaderDenormFlushToZeroFloat64);
    public static final long OFFSET$shaderRoundingModeRTEFloat16 = LAYOUT.byteOffset(PATH$shaderRoundingModeRTEFloat16);
    public static final long OFFSET$shaderRoundingModeRTEFloat32 = LAYOUT.byteOffset(PATH$shaderRoundingModeRTEFloat32);
    public static final long OFFSET$shaderRoundingModeRTEFloat64 = LAYOUT.byteOffset(PATH$shaderRoundingModeRTEFloat64);
    public static final long OFFSET$shaderRoundingModeRTZFloat16 = LAYOUT.byteOffset(PATH$shaderRoundingModeRTZFloat16);
    public static final long OFFSET$shaderRoundingModeRTZFloat32 = LAYOUT.byteOffset(PATH$shaderRoundingModeRTZFloat32);
    public static final long OFFSET$shaderRoundingModeRTZFloat64 = LAYOUT.byteOffset(PATH$shaderRoundingModeRTZFloat64);

    public VkPhysicalDeviceFloatControlsProperties(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_FLOAT_CONTROLS_PROPERTIES);
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

    public @enumtype(VkShaderFloatControlsIndependence.class) int denormBehaviorIndependence() {
        return segment.get(LAYOUT$denormBehaviorIndependence, OFFSET$denormBehaviorIndependence);
    }

    public void denormBehaviorIndependence(@enumtype(VkShaderFloatControlsIndependence.class) int value) {
        segment.set(LAYOUT$denormBehaviorIndependence, OFFSET$denormBehaviorIndependence, value);
    }

    public @enumtype(VkShaderFloatControlsIndependence.class) int roundingModeIndependence() {
        return segment.get(LAYOUT$roundingModeIndependence, OFFSET$roundingModeIndependence);
    }

    public void roundingModeIndependence(@enumtype(VkShaderFloatControlsIndependence.class) int value) {
        segment.set(LAYOUT$roundingModeIndependence, OFFSET$roundingModeIndependence, value);
    }

    public @unsigned int shaderSignedZeroInfNanPreserveFloat16() {
        return segment.get(LAYOUT$shaderSignedZeroInfNanPreserveFloat16, OFFSET$shaderSignedZeroInfNanPreserveFloat16);
    }

    public void shaderSignedZeroInfNanPreserveFloat16(@unsigned int value) {
        segment.set(LAYOUT$shaderSignedZeroInfNanPreserveFloat16, OFFSET$shaderSignedZeroInfNanPreserveFloat16, value);
    }

    public @unsigned int shaderSignedZeroInfNanPreserveFloat32() {
        return segment.get(LAYOUT$shaderSignedZeroInfNanPreserveFloat32, OFFSET$shaderSignedZeroInfNanPreserveFloat32);
    }

    public void shaderSignedZeroInfNanPreserveFloat32(@unsigned int value) {
        segment.set(LAYOUT$shaderSignedZeroInfNanPreserveFloat32, OFFSET$shaderSignedZeroInfNanPreserveFloat32, value);
    }

    public @unsigned int shaderSignedZeroInfNanPreserveFloat64() {
        return segment.get(LAYOUT$shaderSignedZeroInfNanPreserveFloat64, OFFSET$shaderSignedZeroInfNanPreserveFloat64);
    }

    public void shaderSignedZeroInfNanPreserveFloat64(@unsigned int value) {
        segment.set(LAYOUT$shaderSignedZeroInfNanPreserveFloat64, OFFSET$shaderSignedZeroInfNanPreserveFloat64, value);
    }

    public @unsigned int shaderDenormPreserveFloat16() {
        return segment.get(LAYOUT$shaderDenormPreserveFloat16, OFFSET$shaderDenormPreserveFloat16);
    }

    public void shaderDenormPreserveFloat16(@unsigned int value) {
        segment.set(LAYOUT$shaderDenormPreserveFloat16, OFFSET$shaderDenormPreserveFloat16, value);
    }

    public @unsigned int shaderDenormPreserveFloat32() {
        return segment.get(LAYOUT$shaderDenormPreserveFloat32, OFFSET$shaderDenormPreserveFloat32);
    }

    public void shaderDenormPreserveFloat32(@unsigned int value) {
        segment.set(LAYOUT$shaderDenormPreserveFloat32, OFFSET$shaderDenormPreserveFloat32, value);
    }

    public @unsigned int shaderDenormPreserveFloat64() {
        return segment.get(LAYOUT$shaderDenormPreserveFloat64, OFFSET$shaderDenormPreserveFloat64);
    }

    public void shaderDenormPreserveFloat64(@unsigned int value) {
        segment.set(LAYOUT$shaderDenormPreserveFloat64, OFFSET$shaderDenormPreserveFloat64, value);
    }

    public @unsigned int shaderDenormFlushToZeroFloat16() {
        return segment.get(LAYOUT$shaderDenormFlushToZeroFloat16, OFFSET$shaderDenormFlushToZeroFloat16);
    }

    public void shaderDenormFlushToZeroFloat16(@unsigned int value) {
        segment.set(LAYOUT$shaderDenormFlushToZeroFloat16, OFFSET$shaderDenormFlushToZeroFloat16, value);
    }

    public @unsigned int shaderDenormFlushToZeroFloat32() {
        return segment.get(LAYOUT$shaderDenormFlushToZeroFloat32, OFFSET$shaderDenormFlushToZeroFloat32);
    }

    public void shaderDenormFlushToZeroFloat32(@unsigned int value) {
        segment.set(LAYOUT$shaderDenormFlushToZeroFloat32, OFFSET$shaderDenormFlushToZeroFloat32, value);
    }

    public @unsigned int shaderDenormFlushToZeroFloat64() {
        return segment.get(LAYOUT$shaderDenormFlushToZeroFloat64, OFFSET$shaderDenormFlushToZeroFloat64);
    }

    public void shaderDenormFlushToZeroFloat64(@unsigned int value) {
        segment.set(LAYOUT$shaderDenormFlushToZeroFloat64, OFFSET$shaderDenormFlushToZeroFloat64, value);
    }

    public @unsigned int shaderRoundingModeRTEFloat16() {
        return segment.get(LAYOUT$shaderRoundingModeRTEFloat16, OFFSET$shaderRoundingModeRTEFloat16);
    }

    public void shaderRoundingModeRTEFloat16(@unsigned int value) {
        segment.set(LAYOUT$shaderRoundingModeRTEFloat16, OFFSET$shaderRoundingModeRTEFloat16, value);
    }

    public @unsigned int shaderRoundingModeRTEFloat32() {
        return segment.get(LAYOUT$shaderRoundingModeRTEFloat32, OFFSET$shaderRoundingModeRTEFloat32);
    }

    public void shaderRoundingModeRTEFloat32(@unsigned int value) {
        segment.set(LAYOUT$shaderRoundingModeRTEFloat32, OFFSET$shaderRoundingModeRTEFloat32, value);
    }

    public @unsigned int shaderRoundingModeRTEFloat64() {
        return segment.get(LAYOUT$shaderRoundingModeRTEFloat64, OFFSET$shaderRoundingModeRTEFloat64);
    }

    public void shaderRoundingModeRTEFloat64(@unsigned int value) {
        segment.set(LAYOUT$shaderRoundingModeRTEFloat64, OFFSET$shaderRoundingModeRTEFloat64, value);
    }

    public @unsigned int shaderRoundingModeRTZFloat16() {
        return segment.get(LAYOUT$shaderRoundingModeRTZFloat16, OFFSET$shaderRoundingModeRTZFloat16);
    }

    public void shaderRoundingModeRTZFloat16(@unsigned int value) {
        segment.set(LAYOUT$shaderRoundingModeRTZFloat16, OFFSET$shaderRoundingModeRTZFloat16, value);
    }

    public @unsigned int shaderRoundingModeRTZFloat32() {
        return segment.get(LAYOUT$shaderRoundingModeRTZFloat32, OFFSET$shaderRoundingModeRTZFloat32);
    }

    public void shaderRoundingModeRTZFloat32(@unsigned int value) {
        segment.set(LAYOUT$shaderRoundingModeRTZFloat32, OFFSET$shaderRoundingModeRTZFloat32, value);
    }

    public @unsigned int shaderRoundingModeRTZFloat64() {
        return segment.get(LAYOUT$shaderRoundingModeRTZFloat64, OFFSET$shaderRoundingModeRTZFloat64);
    }

    public void shaderRoundingModeRTZFloat64(@unsigned int value) {
        segment.set(LAYOUT$shaderRoundingModeRTZFloat64, OFFSET$shaderRoundingModeRTZFloat64, value);
    }

    public static VkPhysicalDeviceFloatControlsProperties allocate(Arena arena) {
        return new VkPhysicalDeviceFloatControlsProperties(arena.allocate(LAYOUT));
    }
    
    public static VkPhysicalDeviceFloatControlsProperties[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkPhysicalDeviceFloatControlsProperties[] ret = new VkPhysicalDeviceFloatControlsProperties[count];
        for (int i = 0; i < count; i++) {
            ret[i] = new VkPhysicalDeviceFloatControlsProperties(segment.asSlice(i * LAYOUT.byteSize(), LAYOUT.byteSize()));
        }
        return ret;
    }
}
