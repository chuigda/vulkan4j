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

/// Represents a pointer to a <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkPhysicalDeviceImageProcessing2FeaturesQCOM.html"><code>VkPhysicalDeviceImageProcessing2FeaturesQCOM</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct VkPhysicalDeviceImageProcessing2FeaturesQCOM {
///     VkStructureType sType; // @link substring="VkStructureType" target="VkStructureType" @link substring="sType" target="#sType"
///     void* pNext; // optional // @link substring="pNext" target="#pNext"
///     VkBool32 textureBlockMatch2; // @link substring="textureBlockMatch2" target="#textureBlockMatch2"
/// } VkPhysicalDeviceImageProcessing2FeaturesQCOM;
/// }
///
/// ## Auto initialization
/// This structure has the following members that can be automatically initialized:
/// - `sType = VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_IMAGE_PROCESSING_2_FEATURES_QCOM`
///
/// The {@code allocate} ({@link VkPhysicalDeviceImageProcessing2FeaturesQCOM#allocate(Arena)}, {@link VkPhysicalDeviceImageProcessing2FeaturesQCOM#allocate(Arena, int)})
/// functions will automatically initialize these fields. Also, you may call {@link VkPhysicalDeviceImageProcessing2FeaturesQCOM#autoInit}
/// to initialize these fields manually for non-allocated instances.
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
/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkPhysicalDeviceImageProcessing2FeaturesQCOM.html"><code>VkPhysicalDeviceImageProcessing2FeaturesQCOM</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record VkPhysicalDeviceImageProcessing2FeaturesQCOM(@NotNull MemorySegment segment) implements IPointer {
    public static VkPhysicalDeviceImageProcessing2FeaturesQCOM allocate(Arena arena) {
        VkPhysicalDeviceImageProcessing2FeaturesQCOM ret = new VkPhysicalDeviceImageProcessing2FeaturesQCOM(arena.allocate(LAYOUT));
        ret.sType(VkStructureType.PHYSICAL_DEVICE_IMAGE_PROCESSING_2_FEATURES_QCOM);
        return ret;
    }

    public static VkPhysicalDeviceImageProcessing2FeaturesQCOM[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkPhysicalDeviceImageProcessing2FeaturesQCOM[] ret = new VkPhysicalDeviceImageProcessing2FeaturesQCOM[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkPhysicalDeviceImageProcessing2FeaturesQCOM(segment.asSlice(i * BYTES, BYTES));
            ret[i].sType(VkStructureType.PHYSICAL_DEVICE_IMAGE_PROCESSING_2_FEATURES_QCOM);
        }
        return ret;
    }

    public static VkPhysicalDeviceImageProcessing2FeaturesQCOM clone(Arena arena, VkPhysicalDeviceImageProcessing2FeaturesQCOM src) {
        VkPhysicalDeviceImageProcessing2FeaturesQCOM ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkPhysicalDeviceImageProcessing2FeaturesQCOM[] clone(Arena arena, VkPhysicalDeviceImageProcessing2FeaturesQCOM[] src) {
        VkPhysicalDeviceImageProcessing2FeaturesQCOM[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public void autoInit() {
        sType(VkStructureType.PHYSICAL_DEVICE_IMAGE_PROCESSING_2_FEATURES_QCOM);
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

    public @unsigned int textureBlockMatch2() {
        return segment.get(LAYOUT$textureBlockMatch2, OFFSET$textureBlockMatch2);
    }

    public void textureBlockMatch2(@unsigned int value) {
        segment.set(LAYOUT$textureBlockMatch2, OFFSET$textureBlockMatch2, value);
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("textureBlockMatch2")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("PATH$sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("PATH$pNext");
    public static final PathElement PATH$textureBlockMatch2 = PathElement.groupElement("PATH$textureBlockMatch2");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$textureBlockMatch2 = (OfInt) LAYOUT.select(PATH$textureBlockMatch2);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$textureBlockMatch2 = LAYOUT$textureBlockMatch2.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$textureBlockMatch2 = LAYOUT.byteOffset(PATH$textureBlockMatch2);
}
