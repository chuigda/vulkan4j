package tech.icey.vk4j.datatype;

import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;

import org.jetbrains.annotations.Nullable;
import tech.icey.panama.IPointer;
import tech.icey.panama.NativeLayout;
import tech.icey.panama.annotation.*;
import tech.icey.panama.buffer.*;
import tech.icey.vk4j.bitmask.*;
import tech.icey.vk4j.datatype.*;
import tech.icey.vk4j.enumtype.*;
import tech.icey.vk4j.handle.*;
import static tech.icey.vk4j.Constants.*;
import static tech.icey.vk4j.enumtype.VkStructureType.*;

/// {@snippet lang=c :
/// typedef struct VkPhysicalDeviceShaderIntegerDotProductProperties {
///     VkStructureType sType;
///     void* pNext;
///     VkBool32 integerDotProduct8BitUnsignedAccelerated;
///     VkBool32 integerDotProduct8BitSignedAccelerated;
///     VkBool32 integerDotProduct8BitMixedSignednessAccelerated;
///     VkBool32 integerDotProduct4x8BitPackedUnsignedAccelerated;
///     VkBool32 integerDotProduct4x8BitPackedSignedAccelerated;
///     VkBool32 integerDotProduct4x8BitPackedMixedSignednessAccelerated;
///     VkBool32 integerDotProduct16BitUnsignedAccelerated;
///     VkBool32 integerDotProduct16BitSignedAccelerated;
///     VkBool32 integerDotProduct16BitMixedSignednessAccelerated;
///     VkBool32 integerDotProduct32BitUnsignedAccelerated;
///     VkBool32 integerDotProduct32BitSignedAccelerated;
///     VkBool32 integerDotProduct32BitMixedSignednessAccelerated;
///     VkBool32 integerDotProduct64BitUnsignedAccelerated;
///     VkBool32 integerDotProduct64BitSignedAccelerated;
///     VkBool32 integerDotProduct64BitMixedSignednessAccelerated;
///     VkBool32 integerDotProductAccumulatingSaturating8BitUnsignedAccelerated;
///     VkBool32 integerDotProductAccumulatingSaturating8BitSignedAccelerated;
///     VkBool32 integerDotProductAccumulatingSaturating8BitMixedSignednessAccelerated;
///     VkBool32 integerDotProductAccumulatingSaturating4x8BitPackedUnsignedAccelerated;
///     VkBool32 integerDotProductAccumulatingSaturating4x8BitPackedSignedAccelerated;
///     VkBool32 integerDotProductAccumulatingSaturating4x8BitPackedMixedSignednessAccelerated;
///     VkBool32 integerDotProductAccumulatingSaturating16BitUnsignedAccelerated;
///     VkBool32 integerDotProductAccumulatingSaturating16BitSignedAccelerated;
///     VkBool32 integerDotProductAccumulatingSaturating16BitMixedSignednessAccelerated;
///     VkBool32 integerDotProductAccumulatingSaturating32BitUnsignedAccelerated;
///     VkBool32 integerDotProductAccumulatingSaturating32BitSignedAccelerated;
///     VkBool32 integerDotProductAccumulatingSaturating32BitMixedSignednessAccelerated;
///     VkBool32 integerDotProductAccumulatingSaturating64BitUnsignedAccelerated;
///     VkBool32 integerDotProductAccumulatingSaturating64BitSignedAccelerated;
///     VkBool32 integerDotProductAccumulatingSaturating64BitMixedSignednessAccelerated;
/// } VkPhysicalDeviceShaderIntegerDotProductProperties;}
///
/// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/VkPhysicalDeviceShaderIntegerDotProductProperties.html">VkPhysicalDeviceShaderIntegerDotProductProperties</a>
public record VkPhysicalDeviceShaderIntegerDotProductProperties(MemorySegment segment) implements IPointer {
    public VkPhysicalDeviceShaderIntegerDotProductProperties(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_INTEGER_DOT_PRODUCT_PROPERTIES);
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

    public void pNext(@Nullable IPointer pointer) {
        pNext(pointer == null ? MemorySegment.NULL : pointer.segment());
    }

    public @unsigned int integerDotProduct8BitUnsignedAccelerated() {
        return segment.get(LAYOUT$integerDotProduct8BitUnsignedAccelerated, OFFSET$integerDotProduct8BitUnsignedAccelerated);
    }

    public void integerDotProduct8BitUnsignedAccelerated(@unsigned int value) {
        segment.set(LAYOUT$integerDotProduct8BitUnsignedAccelerated, OFFSET$integerDotProduct8BitUnsignedAccelerated, value);
    }

    public @unsigned int integerDotProduct8BitSignedAccelerated() {
        return segment.get(LAYOUT$integerDotProduct8BitSignedAccelerated, OFFSET$integerDotProduct8BitSignedAccelerated);
    }

    public void integerDotProduct8BitSignedAccelerated(@unsigned int value) {
        segment.set(LAYOUT$integerDotProduct8BitSignedAccelerated, OFFSET$integerDotProduct8BitSignedAccelerated, value);
    }

    public @unsigned int integerDotProduct8BitMixedSignednessAccelerated() {
        return segment.get(LAYOUT$integerDotProduct8BitMixedSignednessAccelerated, OFFSET$integerDotProduct8BitMixedSignednessAccelerated);
    }

    public void integerDotProduct8BitMixedSignednessAccelerated(@unsigned int value) {
        segment.set(LAYOUT$integerDotProduct8BitMixedSignednessAccelerated, OFFSET$integerDotProduct8BitMixedSignednessAccelerated, value);
    }

    public @unsigned int integerDotProduct4x8BitPackedUnsignedAccelerated() {
        return segment.get(LAYOUT$integerDotProduct4x8BitPackedUnsignedAccelerated, OFFSET$integerDotProduct4x8BitPackedUnsignedAccelerated);
    }

    public void integerDotProduct4x8BitPackedUnsignedAccelerated(@unsigned int value) {
        segment.set(LAYOUT$integerDotProduct4x8BitPackedUnsignedAccelerated, OFFSET$integerDotProduct4x8BitPackedUnsignedAccelerated, value);
    }

    public @unsigned int integerDotProduct4x8BitPackedSignedAccelerated() {
        return segment.get(LAYOUT$integerDotProduct4x8BitPackedSignedAccelerated, OFFSET$integerDotProduct4x8BitPackedSignedAccelerated);
    }

    public void integerDotProduct4x8BitPackedSignedAccelerated(@unsigned int value) {
        segment.set(LAYOUT$integerDotProduct4x8BitPackedSignedAccelerated, OFFSET$integerDotProduct4x8BitPackedSignedAccelerated, value);
    }

    public @unsigned int integerDotProduct4x8BitPackedMixedSignednessAccelerated() {
        return segment.get(LAYOUT$integerDotProduct4x8BitPackedMixedSignednessAccelerated, OFFSET$integerDotProduct4x8BitPackedMixedSignednessAccelerated);
    }

    public void integerDotProduct4x8BitPackedMixedSignednessAccelerated(@unsigned int value) {
        segment.set(LAYOUT$integerDotProduct4x8BitPackedMixedSignednessAccelerated, OFFSET$integerDotProduct4x8BitPackedMixedSignednessAccelerated, value);
    }

    public @unsigned int integerDotProduct16BitUnsignedAccelerated() {
        return segment.get(LAYOUT$integerDotProduct16BitUnsignedAccelerated, OFFSET$integerDotProduct16BitUnsignedAccelerated);
    }

    public void integerDotProduct16BitUnsignedAccelerated(@unsigned int value) {
        segment.set(LAYOUT$integerDotProduct16BitUnsignedAccelerated, OFFSET$integerDotProduct16BitUnsignedAccelerated, value);
    }

    public @unsigned int integerDotProduct16BitSignedAccelerated() {
        return segment.get(LAYOUT$integerDotProduct16BitSignedAccelerated, OFFSET$integerDotProduct16BitSignedAccelerated);
    }

    public void integerDotProduct16BitSignedAccelerated(@unsigned int value) {
        segment.set(LAYOUT$integerDotProduct16BitSignedAccelerated, OFFSET$integerDotProduct16BitSignedAccelerated, value);
    }

    public @unsigned int integerDotProduct16BitMixedSignednessAccelerated() {
        return segment.get(LAYOUT$integerDotProduct16BitMixedSignednessAccelerated, OFFSET$integerDotProduct16BitMixedSignednessAccelerated);
    }

    public void integerDotProduct16BitMixedSignednessAccelerated(@unsigned int value) {
        segment.set(LAYOUT$integerDotProduct16BitMixedSignednessAccelerated, OFFSET$integerDotProduct16BitMixedSignednessAccelerated, value);
    }

    public @unsigned int integerDotProduct32BitUnsignedAccelerated() {
        return segment.get(LAYOUT$integerDotProduct32BitUnsignedAccelerated, OFFSET$integerDotProduct32BitUnsignedAccelerated);
    }

    public void integerDotProduct32BitUnsignedAccelerated(@unsigned int value) {
        segment.set(LAYOUT$integerDotProduct32BitUnsignedAccelerated, OFFSET$integerDotProduct32BitUnsignedAccelerated, value);
    }

    public @unsigned int integerDotProduct32BitSignedAccelerated() {
        return segment.get(LAYOUT$integerDotProduct32BitSignedAccelerated, OFFSET$integerDotProduct32BitSignedAccelerated);
    }

    public void integerDotProduct32BitSignedAccelerated(@unsigned int value) {
        segment.set(LAYOUT$integerDotProduct32BitSignedAccelerated, OFFSET$integerDotProduct32BitSignedAccelerated, value);
    }

    public @unsigned int integerDotProduct32BitMixedSignednessAccelerated() {
        return segment.get(LAYOUT$integerDotProduct32BitMixedSignednessAccelerated, OFFSET$integerDotProduct32BitMixedSignednessAccelerated);
    }

    public void integerDotProduct32BitMixedSignednessAccelerated(@unsigned int value) {
        segment.set(LAYOUT$integerDotProduct32BitMixedSignednessAccelerated, OFFSET$integerDotProduct32BitMixedSignednessAccelerated, value);
    }

    public @unsigned int integerDotProduct64BitUnsignedAccelerated() {
        return segment.get(LAYOUT$integerDotProduct64BitUnsignedAccelerated, OFFSET$integerDotProduct64BitUnsignedAccelerated);
    }

    public void integerDotProduct64BitUnsignedAccelerated(@unsigned int value) {
        segment.set(LAYOUT$integerDotProduct64BitUnsignedAccelerated, OFFSET$integerDotProduct64BitUnsignedAccelerated, value);
    }

    public @unsigned int integerDotProduct64BitSignedAccelerated() {
        return segment.get(LAYOUT$integerDotProduct64BitSignedAccelerated, OFFSET$integerDotProduct64BitSignedAccelerated);
    }

    public void integerDotProduct64BitSignedAccelerated(@unsigned int value) {
        segment.set(LAYOUT$integerDotProduct64BitSignedAccelerated, OFFSET$integerDotProduct64BitSignedAccelerated, value);
    }

    public @unsigned int integerDotProduct64BitMixedSignednessAccelerated() {
        return segment.get(LAYOUT$integerDotProduct64BitMixedSignednessAccelerated, OFFSET$integerDotProduct64BitMixedSignednessAccelerated);
    }

    public void integerDotProduct64BitMixedSignednessAccelerated(@unsigned int value) {
        segment.set(LAYOUT$integerDotProduct64BitMixedSignednessAccelerated, OFFSET$integerDotProduct64BitMixedSignednessAccelerated, value);
    }

    public @unsigned int integerDotProductAccumulatingSaturating8BitUnsignedAccelerated() {
        return segment.get(LAYOUT$integerDotProductAccumulatingSaturating8BitUnsignedAccelerated, OFFSET$integerDotProductAccumulatingSaturating8BitUnsignedAccelerated);
    }

    public void integerDotProductAccumulatingSaturating8BitUnsignedAccelerated(@unsigned int value) {
        segment.set(LAYOUT$integerDotProductAccumulatingSaturating8BitUnsignedAccelerated, OFFSET$integerDotProductAccumulatingSaturating8BitUnsignedAccelerated, value);
    }

    public @unsigned int integerDotProductAccumulatingSaturating8BitSignedAccelerated() {
        return segment.get(LAYOUT$integerDotProductAccumulatingSaturating8BitSignedAccelerated, OFFSET$integerDotProductAccumulatingSaturating8BitSignedAccelerated);
    }

    public void integerDotProductAccumulatingSaturating8BitSignedAccelerated(@unsigned int value) {
        segment.set(LAYOUT$integerDotProductAccumulatingSaturating8BitSignedAccelerated, OFFSET$integerDotProductAccumulatingSaturating8BitSignedAccelerated, value);
    }

    public @unsigned int integerDotProductAccumulatingSaturating8BitMixedSignednessAccelerated() {
        return segment.get(LAYOUT$integerDotProductAccumulatingSaturating8BitMixedSignednessAccelerated, OFFSET$integerDotProductAccumulatingSaturating8BitMixedSignednessAccelerated);
    }

    public void integerDotProductAccumulatingSaturating8BitMixedSignednessAccelerated(@unsigned int value) {
        segment.set(LAYOUT$integerDotProductAccumulatingSaturating8BitMixedSignednessAccelerated, OFFSET$integerDotProductAccumulatingSaturating8BitMixedSignednessAccelerated, value);
    }

    public @unsigned int integerDotProductAccumulatingSaturating4x8BitPackedUnsignedAccelerated() {
        return segment.get(LAYOUT$integerDotProductAccumulatingSaturating4x8BitPackedUnsignedAccelerated, OFFSET$integerDotProductAccumulatingSaturating4x8BitPackedUnsignedAccelerated);
    }

    public void integerDotProductAccumulatingSaturating4x8BitPackedUnsignedAccelerated(@unsigned int value) {
        segment.set(LAYOUT$integerDotProductAccumulatingSaturating4x8BitPackedUnsignedAccelerated, OFFSET$integerDotProductAccumulatingSaturating4x8BitPackedUnsignedAccelerated, value);
    }

    public @unsigned int integerDotProductAccumulatingSaturating4x8BitPackedSignedAccelerated() {
        return segment.get(LAYOUT$integerDotProductAccumulatingSaturating4x8BitPackedSignedAccelerated, OFFSET$integerDotProductAccumulatingSaturating4x8BitPackedSignedAccelerated);
    }

    public void integerDotProductAccumulatingSaturating4x8BitPackedSignedAccelerated(@unsigned int value) {
        segment.set(LAYOUT$integerDotProductAccumulatingSaturating4x8BitPackedSignedAccelerated, OFFSET$integerDotProductAccumulatingSaturating4x8BitPackedSignedAccelerated, value);
    }

    public @unsigned int integerDotProductAccumulatingSaturating4x8BitPackedMixedSignednessAccelerated() {
        return segment.get(LAYOUT$integerDotProductAccumulatingSaturating4x8BitPackedMixedSignednessAccelerated, OFFSET$integerDotProductAccumulatingSaturating4x8BitPackedMixedSignednessAccelerated);
    }

    public void integerDotProductAccumulatingSaturating4x8BitPackedMixedSignednessAccelerated(@unsigned int value) {
        segment.set(LAYOUT$integerDotProductAccumulatingSaturating4x8BitPackedMixedSignednessAccelerated, OFFSET$integerDotProductAccumulatingSaturating4x8BitPackedMixedSignednessAccelerated, value);
    }

    public @unsigned int integerDotProductAccumulatingSaturating16BitUnsignedAccelerated() {
        return segment.get(LAYOUT$integerDotProductAccumulatingSaturating16BitUnsignedAccelerated, OFFSET$integerDotProductAccumulatingSaturating16BitUnsignedAccelerated);
    }

    public void integerDotProductAccumulatingSaturating16BitUnsignedAccelerated(@unsigned int value) {
        segment.set(LAYOUT$integerDotProductAccumulatingSaturating16BitUnsignedAccelerated, OFFSET$integerDotProductAccumulatingSaturating16BitUnsignedAccelerated, value);
    }

    public @unsigned int integerDotProductAccumulatingSaturating16BitSignedAccelerated() {
        return segment.get(LAYOUT$integerDotProductAccumulatingSaturating16BitSignedAccelerated, OFFSET$integerDotProductAccumulatingSaturating16BitSignedAccelerated);
    }

    public void integerDotProductAccumulatingSaturating16BitSignedAccelerated(@unsigned int value) {
        segment.set(LAYOUT$integerDotProductAccumulatingSaturating16BitSignedAccelerated, OFFSET$integerDotProductAccumulatingSaturating16BitSignedAccelerated, value);
    }

    public @unsigned int integerDotProductAccumulatingSaturating16BitMixedSignednessAccelerated() {
        return segment.get(LAYOUT$integerDotProductAccumulatingSaturating16BitMixedSignednessAccelerated, OFFSET$integerDotProductAccumulatingSaturating16BitMixedSignednessAccelerated);
    }

    public void integerDotProductAccumulatingSaturating16BitMixedSignednessAccelerated(@unsigned int value) {
        segment.set(LAYOUT$integerDotProductAccumulatingSaturating16BitMixedSignednessAccelerated, OFFSET$integerDotProductAccumulatingSaturating16BitMixedSignednessAccelerated, value);
    }

    public @unsigned int integerDotProductAccumulatingSaturating32BitUnsignedAccelerated() {
        return segment.get(LAYOUT$integerDotProductAccumulatingSaturating32BitUnsignedAccelerated, OFFSET$integerDotProductAccumulatingSaturating32BitUnsignedAccelerated);
    }

    public void integerDotProductAccumulatingSaturating32BitUnsignedAccelerated(@unsigned int value) {
        segment.set(LAYOUT$integerDotProductAccumulatingSaturating32BitUnsignedAccelerated, OFFSET$integerDotProductAccumulatingSaturating32BitUnsignedAccelerated, value);
    }

    public @unsigned int integerDotProductAccumulatingSaturating32BitSignedAccelerated() {
        return segment.get(LAYOUT$integerDotProductAccumulatingSaturating32BitSignedAccelerated, OFFSET$integerDotProductAccumulatingSaturating32BitSignedAccelerated);
    }

    public void integerDotProductAccumulatingSaturating32BitSignedAccelerated(@unsigned int value) {
        segment.set(LAYOUT$integerDotProductAccumulatingSaturating32BitSignedAccelerated, OFFSET$integerDotProductAccumulatingSaturating32BitSignedAccelerated, value);
    }

    public @unsigned int integerDotProductAccumulatingSaturating32BitMixedSignednessAccelerated() {
        return segment.get(LAYOUT$integerDotProductAccumulatingSaturating32BitMixedSignednessAccelerated, OFFSET$integerDotProductAccumulatingSaturating32BitMixedSignednessAccelerated);
    }

    public void integerDotProductAccumulatingSaturating32BitMixedSignednessAccelerated(@unsigned int value) {
        segment.set(LAYOUT$integerDotProductAccumulatingSaturating32BitMixedSignednessAccelerated, OFFSET$integerDotProductAccumulatingSaturating32BitMixedSignednessAccelerated, value);
    }

    public @unsigned int integerDotProductAccumulatingSaturating64BitUnsignedAccelerated() {
        return segment.get(LAYOUT$integerDotProductAccumulatingSaturating64BitUnsignedAccelerated, OFFSET$integerDotProductAccumulatingSaturating64BitUnsignedAccelerated);
    }

    public void integerDotProductAccumulatingSaturating64BitUnsignedAccelerated(@unsigned int value) {
        segment.set(LAYOUT$integerDotProductAccumulatingSaturating64BitUnsignedAccelerated, OFFSET$integerDotProductAccumulatingSaturating64BitUnsignedAccelerated, value);
    }

    public @unsigned int integerDotProductAccumulatingSaturating64BitSignedAccelerated() {
        return segment.get(LAYOUT$integerDotProductAccumulatingSaturating64BitSignedAccelerated, OFFSET$integerDotProductAccumulatingSaturating64BitSignedAccelerated);
    }

    public void integerDotProductAccumulatingSaturating64BitSignedAccelerated(@unsigned int value) {
        segment.set(LAYOUT$integerDotProductAccumulatingSaturating64BitSignedAccelerated, OFFSET$integerDotProductAccumulatingSaturating64BitSignedAccelerated, value);
    }

    public @unsigned int integerDotProductAccumulatingSaturating64BitMixedSignednessAccelerated() {
        return segment.get(LAYOUT$integerDotProductAccumulatingSaturating64BitMixedSignednessAccelerated, OFFSET$integerDotProductAccumulatingSaturating64BitMixedSignednessAccelerated);
    }

    public void integerDotProductAccumulatingSaturating64BitMixedSignednessAccelerated(@unsigned int value) {
        segment.set(LAYOUT$integerDotProductAccumulatingSaturating64BitMixedSignednessAccelerated, OFFSET$integerDotProductAccumulatingSaturating64BitMixedSignednessAccelerated, value);
    }

    public static VkPhysicalDeviceShaderIntegerDotProductProperties allocate(Arena arena) {
        return new VkPhysicalDeviceShaderIntegerDotProductProperties(arena.allocate(LAYOUT));
    }

    public static VkPhysicalDeviceShaderIntegerDotProductProperties[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkPhysicalDeviceShaderIntegerDotProductProperties[] ret = new VkPhysicalDeviceShaderIntegerDotProductProperties[count];
        for (int i = 0; i < count; i++) {
            ret[i] = new VkPhysicalDeviceShaderIntegerDotProductProperties(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static VkPhysicalDeviceShaderIntegerDotProductProperties clone(Arena arena, VkPhysicalDeviceShaderIntegerDotProductProperties src) {
        VkPhysicalDeviceShaderIntegerDotProductProperties ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkPhysicalDeviceShaderIntegerDotProductProperties[] clone(Arena arena, VkPhysicalDeviceShaderIntegerDotProductProperties[] src) {
        VkPhysicalDeviceShaderIntegerDotProductProperties[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("integerDotProduct8BitUnsignedAccelerated"),
        ValueLayout.JAVA_INT.withName("integerDotProduct8BitSignedAccelerated"),
        ValueLayout.JAVA_INT.withName("integerDotProduct8BitMixedSignednessAccelerated"),
        ValueLayout.JAVA_INT.withName("integerDotProduct4x8BitPackedUnsignedAccelerated"),
        ValueLayout.JAVA_INT.withName("integerDotProduct4x8BitPackedSignedAccelerated"),
        ValueLayout.JAVA_INT.withName("integerDotProduct4x8BitPackedMixedSignednessAccelerated"),
        ValueLayout.JAVA_INT.withName("integerDotProduct16BitUnsignedAccelerated"),
        ValueLayout.JAVA_INT.withName("integerDotProduct16BitSignedAccelerated"),
        ValueLayout.JAVA_INT.withName("integerDotProduct16BitMixedSignednessAccelerated"),
        ValueLayout.JAVA_INT.withName("integerDotProduct32BitUnsignedAccelerated"),
        ValueLayout.JAVA_INT.withName("integerDotProduct32BitSignedAccelerated"),
        ValueLayout.JAVA_INT.withName("integerDotProduct32BitMixedSignednessAccelerated"),
        ValueLayout.JAVA_INT.withName("integerDotProduct64BitUnsignedAccelerated"),
        ValueLayout.JAVA_INT.withName("integerDotProduct64BitSignedAccelerated"),
        ValueLayout.JAVA_INT.withName("integerDotProduct64BitMixedSignednessAccelerated"),
        ValueLayout.JAVA_INT.withName("integerDotProductAccumulatingSaturating8BitUnsignedAccelerated"),
        ValueLayout.JAVA_INT.withName("integerDotProductAccumulatingSaturating8BitSignedAccelerated"),
        ValueLayout.JAVA_INT.withName("integerDotProductAccumulatingSaturating8BitMixedSignednessAccelerated"),
        ValueLayout.JAVA_INT.withName("integerDotProductAccumulatingSaturating4x8BitPackedUnsignedAccelerated"),
        ValueLayout.JAVA_INT.withName("integerDotProductAccumulatingSaturating4x8BitPackedSignedAccelerated"),
        ValueLayout.JAVA_INT.withName("integerDotProductAccumulatingSaturating4x8BitPackedMixedSignednessAccelerated"),
        ValueLayout.JAVA_INT.withName("integerDotProductAccumulatingSaturating16BitUnsignedAccelerated"),
        ValueLayout.JAVA_INT.withName("integerDotProductAccumulatingSaturating16BitSignedAccelerated"),
        ValueLayout.JAVA_INT.withName("integerDotProductAccumulatingSaturating16BitMixedSignednessAccelerated"),
        ValueLayout.JAVA_INT.withName("integerDotProductAccumulatingSaturating32BitUnsignedAccelerated"),
        ValueLayout.JAVA_INT.withName("integerDotProductAccumulatingSaturating32BitSignedAccelerated"),
        ValueLayout.JAVA_INT.withName("integerDotProductAccumulatingSaturating32BitMixedSignednessAccelerated"),
        ValueLayout.JAVA_INT.withName("integerDotProductAccumulatingSaturating64BitUnsignedAccelerated"),
        ValueLayout.JAVA_INT.withName("integerDotProductAccumulatingSaturating64BitSignedAccelerated"),
        ValueLayout.JAVA_INT.withName("integerDotProductAccumulatingSaturating64BitMixedSignednessAccelerated")
    );
    public static final long SIZE = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$integerDotProduct8BitUnsignedAccelerated = PathElement.groupElement("integerDotProduct8BitUnsignedAccelerated");
    public static final PathElement PATH$integerDotProduct8BitSignedAccelerated = PathElement.groupElement("integerDotProduct8BitSignedAccelerated");
    public static final PathElement PATH$integerDotProduct8BitMixedSignednessAccelerated = PathElement.groupElement("integerDotProduct8BitMixedSignednessAccelerated");
    public static final PathElement PATH$integerDotProduct4x8BitPackedUnsignedAccelerated = PathElement.groupElement("integerDotProduct4x8BitPackedUnsignedAccelerated");
    public static final PathElement PATH$integerDotProduct4x8BitPackedSignedAccelerated = PathElement.groupElement("integerDotProduct4x8BitPackedSignedAccelerated");
    public static final PathElement PATH$integerDotProduct4x8BitPackedMixedSignednessAccelerated = PathElement.groupElement("integerDotProduct4x8BitPackedMixedSignednessAccelerated");
    public static final PathElement PATH$integerDotProduct16BitUnsignedAccelerated = PathElement.groupElement("integerDotProduct16BitUnsignedAccelerated");
    public static final PathElement PATH$integerDotProduct16BitSignedAccelerated = PathElement.groupElement("integerDotProduct16BitSignedAccelerated");
    public static final PathElement PATH$integerDotProduct16BitMixedSignednessAccelerated = PathElement.groupElement("integerDotProduct16BitMixedSignednessAccelerated");
    public static final PathElement PATH$integerDotProduct32BitUnsignedAccelerated = PathElement.groupElement("integerDotProduct32BitUnsignedAccelerated");
    public static final PathElement PATH$integerDotProduct32BitSignedAccelerated = PathElement.groupElement("integerDotProduct32BitSignedAccelerated");
    public static final PathElement PATH$integerDotProduct32BitMixedSignednessAccelerated = PathElement.groupElement("integerDotProduct32BitMixedSignednessAccelerated");
    public static final PathElement PATH$integerDotProduct64BitUnsignedAccelerated = PathElement.groupElement("integerDotProduct64BitUnsignedAccelerated");
    public static final PathElement PATH$integerDotProduct64BitSignedAccelerated = PathElement.groupElement("integerDotProduct64BitSignedAccelerated");
    public static final PathElement PATH$integerDotProduct64BitMixedSignednessAccelerated = PathElement.groupElement("integerDotProduct64BitMixedSignednessAccelerated");
    public static final PathElement PATH$integerDotProductAccumulatingSaturating8BitUnsignedAccelerated = PathElement.groupElement("integerDotProductAccumulatingSaturating8BitUnsignedAccelerated");
    public static final PathElement PATH$integerDotProductAccumulatingSaturating8BitSignedAccelerated = PathElement.groupElement("integerDotProductAccumulatingSaturating8BitSignedAccelerated");
    public static final PathElement PATH$integerDotProductAccumulatingSaturating8BitMixedSignednessAccelerated = PathElement.groupElement("integerDotProductAccumulatingSaturating8BitMixedSignednessAccelerated");
    public static final PathElement PATH$integerDotProductAccumulatingSaturating4x8BitPackedUnsignedAccelerated = PathElement.groupElement("integerDotProductAccumulatingSaturating4x8BitPackedUnsignedAccelerated");
    public static final PathElement PATH$integerDotProductAccumulatingSaturating4x8BitPackedSignedAccelerated = PathElement.groupElement("integerDotProductAccumulatingSaturating4x8BitPackedSignedAccelerated");
    public static final PathElement PATH$integerDotProductAccumulatingSaturating4x8BitPackedMixedSignednessAccelerated = PathElement.groupElement("integerDotProductAccumulatingSaturating4x8BitPackedMixedSignednessAccelerated");
    public static final PathElement PATH$integerDotProductAccumulatingSaturating16BitUnsignedAccelerated = PathElement.groupElement("integerDotProductAccumulatingSaturating16BitUnsignedAccelerated");
    public static final PathElement PATH$integerDotProductAccumulatingSaturating16BitSignedAccelerated = PathElement.groupElement("integerDotProductAccumulatingSaturating16BitSignedAccelerated");
    public static final PathElement PATH$integerDotProductAccumulatingSaturating16BitMixedSignednessAccelerated = PathElement.groupElement("integerDotProductAccumulatingSaturating16BitMixedSignednessAccelerated");
    public static final PathElement PATH$integerDotProductAccumulatingSaturating32BitUnsignedAccelerated = PathElement.groupElement("integerDotProductAccumulatingSaturating32BitUnsignedAccelerated");
    public static final PathElement PATH$integerDotProductAccumulatingSaturating32BitSignedAccelerated = PathElement.groupElement("integerDotProductAccumulatingSaturating32BitSignedAccelerated");
    public static final PathElement PATH$integerDotProductAccumulatingSaturating32BitMixedSignednessAccelerated = PathElement.groupElement("integerDotProductAccumulatingSaturating32BitMixedSignednessAccelerated");
    public static final PathElement PATH$integerDotProductAccumulatingSaturating64BitUnsignedAccelerated = PathElement.groupElement("integerDotProductAccumulatingSaturating64BitUnsignedAccelerated");
    public static final PathElement PATH$integerDotProductAccumulatingSaturating64BitSignedAccelerated = PathElement.groupElement("integerDotProductAccumulatingSaturating64BitSignedAccelerated");
    public static final PathElement PATH$integerDotProductAccumulatingSaturating64BitMixedSignednessAccelerated = PathElement.groupElement("integerDotProductAccumulatingSaturating64BitMixedSignednessAccelerated");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$integerDotProduct8BitUnsignedAccelerated = (OfInt) LAYOUT.select(PATH$integerDotProduct8BitUnsignedAccelerated);
    public static final OfInt LAYOUT$integerDotProduct8BitSignedAccelerated = (OfInt) LAYOUT.select(PATH$integerDotProduct8BitSignedAccelerated);
    public static final OfInt LAYOUT$integerDotProduct8BitMixedSignednessAccelerated = (OfInt) LAYOUT.select(PATH$integerDotProduct8BitMixedSignednessAccelerated);
    public static final OfInt LAYOUT$integerDotProduct4x8BitPackedUnsignedAccelerated = (OfInt) LAYOUT.select(PATH$integerDotProduct4x8BitPackedUnsignedAccelerated);
    public static final OfInt LAYOUT$integerDotProduct4x8BitPackedSignedAccelerated = (OfInt) LAYOUT.select(PATH$integerDotProduct4x8BitPackedSignedAccelerated);
    public static final OfInt LAYOUT$integerDotProduct4x8BitPackedMixedSignednessAccelerated = (OfInt) LAYOUT.select(PATH$integerDotProduct4x8BitPackedMixedSignednessAccelerated);
    public static final OfInt LAYOUT$integerDotProduct16BitUnsignedAccelerated = (OfInt) LAYOUT.select(PATH$integerDotProduct16BitUnsignedAccelerated);
    public static final OfInt LAYOUT$integerDotProduct16BitSignedAccelerated = (OfInt) LAYOUT.select(PATH$integerDotProduct16BitSignedAccelerated);
    public static final OfInt LAYOUT$integerDotProduct16BitMixedSignednessAccelerated = (OfInt) LAYOUT.select(PATH$integerDotProduct16BitMixedSignednessAccelerated);
    public static final OfInt LAYOUT$integerDotProduct32BitUnsignedAccelerated = (OfInt) LAYOUT.select(PATH$integerDotProduct32BitUnsignedAccelerated);
    public static final OfInt LAYOUT$integerDotProduct32BitSignedAccelerated = (OfInt) LAYOUT.select(PATH$integerDotProduct32BitSignedAccelerated);
    public static final OfInt LAYOUT$integerDotProduct32BitMixedSignednessAccelerated = (OfInt) LAYOUT.select(PATH$integerDotProduct32BitMixedSignednessAccelerated);
    public static final OfInt LAYOUT$integerDotProduct64BitUnsignedAccelerated = (OfInt) LAYOUT.select(PATH$integerDotProduct64BitUnsignedAccelerated);
    public static final OfInt LAYOUT$integerDotProduct64BitSignedAccelerated = (OfInt) LAYOUT.select(PATH$integerDotProduct64BitSignedAccelerated);
    public static final OfInt LAYOUT$integerDotProduct64BitMixedSignednessAccelerated = (OfInt) LAYOUT.select(PATH$integerDotProduct64BitMixedSignednessAccelerated);
    public static final OfInt LAYOUT$integerDotProductAccumulatingSaturating8BitUnsignedAccelerated = (OfInt) LAYOUT.select(PATH$integerDotProductAccumulatingSaturating8BitUnsignedAccelerated);
    public static final OfInt LAYOUT$integerDotProductAccumulatingSaturating8BitSignedAccelerated = (OfInt) LAYOUT.select(PATH$integerDotProductAccumulatingSaturating8BitSignedAccelerated);
    public static final OfInt LAYOUT$integerDotProductAccumulatingSaturating8BitMixedSignednessAccelerated = (OfInt) LAYOUT.select(PATH$integerDotProductAccumulatingSaturating8BitMixedSignednessAccelerated);
    public static final OfInt LAYOUT$integerDotProductAccumulatingSaturating4x8BitPackedUnsignedAccelerated = (OfInt) LAYOUT.select(PATH$integerDotProductAccumulatingSaturating4x8BitPackedUnsignedAccelerated);
    public static final OfInt LAYOUT$integerDotProductAccumulatingSaturating4x8BitPackedSignedAccelerated = (OfInt) LAYOUT.select(PATH$integerDotProductAccumulatingSaturating4x8BitPackedSignedAccelerated);
    public static final OfInt LAYOUT$integerDotProductAccumulatingSaturating4x8BitPackedMixedSignednessAccelerated = (OfInt) LAYOUT.select(PATH$integerDotProductAccumulatingSaturating4x8BitPackedMixedSignednessAccelerated);
    public static final OfInt LAYOUT$integerDotProductAccumulatingSaturating16BitUnsignedAccelerated = (OfInt) LAYOUT.select(PATH$integerDotProductAccumulatingSaturating16BitUnsignedAccelerated);
    public static final OfInt LAYOUT$integerDotProductAccumulatingSaturating16BitSignedAccelerated = (OfInt) LAYOUT.select(PATH$integerDotProductAccumulatingSaturating16BitSignedAccelerated);
    public static final OfInt LAYOUT$integerDotProductAccumulatingSaturating16BitMixedSignednessAccelerated = (OfInt) LAYOUT.select(PATH$integerDotProductAccumulatingSaturating16BitMixedSignednessAccelerated);
    public static final OfInt LAYOUT$integerDotProductAccumulatingSaturating32BitUnsignedAccelerated = (OfInt) LAYOUT.select(PATH$integerDotProductAccumulatingSaturating32BitUnsignedAccelerated);
    public static final OfInt LAYOUT$integerDotProductAccumulatingSaturating32BitSignedAccelerated = (OfInt) LAYOUT.select(PATH$integerDotProductAccumulatingSaturating32BitSignedAccelerated);
    public static final OfInt LAYOUT$integerDotProductAccumulatingSaturating32BitMixedSignednessAccelerated = (OfInt) LAYOUT.select(PATH$integerDotProductAccumulatingSaturating32BitMixedSignednessAccelerated);
    public static final OfInt LAYOUT$integerDotProductAccumulatingSaturating64BitUnsignedAccelerated = (OfInt) LAYOUT.select(PATH$integerDotProductAccumulatingSaturating64BitUnsignedAccelerated);
    public static final OfInt LAYOUT$integerDotProductAccumulatingSaturating64BitSignedAccelerated = (OfInt) LAYOUT.select(PATH$integerDotProductAccumulatingSaturating64BitSignedAccelerated);
    public static final OfInt LAYOUT$integerDotProductAccumulatingSaturating64BitMixedSignednessAccelerated = (OfInt) LAYOUT.select(PATH$integerDotProductAccumulatingSaturating64BitMixedSignednessAccelerated);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$integerDotProduct8BitUnsignedAccelerated = LAYOUT.byteOffset(PATH$integerDotProduct8BitUnsignedAccelerated);
    public static final long OFFSET$integerDotProduct8BitSignedAccelerated = LAYOUT.byteOffset(PATH$integerDotProduct8BitSignedAccelerated);
    public static final long OFFSET$integerDotProduct8BitMixedSignednessAccelerated = LAYOUT.byteOffset(PATH$integerDotProduct8BitMixedSignednessAccelerated);
    public static final long OFFSET$integerDotProduct4x8BitPackedUnsignedAccelerated = LAYOUT.byteOffset(PATH$integerDotProduct4x8BitPackedUnsignedAccelerated);
    public static final long OFFSET$integerDotProduct4x8BitPackedSignedAccelerated = LAYOUT.byteOffset(PATH$integerDotProduct4x8BitPackedSignedAccelerated);
    public static final long OFFSET$integerDotProduct4x8BitPackedMixedSignednessAccelerated = LAYOUT.byteOffset(PATH$integerDotProduct4x8BitPackedMixedSignednessAccelerated);
    public static final long OFFSET$integerDotProduct16BitUnsignedAccelerated = LAYOUT.byteOffset(PATH$integerDotProduct16BitUnsignedAccelerated);
    public static final long OFFSET$integerDotProduct16BitSignedAccelerated = LAYOUT.byteOffset(PATH$integerDotProduct16BitSignedAccelerated);
    public static final long OFFSET$integerDotProduct16BitMixedSignednessAccelerated = LAYOUT.byteOffset(PATH$integerDotProduct16BitMixedSignednessAccelerated);
    public static final long OFFSET$integerDotProduct32BitUnsignedAccelerated = LAYOUT.byteOffset(PATH$integerDotProduct32BitUnsignedAccelerated);
    public static final long OFFSET$integerDotProduct32BitSignedAccelerated = LAYOUT.byteOffset(PATH$integerDotProduct32BitSignedAccelerated);
    public static final long OFFSET$integerDotProduct32BitMixedSignednessAccelerated = LAYOUT.byteOffset(PATH$integerDotProduct32BitMixedSignednessAccelerated);
    public static final long OFFSET$integerDotProduct64BitUnsignedAccelerated = LAYOUT.byteOffset(PATH$integerDotProduct64BitUnsignedAccelerated);
    public static final long OFFSET$integerDotProduct64BitSignedAccelerated = LAYOUT.byteOffset(PATH$integerDotProduct64BitSignedAccelerated);
    public static final long OFFSET$integerDotProduct64BitMixedSignednessAccelerated = LAYOUT.byteOffset(PATH$integerDotProduct64BitMixedSignednessAccelerated);
    public static final long OFFSET$integerDotProductAccumulatingSaturating8BitUnsignedAccelerated = LAYOUT.byteOffset(PATH$integerDotProductAccumulatingSaturating8BitUnsignedAccelerated);
    public static final long OFFSET$integerDotProductAccumulatingSaturating8BitSignedAccelerated = LAYOUT.byteOffset(PATH$integerDotProductAccumulatingSaturating8BitSignedAccelerated);
    public static final long OFFSET$integerDotProductAccumulatingSaturating8BitMixedSignednessAccelerated = LAYOUT.byteOffset(PATH$integerDotProductAccumulatingSaturating8BitMixedSignednessAccelerated);
    public static final long OFFSET$integerDotProductAccumulatingSaturating4x8BitPackedUnsignedAccelerated = LAYOUT.byteOffset(PATH$integerDotProductAccumulatingSaturating4x8BitPackedUnsignedAccelerated);
    public static final long OFFSET$integerDotProductAccumulatingSaturating4x8BitPackedSignedAccelerated = LAYOUT.byteOffset(PATH$integerDotProductAccumulatingSaturating4x8BitPackedSignedAccelerated);
    public static final long OFFSET$integerDotProductAccumulatingSaturating4x8BitPackedMixedSignednessAccelerated = LAYOUT.byteOffset(PATH$integerDotProductAccumulatingSaturating4x8BitPackedMixedSignednessAccelerated);
    public static final long OFFSET$integerDotProductAccumulatingSaturating16BitUnsignedAccelerated = LAYOUT.byteOffset(PATH$integerDotProductAccumulatingSaturating16BitUnsignedAccelerated);
    public static final long OFFSET$integerDotProductAccumulatingSaturating16BitSignedAccelerated = LAYOUT.byteOffset(PATH$integerDotProductAccumulatingSaturating16BitSignedAccelerated);
    public static final long OFFSET$integerDotProductAccumulatingSaturating16BitMixedSignednessAccelerated = LAYOUT.byteOffset(PATH$integerDotProductAccumulatingSaturating16BitMixedSignednessAccelerated);
    public static final long OFFSET$integerDotProductAccumulatingSaturating32BitUnsignedAccelerated = LAYOUT.byteOffset(PATH$integerDotProductAccumulatingSaturating32BitUnsignedAccelerated);
    public static final long OFFSET$integerDotProductAccumulatingSaturating32BitSignedAccelerated = LAYOUT.byteOffset(PATH$integerDotProductAccumulatingSaturating32BitSignedAccelerated);
    public static final long OFFSET$integerDotProductAccumulatingSaturating32BitMixedSignednessAccelerated = LAYOUT.byteOffset(PATH$integerDotProductAccumulatingSaturating32BitMixedSignednessAccelerated);
    public static final long OFFSET$integerDotProductAccumulatingSaturating64BitUnsignedAccelerated = LAYOUT.byteOffset(PATH$integerDotProductAccumulatingSaturating64BitUnsignedAccelerated);
    public static final long OFFSET$integerDotProductAccumulatingSaturating64BitSignedAccelerated = LAYOUT.byteOffset(PATH$integerDotProductAccumulatingSaturating64BitSignedAccelerated);
    public static final long OFFSET$integerDotProductAccumulatingSaturating64BitMixedSignednessAccelerated = LAYOUT.byteOffset(PATH$integerDotProductAccumulatingSaturating64BitMixedSignednessAccelerated);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$integerDotProduct8BitUnsignedAccelerated = LAYOUT$integerDotProduct8BitUnsignedAccelerated.byteSize();
    public static final long SIZE$integerDotProduct8BitSignedAccelerated = LAYOUT$integerDotProduct8BitSignedAccelerated.byteSize();
    public static final long SIZE$integerDotProduct8BitMixedSignednessAccelerated = LAYOUT$integerDotProduct8BitMixedSignednessAccelerated.byteSize();
    public static final long SIZE$integerDotProduct4x8BitPackedUnsignedAccelerated = LAYOUT$integerDotProduct4x8BitPackedUnsignedAccelerated.byteSize();
    public static final long SIZE$integerDotProduct4x8BitPackedSignedAccelerated = LAYOUT$integerDotProduct4x8BitPackedSignedAccelerated.byteSize();
    public static final long SIZE$integerDotProduct4x8BitPackedMixedSignednessAccelerated = LAYOUT$integerDotProduct4x8BitPackedMixedSignednessAccelerated.byteSize();
    public static final long SIZE$integerDotProduct16BitUnsignedAccelerated = LAYOUT$integerDotProduct16BitUnsignedAccelerated.byteSize();
    public static final long SIZE$integerDotProduct16BitSignedAccelerated = LAYOUT$integerDotProduct16BitSignedAccelerated.byteSize();
    public static final long SIZE$integerDotProduct16BitMixedSignednessAccelerated = LAYOUT$integerDotProduct16BitMixedSignednessAccelerated.byteSize();
    public static final long SIZE$integerDotProduct32BitUnsignedAccelerated = LAYOUT$integerDotProduct32BitUnsignedAccelerated.byteSize();
    public static final long SIZE$integerDotProduct32BitSignedAccelerated = LAYOUT$integerDotProduct32BitSignedAccelerated.byteSize();
    public static final long SIZE$integerDotProduct32BitMixedSignednessAccelerated = LAYOUT$integerDotProduct32BitMixedSignednessAccelerated.byteSize();
    public static final long SIZE$integerDotProduct64BitUnsignedAccelerated = LAYOUT$integerDotProduct64BitUnsignedAccelerated.byteSize();
    public static final long SIZE$integerDotProduct64BitSignedAccelerated = LAYOUT$integerDotProduct64BitSignedAccelerated.byteSize();
    public static final long SIZE$integerDotProduct64BitMixedSignednessAccelerated = LAYOUT$integerDotProduct64BitMixedSignednessAccelerated.byteSize();
    public static final long SIZE$integerDotProductAccumulatingSaturating8BitUnsignedAccelerated = LAYOUT$integerDotProductAccumulatingSaturating8BitUnsignedAccelerated.byteSize();
    public static final long SIZE$integerDotProductAccumulatingSaturating8BitSignedAccelerated = LAYOUT$integerDotProductAccumulatingSaturating8BitSignedAccelerated.byteSize();
    public static final long SIZE$integerDotProductAccumulatingSaturating8BitMixedSignednessAccelerated = LAYOUT$integerDotProductAccumulatingSaturating8BitMixedSignednessAccelerated.byteSize();
    public static final long SIZE$integerDotProductAccumulatingSaturating4x8BitPackedUnsignedAccelerated = LAYOUT$integerDotProductAccumulatingSaturating4x8BitPackedUnsignedAccelerated.byteSize();
    public static final long SIZE$integerDotProductAccumulatingSaturating4x8BitPackedSignedAccelerated = LAYOUT$integerDotProductAccumulatingSaturating4x8BitPackedSignedAccelerated.byteSize();
    public static final long SIZE$integerDotProductAccumulatingSaturating4x8BitPackedMixedSignednessAccelerated = LAYOUT$integerDotProductAccumulatingSaturating4x8BitPackedMixedSignednessAccelerated.byteSize();
    public static final long SIZE$integerDotProductAccumulatingSaturating16BitUnsignedAccelerated = LAYOUT$integerDotProductAccumulatingSaturating16BitUnsignedAccelerated.byteSize();
    public static final long SIZE$integerDotProductAccumulatingSaturating16BitSignedAccelerated = LAYOUT$integerDotProductAccumulatingSaturating16BitSignedAccelerated.byteSize();
    public static final long SIZE$integerDotProductAccumulatingSaturating16BitMixedSignednessAccelerated = LAYOUT$integerDotProductAccumulatingSaturating16BitMixedSignednessAccelerated.byteSize();
    public static final long SIZE$integerDotProductAccumulatingSaturating32BitUnsignedAccelerated = LAYOUT$integerDotProductAccumulatingSaturating32BitUnsignedAccelerated.byteSize();
    public static final long SIZE$integerDotProductAccumulatingSaturating32BitSignedAccelerated = LAYOUT$integerDotProductAccumulatingSaturating32BitSignedAccelerated.byteSize();
    public static final long SIZE$integerDotProductAccumulatingSaturating32BitMixedSignednessAccelerated = LAYOUT$integerDotProductAccumulatingSaturating32BitMixedSignednessAccelerated.byteSize();
    public static final long SIZE$integerDotProductAccumulatingSaturating64BitUnsignedAccelerated = LAYOUT$integerDotProductAccumulatingSaturating64BitUnsignedAccelerated.byteSize();
    public static final long SIZE$integerDotProductAccumulatingSaturating64BitSignedAccelerated = LAYOUT$integerDotProductAccumulatingSaturating64BitSignedAccelerated.byteSize();
    public static final long SIZE$integerDotProductAccumulatingSaturating64BitMixedSignednessAccelerated = LAYOUT$integerDotProductAccumulatingSaturating64BitMixedSignednessAccelerated.byteSize();
}
