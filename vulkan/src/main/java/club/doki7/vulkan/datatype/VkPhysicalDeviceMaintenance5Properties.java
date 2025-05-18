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

/// Represents a pointer to a <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkPhysicalDeviceMaintenance5Properties.html"><code>VkPhysicalDeviceMaintenance5Properties</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct VkPhysicalDeviceMaintenance5Properties {
///     VkStructureType sType; // @link substring="VkStructureType" target="VkStructureType" @link substring="sType" target="#sType"
///     void* pNext; // optional // @link substring="pNext" target="#pNext"
///     VkBool32 earlyFragmentMultisampleCoverageAfterSampleCounting; // @link substring="earlyFragmentMultisampleCoverageAfterSampleCounting" target="#earlyFragmentMultisampleCoverageAfterSampleCounting"
///     VkBool32 earlyFragmentSampleMaskTestBeforeSampleCounting; // @link substring="earlyFragmentSampleMaskTestBeforeSampleCounting" target="#earlyFragmentSampleMaskTestBeforeSampleCounting"
///     VkBool32 depthStencilSwizzleOneSupport; // @link substring="depthStencilSwizzleOneSupport" target="#depthStencilSwizzleOneSupport"
///     VkBool32 polygonModePointSize; // @link substring="polygonModePointSize" target="#polygonModePointSize"
///     VkBool32 nonStrictSinglePixelWideLinesUseParallelogram; // @link substring="nonStrictSinglePixelWideLinesUseParallelogram" target="#nonStrictSinglePixelWideLinesUseParallelogram"
///     VkBool32 nonStrictWideLinesUseParallelogram; // @link substring="nonStrictWideLinesUseParallelogram" target="#nonStrictWideLinesUseParallelogram"
/// } VkPhysicalDeviceMaintenance5Properties;
/// }
///
/// ## Auto initialization
/// This structure has the following members that can be automatically initialized:
/// - `sType = VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_MAINTENANCE_5_PROPERTIES`
///
/// The {@code allocate} ({@link VkPhysicalDeviceMaintenance5Properties#allocate(Arena)}, {@link VkPhysicalDeviceMaintenance5Properties#allocate(Arena, int)})
/// functions will automatically initialize these fields. Also, you may call {@link VkPhysicalDeviceMaintenance5Properties#autoInit}
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
/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkPhysicalDeviceMaintenance5Properties.html"><code>VkPhysicalDeviceMaintenance5Properties</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record VkPhysicalDeviceMaintenance5Properties(@NotNull MemorySegment segment) implements IPointer {
    public static VkPhysicalDeviceMaintenance5Properties allocate(Arena arena) {
        VkPhysicalDeviceMaintenance5Properties ret = new VkPhysicalDeviceMaintenance5Properties(arena.allocate(LAYOUT));
        ret.sType(VkStructureType.PHYSICAL_DEVICE_MAINTENANCE_5_PROPERTIES);
        return ret;
    }

    public static VkPhysicalDeviceMaintenance5Properties[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkPhysicalDeviceMaintenance5Properties[] ret = new VkPhysicalDeviceMaintenance5Properties[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkPhysicalDeviceMaintenance5Properties(segment.asSlice(i * BYTES, BYTES));
            ret[i].sType(VkStructureType.PHYSICAL_DEVICE_MAINTENANCE_5_PROPERTIES);
        }
        return ret;
    }

    public static VkPhysicalDeviceMaintenance5Properties clone(Arena arena, VkPhysicalDeviceMaintenance5Properties src) {
        VkPhysicalDeviceMaintenance5Properties ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkPhysicalDeviceMaintenance5Properties[] clone(Arena arena, VkPhysicalDeviceMaintenance5Properties[] src) {
        VkPhysicalDeviceMaintenance5Properties[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public void autoInit() {
        sType(VkStructureType.PHYSICAL_DEVICE_MAINTENANCE_5_PROPERTIES);
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

    public @unsigned int earlyFragmentMultisampleCoverageAfterSampleCounting() {
        return segment.get(LAYOUT$earlyFragmentMultisampleCoverageAfterSampleCounting, OFFSET$earlyFragmentMultisampleCoverageAfterSampleCounting);
    }

    public void earlyFragmentMultisampleCoverageAfterSampleCounting(@unsigned int value) {
        segment.set(LAYOUT$earlyFragmentMultisampleCoverageAfterSampleCounting, OFFSET$earlyFragmentMultisampleCoverageAfterSampleCounting, value);
    }

    public @unsigned int earlyFragmentSampleMaskTestBeforeSampleCounting() {
        return segment.get(LAYOUT$earlyFragmentSampleMaskTestBeforeSampleCounting, OFFSET$earlyFragmentSampleMaskTestBeforeSampleCounting);
    }

    public void earlyFragmentSampleMaskTestBeforeSampleCounting(@unsigned int value) {
        segment.set(LAYOUT$earlyFragmentSampleMaskTestBeforeSampleCounting, OFFSET$earlyFragmentSampleMaskTestBeforeSampleCounting, value);
    }

    public @unsigned int depthStencilSwizzleOneSupport() {
        return segment.get(LAYOUT$depthStencilSwizzleOneSupport, OFFSET$depthStencilSwizzleOneSupport);
    }

    public void depthStencilSwizzleOneSupport(@unsigned int value) {
        segment.set(LAYOUT$depthStencilSwizzleOneSupport, OFFSET$depthStencilSwizzleOneSupport, value);
    }

    public @unsigned int polygonModePointSize() {
        return segment.get(LAYOUT$polygonModePointSize, OFFSET$polygonModePointSize);
    }

    public void polygonModePointSize(@unsigned int value) {
        segment.set(LAYOUT$polygonModePointSize, OFFSET$polygonModePointSize, value);
    }

    public @unsigned int nonStrictSinglePixelWideLinesUseParallelogram() {
        return segment.get(LAYOUT$nonStrictSinglePixelWideLinesUseParallelogram, OFFSET$nonStrictSinglePixelWideLinesUseParallelogram);
    }

    public void nonStrictSinglePixelWideLinesUseParallelogram(@unsigned int value) {
        segment.set(LAYOUT$nonStrictSinglePixelWideLinesUseParallelogram, OFFSET$nonStrictSinglePixelWideLinesUseParallelogram, value);
    }

    public @unsigned int nonStrictWideLinesUseParallelogram() {
        return segment.get(LAYOUT$nonStrictWideLinesUseParallelogram, OFFSET$nonStrictWideLinesUseParallelogram);
    }

    public void nonStrictWideLinesUseParallelogram(@unsigned int value) {
        segment.set(LAYOUT$nonStrictWideLinesUseParallelogram, OFFSET$nonStrictWideLinesUseParallelogram, value);
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("earlyFragmentMultisampleCoverageAfterSampleCounting"),
        ValueLayout.JAVA_INT.withName("earlyFragmentSampleMaskTestBeforeSampleCounting"),
        ValueLayout.JAVA_INT.withName("depthStencilSwizzleOneSupport"),
        ValueLayout.JAVA_INT.withName("polygonModePointSize"),
        ValueLayout.JAVA_INT.withName("nonStrictSinglePixelWideLinesUseParallelogram"),
        ValueLayout.JAVA_INT.withName("nonStrictWideLinesUseParallelogram")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("PATH$sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("PATH$pNext");
    public static final PathElement PATH$earlyFragmentMultisampleCoverageAfterSampleCounting = PathElement.groupElement("PATH$earlyFragmentMultisampleCoverageAfterSampleCounting");
    public static final PathElement PATH$earlyFragmentSampleMaskTestBeforeSampleCounting = PathElement.groupElement("PATH$earlyFragmentSampleMaskTestBeforeSampleCounting");
    public static final PathElement PATH$depthStencilSwizzleOneSupport = PathElement.groupElement("PATH$depthStencilSwizzleOneSupport");
    public static final PathElement PATH$polygonModePointSize = PathElement.groupElement("PATH$polygonModePointSize");
    public static final PathElement PATH$nonStrictSinglePixelWideLinesUseParallelogram = PathElement.groupElement("PATH$nonStrictSinglePixelWideLinesUseParallelogram");
    public static final PathElement PATH$nonStrictWideLinesUseParallelogram = PathElement.groupElement("PATH$nonStrictWideLinesUseParallelogram");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$earlyFragmentMultisampleCoverageAfterSampleCounting = (OfInt) LAYOUT.select(PATH$earlyFragmentMultisampleCoverageAfterSampleCounting);
    public static final OfInt LAYOUT$earlyFragmentSampleMaskTestBeforeSampleCounting = (OfInt) LAYOUT.select(PATH$earlyFragmentSampleMaskTestBeforeSampleCounting);
    public static final OfInt LAYOUT$depthStencilSwizzleOneSupport = (OfInt) LAYOUT.select(PATH$depthStencilSwizzleOneSupport);
    public static final OfInt LAYOUT$polygonModePointSize = (OfInt) LAYOUT.select(PATH$polygonModePointSize);
    public static final OfInt LAYOUT$nonStrictSinglePixelWideLinesUseParallelogram = (OfInt) LAYOUT.select(PATH$nonStrictSinglePixelWideLinesUseParallelogram);
    public static final OfInt LAYOUT$nonStrictWideLinesUseParallelogram = (OfInt) LAYOUT.select(PATH$nonStrictWideLinesUseParallelogram);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$earlyFragmentMultisampleCoverageAfterSampleCounting = LAYOUT$earlyFragmentMultisampleCoverageAfterSampleCounting.byteSize();
    public static final long SIZE$earlyFragmentSampleMaskTestBeforeSampleCounting = LAYOUT$earlyFragmentSampleMaskTestBeforeSampleCounting.byteSize();
    public static final long SIZE$depthStencilSwizzleOneSupport = LAYOUT$depthStencilSwizzleOneSupport.byteSize();
    public static final long SIZE$polygonModePointSize = LAYOUT$polygonModePointSize.byteSize();
    public static final long SIZE$nonStrictSinglePixelWideLinesUseParallelogram = LAYOUT$nonStrictSinglePixelWideLinesUseParallelogram.byteSize();
    public static final long SIZE$nonStrictWideLinesUseParallelogram = LAYOUT$nonStrictWideLinesUseParallelogram.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$earlyFragmentMultisampleCoverageAfterSampleCounting = LAYOUT.byteOffset(PATH$earlyFragmentMultisampleCoverageAfterSampleCounting);
    public static final long OFFSET$earlyFragmentSampleMaskTestBeforeSampleCounting = LAYOUT.byteOffset(PATH$earlyFragmentSampleMaskTestBeforeSampleCounting);
    public static final long OFFSET$depthStencilSwizzleOneSupport = LAYOUT.byteOffset(PATH$depthStencilSwizzleOneSupport);
    public static final long OFFSET$polygonModePointSize = LAYOUT.byteOffset(PATH$polygonModePointSize);
    public static final long OFFSET$nonStrictSinglePixelWideLinesUseParallelogram = LAYOUT.byteOffset(PATH$nonStrictSinglePixelWideLinesUseParallelogram);
    public static final long OFFSET$nonStrictWideLinesUseParallelogram = LAYOUT.byteOffset(PATH$nonStrictWideLinesUseParallelogram);
}
