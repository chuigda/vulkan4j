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

/// Represents a pointer to a {@code VkPhysicalDeviceVertexAttributeDivisorFeatures} structure in native memory.
///
/// The property {@link #segment()} should always be not-null
/// (({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to)
/// {@code LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
/// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
///
/// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
/// perform any runtime check. The constructor can be useful for automatic code generators.
///
/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkPhysicalDeviceVertexAttributeDivisorFeatures.html">VkPhysicalDeviceVertexAttributeDivisorFeatures</a>
@ValueBasedCandidate
@UnsafeConstructor
public record VkPhysicalDeviceVertexAttributeDivisorFeatures(@NotNull MemorySegment segment) implements IPointer {
    public VkPhysicalDeviceVertexAttributeDivisorFeatures {
        sType(VkStructureType.PHYSICAL_DEVICE_VERTEX_ATTRIBUTE_DIVISOR_FEATURES);
    }

    public static VkPhysicalDeviceVertexAttributeDivisorFeatures allocate(Arena arena) {
        return new VkPhysicalDeviceVertexAttributeDivisorFeatures(arena.allocate(LAYOUT));
    }

    public static VkPhysicalDeviceVertexAttributeDivisorFeatures[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkPhysicalDeviceVertexAttributeDivisorFeatures[] ret = new VkPhysicalDeviceVertexAttributeDivisorFeatures[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkPhysicalDeviceVertexAttributeDivisorFeatures(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static VkPhysicalDeviceVertexAttributeDivisorFeatures clone(Arena arena, VkPhysicalDeviceVertexAttributeDivisorFeatures src) {
        VkPhysicalDeviceVertexAttributeDivisorFeatures ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkPhysicalDeviceVertexAttributeDivisorFeatures[] clone(Arena arena, VkPhysicalDeviceVertexAttributeDivisorFeatures[] src) {
        VkPhysicalDeviceVertexAttributeDivisorFeatures[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("vertexAttributeInstanceRateDivisor"),
        ValueLayout.JAVA_INT.withName("vertexAttributeInstanceRateZeroDivisor")
    );
    public static final long SIZE = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("PATH$sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("PATH$pNext");
    public static final PathElement PATH$vertexAttributeInstanceRateDivisor = PathElement.groupElement("PATH$vertexAttributeInstanceRateDivisor");
    public static final PathElement PATH$vertexAttributeInstanceRateZeroDivisor = PathElement.groupElement("PATH$vertexAttributeInstanceRateZeroDivisor");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$vertexAttributeInstanceRateDivisor = (OfInt) LAYOUT.select(PATH$vertexAttributeInstanceRateDivisor);
    public static final OfInt LAYOUT$vertexAttributeInstanceRateZeroDivisor = (OfInt) LAYOUT.select(PATH$vertexAttributeInstanceRateZeroDivisor);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$vertexAttributeInstanceRateDivisor = LAYOUT$vertexAttributeInstanceRateDivisor.byteSize();
    public static final long SIZE$vertexAttributeInstanceRateZeroDivisor = LAYOUT$vertexAttributeInstanceRateZeroDivisor.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$vertexAttributeInstanceRateDivisor = LAYOUT.byteOffset(PATH$vertexAttributeInstanceRateDivisor);
    public static final long OFFSET$vertexAttributeInstanceRateZeroDivisor = LAYOUT.byteOffset(PATH$vertexAttributeInstanceRateZeroDivisor);

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

    public @unsigned int vertexAttributeInstanceRateDivisor() {
        return segment.get(LAYOUT$vertexAttributeInstanceRateDivisor, OFFSET$vertexAttributeInstanceRateDivisor);
    }

    public void vertexAttributeInstanceRateDivisor(@unsigned int value) {
        segment.set(LAYOUT$vertexAttributeInstanceRateDivisor, OFFSET$vertexAttributeInstanceRateDivisor, value);
    }

    public @unsigned int vertexAttributeInstanceRateZeroDivisor() {
        return segment.get(LAYOUT$vertexAttributeInstanceRateZeroDivisor, OFFSET$vertexAttributeInstanceRateZeroDivisor);
    }

    public void vertexAttributeInstanceRateZeroDivisor(@unsigned int value) {
        segment.set(LAYOUT$vertexAttributeInstanceRateZeroDivisor, OFFSET$vertexAttributeInstanceRateZeroDivisor, value);
    }

}
