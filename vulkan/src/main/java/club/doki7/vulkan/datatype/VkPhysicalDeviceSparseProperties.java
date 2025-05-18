package club.doki7.vulkan.datatype;

import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;

import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.NotNull;
import club.doki7.ffm.IPointer;
import club.doki7.ffm.NativeLayout;
import club.doki7.ffm.annotation.*;
import club.doki7.ffm.ptr.*;
import club.doki7.vulkan.bitmask.*;
import club.doki7.vulkan.handle.*;
import club.doki7.vulkan.enumtype.*;
import static club.doki7.vulkan.VkConstants.*;

/// Represents a pointer to a <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkPhysicalDeviceSparseProperties.html"><code>VkPhysicalDeviceSparseProperties</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct VkPhysicalDeviceSparseProperties {
///     VkBool32 residencyStandard2DBlockShape; // @link substring="residencyStandard2DBlockShape" target="#residencyStandard2DBlockShape"
///     VkBool32 residencyStandard2DMultisampleBlockShape; // @link substring="residencyStandard2DMultisampleBlockShape" target="#residencyStandard2DMultisampleBlockShape"
///     VkBool32 residencyStandard3DBlockShape; // @link substring="residencyStandard3DBlockShape" target="#residencyStandard3DBlockShape"
///     VkBool32 residencyAlignedMipSize; // @link substring="residencyAlignedMipSize" target="#residencyAlignedMipSize"
///     VkBool32 residencyNonResidentStrict; // @link substring="residencyNonResidentStrict" target="#residencyNonResidentStrict"
/// } VkPhysicalDeviceSparseProperties;
/// }
///
/// ## Contracts
///
/// The property {@link #segment()} should always be not-null
/// (({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to)
/// {@code LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
/// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
///
/// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
/// perform any runtime check. The constructor can be useful for automatic code generators.
///
/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkPhysicalDeviceSparseProperties.html"><code>VkPhysicalDeviceSparseProperties</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record VkPhysicalDeviceSparseProperties(@NotNull MemorySegment segment) implements IPointer {
    public static VkPhysicalDeviceSparseProperties allocate(Arena arena) {
        return new VkPhysicalDeviceSparseProperties(arena.allocate(LAYOUT));
    }

    public static VkPhysicalDeviceSparseProperties[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkPhysicalDeviceSparseProperties[] ret = new VkPhysicalDeviceSparseProperties[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkPhysicalDeviceSparseProperties(segment.asSlice(i * BYTES, BYTES));
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
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
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

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("residencyStandard2DBlockShape"),
        ValueLayout.JAVA_INT.withName("residencyStandard2DMultisampleBlockShape"),
        ValueLayout.JAVA_INT.withName("residencyStandard3DBlockShape"),
        ValueLayout.JAVA_INT.withName("residencyAlignedMipSize"),
        ValueLayout.JAVA_INT.withName("residencyNonResidentStrict")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$residencyStandard2DBlockShape = PathElement.groupElement("PATH$residencyStandard2DBlockShape");
    public static final PathElement PATH$residencyStandard2DMultisampleBlockShape = PathElement.groupElement("PATH$residencyStandard2DMultisampleBlockShape");
    public static final PathElement PATH$residencyStandard3DBlockShape = PathElement.groupElement("PATH$residencyStandard3DBlockShape");
    public static final PathElement PATH$residencyAlignedMipSize = PathElement.groupElement("PATH$residencyAlignedMipSize");
    public static final PathElement PATH$residencyNonResidentStrict = PathElement.groupElement("PATH$residencyNonResidentStrict");

    public static final OfInt LAYOUT$residencyStandard2DBlockShape = (OfInt) LAYOUT.select(PATH$residencyStandard2DBlockShape);
    public static final OfInt LAYOUT$residencyStandard2DMultisampleBlockShape = (OfInt) LAYOUT.select(PATH$residencyStandard2DMultisampleBlockShape);
    public static final OfInt LAYOUT$residencyStandard3DBlockShape = (OfInt) LAYOUT.select(PATH$residencyStandard3DBlockShape);
    public static final OfInt LAYOUT$residencyAlignedMipSize = (OfInt) LAYOUT.select(PATH$residencyAlignedMipSize);
    public static final OfInt LAYOUT$residencyNonResidentStrict = (OfInt) LAYOUT.select(PATH$residencyNonResidentStrict);

    public static final long SIZE$residencyStandard2DBlockShape = LAYOUT$residencyStandard2DBlockShape.byteSize();
    public static final long SIZE$residencyStandard2DMultisampleBlockShape = LAYOUT$residencyStandard2DMultisampleBlockShape.byteSize();
    public static final long SIZE$residencyStandard3DBlockShape = LAYOUT$residencyStandard3DBlockShape.byteSize();
    public static final long SIZE$residencyAlignedMipSize = LAYOUT$residencyAlignedMipSize.byteSize();
    public static final long SIZE$residencyNonResidentStrict = LAYOUT$residencyNonResidentStrict.byteSize();

    public static final long OFFSET$residencyStandard2DBlockShape = LAYOUT.byteOffset(PATH$residencyStandard2DBlockShape);
    public static final long OFFSET$residencyStandard2DMultisampleBlockShape = LAYOUT.byteOffset(PATH$residencyStandard2DMultisampleBlockShape);
    public static final long OFFSET$residencyStandard3DBlockShape = LAYOUT.byteOffset(PATH$residencyStandard3DBlockShape);
    public static final long OFFSET$residencyAlignedMipSize = LAYOUT.byteOffset(PATH$residencyAlignedMipSize);
    public static final long OFFSET$residencyNonResidentStrict = LAYOUT.byteOffset(PATH$residencyNonResidentStrict);
}
