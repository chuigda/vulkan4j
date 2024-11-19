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
/// typedef struct VkPhysicalDeviceSparseProperties {
///     VkBool32 residencyStandard2DBlockShape;
///     VkBool32 residencyStandard2DMultisampleBlockShape;
///     VkBool32 residencyStandard3DBlockShape;
///     VkBool32 residencyAlignedMipSize;
///     VkBool32 residencyNonResidentStrict;
/// } VkPhysicalDeviceSparseProperties;}
///
/// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/VkPhysicalDeviceSparseProperties.html">VkPhysicalDeviceSparseProperties</a>
public record VkPhysicalDeviceSparseProperties(MemorySegment segment) implements IPointer {
    public VkPhysicalDeviceSparseProperties(MemorySegment segment) {
        this.segment = segment;
    }

    public @unsigned int residencyStandard2DBlockShape() {
        return segment.get(LAYOUT$residencyStandard2DBlockShape, OFFSET$residencyStandard2DBlockShape);
    }

    public void residencyStandard2DBlockShape(@unsigned int value) {
        segment.set(LAYOUT$residencyStandard2DBlockShape, OFFSET$residencyStandard2DBlockShape, value);
    }

    public @unsigned int residencyStandard2DMultisampleBlockShape() {
        return segment.get(LAYOUT$residencyStandard2DMultisampleBlockShape, OFFSET$residencyStandard2DMultisampleBlockShape);
    }

    public void residencyStandard2DMultisampleBlockShape(@unsigned int value) {
        segment.set(LAYOUT$residencyStandard2DMultisampleBlockShape, OFFSET$residencyStandard2DMultisampleBlockShape, value);
    }

    public @unsigned int residencyStandard3DBlockShape() {
        return segment.get(LAYOUT$residencyStandard3DBlockShape, OFFSET$residencyStandard3DBlockShape);
    }

    public void residencyStandard3DBlockShape(@unsigned int value) {
        segment.set(LAYOUT$residencyStandard3DBlockShape, OFFSET$residencyStandard3DBlockShape, value);
    }

    public @unsigned int residencyAlignedMipSize() {
        return segment.get(LAYOUT$residencyAlignedMipSize, OFFSET$residencyAlignedMipSize);
    }

    public void residencyAlignedMipSize(@unsigned int value) {
        segment.set(LAYOUT$residencyAlignedMipSize, OFFSET$residencyAlignedMipSize, value);
    }

    public @unsigned int residencyNonResidentStrict() {
        return segment.get(LAYOUT$residencyNonResidentStrict, OFFSET$residencyNonResidentStrict);
    }

    public void residencyNonResidentStrict(@unsigned int value) {
        segment.set(LAYOUT$residencyNonResidentStrict, OFFSET$residencyNonResidentStrict, value);
    }

    public static VkPhysicalDeviceSparseProperties allocate(Arena arena) {
        return new VkPhysicalDeviceSparseProperties(arena.allocate(LAYOUT));
    }

    public static VkPhysicalDeviceSparseProperties[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkPhysicalDeviceSparseProperties[] ret = new VkPhysicalDeviceSparseProperties[count];
        for (int i = 0; i < count; i++) {
            ret[i] = new VkPhysicalDeviceSparseProperties(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static VkPhysicalDeviceSparseProperties clone(Arena arena, VkPhysicalDeviceSparseProperties src) {
        VkPhysicalDeviceSparseProperties ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkPhysicalDeviceSparseProperties[] clone(Arena arena, VkPhysicalDeviceSparseProperties[] src) {
        VkPhysicalDeviceSparseProperties[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("residencyStandard2DBlockShape"),
        ValueLayout.JAVA_INT.withName("residencyStandard2DMultisampleBlockShape"),
        ValueLayout.JAVA_INT.withName("residencyStandard3DBlockShape"),
        ValueLayout.JAVA_INT.withName("residencyAlignedMipSize"),
        ValueLayout.JAVA_INT.withName("residencyNonResidentStrict")
    );
    public static final long SIZE = LAYOUT.byteSize();

    public static final PathElement PATH$residencyStandard2DBlockShape = PathElement.groupElement("residencyStandard2DBlockShape");
    public static final PathElement PATH$residencyStandard2DMultisampleBlockShape = PathElement.groupElement("residencyStandard2DMultisampleBlockShape");
    public static final PathElement PATH$residencyStandard3DBlockShape = PathElement.groupElement("residencyStandard3DBlockShape");
    public static final PathElement PATH$residencyAlignedMipSize = PathElement.groupElement("residencyAlignedMipSize");
    public static final PathElement PATH$residencyNonResidentStrict = PathElement.groupElement("residencyNonResidentStrict");

    public static final OfInt LAYOUT$residencyStandard2DBlockShape = (OfInt) LAYOUT.select(PATH$residencyStandard2DBlockShape);
    public static final OfInt LAYOUT$residencyStandard2DMultisampleBlockShape = (OfInt) LAYOUT.select(PATH$residencyStandard2DMultisampleBlockShape);
    public static final OfInt LAYOUT$residencyStandard3DBlockShape = (OfInt) LAYOUT.select(PATH$residencyStandard3DBlockShape);
    public static final OfInt LAYOUT$residencyAlignedMipSize = (OfInt) LAYOUT.select(PATH$residencyAlignedMipSize);
    public static final OfInt LAYOUT$residencyNonResidentStrict = (OfInt) LAYOUT.select(PATH$residencyNonResidentStrict);

    public static final long OFFSET$residencyStandard2DBlockShape = LAYOUT.byteOffset(PATH$residencyStandard2DBlockShape);
    public static final long OFFSET$residencyStandard2DMultisampleBlockShape = LAYOUT.byteOffset(PATH$residencyStandard2DMultisampleBlockShape);
    public static final long OFFSET$residencyStandard3DBlockShape = LAYOUT.byteOffset(PATH$residencyStandard3DBlockShape);
    public static final long OFFSET$residencyAlignedMipSize = LAYOUT.byteOffset(PATH$residencyAlignedMipSize);
    public static final long OFFSET$residencyNonResidentStrict = LAYOUT.byteOffset(PATH$residencyNonResidentStrict);

    public static final long SIZE$residencyStandard2DBlockShape = LAYOUT$residencyStandard2DBlockShape.byteSize();
    public static final long SIZE$residencyStandard2DMultisampleBlockShape = LAYOUT$residencyStandard2DMultisampleBlockShape.byteSize();
    public static final long SIZE$residencyStandard3DBlockShape = LAYOUT$residencyStandard3DBlockShape.byteSize();
    public static final long SIZE$residencyAlignedMipSize = LAYOUT$residencyAlignedMipSize.byteSize();
    public static final long SIZE$residencyNonResidentStrict = LAYOUT$residencyNonResidentStrict.byteSize();
}
