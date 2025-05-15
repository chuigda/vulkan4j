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

/// Represents a pointer to a {@code VkCooperativeMatrixFlexibleDimensionsPropertiesNV} structure in native memory.
///
/// The property {@link #segment()} should always be not-null
/// (({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to)
/// {@code LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
/// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
///
/// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
/// perform any runtime check. The constructor can be useful for automatic code generators.
///
/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkCooperativeMatrixFlexibleDimensionsPropertiesNV.html">VkCooperativeMatrixFlexibleDimensionsPropertiesNV</a>
@ValueBasedCandidate
@UnsafeConstructor
public record VkCooperativeMatrixFlexibleDimensionsPropertiesNV(@NotNull MemorySegment segment) implements IPointer {
    public VkCooperativeMatrixFlexibleDimensionsPropertiesNV {
        sType(VkStructureType.COOPERATIVE_MATRIX_FLEXIBLE_DIMENSIONS_PROPERTIES_NV);
    }

    public static VkCooperativeMatrixFlexibleDimensionsPropertiesNV allocate(Arena arena) {
        return new VkCooperativeMatrixFlexibleDimensionsPropertiesNV(arena.allocate(LAYOUT));
    }

    public static VkCooperativeMatrixFlexibleDimensionsPropertiesNV[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkCooperativeMatrixFlexibleDimensionsPropertiesNV[] ret = new VkCooperativeMatrixFlexibleDimensionsPropertiesNV[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkCooperativeMatrixFlexibleDimensionsPropertiesNV(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static VkCooperativeMatrixFlexibleDimensionsPropertiesNV clone(Arena arena, VkCooperativeMatrixFlexibleDimensionsPropertiesNV src) {
        VkCooperativeMatrixFlexibleDimensionsPropertiesNV ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkCooperativeMatrixFlexibleDimensionsPropertiesNV[] clone(Arena arena, VkCooperativeMatrixFlexibleDimensionsPropertiesNV[] src) {
        VkCooperativeMatrixFlexibleDimensionsPropertiesNV[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("MGranularity"),
        ValueLayout.JAVA_INT.withName("NGranularity"),
        ValueLayout.JAVA_INT.withName("KGranularity"),
        ValueLayout.JAVA_INT.withName("AType"),
        ValueLayout.JAVA_INT.withName("BType"),
        ValueLayout.JAVA_INT.withName("CType"),
        ValueLayout.JAVA_INT.withName("ResultType"),
        ValueLayout.JAVA_INT.withName("saturatingAccumulation"),
        ValueLayout.JAVA_INT.withName("scope"),
        ValueLayout.JAVA_INT.withName("workgroupInvocations")
    );
    public static final long SIZE = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("PATH$sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("PATH$pNext");
    public static final PathElement PATH$MGranularity = PathElement.groupElement("PATH$MGranularity");
    public static final PathElement PATH$NGranularity = PathElement.groupElement("PATH$NGranularity");
    public static final PathElement PATH$KGranularity = PathElement.groupElement("PATH$KGranularity");
    public static final PathElement PATH$AType = PathElement.groupElement("PATH$AType");
    public static final PathElement PATH$BType = PathElement.groupElement("PATH$BType");
    public static final PathElement PATH$CType = PathElement.groupElement("PATH$CType");
    public static final PathElement PATH$ResultType = PathElement.groupElement("PATH$ResultType");
    public static final PathElement PATH$saturatingAccumulation = PathElement.groupElement("PATH$saturatingAccumulation");
    public static final PathElement PATH$scope = PathElement.groupElement("PATH$scope");
    public static final PathElement PATH$workgroupInvocations = PathElement.groupElement("PATH$workgroupInvocations");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$MGranularity = (OfInt) LAYOUT.select(PATH$MGranularity);
    public static final OfInt LAYOUT$NGranularity = (OfInt) LAYOUT.select(PATH$NGranularity);
    public static final OfInt LAYOUT$KGranularity = (OfInt) LAYOUT.select(PATH$KGranularity);
    public static final OfInt LAYOUT$AType = (OfInt) LAYOUT.select(PATH$AType);
    public static final OfInt LAYOUT$BType = (OfInt) LAYOUT.select(PATH$BType);
    public static final OfInt LAYOUT$CType = (OfInt) LAYOUT.select(PATH$CType);
    public static final OfInt LAYOUT$ResultType = (OfInt) LAYOUT.select(PATH$ResultType);
    public static final OfInt LAYOUT$saturatingAccumulation = (OfInt) LAYOUT.select(PATH$saturatingAccumulation);
    public static final OfInt LAYOUT$scope = (OfInt) LAYOUT.select(PATH$scope);
    public static final OfInt LAYOUT$workgroupInvocations = (OfInt) LAYOUT.select(PATH$workgroupInvocations);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$MGranularity = LAYOUT$MGranularity.byteSize();
    public static final long SIZE$NGranularity = LAYOUT$NGranularity.byteSize();
    public static final long SIZE$KGranularity = LAYOUT$KGranularity.byteSize();
    public static final long SIZE$AType = LAYOUT$AType.byteSize();
    public static final long SIZE$BType = LAYOUT$BType.byteSize();
    public static final long SIZE$CType = LAYOUT$CType.byteSize();
    public static final long SIZE$ResultType = LAYOUT$ResultType.byteSize();
    public static final long SIZE$saturatingAccumulation = LAYOUT$saturatingAccumulation.byteSize();
    public static final long SIZE$scope = LAYOUT$scope.byteSize();
    public static final long SIZE$workgroupInvocations = LAYOUT$workgroupInvocations.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$MGranularity = LAYOUT.byteOffset(PATH$MGranularity);
    public static final long OFFSET$NGranularity = LAYOUT.byteOffset(PATH$NGranularity);
    public static final long OFFSET$KGranularity = LAYOUT.byteOffset(PATH$KGranularity);
    public static final long OFFSET$AType = LAYOUT.byteOffset(PATH$AType);
    public static final long OFFSET$BType = LAYOUT.byteOffset(PATH$BType);
    public static final long OFFSET$CType = LAYOUT.byteOffset(PATH$CType);
    public static final long OFFSET$ResultType = LAYOUT.byteOffset(PATH$ResultType);
    public static final long OFFSET$saturatingAccumulation = LAYOUT.byteOffset(PATH$saturatingAccumulation);
    public static final long OFFSET$scope = LAYOUT.byteOffset(PATH$scope);
    public static final long OFFSET$workgroupInvocations = LAYOUT.byteOffset(PATH$workgroupInvocations);

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

    public @unsigned int MGranularity() {
        return segment.get(LAYOUT$MGranularity, OFFSET$MGranularity);
    }

    public void MGranularity(@unsigned int value) {
        segment.set(LAYOUT$MGranularity, OFFSET$MGranularity, value);
    }

    public @unsigned int NGranularity() {
        return segment.get(LAYOUT$NGranularity, OFFSET$NGranularity);
    }

    public void NGranularity(@unsigned int value) {
        segment.set(LAYOUT$NGranularity, OFFSET$NGranularity, value);
    }

    public @unsigned int KGranularity() {
        return segment.get(LAYOUT$KGranularity, OFFSET$KGranularity);
    }

    public void KGranularity(@unsigned int value) {
        segment.set(LAYOUT$KGranularity, OFFSET$KGranularity, value);
    }

    public @enumtype(VkComponentTypeKHR.class) int AType() {
        return segment.get(LAYOUT$AType, OFFSET$AType);
    }

    public void AType(@enumtype(VkComponentTypeKHR.class) int value) {
        segment.set(LAYOUT$AType, OFFSET$AType, value);
    }

    public @enumtype(VkComponentTypeKHR.class) int BType() {
        return segment.get(LAYOUT$BType, OFFSET$BType);
    }

    public void BType(@enumtype(VkComponentTypeKHR.class) int value) {
        segment.set(LAYOUT$BType, OFFSET$BType, value);
    }

    public @enumtype(VkComponentTypeKHR.class) int CType() {
        return segment.get(LAYOUT$CType, OFFSET$CType);
    }

    public void CType(@enumtype(VkComponentTypeKHR.class) int value) {
        segment.set(LAYOUT$CType, OFFSET$CType, value);
    }

    public @enumtype(VkComponentTypeKHR.class) int ResultType() {
        return segment.get(LAYOUT$ResultType, OFFSET$ResultType);
    }

    public void ResultType(@enumtype(VkComponentTypeKHR.class) int value) {
        segment.set(LAYOUT$ResultType, OFFSET$ResultType, value);
    }

    public @unsigned int saturatingAccumulation() {
        return segment.get(LAYOUT$saturatingAccumulation, OFFSET$saturatingAccumulation);
    }

    public void saturatingAccumulation(@unsigned int value) {
        segment.set(LAYOUT$saturatingAccumulation, OFFSET$saturatingAccumulation, value);
    }

    public @enumtype(VkScopeKHR.class) int scope() {
        return segment.get(LAYOUT$scope, OFFSET$scope);
    }

    public void scope(@enumtype(VkScopeKHR.class) int value) {
        segment.set(LAYOUT$scope, OFFSET$scope, value);
    }

    public @unsigned int workgroupInvocations() {
        return segment.get(LAYOUT$workgroupInvocations, OFFSET$workgroupInvocations);
    }

    public void workgroupInvocations(@unsigned int value) {
        segment.set(LAYOUT$workgroupInvocations, OFFSET$workgroupInvocations, value);
    }

}
