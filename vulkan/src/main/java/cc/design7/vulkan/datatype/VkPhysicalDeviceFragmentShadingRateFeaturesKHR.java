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

/// Represents a pointer to a {@code VkPhysicalDeviceFragmentShadingRateFeaturesKHR} structure in native memory.
///
/// The property {@link #segment()} should always be not-null
/// (({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to)
/// {@code LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
/// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
///
/// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
/// perform any runtime check. The constructor can be useful for automatic code generators.
///
/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkPhysicalDeviceFragmentShadingRateFeaturesKHR.html">VkPhysicalDeviceFragmentShadingRateFeaturesKHR</a>
@ValueBasedCandidate
@UnsafeConstructor
public record VkPhysicalDeviceFragmentShadingRateFeaturesKHR(@NotNull MemorySegment segment) implements IPointer {
    public VkPhysicalDeviceFragmentShadingRateFeaturesKHR {
        sType(VkStructureType.PHYSICAL_DEVICE_FRAGMENT_SHADING_RATE_FEATURES_KHR);
    }

    public static VkPhysicalDeviceFragmentShadingRateFeaturesKHR allocate(Arena arena) {
        return new VkPhysicalDeviceFragmentShadingRateFeaturesKHR(arena.allocate(LAYOUT));
    }

    public static VkPhysicalDeviceFragmentShadingRateFeaturesKHR[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkPhysicalDeviceFragmentShadingRateFeaturesKHR[] ret = new VkPhysicalDeviceFragmentShadingRateFeaturesKHR[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkPhysicalDeviceFragmentShadingRateFeaturesKHR(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static VkPhysicalDeviceFragmentShadingRateFeaturesKHR clone(Arena arena, VkPhysicalDeviceFragmentShadingRateFeaturesKHR src) {
        VkPhysicalDeviceFragmentShadingRateFeaturesKHR ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkPhysicalDeviceFragmentShadingRateFeaturesKHR[] clone(Arena arena, VkPhysicalDeviceFragmentShadingRateFeaturesKHR[] src) {
        VkPhysicalDeviceFragmentShadingRateFeaturesKHR[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("pipelineFragmentShadingRate"),
        ValueLayout.JAVA_INT.withName("primitiveFragmentShadingRate"),
        ValueLayout.JAVA_INT.withName("attachmentFragmentShadingRate")
    );
    public static final long SIZE = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("PATH$sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("PATH$pNext");
    public static final PathElement PATH$pipelineFragmentShadingRate = PathElement.groupElement("PATH$pipelineFragmentShadingRate");
    public static final PathElement PATH$primitiveFragmentShadingRate = PathElement.groupElement("PATH$primitiveFragmentShadingRate");
    public static final PathElement PATH$attachmentFragmentShadingRate = PathElement.groupElement("PATH$attachmentFragmentShadingRate");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$pipelineFragmentShadingRate = (OfInt) LAYOUT.select(PATH$pipelineFragmentShadingRate);
    public static final OfInt LAYOUT$primitiveFragmentShadingRate = (OfInt) LAYOUT.select(PATH$primitiveFragmentShadingRate);
    public static final OfInt LAYOUT$attachmentFragmentShadingRate = (OfInt) LAYOUT.select(PATH$attachmentFragmentShadingRate);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$pipelineFragmentShadingRate = LAYOUT$pipelineFragmentShadingRate.byteSize();
    public static final long SIZE$primitiveFragmentShadingRate = LAYOUT$primitiveFragmentShadingRate.byteSize();
    public static final long SIZE$attachmentFragmentShadingRate = LAYOUT$attachmentFragmentShadingRate.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$pipelineFragmentShadingRate = LAYOUT.byteOffset(PATH$pipelineFragmentShadingRate);
    public static final long OFFSET$primitiveFragmentShadingRate = LAYOUT.byteOffset(PATH$primitiveFragmentShadingRate);
    public static final long OFFSET$attachmentFragmentShadingRate = LAYOUT.byteOffset(PATH$attachmentFragmentShadingRate);

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

    public @unsigned int pipelineFragmentShadingRate() {
        return segment.get(LAYOUT$pipelineFragmentShadingRate, OFFSET$pipelineFragmentShadingRate);
    }

    public void pipelineFragmentShadingRate(@unsigned int value) {
        segment.set(LAYOUT$pipelineFragmentShadingRate, OFFSET$pipelineFragmentShadingRate, value);
    }

    public @unsigned int primitiveFragmentShadingRate() {
        return segment.get(LAYOUT$primitiveFragmentShadingRate, OFFSET$primitiveFragmentShadingRate);
    }

    public void primitiveFragmentShadingRate(@unsigned int value) {
        segment.set(LAYOUT$primitiveFragmentShadingRate, OFFSET$primitiveFragmentShadingRate, value);
    }

    public @unsigned int attachmentFragmentShadingRate() {
        return segment.get(LAYOUT$attachmentFragmentShadingRate, OFFSET$attachmentFragmentShadingRate);
    }

    public void attachmentFragmentShadingRate(@unsigned int value) {
        segment.set(LAYOUT$attachmentFragmentShadingRate, OFFSET$attachmentFragmentShadingRate, value);
    }

}
