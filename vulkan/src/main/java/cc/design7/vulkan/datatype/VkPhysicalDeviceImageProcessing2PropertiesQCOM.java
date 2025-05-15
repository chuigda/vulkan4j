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

/// Represents a pointer to a <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkPhysicalDeviceImageProcessing2PropertiesQCOM.html"><code>VkPhysicalDeviceImageProcessing2PropertiesQCOM</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct VkPhysicalDeviceImageProcessing2PropertiesQCOM {
///     VkStructureType sType;
///     void* pNext; // optional
///     VkExtent2D maxBlockMatchWindow; // optional
/// } VkPhysicalDeviceImageProcessing2PropertiesQCOM;
/// }
///
/// ## Auto initialization
/// This structure has the following members that can be automatically initialized:
/// - `sType = VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_IMAGE_PROCESSING_2_PROPERTIES_QCOM`
///
/// The {@link VkPhysicalDeviceImageProcessing2PropertiesQCOM#allocate} functions will automatically initialize these fields.
/// Also, you may call {@link VkPhysicalDeviceImageProcessing2PropertiesQCOM#autoInit} to initialize these fields manually for
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
/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkPhysicalDeviceImageProcessing2PropertiesQCOM.html"><code>VkPhysicalDeviceImageProcessing2PropertiesQCOM</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record VkPhysicalDeviceImageProcessing2PropertiesQCOM(@NotNull MemorySegment segment) implements IPointer {
    public static VkPhysicalDeviceImageProcessing2PropertiesQCOM allocate(Arena arena) {
        VkPhysicalDeviceImageProcessing2PropertiesQCOM ret = new VkPhysicalDeviceImageProcessing2PropertiesQCOM(arena.allocate(LAYOUT));
        ret.sType(VkStructureType.PHYSICAL_DEVICE_IMAGE_PROCESSING_2_PROPERTIES_QCOM);
        return ret;
    }

    public static VkPhysicalDeviceImageProcessing2PropertiesQCOM[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkPhysicalDeviceImageProcessing2PropertiesQCOM[] ret = new VkPhysicalDeviceImageProcessing2PropertiesQCOM[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkPhysicalDeviceImageProcessing2PropertiesQCOM(segment.asSlice(i * BYTES, BYTES));
            ret[i].sType(VkStructureType.PHYSICAL_DEVICE_IMAGE_PROCESSING_2_PROPERTIES_QCOM);
        }
        return ret;
    }

    public static VkPhysicalDeviceImageProcessing2PropertiesQCOM clone(Arena arena, VkPhysicalDeviceImageProcessing2PropertiesQCOM src) {
        VkPhysicalDeviceImageProcessing2PropertiesQCOM ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkPhysicalDeviceImageProcessing2PropertiesQCOM[] clone(Arena arena, VkPhysicalDeviceImageProcessing2PropertiesQCOM[] src) {
        VkPhysicalDeviceImageProcessing2PropertiesQCOM[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public void autoInit() {
        sType(VkStructureType.PHYSICAL_DEVICE_IMAGE_PROCESSING_2_PROPERTIES_QCOM);
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

    public VkExtent2D maxBlockMatchWindow() {
        return new VkExtent2D(segment.asSlice(OFFSET$maxBlockMatchWindow, LAYOUT$maxBlockMatchWindow));
    }

    public void maxBlockMatchWindow(VkExtent2D value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$maxBlockMatchWindow, SIZE$maxBlockMatchWindow);
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        VkExtent2D.LAYOUT.withName("maxBlockMatchWindow")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("PATH$sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("PATH$pNext");
    public static final PathElement PATH$maxBlockMatchWindow = PathElement.groupElement("PATH$maxBlockMatchWindow");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final StructLayout LAYOUT$maxBlockMatchWindow = (StructLayout) LAYOUT.select(PATH$maxBlockMatchWindow);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$maxBlockMatchWindow = LAYOUT$maxBlockMatchWindow.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$maxBlockMatchWindow = LAYOUT.byteOffset(PATH$maxBlockMatchWindow);
}
