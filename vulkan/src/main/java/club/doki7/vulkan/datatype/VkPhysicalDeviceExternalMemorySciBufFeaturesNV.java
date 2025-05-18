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

/// Represents a pointer to a <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkPhysicalDeviceExternalMemorySciBufFeaturesNV.html"><code>VkPhysicalDeviceExternalMemorySciBufFeaturesNV</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct VkPhysicalDeviceExternalMemorySciBufFeaturesNV {
///     VkStructureType sType; // @link substring="VkStructureType" target="VkStructureType" @link substring="sType" target="#sType"
///     void* pNext; // optional // @link substring="pNext" target="#pNext"
///     VkBool32 sciBufImport; // @link substring="sciBufImport" target="#sciBufImport"
///     VkBool32 sciBufExport; // @link substring="sciBufExport" target="#sciBufExport"
/// } VkPhysicalDeviceExternalMemorySciBufFeaturesNV;
/// }
///
/// ## Auto initialization
/// This structure has the following members that can be automatically initialized:
/// - `sType = VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_EXTERNAL_MEMORY_SCI_BUF_FEATURES_NV`
///
/// The {@code allocate} ({@link VkPhysicalDeviceExternalMemorySciBufFeaturesNV#allocate(Arena)}, {@link VkPhysicalDeviceExternalMemorySciBufFeaturesNV#allocate(Arena, int)})
/// functions will automatically initialize these fields. Also, you may call {@link VkPhysicalDeviceExternalMemorySciBufFeaturesNV#autoInit}
/// to initialize these fields manually for non-allocated instances.
/// ## Contracts
///
/// The property {@link #segment()} should always be not-null
/// (({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to
/// {@code LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
/// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
///
/// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
/// perform any runtime check. The constructor can be useful for automatic code generators.
///
/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkPhysicalDeviceExternalMemorySciBufFeaturesNV.html"><code>VkPhysicalDeviceExternalMemorySciBufFeaturesNV</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record VkPhysicalDeviceExternalMemorySciBufFeaturesNV(@NotNull MemorySegment segment) implements IPointer {
    public static VkPhysicalDeviceExternalMemorySciBufFeaturesNV allocate(Arena arena) {
        VkPhysicalDeviceExternalMemorySciBufFeaturesNV ret = new VkPhysicalDeviceExternalMemorySciBufFeaturesNV(arena.allocate(LAYOUT));
        ret.sType(VkStructureType.PHYSICAL_DEVICE_EXTERNAL_MEMORY_SCI_BUF_FEATURES_NV);
        return ret;
    }

    public static VkPhysicalDeviceExternalMemorySciBufFeaturesNV[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkPhysicalDeviceExternalMemorySciBufFeaturesNV[] ret = new VkPhysicalDeviceExternalMemorySciBufFeaturesNV[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkPhysicalDeviceExternalMemorySciBufFeaturesNV(segment.asSlice(i * BYTES, BYTES));
            ret[i].sType(VkStructureType.PHYSICAL_DEVICE_EXTERNAL_MEMORY_SCI_BUF_FEATURES_NV);
        }
        return ret;
    }

    public static VkPhysicalDeviceExternalMemorySciBufFeaturesNV clone(Arena arena, VkPhysicalDeviceExternalMemorySciBufFeaturesNV src) {
        VkPhysicalDeviceExternalMemorySciBufFeaturesNV ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkPhysicalDeviceExternalMemorySciBufFeaturesNV[] clone(Arena arena, VkPhysicalDeviceExternalMemorySciBufFeaturesNV[] src) {
        VkPhysicalDeviceExternalMemorySciBufFeaturesNV[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public void autoInit() {
        sType(VkStructureType.PHYSICAL_DEVICE_EXTERNAL_MEMORY_SCI_BUF_FEATURES_NV);
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

    public @unsigned int sciBufImport() {
        return segment.get(LAYOUT$sciBufImport, OFFSET$sciBufImport);
    }

    public void sciBufImport(@unsigned int value) {
        segment.set(LAYOUT$sciBufImport, OFFSET$sciBufImport, value);
    }

    public @unsigned int sciBufExport() {
        return segment.get(LAYOUT$sciBufExport, OFFSET$sciBufExport);
    }

    public void sciBufExport(@unsigned int value) {
        segment.set(LAYOUT$sciBufExport, OFFSET$sciBufExport, value);
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("sciBufImport"),
        ValueLayout.JAVA_INT.withName("sciBufExport")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("PATH$sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("PATH$pNext");
    public static final PathElement PATH$sciBufImport = PathElement.groupElement("PATH$sciBufImport");
    public static final PathElement PATH$sciBufExport = PathElement.groupElement("PATH$sciBufExport");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$sciBufImport = (OfInt) LAYOUT.select(PATH$sciBufImport);
    public static final OfInt LAYOUT$sciBufExport = (OfInt) LAYOUT.select(PATH$sciBufExport);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$sciBufImport = LAYOUT$sciBufImport.byteSize();
    public static final long SIZE$sciBufExport = LAYOUT$sciBufExport.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$sciBufImport = LAYOUT.byteOffset(PATH$sciBufImport);
    public static final long OFFSET$sciBufExport = LAYOUT.byteOffset(PATH$sciBufExport);
}
