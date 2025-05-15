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

/// Represents a pointer to a {@code VkPhysicalDeviceCooperativeMatrix2FeaturesNV} structure in native memory.
///
/// The property {@link #segment()} should always be not-null
/// (({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to)
/// {@code LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
/// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
///
/// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
/// perform any runtime check. The constructor can be useful for automatic code generators.
///
/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkPhysicalDeviceCooperativeMatrix2FeaturesNV.html">VkPhysicalDeviceCooperativeMatrix2FeaturesNV</a>
@ValueBasedCandidate
@UnsafeConstructor
public record VkPhysicalDeviceCooperativeMatrix2FeaturesNV(@NotNull MemorySegment segment) implements IPointer {
    public VkPhysicalDeviceCooperativeMatrix2FeaturesNV {
        sType(VkStructureType.PHYSICAL_DEVICE_COOPERATIVE_MATRIX_2_FEATURES_NV);
    }

    public static VkPhysicalDeviceCooperativeMatrix2FeaturesNV allocate(Arena arena) {
        return new VkPhysicalDeviceCooperativeMatrix2FeaturesNV(arena.allocate(LAYOUT));
    }

    public static VkPhysicalDeviceCooperativeMatrix2FeaturesNV[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkPhysicalDeviceCooperativeMatrix2FeaturesNV[] ret = new VkPhysicalDeviceCooperativeMatrix2FeaturesNV[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkPhysicalDeviceCooperativeMatrix2FeaturesNV(segment.asSlice(i * BYTES, BYTES));
        }
        return ret;
    }

    public static VkPhysicalDeviceCooperativeMatrix2FeaturesNV clone(Arena arena, VkPhysicalDeviceCooperativeMatrix2FeaturesNV src) {
        VkPhysicalDeviceCooperativeMatrix2FeaturesNV ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkPhysicalDeviceCooperativeMatrix2FeaturesNV[] clone(Arena arena, VkPhysicalDeviceCooperativeMatrix2FeaturesNV[] src) {
        VkPhysicalDeviceCooperativeMatrix2FeaturesNV[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("cooperativeMatrixWorkgroupScope"),
        ValueLayout.JAVA_INT.withName("cooperativeMatrixFlexibleDimensions"),
        ValueLayout.JAVA_INT.withName("cooperativeMatrixReductions"),
        ValueLayout.JAVA_INT.withName("cooperativeMatrixConversions"),
        ValueLayout.JAVA_INT.withName("cooperativeMatrixPerElementOperations"),
        ValueLayout.JAVA_INT.withName("cooperativeMatrixTensorAddressing"),
        ValueLayout.JAVA_INT.withName("cooperativeMatrixBlockLoads")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("PATH$sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("PATH$pNext");
    public static final PathElement PATH$cooperativeMatrixWorkgroupScope = PathElement.groupElement("PATH$cooperativeMatrixWorkgroupScope");
    public static final PathElement PATH$cooperativeMatrixFlexibleDimensions = PathElement.groupElement("PATH$cooperativeMatrixFlexibleDimensions");
    public static final PathElement PATH$cooperativeMatrixReductions = PathElement.groupElement("PATH$cooperativeMatrixReductions");
    public static final PathElement PATH$cooperativeMatrixConversions = PathElement.groupElement("PATH$cooperativeMatrixConversions");
    public static final PathElement PATH$cooperativeMatrixPerElementOperations = PathElement.groupElement("PATH$cooperativeMatrixPerElementOperations");
    public static final PathElement PATH$cooperativeMatrixTensorAddressing = PathElement.groupElement("PATH$cooperativeMatrixTensorAddressing");
    public static final PathElement PATH$cooperativeMatrixBlockLoads = PathElement.groupElement("PATH$cooperativeMatrixBlockLoads");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$cooperativeMatrixWorkgroupScope = (OfInt) LAYOUT.select(PATH$cooperativeMatrixWorkgroupScope);
    public static final OfInt LAYOUT$cooperativeMatrixFlexibleDimensions = (OfInt) LAYOUT.select(PATH$cooperativeMatrixFlexibleDimensions);
    public static final OfInt LAYOUT$cooperativeMatrixReductions = (OfInt) LAYOUT.select(PATH$cooperativeMatrixReductions);
    public static final OfInt LAYOUT$cooperativeMatrixConversions = (OfInt) LAYOUT.select(PATH$cooperativeMatrixConversions);
    public static final OfInt LAYOUT$cooperativeMatrixPerElementOperations = (OfInt) LAYOUT.select(PATH$cooperativeMatrixPerElementOperations);
    public static final OfInt LAYOUT$cooperativeMatrixTensorAddressing = (OfInt) LAYOUT.select(PATH$cooperativeMatrixTensorAddressing);
    public static final OfInt LAYOUT$cooperativeMatrixBlockLoads = (OfInt) LAYOUT.select(PATH$cooperativeMatrixBlockLoads);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$cooperativeMatrixWorkgroupScope = LAYOUT$cooperativeMatrixWorkgroupScope.byteSize();
    public static final long SIZE$cooperativeMatrixFlexibleDimensions = LAYOUT$cooperativeMatrixFlexibleDimensions.byteSize();
    public static final long SIZE$cooperativeMatrixReductions = LAYOUT$cooperativeMatrixReductions.byteSize();
    public static final long SIZE$cooperativeMatrixConversions = LAYOUT$cooperativeMatrixConversions.byteSize();
    public static final long SIZE$cooperativeMatrixPerElementOperations = LAYOUT$cooperativeMatrixPerElementOperations.byteSize();
    public static final long SIZE$cooperativeMatrixTensorAddressing = LAYOUT$cooperativeMatrixTensorAddressing.byteSize();
    public static final long SIZE$cooperativeMatrixBlockLoads = LAYOUT$cooperativeMatrixBlockLoads.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$cooperativeMatrixWorkgroupScope = LAYOUT.byteOffset(PATH$cooperativeMatrixWorkgroupScope);
    public static final long OFFSET$cooperativeMatrixFlexibleDimensions = LAYOUT.byteOffset(PATH$cooperativeMatrixFlexibleDimensions);
    public static final long OFFSET$cooperativeMatrixReductions = LAYOUT.byteOffset(PATH$cooperativeMatrixReductions);
    public static final long OFFSET$cooperativeMatrixConversions = LAYOUT.byteOffset(PATH$cooperativeMatrixConversions);
    public static final long OFFSET$cooperativeMatrixPerElementOperations = LAYOUT.byteOffset(PATH$cooperativeMatrixPerElementOperations);
    public static final long OFFSET$cooperativeMatrixTensorAddressing = LAYOUT.byteOffset(PATH$cooperativeMatrixTensorAddressing);
    public static final long OFFSET$cooperativeMatrixBlockLoads = LAYOUT.byteOffset(PATH$cooperativeMatrixBlockLoads);

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

    public @unsigned int cooperativeMatrixWorkgroupScope() {
        return segment.get(LAYOUT$cooperativeMatrixWorkgroupScope, OFFSET$cooperativeMatrixWorkgroupScope);
    }

    public void cooperativeMatrixWorkgroupScope(@unsigned int value) {
        segment.set(LAYOUT$cooperativeMatrixWorkgroupScope, OFFSET$cooperativeMatrixWorkgroupScope, value);
    }

    public @unsigned int cooperativeMatrixFlexibleDimensions() {
        return segment.get(LAYOUT$cooperativeMatrixFlexibleDimensions, OFFSET$cooperativeMatrixFlexibleDimensions);
    }

    public void cooperativeMatrixFlexibleDimensions(@unsigned int value) {
        segment.set(LAYOUT$cooperativeMatrixFlexibleDimensions, OFFSET$cooperativeMatrixFlexibleDimensions, value);
    }

    public @unsigned int cooperativeMatrixReductions() {
        return segment.get(LAYOUT$cooperativeMatrixReductions, OFFSET$cooperativeMatrixReductions);
    }

    public void cooperativeMatrixReductions(@unsigned int value) {
        segment.set(LAYOUT$cooperativeMatrixReductions, OFFSET$cooperativeMatrixReductions, value);
    }

    public @unsigned int cooperativeMatrixConversions() {
        return segment.get(LAYOUT$cooperativeMatrixConversions, OFFSET$cooperativeMatrixConversions);
    }

    public void cooperativeMatrixConversions(@unsigned int value) {
        segment.set(LAYOUT$cooperativeMatrixConversions, OFFSET$cooperativeMatrixConversions, value);
    }

    public @unsigned int cooperativeMatrixPerElementOperations() {
        return segment.get(LAYOUT$cooperativeMatrixPerElementOperations, OFFSET$cooperativeMatrixPerElementOperations);
    }

    public void cooperativeMatrixPerElementOperations(@unsigned int value) {
        segment.set(LAYOUT$cooperativeMatrixPerElementOperations, OFFSET$cooperativeMatrixPerElementOperations, value);
    }

    public @unsigned int cooperativeMatrixTensorAddressing() {
        return segment.get(LAYOUT$cooperativeMatrixTensorAddressing, OFFSET$cooperativeMatrixTensorAddressing);
    }

    public void cooperativeMatrixTensorAddressing(@unsigned int value) {
        segment.set(LAYOUT$cooperativeMatrixTensorAddressing, OFFSET$cooperativeMatrixTensorAddressing, value);
    }

    public @unsigned int cooperativeMatrixBlockLoads() {
        return segment.get(LAYOUT$cooperativeMatrixBlockLoads, OFFSET$cooperativeMatrixBlockLoads);
    }

    public void cooperativeMatrixBlockLoads(@unsigned int value) {
        segment.set(LAYOUT$cooperativeMatrixBlockLoads, OFFSET$cooperativeMatrixBlockLoads, value);
    }

}
