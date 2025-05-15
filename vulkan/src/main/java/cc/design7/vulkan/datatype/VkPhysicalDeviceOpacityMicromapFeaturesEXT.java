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

/// Represents a pointer to a <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkPhysicalDeviceOpacityMicromapFeaturesEXT.html"><code>VkPhysicalDeviceOpacityMicromapFeaturesEXT</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct VkPhysicalDeviceOpacityMicromapFeaturesEXT {
///     VkStructureType sType;
///     void* pNext; // optional
///     VkBool32 micromap;
///     VkBool32 micromapCaptureReplay;
///     VkBool32 micromapHostCommands;
/// } VkPhysicalDeviceOpacityMicromapFeaturesEXT;
/// }
///
/// ## Auto initialization
/// This structure has the following members that can be automatically initialized:
/// - `sType = VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_OPACITY_MICROMAP_FEATURES_EXT`
///
/// The {@link VkPhysicalDeviceOpacityMicromapFeaturesEXT#allocate} functions will automatically initialize these fields.
/// Also, you may call {@link VkPhysicalDeviceOpacityMicromapFeaturesEXT#autoInit} to initialize these fields manually for
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
/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkPhysicalDeviceOpacityMicromapFeaturesEXT.html"><code>VkPhysicalDeviceOpacityMicromapFeaturesEXT</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record VkPhysicalDeviceOpacityMicromapFeaturesEXT(@NotNull MemorySegment segment) implements IPointer {
    public static VkPhysicalDeviceOpacityMicromapFeaturesEXT allocate(Arena arena) {
        VkPhysicalDeviceOpacityMicromapFeaturesEXT ret = new VkPhysicalDeviceOpacityMicromapFeaturesEXT(arena.allocate(LAYOUT));
        ret.sType(VkStructureType.PHYSICAL_DEVICE_OPACITY_MICROMAP_FEATURES_EXT);
        return ret;
    }

    public static VkPhysicalDeviceOpacityMicromapFeaturesEXT[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkPhysicalDeviceOpacityMicromapFeaturesEXT[] ret = new VkPhysicalDeviceOpacityMicromapFeaturesEXT[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkPhysicalDeviceOpacityMicromapFeaturesEXT(segment.asSlice(i * BYTES, BYTES));
            ret[i].sType(VkStructureType.PHYSICAL_DEVICE_OPACITY_MICROMAP_FEATURES_EXT);
        }
        return ret;
    }

    public static VkPhysicalDeviceOpacityMicromapFeaturesEXT clone(Arena arena, VkPhysicalDeviceOpacityMicromapFeaturesEXT src) {
        VkPhysicalDeviceOpacityMicromapFeaturesEXT ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkPhysicalDeviceOpacityMicromapFeaturesEXT[] clone(Arena arena, VkPhysicalDeviceOpacityMicromapFeaturesEXT[] src) {
        VkPhysicalDeviceOpacityMicromapFeaturesEXT[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public void autoInit() {
        sType(VkStructureType.PHYSICAL_DEVICE_OPACITY_MICROMAP_FEATURES_EXT);
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

    public @unsigned int micromap() {
        return segment.get(LAYOUT$micromap, OFFSET$micromap);
    }

    public void micromap(@unsigned int value) {
        segment.set(LAYOUT$micromap, OFFSET$micromap, value);
    }

    public @unsigned int micromapCaptureReplay() {
        return segment.get(LAYOUT$micromapCaptureReplay, OFFSET$micromapCaptureReplay);
    }

    public void micromapCaptureReplay(@unsigned int value) {
        segment.set(LAYOUT$micromapCaptureReplay, OFFSET$micromapCaptureReplay, value);
    }

    public @unsigned int micromapHostCommands() {
        return segment.get(LAYOUT$micromapHostCommands, OFFSET$micromapHostCommands);
    }

    public void micromapHostCommands(@unsigned int value) {
        segment.set(LAYOUT$micromapHostCommands, OFFSET$micromapHostCommands, value);
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("micromap"),
        ValueLayout.JAVA_INT.withName("micromapCaptureReplay"),
        ValueLayout.JAVA_INT.withName("micromapHostCommands")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("PATH$sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("PATH$pNext");
    public static final PathElement PATH$micromap = PathElement.groupElement("PATH$micromap");
    public static final PathElement PATH$micromapCaptureReplay = PathElement.groupElement("PATH$micromapCaptureReplay");
    public static final PathElement PATH$micromapHostCommands = PathElement.groupElement("PATH$micromapHostCommands");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$micromap = (OfInt) LAYOUT.select(PATH$micromap);
    public static final OfInt LAYOUT$micromapCaptureReplay = (OfInt) LAYOUT.select(PATH$micromapCaptureReplay);
    public static final OfInt LAYOUT$micromapHostCommands = (OfInt) LAYOUT.select(PATH$micromapHostCommands);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$micromap = LAYOUT$micromap.byteSize();
    public static final long SIZE$micromapCaptureReplay = LAYOUT$micromapCaptureReplay.byteSize();
    public static final long SIZE$micromapHostCommands = LAYOUT$micromapHostCommands.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$micromap = LAYOUT.byteOffset(PATH$micromap);
    public static final long OFFSET$micromapCaptureReplay = LAYOUT.byteOffset(PATH$micromapCaptureReplay);
    public static final long OFFSET$micromapHostCommands = LAYOUT.byteOffset(PATH$micromapHostCommands);
}
