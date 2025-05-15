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

/// Represents a pointer to a <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkPhysicalDevice4444FormatsFeaturesEXT.html"><code>VkPhysicalDevice4444FormatsFeaturesEXT</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct VkPhysicalDevice4444FormatsFeaturesEXT {
///     VkStructureType sType;
///     void* pNext; // optional
///     VkBool32 formatA4R4G4B4;
///     VkBool32 formatA4B4G4R4;
/// } VkPhysicalDevice4444FormatsFeaturesEXT;
/// }
///
/// ## Auto initialization
/// This structure has the following members that can be automatically initialized:
/// - `sType = VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_4444_FORMATS_FEATURES_EXT`
///
/// The {@link VkPhysicalDevice4444FormatsFeaturesEXT#allocate} functions will automatically initialize these fields.
/// Also, you may call {@link VkPhysicalDevice4444FormatsFeaturesEXT#autoInit} to initialize these fields manually for
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
/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkPhysicalDevice4444FormatsFeaturesEXT.html"><code>VkPhysicalDevice4444FormatsFeaturesEXT</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record VkPhysicalDevice4444FormatsFeaturesEXT(@NotNull MemorySegment segment) implements IPointer {
    public static VkPhysicalDevice4444FormatsFeaturesEXT allocate(Arena arena) {
        VkPhysicalDevice4444FormatsFeaturesEXT ret = new VkPhysicalDevice4444FormatsFeaturesEXT(arena.allocate(LAYOUT));
        ret.sType(VkStructureType.PHYSICAL_DEVICE_4444_FORMATS_FEATURES_EXT);
        return ret;
    }

    public static VkPhysicalDevice4444FormatsFeaturesEXT[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkPhysicalDevice4444FormatsFeaturesEXT[] ret = new VkPhysicalDevice4444FormatsFeaturesEXT[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkPhysicalDevice4444FormatsFeaturesEXT(segment.asSlice(i * BYTES, BYTES));
            ret[i].sType(VkStructureType.PHYSICAL_DEVICE_4444_FORMATS_FEATURES_EXT);
        }
        return ret;
    }

    public static VkPhysicalDevice4444FormatsFeaturesEXT clone(Arena arena, VkPhysicalDevice4444FormatsFeaturesEXT src) {
        VkPhysicalDevice4444FormatsFeaturesEXT ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkPhysicalDevice4444FormatsFeaturesEXT[] clone(Arena arena, VkPhysicalDevice4444FormatsFeaturesEXT[] src) {
        VkPhysicalDevice4444FormatsFeaturesEXT[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public void autoInit() {
        sType(VkStructureType.PHYSICAL_DEVICE_4444_FORMATS_FEATURES_EXT);
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

    public @unsigned int formatA4R4G4B4() {
        return segment.get(LAYOUT$formatA4R4G4B4, OFFSET$formatA4R4G4B4);
    }

    public void formatA4R4G4B4(@unsigned int value) {
        segment.set(LAYOUT$formatA4R4G4B4, OFFSET$formatA4R4G4B4, value);
    }

    public @unsigned int formatA4B4G4R4() {
        return segment.get(LAYOUT$formatA4B4G4R4, OFFSET$formatA4B4G4R4);
    }

    public void formatA4B4G4R4(@unsigned int value) {
        segment.set(LAYOUT$formatA4B4G4R4, OFFSET$formatA4B4G4R4, value);
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("formatA4R4G4B4"),
        ValueLayout.JAVA_INT.withName("formatA4B4G4R4")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("PATH$sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("PATH$pNext");
    public static final PathElement PATH$formatA4R4G4B4 = PathElement.groupElement("PATH$formatA4R4G4B4");
    public static final PathElement PATH$formatA4B4G4R4 = PathElement.groupElement("PATH$formatA4B4G4R4");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$formatA4R4G4B4 = (OfInt) LAYOUT.select(PATH$formatA4R4G4B4);
    public static final OfInt LAYOUT$formatA4B4G4R4 = (OfInt) LAYOUT.select(PATH$formatA4B4G4R4);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$formatA4R4G4B4 = LAYOUT$formatA4R4G4B4.byteSize();
    public static final long SIZE$formatA4B4G4R4 = LAYOUT$formatA4B4G4R4.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$formatA4R4G4B4 = LAYOUT.byteOffset(PATH$formatA4R4G4B4);
    public static final long OFFSET$formatA4B4G4R4 = LAYOUT.byteOffset(PATH$formatA4B4G4R4);
}
