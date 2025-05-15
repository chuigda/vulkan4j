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

/// Represents a pointer to a <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkPhysicalDeviceFragmentShaderInterlockFeaturesEXT.html"><code>VkPhysicalDeviceFragmentShaderInterlockFeaturesEXT</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct VkPhysicalDeviceFragmentShaderInterlockFeaturesEXT {
///     VkStructureType sType;
///     void* pNext;
///     VkBool32 fragmentShaderSampleInterlock;
///     VkBool32 fragmentShaderPixelInterlock;
///     VkBool32 fragmentShaderShadingRateInterlock;
/// } VkPhysicalDeviceFragmentShaderInterlockFeaturesEXT;
/// }
///
/// ## Auto initialization
/// This structure has the following members that can be automatically initialized:
/// - `sType = VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_FRAGMENT_SHADER_INTERLOCK_FEATURES_EXT`
///
/// The {@link VkPhysicalDeviceFragmentShaderInterlockFeaturesEXT#allocate} functions will automatically initialize these fields.
/// Also, you may call {@link VkPhysicalDeviceFragmentShaderInterlockFeaturesEXT#autoInit} to initialize these fields manually for
/// non-allocated instances.
///
/// ## Contracts
/// The property {@link #segment()} should always be not-null
/// (({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to)
/// {@code LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
/// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
///
/// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
/// perform any runtime check. The constructor can be useful for automatic code generators.
///
/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkPhysicalDeviceFragmentShaderInterlockFeaturesEXT.html"><code>VkPhysicalDeviceFragmentShaderInterlockFeaturesEXT</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record VkPhysicalDeviceFragmentShaderInterlockFeaturesEXT(@NotNull MemorySegment segment) implements IPointer {
    public static VkPhysicalDeviceFragmentShaderInterlockFeaturesEXT allocate(Arena arena) {
        VkPhysicalDeviceFragmentShaderInterlockFeaturesEXT ret = new VkPhysicalDeviceFragmentShaderInterlockFeaturesEXT(arena.allocate(LAYOUT));
        ret.sType(VkStructureType.PHYSICAL_DEVICE_FRAGMENT_SHADER_INTERLOCK_FEATURES_EXT);
        return ret;
    }

    public static VkPhysicalDeviceFragmentShaderInterlockFeaturesEXT[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkPhysicalDeviceFragmentShaderInterlockFeaturesEXT[] ret = new VkPhysicalDeviceFragmentShaderInterlockFeaturesEXT[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkPhysicalDeviceFragmentShaderInterlockFeaturesEXT(segment.asSlice(i * BYTES, BYTES));
            ret[i].sType(VkStructureType.PHYSICAL_DEVICE_FRAGMENT_SHADER_INTERLOCK_FEATURES_EXT);
        }
        return ret;
    }

    public static VkPhysicalDeviceFragmentShaderInterlockFeaturesEXT clone(Arena arena, VkPhysicalDeviceFragmentShaderInterlockFeaturesEXT src) {
        VkPhysicalDeviceFragmentShaderInterlockFeaturesEXT ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkPhysicalDeviceFragmentShaderInterlockFeaturesEXT[] clone(Arena arena, VkPhysicalDeviceFragmentShaderInterlockFeaturesEXT[] src) {
        VkPhysicalDeviceFragmentShaderInterlockFeaturesEXT[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public void autoInit() {
        sType(VkStructureType.PHYSICAL_DEVICE_FRAGMENT_SHADER_INTERLOCK_FEATURES_EXT);
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

    public void pNext(IPointer pointer) {
        pNext(pointer.segment());
    }

    public @unsigned int fragmentShaderSampleInterlock() {
        return segment.get(LAYOUT$fragmentShaderSampleInterlock, OFFSET$fragmentShaderSampleInterlock);
    }

    public void fragmentShaderSampleInterlock(@unsigned int value) {
        segment.set(LAYOUT$fragmentShaderSampleInterlock, OFFSET$fragmentShaderSampleInterlock, value);
    }

    public @unsigned int fragmentShaderPixelInterlock() {
        return segment.get(LAYOUT$fragmentShaderPixelInterlock, OFFSET$fragmentShaderPixelInterlock);
    }

    public void fragmentShaderPixelInterlock(@unsigned int value) {
        segment.set(LAYOUT$fragmentShaderPixelInterlock, OFFSET$fragmentShaderPixelInterlock, value);
    }

    public @unsigned int fragmentShaderShadingRateInterlock() {
        return segment.get(LAYOUT$fragmentShaderShadingRateInterlock, OFFSET$fragmentShaderShadingRateInterlock);
    }

    public void fragmentShaderShadingRateInterlock(@unsigned int value) {
        segment.set(LAYOUT$fragmentShaderShadingRateInterlock, OFFSET$fragmentShaderShadingRateInterlock, value);
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("fragmentShaderSampleInterlock"),
        ValueLayout.JAVA_INT.withName("fragmentShaderPixelInterlock"),
        ValueLayout.JAVA_INT.withName("fragmentShaderShadingRateInterlock")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("PATH$sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("PATH$pNext");
    public static final PathElement PATH$fragmentShaderSampleInterlock = PathElement.groupElement("PATH$fragmentShaderSampleInterlock");
    public static final PathElement PATH$fragmentShaderPixelInterlock = PathElement.groupElement("PATH$fragmentShaderPixelInterlock");
    public static final PathElement PATH$fragmentShaderShadingRateInterlock = PathElement.groupElement("PATH$fragmentShaderShadingRateInterlock");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$fragmentShaderSampleInterlock = (OfInt) LAYOUT.select(PATH$fragmentShaderSampleInterlock);
    public static final OfInt LAYOUT$fragmentShaderPixelInterlock = (OfInt) LAYOUT.select(PATH$fragmentShaderPixelInterlock);
    public static final OfInt LAYOUT$fragmentShaderShadingRateInterlock = (OfInt) LAYOUT.select(PATH$fragmentShaderShadingRateInterlock);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$fragmentShaderSampleInterlock = LAYOUT$fragmentShaderSampleInterlock.byteSize();
    public static final long SIZE$fragmentShaderPixelInterlock = LAYOUT$fragmentShaderPixelInterlock.byteSize();
    public static final long SIZE$fragmentShaderShadingRateInterlock = LAYOUT$fragmentShaderShadingRateInterlock.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$fragmentShaderSampleInterlock = LAYOUT.byteOffset(PATH$fragmentShaderSampleInterlock);
    public static final long OFFSET$fragmentShaderPixelInterlock = LAYOUT.byteOffset(PATH$fragmentShaderPixelInterlock);
    public static final long OFFSET$fragmentShaderShadingRateInterlock = LAYOUT.byteOffset(PATH$fragmentShaderShadingRateInterlock);
}
