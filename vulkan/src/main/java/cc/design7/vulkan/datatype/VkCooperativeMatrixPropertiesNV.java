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

/// Represents a pointer to a {@code VkCooperativeMatrixPropertiesNV} structure in native memory.
///
/// The property {@link #segment()} should always be not-null
/// (({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to)
/// {@code LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
/// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
///
/// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
/// perform any runtime check. The constructor can be useful for automatic code generators.
///
/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkCooperativeMatrixPropertiesNV.html">VkCooperativeMatrixPropertiesNV</a>
@ValueBasedCandidate
@UnsafeConstructor
public record VkCooperativeMatrixPropertiesNV(@NotNull MemorySegment segment) implements IPointer {
    public VkCooperativeMatrixPropertiesNV {
        sType(VkStructureType.COOPERATIVE_MATRIX_PROPERTIES_NV);
    }

    public static VkCooperativeMatrixPropertiesNV allocate(Arena arena) {
        return new VkCooperativeMatrixPropertiesNV(arena.allocate(LAYOUT));
    }

    public static VkCooperativeMatrixPropertiesNV[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkCooperativeMatrixPropertiesNV[] ret = new VkCooperativeMatrixPropertiesNV[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkCooperativeMatrixPropertiesNV(segment.asSlice(i * BYTES, BYTES));
        }
        return ret;
    }

    public static VkCooperativeMatrixPropertiesNV clone(Arena arena, VkCooperativeMatrixPropertiesNV src) {
        VkCooperativeMatrixPropertiesNV ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkCooperativeMatrixPropertiesNV[] clone(Arena arena, VkCooperativeMatrixPropertiesNV[] src) {
        VkCooperativeMatrixPropertiesNV[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("MSize"),
        ValueLayout.JAVA_INT.withName("NSize"),
        ValueLayout.JAVA_INT.withName("KSize"),
        ValueLayout.JAVA_INT.withName("AType"),
        ValueLayout.JAVA_INT.withName("BType"),
        ValueLayout.JAVA_INT.withName("CType"),
        ValueLayout.JAVA_INT.withName("DType"),
        ValueLayout.JAVA_INT.withName("scope")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("PATH$sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("PATH$pNext");
    public static final PathElement PATH$MSize = PathElement.groupElement("PATH$MSize");
    public static final PathElement PATH$NSize = PathElement.groupElement("PATH$NSize");
    public static final PathElement PATH$KSize = PathElement.groupElement("PATH$KSize");
    public static final PathElement PATH$AType = PathElement.groupElement("PATH$AType");
    public static final PathElement PATH$BType = PathElement.groupElement("PATH$BType");
    public static final PathElement PATH$CType = PathElement.groupElement("PATH$CType");
    public static final PathElement PATH$DType = PathElement.groupElement("PATH$DType");
    public static final PathElement PATH$scope = PathElement.groupElement("PATH$scope");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$MSize = (OfInt) LAYOUT.select(PATH$MSize);
    public static final OfInt LAYOUT$NSize = (OfInt) LAYOUT.select(PATH$NSize);
    public static final OfInt LAYOUT$KSize = (OfInt) LAYOUT.select(PATH$KSize);
    public static final OfInt LAYOUT$AType = (OfInt) LAYOUT.select(PATH$AType);
    public static final OfInt LAYOUT$BType = (OfInt) LAYOUT.select(PATH$BType);
    public static final OfInt LAYOUT$CType = (OfInt) LAYOUT.select(PATH$CType);
    public static final OfInt LAYOUT$DType = (OfInt) LAYOUT.select(PATH$DType);
    public static final OfInt LAYOUT$scope = (OfInt) LAYOUT.select(PATH$scope);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$MSize = LAYOUT$MSize.byteSize();
    public static final long SIZE$NSize = LAYOUT$NSize.byteSize();
    public static final long SIZE$KSize = LAYOUT$KSize.byteSize();
    public static final long SIZE$AType = LAYOUT$AType.byteSize();
    public static final long SIZE$BType = LAYOUT$BType.byteSize();
    public static final long SIZE$CType = LAYOUT$CType.byteSize();
    public static final long SIZE$DType = LAYOUT$DType.byteSize();
    public static final long SIZE$scope = LAYOUT$scope.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$MSize = LAYOUT.byteOffset(PATH$MSize);
    public static final long OFFSET$NSize = LAYOUT.byteOffset(PATH$NSize);
    public static final long OFFSET$KSize = LAYOUT.byteOffset(PATH$KSize);
    public static final long OFFSET$AType = LAYOUT.byteOffset(PATH$AType);
    public static final long OFFSET$BType = LAYOUT.byteOffset(PATH$BType);
    public static final long OFFSET$CType = LAYOUT.byteOffset(PATH$CType);
    public static final long OFFSET$DType = LAYOUT.byteOffset(PATH$DType);
    public static final long OFFSET$scope = LAYOUT.byteOffset(PATH$scope);

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

    public @unsigned int MSize() {
        return segment.get(LAYOUT$MSize, OFFSET$MSize);
    }

    public void MSize(@unsigned int value) {
        segment.set(LAYOUT$MSize, OFFSET$MSize, value);
    }

    public @unsigned int NSize() {
        return segment.get(LAYOUT$NSize, OFFSET$NSize);
    }

    public void NSize(@unsigned int value) {
        segment.set(LAYOUT$NSize, OFFSET$NSize, value);
    }

    public @unsigned int KSize() {
        return segment.get(LAYOUT$KSize, OFFSET$KSize);
    }

    public void KSize(@unsigned int value) {
        segment.set(LAYOUT$KSize, OFFSET$KSize, value);
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

    public @enumtype(VkComponentTypeKHR.class) int DType() {
        return segment.get(LAYOUT$DType, OFFSET$DType);
    }

    public void DType(@enumtype(VkComponentTypeKHR.class) int value) {
        segment.set(LAYOUT$DType, OFFSET$DType, value);
    }

    public @enumtype(VkScopeKHR.class) int scope() {
        return segment.get(LAYOUT$scope, OFFSET$scope);
    }

    public void scope(@enumtype(VkScopeKHR.class) int value) {
        segment.set(LAYOUT$scope, OFFSET$scope, value);
    }

}
