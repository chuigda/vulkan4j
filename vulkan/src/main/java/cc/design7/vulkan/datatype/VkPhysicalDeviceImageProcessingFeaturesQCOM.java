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
import cc.design7.vulkan.handle.*;
import cc.design7.vulkan.enumtype.*;
import static cc.design7.vulkan.VkConstants.*;

/// Represents a pointer to a <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkPhysicalDeviceImageProcessingFeaturesQCOM.html"><code>VkPhysicalDeviceImageProcessingFeaturesQCOM</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct VkPhysicalDeviceImageProcessingFeaturesQCOM {
///     VkStructureType sType;
///     void* pNext; // optional
///     VkBool32 textureSampleWeighted;
///     VkBool32 textureBoxFilter;
///     VkBool32 textureBlockMatch;
/// } VkPhysicalDeviceImageProcessingFeaturesQCOM;
/// }
///
/// ## Auto initialization
/// This structure has the following members that can be automatically initialized:
/// - `sType = VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_IMAGE_PROCESSING_FEATURES_QCOM`
///
/// The {@link VkPhysicalDeviceImageProcessingFeaturesQCOM#allocate} functions will automatically initialize these fields.
/// Also, you may call {@link VkPhysicalDeviceImageProcessingFeaturesQCOM#autoInit} to initialize these fields manually for
/// non-allocated instances.
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
/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkPhysicalDeviceImageProcessingFeaturesQCOM.html"><code>VkPhysicalDeviceImageProcessingFeaturesQCOM</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record VkPhysicalDeviceImageProcessingFeaturesQCOM(@NotNull MemorySegment segment) implements IPointer {
    public static VkPhysicalDeviceImageProcessingFeaturesQCOM allocate(Arena arena) {
        VkPhysicalDeviceImageProcessingFeaturesQCOM ret = new VkPhysicalDeviceImageProcessingFeaturesQCOM(arena.allocate(LAYOUT));
        ret.sType(VkStructureType.PHYSICAL_DEVICE_IMAGE_PROCESSING_FEATURES_QCOM);
        return ret;
    }

    public static VkPhysicalDeviceImageProcessingFeaturesQCOM[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkPhysicalDeviceImageProcessingFeaturesQCOM[] ret = new VkPhysicalDeviceImageProcessingFeaturesQCOM[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkPhysicalDeviceImageProcessingFeaturesQCOM(segment.asSlice(i * BYTES, BYTES));
            ret[i].sType(VkStructureType.PHYSICAL_DEVICE_IMAGE_PROCESSING_FEATURES_QCOM);
        }
        return ret;
    }

    public static VkPhysicalDeviceImageProcessingFeaturesQCOM clone(Arena arena, VkPhysicalDeviceImageProcessingFeaturesQCOM src) {
        VkPhysicalDeviceImageProcessingFeaturesQCOM ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkPhysicalDeviceImageProcessingFeaturesQCOM[] clone(Arena arena, VkPhysicalDeviceImageProcessingFeaturesQCOM[] src) {
        VkPhysicalDeviceImageProcessingFeaturesQCOM[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public void autoInit() {
        sType(VkStructureType.PHYSICAL_DEVICE_IMAGE_PROCESSING_FEATURES_QCOM);
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
        pNext(pointer != null ? pointer.segment() : MemorySegment.NULL);
    }

    public @unsigned int textureSampleWeighted() {
        return segment.get(LAYOUT$textureSampleWeighted, OFFSET$textureSampleWeighted);
    }

    public void textureSampleWeighted(@unsigned int value) {
        segment.set(LAYOUT$textureSampleWeighted, OFFSET$textureSampleWeighted, value);
    }

    public @unsigned int textureBoxFilter() {
        return segment.get(LAYOUT$textureBoxFilter, OFFSET$textureBoxFilter);
    }

    public void textureBoxFilter(@unsigned int value) {
        segment.set(LAYOUT$textureBoxFilter, OFFSET$textureBoxFilter, value);
    }

    public @unsigned int textureBlockMatch() {
        return segment.get(LAYOUT$textureBlockMatch, OFFSET$textureBlockMatch);
    }

    public void textureBlockMatch(@unsigned int value) {
        segment.set(LAYOUT$textureBlockMatch, OFFSET$textureBlockMatch, value);
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("textureSampleWeighted"),
        ValueLayout.JAVA_INT.withName("textureBoxFilter"),
        ValueLayout.JAVA_INT.withName("textureBlockMatch")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("PATH$sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("PATH$pNext");
    public static final PathElement PATH$textureSampleWeighted = PathElement.groupElement("PATH$textureSampleWeighted");
    public static final PathElement PATH$textureBoxFilter = PathElement.groupElement("PATH$textureBoxFilter");
    public static final PathElement PATH$textureBlockMatch = PathElement.groupElement("PATH$textureBlockMatch");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$textureSampleWeighted = (OfInt) LAYOUT.select(PATH$textureSampleWeighted);
    public static final OfInt LAYOUT$textureBoxFilter = (OfInt) LAYOUT.select(PATH$textureBoxFilter);
    public static final OfInt LAYOUT$textureBlockMatch = (OfInt) LAYOUT.select(PATH$textureBlockMatch);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$textureSampleWeighted = LAYOUT$textureSampleWeighted.byteSize();
    public static final long SIZE$textureBoxFilter = LAYOUT$textureBoxFilter.byteSize();
    public static final long SIZE$textureBlockMatch = LAYOUT$textureBlockMatch.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$textureSampleWeighted = LAYOUT.byteOffset(PATH$textureSampleWeighted);
    public static final long OFFSET$textureBoxFilter = LAYOUT.byteOffset(PATH$textureBoxFilter);
    public static final long OFFSET$textureBlockMatch = LAYOUT.byteOffset(PATH$textureBlockMatch);
}
